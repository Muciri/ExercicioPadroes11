package mediator;

public interface ATCMediator {
    public void registerRunway(Runway runway);
    
    public void registerFlight(Flight flight);

    public void registerSupportTeam(SupportTeam supportTeam);
 
    public boolean isLandingOk();
 
    public void setLandingStatus(boolean status);  

    public void atualizar(String contexto);

    void solicitarPouso(Flight flight);
}
