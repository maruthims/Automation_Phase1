package JavaSessions;

public class CarBrand {

	public static void main(String[] args) {
	CarBrand cb = new CarBrand();
	String cName = cb.car1("FORD");
	System.out.println(cName);
	}

	public String car1(String brandName) {
		if(brandName.equals("MARUTI")) {
			return brandName +" : MADE IN INDIA";
		} else if(brandName.equals("FORD")) {
			return brandName +" : MADE IN USA";
		}else if(brandName.equals("TOYOTA")){
			return brandName +" : MADE IN JAPAN";
		} else {
		return brandName + " Is not available";
		}
	}
	
	
	public void Model(String carModel) {
		if(carModel.equals("ZEN")) {
			
		}
		
	}
	
	public void Range() {
		
	}
}
