public class AppFour {
//example for multi-dimensional arrays
    public static void main(String[] args) {

        int[] values = {3, 5, 2343};

        System.out.println(values[2]);

        int[][] grid = {

                {3, 5, 2343},
                {2, 6},
                {2, 3, 4, 5}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];
       // String[][] texts = new String[1][3];

        texts[0][1] = "Hello there, world....";

        System.out.println(texts[0][1]);

        for(int row = 0; row<grid.length; row++ ){
            for (int col = 0; col< grid[row].length; col++) {

                System.out.println(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[2][];

        System.out.println();
    }
}

