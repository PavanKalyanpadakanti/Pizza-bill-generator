import java.util.*;

class pizza {
    private int price;
    private boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int backprise = 20;
    private int baseprise;
    private boolean isExtracheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isoptedfortakeaway = false;

    public pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        baseprise = this.price;
    }

    public void addextracheese() {
        isExtracheeseAdded = true;
        this.price += extraCheese;
    }

    public void addextraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }

    public void takeaway() {
        isoptedfortakeaway = true;
        this.price += backprise;
    }

    public void getbill() {
        String bill = "";
        if (veg) {
            System.out.println("veg pizza :" + baseprise);
        } else {
            System.out.println("non-veg pizza :" + baseprise);
        }
        if (isExtracheeseAdded) {
            bill += "Extra cheese is added: " + extraCheese + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings is added: " + extraToppings + "\n";
        }
        if (isoptedfortakeaway) {
            bill += "takeaway :" + backprise + "\n";
        }
        bill += "Bill :" + this.price;
        System.out.println(bill);
    }
}

public class Pizzabill {
    public static void main(String[] args) {
        pizza basePizza = new pizza(true);
        basePizza.addextraToppings();
        basePizza.addextracheese();
        basePizza.getbill();
    }
}