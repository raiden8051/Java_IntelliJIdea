package RatInMaze;

public class NewMaze {
    public static int ctr = 0;
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 0, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        maze(maze,0,0,maze.length-1);
        System.out.println(ctr);
    }
    public static boolean check(int[][]arr, int x, int y, int size){
        return x<=size && y<=size && arr[x][y]==1;
    }
    public static boolean maze(int[][] arr,int x, int y, int size){
        if(x==size && y==size)
            return true;
        else if(check(arr,x,y,size)){
            ctr++;
            if(maze(arr,x+1,y,size))
                return true;
            if(maze(arr,x,y+1,size))
                return true;

            ctr--;
            return false;
        }
        return false;
    }
}
