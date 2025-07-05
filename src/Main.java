import jdk.dynalink.beans.StaticClass;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Product, Integer> carts=new HashMap<>();
    static Scanner res= new Scanner(System.in);
    static Customer customer=new Customer("hager",10000);

    static ArrayList<Product> products=new ArrayList<>();
    public static void main(String[] args) throws IOException {

        Product p1=new Product("cheese",100,10);
        p1.setShipping(30f);
        p1.setWeight(400);
        Product p2=new Product("TV",1500,20);
        p2.setShipping(100);
        p2.setWeight(600);
        Product p3=new Product("scratchcard",50,10);
        Product p4=new Product("biscuits",30,10);
        Product p5=new Product("camera",3500,50);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);


        while (true){

            System.out.println(" add to cart press 1 :");
            System.out.println(" add to checkout press 2 :");
            System.out.println(" add to show carts press 3 :");
            System.out.println(" add to exit press 4 :");

            int x=res.nextInt();
            if(x==1) cart();
           else if(x==2) {checkout();
            continue;

            }
           else if(x==3) show_carts();
           else if(x==4) break;
            else System.out.println(" invalid input");
            }
        }

    private static void show_carts() {
        if(carts.size()==0) System.out.println(" empty cart......");
        for (Product x:carts.keySet()
             ) {
            System.out.println("the product name : "+x.getName()+" \n the quantity : "+carts.get(x));

        }
    }


    private static void checkout() {


        if (carts.isEmpty()) {
            System.out.println("Cart is empty. Cannot checkout......");
            return;
        }

        float total = 0f;
        float shipping=0;
        float amount=0;
        for (Product x:carts.keySet()) {
            System.out.println("the product name : "+x.getName()+" \n the quantity : "+carts.get(x)+" \n the price "+x.getPrice()*carts.get(x));

            total += x.getPrice()*carts.get(x);
            if(x.getshipping()>0){
                shipping+=x.getshipping()*((x.getWeight()/1000f)*carts.get(x));
            }
        }
        amount = total + shipping;
        if(customer.getBalance()<amount){
            System.out.println("the balance not satisfy the amount.......");
            carts.clear();
        }
        else {

            System.out.println("the subtotal price :" + total);
            System.out.println("the shipping price :" + shipping);
            System.out.println("the amount price :" + amount);
            customer.update_balance(amount);
            System.out.println("the remaning balance : "+customer.getBalance());
            carts.clear();
        }


    }
    public static void add_cart(Product p,int q){
        if(p.isIsexpire()){
            System.out.println("the product is expired ");
      return;
        }
        if(p.getQuantity()<q){
            System.out.println("invalid quantity");
        }
        if (q <= 0) {
            System.out.println("Quantity must be more than 0");
            return;
        }
        else
        {
            if(carts.containsKey(p)){
                carts.put(p, carts.get(p)+q);

            }
            else{
            carts.put(p, q);
            }
            for (Product h:products) {
                if(h.getName().equals(p.getName())){
                   h.setQuantity(h.getQuantity()-q);
                   break;

                }

            }
        }
    }

    private static void cart() {
        boolean found = false;
        for (Product p:
                products) {
            int i=1;
            System.out.println(p);
        }
        System.out.println("enter name of product :");
        String name=res.next();
        System.out.println("enter quantity of product :");
        int qua=res.nextInt();
        /*Product p1= products.stream().filter(p -> p.getName()==name).findFirst().get();*/
        for (Product h:products) {
            if(h.getName().equals(name)){
                add_cart(h,qua);
                 found = true;
                break;
            }

        }
        if(!found){
            System.out.println(" invalid product name ");
        }

    }


}