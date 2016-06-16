package desenho;

public abstract class Application {
	Document document;

	public abstract void createDocument(String doc);
	public abstract void sendDocument();
}
