public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("License plate: " + getLicensePlate());
    System.out.println("Toll fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate() {
    if (hasTrailer) {
      if (axles > 4) {
        return getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length()).equals("MX");
      } else {
        return getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length()).equals("LX");
      }
    }
    return true;
  }
}