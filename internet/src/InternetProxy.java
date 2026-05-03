import java.util.ArrayList;
import java.util.Arrays;

public class InternetProxy implements Internet {
    private RealInternet realInternet;

    public InternetProxy(RealInternet realInternet) {
        this.realInternet = realInternet;
    }

    private boolean acessoLiberado(String serverhost) {
        ArrayList<String> sitesBloquados = new ArrayList<String>(Arrays.asList("www.instagram.com", "www.tiktok.com", "www.kwai.com"));

        if (!sitesBloquados.contains(serverhost)) {
            return true;
        }
        return false;
    }
    
    public void connectTo(String serverhost) throws Exception {
        if(acessoLiberado(serverhost)) {
            this.realInternet.connectTo(serverhost);
        } else {
            System.out.println("acesso bloqueado para o host: " + serverhost);
        }
    }
}
