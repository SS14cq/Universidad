public class Rector extends SupportHandler {
    public Rector() {
        super(RequestType.INSTITUTIONAL_POLICY); // Maneja políticas institucionales y fusiones
    }

    @Override
    protected void processRequest(Request request) {
        System.out.println("Rector procesando: " + request);
    }
}
