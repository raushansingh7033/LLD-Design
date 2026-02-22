interface Vehicle {
  void start();

  void stop();
}

class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Car started");
  }

  @Override
  public void stop() {
    System.out.println("Car stopped");
  }
}

class Bike implements Vehicle {
  public void start() {
    System.out.println("bike started");
  }

  public void stop() {
    System.out.println("Bike stopped");
  }
}

class Truck implements Vehicle{
  public void start(){
    System.out.println("Truck started");
  }
  public void stop(){
    System.out.println("Truck stopped");
  }
}

class VehicleFactory{
  public static Vehicle getVehicle(String vehicleType){
      if(vehicleType.equals("car")){
        return new Car();
      }
      else if(vehicleType.equals("truck")){
        return new Truck();
      }
      else if(vehicleType.equals("bike")){
        return new Bike();
      }
      else
         throw new IllegalArgumentException("unknown vehicle type");
  }
}



public class FactoryPattern {
  public static void main(String[] args) {
       Vehicle v1=VehicleFactory.getVehicle("car");
       v1.start();
       v1.stop();
       Vehicle v2=VehicleFactory.getVehicle("bike");
       v2.start();
       v2.stop();
       Vehicle v3=VehicleFactory.getVehicle("truck");
       v3.start();
       v3.stop();
       
  }
}
