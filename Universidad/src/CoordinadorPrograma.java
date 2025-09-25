public class CoordinadorPrograma extends SupportHandler {
    public CoordinadorPrograma() {
        super(RequestType.SCHEDULE_CHANGE); // Maneja cambios de horarios y problemas académicos menores
    }

    @Override
    protected void processRequest(Request request) {
        System.out.println("Coordinador de Programa procesando: " + request);
    }
}
