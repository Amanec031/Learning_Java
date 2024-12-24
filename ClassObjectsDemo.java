public class ClassObjectsDemo {
    public static void main(String[] args) {
        Car maruti = new Car();
        Car hyundai = new Car();
        Car tata = new Car();
        
        maruti.color = "Red";
        maruti.model = "Swift";
        maruti.cost = 800000;
        maruti.carDetails();
        maruti.StartCar();
        maruti.StopCar();

        hyundai.color = "Blue";
        hyundai.model = "i20";
        hyundai.cost = 900000;
        hyundai.carDetails();
        hyundai.StartCar();
        hyundai.StopCar();

        tata.color = "White";
        tata.model = "Nexon";
        tata.cost = 1000000;
        tata.carDetails();
        tata.StartCar();
        tata.StopCar();
    }
}

class Car{
    String color;
    String model;
    int cost;

    public void StartCar(){
        System.out.println(model+" Car Started");
    }
    public void StopCar(){
        System.out.println(model+" Car Stopped");
    }
    public void carDetails(){
        System.out.println("Car Details: "+model+" "+color+" "+cost);
    }
}