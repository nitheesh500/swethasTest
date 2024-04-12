package railways;

public class TrainStatus {
	private String from;
	private String to;
	private TrainStatus(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public void trainStatus() {
		System.out.println("Dont worry u will reach soon....");
	}
}
