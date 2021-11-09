package dThread3.Wait3;


import java.util.ArrayList;

public class ThreadWaitEx3 {
    public static void main(String[] args) throws Exception {
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}

class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while(true) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) { this.table = table; }

    public void run() {
        while(true) {
            //임의의 요리 하나 선택해 table에 추가
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(10); } catch (InterruptedException e) {}
        }
    }
}

class Table {
    String[] dishNames = { "donut", "donut", "burger" }; // donut이 더 자주나옴
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식 수
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while(dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK 쓰레드 기다리게함
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        dishes.add(dish);
        notify(); // 기다리는 CUST 깨움
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while(dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    wait(); // CUST 쓰레드 기다리게 함
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }

            while(true) {
                for(int i = 0; i < dishes.size(); i++) {
                    if(dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // 잠자고있는 COOK 깨움
                        return true;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }
    public int dishNum() { return dishNames.length; }
}