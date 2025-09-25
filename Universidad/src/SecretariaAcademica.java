public class SecretariaAcademica extends SupportHandler {
    public SecretariaAcademica() {
        super(RequestType.CERTIFICATE); // Solo maneja solicitudes de certificados
    }

    @Override
    protected void processRequest(Request request) {
        System.out.println("Secretaría Académica procesando: " + request);
    }
}
