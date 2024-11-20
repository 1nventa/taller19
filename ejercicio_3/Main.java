package ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Usando generador de reportes PDF
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.crearReporte("Este es un reporte en PDF.");

        // Usando generador de reportes Excel
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.crearReporte("Este es un reporte en Excel.");
    }
}