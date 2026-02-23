interface Vehicle {
  void start();

  void stop();
}

class Honda implements Vehicle {
  @Override
  public void start() {
    System.out.println("Honda started");
  }

  @Override
  public void stop() {
    System.out.println("Honda stopped");
  }
}

class Toyota implements Vehicle {
  @Override
  public void start() {
    System.out.println("toyota started");
  }

  @Override
  public void stop() {
    System.out.println("toyota stopped");
  }
}

class BMW implements Vehicle {
  @Override
  public void start() {
    System.out.println("BMW started");
  }

  @Override
  public void stop() {
    System.out.println("BMW stopped");
  }
}

interface VehicleFactory {
  Vehicle createVehicle();
}

class HondaFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Honda();
  }
}

class ToyotaFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Toyota();
  }
}

class BMWFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new BMW();
  }
}

public class AbstractFactoryPattern {
  public static void main(String[] args) {
    VehicleFactory hondaFactory = new HondaFactory();
    Vehicle honda = hondaFactory.createVehicle();
    honda.start();
    honda.stop();
    VehicleFactory toyotaFactory = new ToyotaFactory();
    Vehicle toyota = toyotaFactory.createVehicle();
    toyota.start();
    toyota.stop();
    VehicleFactory bmwFactory = new BMWFactory();
    Vehicle bmw = bmwFactory.createVehicle();
    bmw.start();
    bmw.stop();
  }
}
