package mediator;

/**
 * Componente 2: Runway (representa a pista de pouso)
 * @author alexs
 *
 */
public class Runway implements Command {
    private ATCMediator atcMediator = null;
    private String status;
    
    public Runway(ATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
        this.status = "inseguro";
        //atcMediator.setLandingStatus(true);
    }

    public void getStatus() {
        System.out.println("estado da pista: " + status);
    }

    public String notificarStatus() {
        return status;
    }
	
    public void setStatus(String status){
        this.status = status;
    }

    @Override
	public void land() {
		//System.out.println("Landing permission granted.");

        if(status.equals("disponivel")) {
            setStatus("indisponivel");
            atcMediator.setLandingStatus(true);
        }

        if(status.equals("inseguro")) {
            System.out.println("pista insegura...realizando varredura");
            atcMediator.atualizar("varredura");
        }
	}
}
