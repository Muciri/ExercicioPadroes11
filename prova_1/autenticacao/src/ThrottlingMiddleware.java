public class ThrottlingMiddleware extends Middleware {
    private int requestsPerMinute;
    private int request;
    private Long currentTime;

    public ThrottlingMiddleware(int requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        this.request = 0;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        long now = System.currentTimeMillis();

        // Se passou mais de 1 minuto, reseta o contador
        if (now > currentTime + 60_000) {
            request = 0;
            currentTime = now;
        }

        request++;

        // Se exceder o limite, bloqueia
        if (request > requestsPerMinute) {
            System.out.println("Limite de requisições excedido!");
            return false;
        }

        if(hasNext()) {
            return checkNext(email, password);
        } 

        return true;
    }
}
