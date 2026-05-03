public class ClientInternet {
    public static void main (String[] args) {
        Internet internet = new RealInternet();
        Internet internetPrivada = new InternetProxy(new RealInternet());
        
        try {
            internet.connectTo("www.ifpb.edu.br");
            internet.connectTo("www.youtube.com");
            internet.connectTo("www.instagram.com");


            System.out.println("---");

            internetPrivada.connectTo("www.instagram.com");
            internetPrivada.connectTo("www.github.com");
            internetPrivada.connectTo("www.docker.com");
            internetPrivada.connectTo("www.tiktok.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}