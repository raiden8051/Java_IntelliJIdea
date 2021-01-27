package RatInMaze;

public class NewMaze {
    public static int ctr = 0;
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        maze(maze,0,0,3,3);
        System.out.println(ctr);
    }
    public static boolean check(int[][]arr, int x, int y, int row, int col){
        return x<=row && y<=col && arr[x][y]==1;
    }
    public static boolean maze(int[][] arr,int x, int y, int row, int col){
        if(x==row && y==col)
            return true;
        else if(check(arr,x,y,row, col)){
            ctr++;
            if(maze(arr,x+1,y,row,col))
                return true;
            if(maze(arr,x,y+1,row,col))
                return true;

            ctr--;
            return false;
        }
        return false;
    }
}
