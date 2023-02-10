public class binsearch {
    public static void main(String[] args) {
  System.out.println(taskManagerIterative(4));
  System.out.println(taskManagerRecursive(4));
    }
    
    public static int taskManagerIterative(int n){
    int[] a = new int[n];
    a[0] = 0;
    a[1]= 1;
    for(int i=2; i<n; i++){
        a[i] = a[i-1] + a[i-2];
      
    }
   return a[n-1];
}
public static int taskManagerRecursive(int n){
    if(n==0 || n== 1){
        return n;
    }
    return taskManagerRecursive(n-1) + taskManagerRecursive(n-2);
}
}