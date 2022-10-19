package exception;
//creating custom exceptions
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
	//method to calculate tax
	static double calculateTax(String empName,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		double taxAmount;
			if(isIndian==false) {
				//throw exception
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}else {
				if(empName==null || empName=="") {
					//throw exception
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
						//throw exception
						throw new TaxNotEligibleException("The employee does not need to pay tax");
					}
				}
			}
	}
			
}


public class CalculatorSimulator {
	

	public static void main(String[] args) {
		//test case 1
		try {
			System.out.println("Tax amount is : "+TaxCalculator.calculateTax("Ron",false, 34000));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		//test case 2
		}try {
			System.out.println("Tax amount is : "+TaxCalculator.calculateTax("Tim", true, 1000));
		}catch(Exception e){
			System.out.println(e.getMessage());
		//test case 3
		}try {
			System.out.println("Tax amount is : "+TaxCalculator.calculateTax("Jack",true, 55000));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		//test case 4
		}try {
			System.out.println("Tax amount is : "+TaxCalculator.calculateTax(null, true, 30000));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
