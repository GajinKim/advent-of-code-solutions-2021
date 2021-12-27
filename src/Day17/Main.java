package Day17;

/**
 * https://adventofcode.com/2021/day/17
 */
public class Main {
    public static void main(String[] args) {
        int xVelocity = 7;
        int yVelocity = 2;

        int xPos = 0;
        int yPox = 0;

        int xTargetStart = 20;
        int xTargetEnd = 30;
        int yTargetStart = -10;
        int yTargetEnd = -5;

        // determine the trajectory apex in order to know how tall to make the matrix
        int yApex = 0;
        for (int i = 0; i < yVelocity; i++) {
            yApex += yVelocity - i;
        }


        int rows = yApex + Math.abs(yTargetStart);
        int cols = xTargetEnd;

        int[][] trench = new int[rows][cols];

        for (int row = 0; row < trench.length; row++) {
            for (int col = 0; col < trench[0].length; col++) {
                if (row == 0 && col == 0)
                    System.out.print("S");
                else
                    if (col >= xTargetStart && col <= xTargetEnd && row <= yApex + Math.abs(yTargetStart) && row >= yApex + Math.abs(yTargetEnd))
                        System.out.print("T");
                    else
                        System.out.print(".");
            }
            System.out.println();
        }
    }
}
