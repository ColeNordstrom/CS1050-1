
 class GradeCalculatorM02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Constants for grade weights
		final double CLASS_PART_PERCENT = .15;
		final double GUIDE_EXPL_PERCENT = .2;
		final double QUIZ_PERCENT = .25;
		final double PROJECT_PERCENT = .2;
		final double FINAL_DEMONSTR_PERCENT = .2;
		
		//Variables to hold possible grade for each category
		double guideExpl = 95;
		double classPart = 92;
		double quiz = 87;
		double project = 92;
		double finalDemonst = 85;
		
		// calculate final grade based on percentages weights 
		double finalGrades = (GUIDE_EXPL_PERCENT * guideExpl) + (CLASS_PART_PERCENT * classPart) + (QUIZ_PERCENT * quiz)
							+(PROJECT_PERCENT * project) + (FINAL_DEMONSTR_PERCENT * finalDemonst);
							System.out.printf("\nCole's Final Grade: %2f",finalGrades);
							
		
			
	}// end of main method

}// end of class

            