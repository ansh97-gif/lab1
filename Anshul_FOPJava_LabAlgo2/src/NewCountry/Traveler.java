package NewCountry;

public class Traveler {

	 public  void minNotes(int[] denomination,int amount) {
	       
	        int result[]=new int[denomination.length];
	        Traveler h=new Traveler();
	        int k=0;
	        h.sort(denomination,0,denomination.length-1);
	        for(int i=0;i<denomination.length;i++){
	            result[i]=amount/denomination[i];
	            amount%=denomination[i];
	            if(amount==0)
	                break;
	        }
	        if(amount>0){
	            System.out.println("Could not pay with the current denomination");
	        }
	        else{
	            System.out.println("Your payment approach in order to give min no of notes will be");
	            for(int i=0;i<result.length;i++){
	              if(result[i]>0)
	              System.out.println(denomination[i]+":"+result[i]);  
	            }
	        }
	        
	        
	        
	    }
	    public void sort(int[] denomination,int start,int end){
	        Traveler h=new Traveler();
	        if(start<end){
	          int mid=start+(end-start)/2;
	          h.sort(denomination,start,mid);
	          h.sort(denomination,mid+1,end);
	         h.merge(denomination,start,mid,end);
	         
	        }
	        
	    }
	   public void merge(int[] denomination,int start,int mid,int end){
	         Traveler h=new Traveler();
	        int n1=mid-start+1;
	        int n2=end-mid;
	        int [] left=new int[n1];
	        int [] right=new int[n2];
	        for(int i=0;i<n1;i++){
	            left[i]=denomination[start+i];
	        }
	        for(int j=0;j<n2;j++){
	            right[j]=denomination[mid+1+j];
	        }
	        int i=0,j=0,k=start;
	        while(i<n1&&j<n2){
	          if(left[i]>=right[j]){
	            denomination[k]=left[i];
	            i++;
	          }
	          else if(left[i]<right[j]){
	              denomination[k]=right[j];
	              j++;
	          }
	          k++;
	        }
	        while(i<n1){
	            denomination[k]=left[i];
	            k++;
	            i++;
	        }
	        while(j<n2){
	            denomination[k]=right[j];
	            k++;
	            j++;
	        }
	        
	        
	    } 
	   public void printArray(int[] arr){
	       for(int i=0;i<arr.length;i++){
	           System.out.println(arr[i]);
	       }
	   }
}
