package srp_unsolved;

public class Report {
	private String title;
	private String body;
	
	
	public Report(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public void generateReport() {
// Genera el reporte en un formato específico
		System.out.println("Generating report...");
	}

	public void printReport() {
// Imprime el reporte
		System.out.println("Printing report: " + title);
	}
}