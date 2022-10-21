import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cake> cakes = new ArrayList<Cake>();
        ArrayList<Pastry> pastries = new ArrayList<Pastry>();
        Cake cake1 = new Cake();
        cake1.name = "Chocolate Brownie";
        cake1.price = 200;
        Cake cake2 = new Cake();
        cake2.name = "Chocolate Maple";
        cake2.price = 300;
        cakes.add(cake1);
        cakes.add(cake2);
        Pastry p1 = new Pastry();
        p1.name = "Black Forest";
        p1.price = 35;
        Pastry p2 = new Pastry();
        p2.name = "Choco Truffle";
        p2.price = 40;
        pastries.add(p1);
        pastries.add(p2);
        System.out.println();
        System.out.println("                Today's Special Menu              ");
        System.out.println("--------------------------------------------------");
        System.out.println("  Special Cakes");
        System.out.println("  -------------------------------------");
        for (Cake i : cakes) {
            System.out.print("  ");
            i.display();
        }
        System.out.println();
        System.out.println("  Special Pastries");
        System.out.println("  -------------------------------------");
        for(Pastry i : pastries) {
            System.out.print("  ");
            i.display();
        }
    }
}

class Cake {
    public String name;
    public float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display() {
        System.out.println(name + " : \u20B9 " + price + " per pound");
    }
}

class Pastry extends Cake {
    @Override
    public void display() {
        System.out.println(name + " : \u20B9 " + price + " per piece");
    }
}

/*
SAMPLE OUTPUT : 

                Today's Special Menu              
--------------------------------------------------
  Special Cakes
  -------------------------------------
  Chocolate Brownie : ₹ 200.0 per pound
  Chocolate Maple : ₹ 300.0 per pound

  Special Pastries
  -------------------------------------
  Black Forest : ₹ 35.0 per piece
  Choco Truffle : ₹ 40.0 per piece

*/
