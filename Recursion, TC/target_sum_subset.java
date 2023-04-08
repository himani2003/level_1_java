public class target_sum_subset {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        subsets(arr,0,0,60,"");
    }
    public static void subsets(int[] arr, int idx, int sum,int target, String asf){
        if(sum>target){
            return;
        }
        if(idx==arr.length){
            if(sum==target){
                System.out.println(asf+".");
            }
            return;
        }
        int ele=arr[idx];
        subsets(arr, idx+1, sum+ele, target, asf+ele+",");
        subsets(arr, idx+1, sum, target, asf);
    }
}
