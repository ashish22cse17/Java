package leetcode;

import java.util.*;
class Solution {
   public int rev(){
    int m=x;
     while(m>0){
            int d=m%10;
            r=r*10+d;
            m=m/10;
        }  
      }
    public boolean isPalindrome(int x) {
     Scanner sc=new Scanner(System.in);
     x=sc.nextInt();
     int r=x.rev();
     if(r==x)
     return true;
     else
     return false;
    }
}
