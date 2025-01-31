// Write a Java program with a Car class having private fields (make, model), a 
// parameterized constructor, getter, and setter methods. In the CarTester class, 
// instantiate myCar1 with values and myCar2 with null. Print their initial details, 
// update myCar2 using setters, and print the updated details.
// // 

class CarTester{
    private int make;
    private String Model;
    public CarTester(int make, String model){
    this.make=make;
    this.Model=model;
    }
    public int getMake() {
        return make;
    }
    public String getModel() {
        return Model;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    
}
public class Q1 {
    public static void main(String[] args) {
    CarTester Car1= new CarTester(2020, "Toyota supra");
    CarTester Car2= new CarTester(0, null);
    System.out.println("Car1 details: Make = "+Car1.getMake()+" Model = "+Car1.getModel());
//as car 2 value was null 
    System.out.println("previous Car2 details: Make = "+Car2.getMake()+" Model = "+Car2.getModel());
    //now we are updating the values of car2 using setter method
    Car2.setMake(2023);
    Car2.setModel("Lexus");
    System.out.println("Car2 details: Make = "+Car2.getMake()+" Model = "+Car2.getModel());

    }
}

