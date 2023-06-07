public class MethonArray {
    public static void main(String[] args) {
        int[][] map = {{1, 3, 5}, {2, 4, 6}};
        myTools tools = new myTools();
        tools.printArr(map);
        tools.printArr(map);
    }
}

class myTools {
    public void printArr(int[][] arr) {
        System.out.println("======");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "-");
            }
            System.out.println();
        }
        System.out.println("======");
    }
}