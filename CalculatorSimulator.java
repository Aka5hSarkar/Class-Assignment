package exception;
class CountryNotValidException extends Exception{
	CountryNotValidException(String str){
		super(str);
	}
}
class EmployeeNameInvalidException extends Exception{
	EmployeeNameInvalidException(String str){
		super(str);
	}
}
class TaxNotEligibleException extends Exception{
	TaxNotEligibleException(String str){
		super(str);
	}
}
class TaxCalculator{
	//method
	static double calculateTax(String empName,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		double taxAmount;
			if(isIndian==false) {
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}else {
				if(empName==null) {
					throw new EmployeeNameInvalidException("The employee name cannot be empty");
				}else {
					if(empSal>100000) {
						taxAmount=(empSal*8)/100;
						return taxAmount;
					}else if(empSal>=50000 && empSal<=100000) {
						taxAmount=(empSal*6)/100;
						return taxAmount;
					}else if(empSal>=30000 && empSal<=50000) {
						taxAmount=(empSal*5)/100;
						return taxAmount;
					}else if(empSal>=10000 && empSal<=30000) {
						taxAmount=(empSal*4)/100;
						return taxAmount;
					}else {
						throw new TaxNotEligibleException("The employee does not need to pay tax");
					}
				}
			}
	}
		
		
}


public class CalculatorSimulator {
	

	public static void main(String[] args) {
		 String name=null;
		 boolean isIndian=true;
		 double salary=55000;
		try {
			System.out.println("Tax amount is : "+TaxCalculator.calculateTax(name, isIndian, salary));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
