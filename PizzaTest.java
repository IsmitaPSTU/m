class Pizza{
    private String size ;
    private  int cheese,pepperoni ,ham;

    Pizza(String size,int cheese,int pepperoni,int ham){
        this.size=size;
        this.cheese=cheese;
        this.pepperoni=pepperoni;
        this.ham=ham;
    }
    //setter getter method
    public  String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size= size;
    }
    public int getCheese(){
        return  cheese;

    }
    public void setCheese(int cheese){
        this.cheese= cheese;
    }
    public int getPepperoni(){
        return pepperoni;
    }
    public void setPepperoni(int pepperoni){
        this.pepperoni= pepperoni;
    }
    public int getHam(){
        return ham;
    }
    public void setHam(int ham){
        this.ham= ham;
    }

    //calculated cost
    public double calCost(){
        double cost=0;
        int totalToppings =pepperoni+cheese+ham;

        if(size.equals("Small")){
            cost= 10+(2*totalToppings);
        }
        else if(size.equals("Medium")){
            cost= 12+(2*totalToppings);
        }
        else if(size.equals("Large")){
            cost= 14+(2*totalToppings);

        }
        return  cost;

    }
    //getDescription
    public String getDescription(){
        return "\nPizza size:"+size+",\nCheese:"+cheese+",\nPepperoni:"+pepperoni+"\nHam:"+ham+"\nTotal cost$:"+calCost();

    }
}
//pizza order class
class PizzaOrder{
    private Pizza pizza1,pizza2,pizza3;
    public  void setPizza1(Pizza pizza1){
        this.pizza1=pizza1;
    }
    public void setPizza2(Pizza pizza2){
        this.pizza2=pizza2;
    }
    public void setPizza3(Pizza pizza3){
        this.pizza3=pizza3;
    }
    //calculate total cost
    public double calTotal(){
        double total=0;
        if(pizza1 != null)
            total+=pizza1.calCost();
        if(pizza2 != null)
            total+=pizza2.calCost();
        if(pizza3!= null)
            total+=pizza3.calCost();
        return  total;
    }
}
//pizza test class
public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1= new Pizza("Large",1 , 1, 2);
        Pizza p2= new Pizza("Medium", 2, 0, 1);
        System.out.println("Pizza 1 details:"+p1.getDescription());
        System.out.println("Pizza 2 details:"+p2.getDescription());


        PizzaOrder order= new PizzaOrder();
        order.setPizza1(p1);
        order.setPizza2(p2);
        System.out.println("\nTotal oder cost:$"+order.calTotal());
    }
}
