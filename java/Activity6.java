package activities;

public class Activity6 {
	public static void main(String []args) throws InterruptedException {
    Plane plane = new Plane(10);
    plane.onboard("Samuel");
    plane.onboard("James");
    plane.onboard("Smith");
    plane.onboard("Sara");
    plane.onboard("Ankit");
    System.out.println("Take off time: " + plane.takeOff());
    System.out.println("List of Passengers: " + plane.getPassengers());
    Thread.sleep(5000);
    plane.land();
    System.out.println("Plane landed at: " + plane.getLastTimeLanded());
}
}
