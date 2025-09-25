public class Main {
    public static void main(String[] args) {

        // Crear los manejadores
        Handler secretaria = new SecretariaAcademica();
        Handler coordinador = new CoordinadorPrograma();
        Handler decano = new Decano();
        Handler vicerrector = new VicerrectorAcademico();
        Handler rector = new Rector();

        // Establecer la cadena de responsabilidad
        secretaria.setNext(coordinador)
                  .setNext(decano)
                  .setNext(vicerrector)
                  .setNext(rector);

        // Crear solicitudes de ejemplo
        Request[] requests = {
            new Request(RequestType.CERTIFICATE, "Certificado de notas"),
            new Request(RequestType.SCHEDULE_CHANGE, "Cambio de horario de clase"),
            new Request(RequestType.ACADEMIC_ISSUE, "Problema académico menor"),
            new Request(RequestType.ACADEMIC_APPEAL, "Apelación de calificación"),
            new Request(RequestType.DISCIPLINARY_CASE, "Caso disciplinario"),
            new Request(RequestType.NEW_SUBJECT, "Nueva materia de Matemáticas"),
            new Request(RequestType.NEW_PROGRAM, "Nuevo programa de Doctorado"),
            new Request(RequestType.ACADEMIC_AGREEMENTS, "Convenio académico con universidad extranjera"),
            new Request(RequestType.INSTITUTIONAL_POLICY, "Propuesta de nueva política institucional"),
            new Request(RequestType.MERGER, "Fusión con otra universidad")
        };

        // Procesar las solicitudes
        for (Request request : requests) {
            System.out.println("Procesando solicitud: " + request);
            secretaria.handleRequest(request);
            System.out.println();
        }

        // Ejemplo de cadena que no puede manejar solicitudes (solo procesará certificados y apelaciones académicas)
        Handler limitedChain = new SecretariaAcademica();
        Handler appealChain = new Decano();
        limitedChain.setNext(appealChain);

        Request specialRequest = new Request(RequestType.NEW_PROGRAM, "Nuevo programa de MBA");
        System.out.println("Procesando solicitud especial: " + specialRequest);
        limitedChain.handleRequest(specialRequest);
    }
}
