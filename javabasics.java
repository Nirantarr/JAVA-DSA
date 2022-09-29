import java.util.*;
public class javabasics {
   public static float shortestdistance(String str){
    int x = 0 ;
    int y = 0 ;
    
    for(int i=0 ; i<str.length(); i++){
      char dir = str.charAt(i);
      if(dir=='E'){
        x++;
      }
      else if(dir == 'W'){
        x--;
      }
      else if(dir == 'N'){
        y++;
      }
      else if(dir == 'S'){
        y--;
      }
    }
    int x2 =x*x;
    int y2 = y*y;
    return (float)Math.sqrt(x2 + y2);
   }
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
   float ans = shortestdistance(str);
   System.out.println(ans);
    sc.close();  }
}
