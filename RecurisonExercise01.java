public class RecurisonExercise01{
    public static void main(String[] args) {
    	M m = new M();
    	int day = 9;
    	int peachnum = m.peach(day);
    	if (peachnum != -1) {
    		System.out.println("第" + day + "天有" + peachnum + "个桃");
    	}
    	 
    }
 }
class M {
	public int peach(int day) {
		if (day == 10) {
			return 1;
		} else if ( day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
			
		} else {
			System.out.println("day 必须 1----10");
			return -1;
		}
	}
}