public class MiGong{
    public static void main(String[] args) {      // 0表示可以走，1表示障碍物，2，表示走得通，3表示走不通
    	int[][] map = new int[8][7];              //下-右-上-左
    	for (int i = 0; i < 7; i++) {
    		map[0][i] = 1;
    		map[7][i] = 1;
    	}
    	for (int i = 0; i < 8; i++) {
    		map[i][0] = 1;
    		map[i][6] = 1;
    	}
    	map[3][1] = 1;
    	map[3][2] = 1;
    	System.out.println("======当前地图情况========");
    	for (int i = 0; i < map.length; i++) {
    		for (int j = 0; j < map[i].length; j++) {
    			System.out.print(map[i][j] + "  ");	
    		}
    		System.out.println();
    	}
    	A t1 = new A();
    	t1.Way(map, 1, 1);
    	System.out.println("\n======找路情况========");
    	for (int i = 0; i < map.length; i++) {
    		for (int j = 0; j < map[i].length; j++) {
    			System.out.print(map[i][j] + "  ");	
    		}
    		System.out.println();
    	}
    	
    }
    }
class A {
	public boolean Way(int[][] map, int i, int j) {
		if(map[6][5] == 2) {
			return true;
		} else {
			if(map[i][j] == 0) {
				map[i][j] = 2;
			if(Way(map,i + 1, j)) {
				return true;
			} else if(Way(map, i, j +  1)) {
				return true;
			}  else if(Way(map, i - 1, j)) {
				return true;
			} else if(Way(map, i, j - 1)) {
				return true;
			} else {
				map[i][j] = 3;
				return false;
			}
			}
		}
		return false;
	}
}
