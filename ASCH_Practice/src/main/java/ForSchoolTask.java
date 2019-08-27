public class ForSchoolTask {

    public static int countTwoRangesNumbers(int a, int b, int c, int d){
        int count = 0;
        for(int i = a; i <=b; i++){
          if(i < d & i > c){
              count++;
          }
        }return count;

    }



}
