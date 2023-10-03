package paymoney;

public class PayMoney {
	public void transactions(int[] arr,int target) {
	        int sum=0;
	        for(int i=0;i<arr.length;i++){
	           sum+=arr[i];
	           if(target<=sum){
	               System.out.println("Target is achieved after "+
	               (i+1)+" transactions");
	               break;
	           }
	           
	        }
	        if(target>sum){
	            System.out.println("Given target is not achieved");
	        }
	}

}
