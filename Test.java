// package io.github.jiangdequan;

public class MaximumCircular {
   public static void main(String[] args) {
    int prr[]={8,-4,3,-5,4};
    System.out.println(maximumcircular(prr,prr.length));
   }
   public static int maximumcircular(int arr[],int n){
    int count=0;int res=0;
    for(int i=0;i<n;i++){
         count=count+arr[i];
         if(count>res)
         res=count;
        if(count<0){
        count=0;
        }
       res=Math.max(res,count);

    }
    return res;
   } 
}