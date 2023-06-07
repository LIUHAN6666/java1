public class SwitchExercise {
    public static void main(String[] args) {
        double score = 88.5;
        if (score >= 0 && score <= 100) {
            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("合格");
                    break;
                case 1:
                    System.out.println("不合格");
                    break;
                default:
                    System.out.println("输入错误");
            }
        } else {
            System.out.println("输入错误");
        }
    }
}
		
		
		
		
		    	
		     
	 
				
	          
 
	
	
			
		
	
