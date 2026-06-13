public class Main {
    public static Server server;

    public static void init() {
        server = new Server();
    }
    public static void main(String[] args) {
        init();

        Middleware throttlingMiddleware = new ThrottlingMiddleware(5);
        Middleware userExists = new UserExistsMiddleware(server);
        Middleware roleCheck = new RoleCheckMiddleware();
        
        throttlingMiddleware.linkWith(userExists);
        userExists.linkWith(roleCheck);

        server.setMiddleware(throttlingMiddleware);

        server.register("murilo@admin.email.com", "1234");
        server.register("gabriel@email.com", "1234");
        server.register("joel@email.com", "1234");

        server.logIn("murilo@admin.email.com", "1234");
        server.logIn("gabriel@email.com", "1234");
    }
}