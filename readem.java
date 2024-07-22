import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class readem {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] inps = input.trim().split(" ");
        int n = inps.length;
        int[] nums = new int[n-3];
        int[] nums1 = new int[n-3];
        try{
            for(int i=0;i<n-3;i++){
                nums[i]=Integer.parseInt(inps[i]);
            }
            for(int i=0;i<n-3;i++){
                nums1[i]=Integer.parseInt(inps[i+(n-3)]);
            }
            System.out.println(nums1[0]);
        }catch(Exception e){}
        
    }
}
