package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product products[] = new Product[4];
        products[0] = new Product("astana",142536,2017,16,"суббота");
        products[1] = new Product("almaty",175421,2021,8,"понидельник");
        products[2] = new Product("shymkent",154827,2019,11,"среда");
        products[3] = new Product("taraz",165822,2020,22,"пятница");
        System.out.println("Список ейсов по заддомнному пути" +
                ": ");
        String aty = sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(products[i].getdestination().equals(aty)){
                System.out.println(products[i].toString());
            }
        }
        System.out.println("Список рейсов по заддоной дня недели" +
                ": ");
        String kuny = sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(products[i].getName().equals(kuny)){
                System.out.println(products[i].toString());
            }
        }
        System.out.println("Срок времени :");
        int c = sc.nextInt();

        for (int i = 0; i < 4 ; i++) {
            if(c >= products[i].gettime()){
                System.out.println(products[i].toString());
            }
        }

    }
}




class Product {
            private String destination;
            private int number;
            private int type;
            private int time;
            private String name;


            public Product (  String destination, int number,int type, int time, String name) {
                this.destination = destination;
                this.number= number;
                this.type = type;
                this.time = time;
                this.name = name;
            }

            public String getdestination() {
                return destination;
            }
            public void setId(String destination) {
                this.destination = destination;
            }

            public int getnumber() {
                return number;
            }
            public void setnumber(int number) {
                this.number = number;
            }

            public int gettype() {
                return type;
            }
            public void settype(int type) {
                this.type = type;
            }

            public int gettime() {
                return time;
            }
            public void settime(int time) {
                this.time= time;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }

            public String toString() {
                return "Product{ " +
                        "destination = " + destination +
                        ", Name = '" + name + '\'' +
                        ", number = '" + number + '\'' +
                        ", type = '" + type + '\'' +
                        ", time = '" + time + '\'' +
                        '}';
            }

        }