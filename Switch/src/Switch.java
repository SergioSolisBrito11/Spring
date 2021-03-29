
public class Switch {

	String regimen;
	
	public String validaRegimen() {
		
		switch (regimen) {
		case "RO":
			validaTipoRetiro("A");
			break;
			
        case "DT":
			
			break;  

		default:
			break;
		}
		return regimen;
		
	}
	
	public String validaTipoRetiro(String string) {
		String tipoRetiro = null;
		
		switch (tipoRetiro) {
		case "A":
			System.out.println("DDDDDDDDDDDDd");
			break;
		case "B":
			
			break;
		case "G":
			
			break;
		case "I":
			
			break;
		case "M":
			
			break;

		default:
			break;
		}
		return regimen;	
	}
	public static void main(String[] args) {
		System.out.println("djddhh");
	}
	
}
