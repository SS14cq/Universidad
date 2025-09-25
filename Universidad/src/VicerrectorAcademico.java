public class VicerrectorAcademico extends SupportHandler {
    public VicerrectorAcademico() {
        super(RequestType.NEW_PROGRAM); // Maneja nuevos programas y convenios académicos
    }

    @Override
    protected void processRequest(Request request) {
        System.out.println("Vicerrector Académico procesando: " + request);
    }
}
