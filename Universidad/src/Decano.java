public class Decano extends SupportHandler {
    public Decano() {
        super(RequestType.ACADEMIC_APPEAL); // Maneja apelaciones académicas y casos disciplinarios
    }

    @Override
    protected void processRequest(Request request) {
        System.out.println("Decano procesando: " + request);
    }
}
