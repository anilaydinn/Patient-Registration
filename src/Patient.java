
public class Patient {

	private String patientName;
	private String patientSurname;
	private String diseaseName;
	private int patientAge;
	private String patientAllergies;
	private String companionName;
	private String tcId;
	
	/*
	 	Constructor
	 */
	
	public Patient(String patientName, String patientSurname, String diseaseName, int patientAge, String patientAllergies, String companionName, String tcId) {
		
		this.patientName = patientName;
		this.patientSurname = patientSurname;
		this.diseaseName = diseaseName;
		this.patientAge = patientAge;
		this.patientAllergies = patientAllergies;
		this.companionName = companionName;
		this.tcId = tcId;
		
	}
	
	// GET and SET Methods of patientName field.
	
	public void setPatientName(String patientName) {
		
		this.patientName = patientName;
	}
	
	public String getPatientName() {
		
		return patientName;
	}
	
	// GET and SET Methods of patientSurname field.
	
	public void setPatientSurname (String patientSurname) {
		
		this.patientSurname = patientSurname;
		
	}
	
	public String getPatientSurname() {
		
		return patientSurname;
		
	}
	
	//GET and SET Methods of diseaseName field.
	
	public void setDiseaseName(String diseaseName) {
		
		this.diseaseName = diseaseName;
	}
	
	public String getDiseaseName() {
		
		return diseaseName;
	}
	
	//GET and SET Methods of patientAge field.
	
	public void setPatientAge(int patientAge) {
		
		this.patientAge = patientAge;
	}
	
	public int getPatientAge() {
		
		return patientAge;
	}
	
	//GET and SET Methods of patientAllergies field.
	
	public void setPatientAllergies(String patientAllergies) {
		
		this.patientAllergies = patientAllergies;
	}
	
	public String getPatientAllergies() {
		
		return patientAllergies;
	}
	
	//GET and SET Methods of companionName field.
	
	public void setCompanionName(String companionName) {
		
		this.companionName = companionName;
	}
	
	public String getCompanionName() {
		
		return companionName;
	}
	
	//GET and SET Methods of tcId field.
	
	public void setTcId(String tcId) {
		
		this.tcId = tcId;
	}
	
	public String getTcId() {
		
		return tcId;
	}
}
