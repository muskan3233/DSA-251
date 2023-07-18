import java.util.* ;

import java.io.*; 

public class Solution {

    public static int firstMissing(int[] arr, int n) {

        

        Arrays.sort(arr);

 

        int positiveNo=1;

        for(int i=0;i<n;i++){

         

         if(arr[i]>0){

            int  fno=arr[i];

             

             if(fno>1 ){

             positiveNo=1;

              break;

             } 

             for(int j=i; j<n-1;j++){

 

                 if(arr[j+1]  <=arr[j]+1){ 

                        positiveNo=arr[j+1]+1;  

                 }else{ 

                    positiveNo=arr[j]+1; 

                    break;

                 }  

             } 

 

             break; 

         } 

        }

       return positiveNo;

    }

}

// https://www.codingninjas.com/studio/problems/first-missing-positive_699946?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=0
