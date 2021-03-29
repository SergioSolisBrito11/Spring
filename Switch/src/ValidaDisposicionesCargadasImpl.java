

public class ValidaDisposicionesCargadasImpl implements ValidaDisposicionesCargadas {

	@Override
	public boolean validaDispCargada(String regimen) {
		boolean respValidaTipoRetiro = false;
		
		switch (regimen) {
		case "RO":
			respValidaTipoRetiro = validaTipoRetiro("A"); 
			//valn 
			
			
			break;
			
        case "DT":
			
			break;  

		default:
			break;
		}
		return respValidaTipoRetiro;
	}
	
	public boolean validaTipoRetiro(String tipoRetiro) {
		//String tipoRetiro = null;
		if ("A".equals(tipoRetiro) || "B".equals(tipoRetiro) || "C".equals(tipoRetiro)  ) {
			return true;
		}
		return false;
		
		
//		switch (tipoRetiro) {
//		case "A":
//			System.out.println("DDDDDDDDDDDDd");
//			break;
//		case "B":
//			
//			break;
//		case "G":
//			
//			break;
//		case "I":
//			
//			break;
//		case "M":
//			
//			break;
//
//		default:
//			break;
//		}
		//return null;	
	}
	
	public String validaSecuenciaPension() {
		return null;
		
	}

}
