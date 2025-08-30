public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int [] arr = new int[2];
            for(int i=0;i<nums.length-1;i++){
                System.out.println("nums[i] "+nums[i]);
               for(int j=i+1;j<nums.length;j++){ 
                System.out.println("nums[j] "+nums[j]);
                //System.out.println("t "+target);
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+nums[i]);
                    arr[0]=i;
                    System.out.println("arr[i]"+arr[0]);
                    arr[1]=j;
                    System.out.println("arr[i]"+arr[1]);
                    //break;
                    
                }
              }
            }
            return arr;
        }
        
        public static void main(String[] args){
            int[] nums ={3,2,3};
            TwoSum obj = new TwoSum();
            int [] result= obj.twoSum(nums,6);
            for(int e : result){
                System.out.print(e+" ");
            }
           
        }
}
