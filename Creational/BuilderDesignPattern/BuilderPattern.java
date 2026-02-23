class Car {
  private String engine;
  private int wheels;
  private int seats;
  private String color;
  private boolean sunRoof;
  private boolean navigationSystem;

  private Car(CarBuilder builder) {
    this.engine = builder.engine;
    this.wheels = builder.wheels;
    this.seats = builder.seats;
    this.color = builder.color;
    this.sunRoof = builder.sunRoof;
    this.navigationSystem = builder.navigationSystem;

  }

  public String getEngine() {
    return engine;
  }

  public int getWheels() {
    return wheels;
  }

  public int getSeats() {
    return seats;
  }

  public String getColor() {
    return color;
  }

  public boolean hasSunRoof() {
    return sunRoof;
  }

  public boolean hasNavigationSystem() {
    return navigationSystem;
  }

  @Override
  public String toString() {
    return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
        + ", color=" + color + ", sunroof=" + sunRoof
        + ", navigationSystem=" + navigationSystem + "]";
  }

  public static class CarBuilder {
    private String engine;
    private int wheels = 4; // Default value
    private int seats = 5; // Default value
    private String color = "Black"; // Default value
    private boolean sunRoof = false; // Default value
    private boolean navigationSystem = false; // Default value

    // Builder methods to set attributes
    public CarBuilder setEngine(String engine) {
      this.engine = engine;
      return this;
    }

    public CarBuilder setWheels(int wheels) {
      this.wheels = wheels;
      return this;
    }

    public CarBuilder setSeats(int seats) {
      this.seats = seats;
      return this;
    }

    public CarBuilder setColor(String color) {
      this.color = color;
      return this;
    }

    public CarBuilder setSunRoof(boolean sunRoof) {
      this.sunRoof = sunRoof;
      return this;
    }

    public CarBuilder setNavigationSystem(boolean navigationSystem) {
      this.navigationSystem = navigationSystem;
      return this;
    }

    // Build method to create a Car object
    public Car build() {
      return new Car(
          this); // Return a new Car created using the builder's values
    }
  }
}

public class BuilderPattern {
  public static void main(String[] args) {
    Car.CarBuilder builder = new Car.CarBuilder();
    Car car1 = builder.setEngine("V8")
        .setColor("Red")
        .setSeats(5)
        .setSunRoof(true)
        .build(); // The build method returns the final product
    System.out.println(car1);

    // Creating another car with different specifications
    Car car2 = builder.setEngine("V6")
        .setColor("Blue")
        .setSeats(4)
        .build(); // Sunroof and Navigation are default
    System.out.println(car2);
  }
}
