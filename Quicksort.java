public class Solution {
    public static void helperQuick(int input[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partation(input,si,ei);
        helperQuick(input,si,pivotIndex-1);
        helperQuick(input,pivotIndex+1,ei);
        }
    public static int partation(int input[],int si,int ei){
     int pivotelement=input[si];
        int count=0;
        for(int i=si+1;i<=ei;i++){
            	
            if(input[i] < pivotelement){
                count++;
            }
           
        }
        
         int pivpos = si+count;
            int temp=input[si];
            input[si]=input[si+count];
            input[si+count]=temp;
//         while(si<ei){
//             if(input[si]<pivotElement){
//                 si++;
//             }else if(input[ei]>=pivotelement){
//                 ei--;
//             }else{
//                 temp=input[si];
//                 input[si]=input[ei];
//                 input[ei]=temp;
//                 si++;
//                 ei--;
                
//             }
            
//         }
//         return si+count;
//     }
        int j=ei;
        int k=si;
	while(k<pivpos && j>pivpos) {
		
		if(input[k] >= input[pivpos]) {
			
			if(input[j]<input[pivpos]) {
				 temp = input[k];
				input[k] = input[j];
				input[j] = temp;
				j--;
				k++;
                
                
			}
			else {
				j--;
			}
		}
		else {
			k++;
		}
	}
	
		return pivpos;
    }
    
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        helperQuick(input,0,input.length-1);
		
	}
	
}
