public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.setStrategy(new WalkingStrategy());

        double latitude = 35.658581;
        double longitude = 139.745438;

        System.out.println(navigator.buildRoute(latitude, longitude));

        System.out.println("-=-=-=-=-=");

        latitude = 48.862140;
        longitude = 2.289971;

        navigator.setStrategy(new PublicTransportStrategy());
        System.out.println(navigator.buildRoute(latitude, longitude));

        System.out.println("-=-=-=-=-=");

        latitude = 40.758896;
        longitude = 73.985130;

        navigator.setStrategy(new RoadStrategy());
        System.out.println(navigator.buildRoute(latitude, longitude));
    }
}