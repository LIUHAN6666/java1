public class MethodExercise01 {
    public static void main(String[] args) {
    	int[][] map = {{1, 3, 5}, {2, 4, 6}, {1, 3, 2}};
        myTools tools = new myTools();
        tools.printArr(map);
        tools.printArr(map);
        tools.printArr(map);
    }
}

class myTools {
    public void printArr(int[][] map) {
        System.out.println("======");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "-");
            }
            System.out.println();
        }
    }
}