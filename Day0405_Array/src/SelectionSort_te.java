
public class SelectionSort_te {
	public static void main(String[] args) {

		int[] arr = { 3, 5, 4, 1, 2 };

		/* for(int i =0;i<arr.length-1;i++) {
	            //배열 안에서 최소값을 찾기위해서는 내부비교를 해야 한다.
	            //배열에서 가장 앞에 있는 수를 최소값이라고 가정하겠다.
	            int minVal = arr[i];//이미 자리를 찾은 숫자는 비교대상에서 제외 
	            for(int j=i+1;j<arr.length;j++) {
	                //minVal가 비교대상보다 크다면, 비교대상을 최소값으로 만들어줌
	                //값바꿔주기 minVal과 비교 대상 자리 바꿔주기
	                if(minVal > arr[j]) {
	                    int tmp = minVal;
	                    minVal = arr[j]; //비교대상을 최소값으로 만들어주기
	                    arr[j] = tmp;
	                }
	            } //반복문이 끝이 나면 최소값이 minVal에 저장되어 있음
	            //최소값이 들어갈 자리에 최소값을 넣어줌
	            arr[i] = minVal;
	        }//최소값을 자리에 넣어주는 반복문 끝
	         
	        // 반복문이 끝이나면 정렬된 배열을 얻을 수 있음
	        for(int num:arr) {
	            System.out.print(num+ " ");
	        }
	         */
	         // 이번에는 최소값을 찾아서 바로 바꾸지 않고, 자리 위치만 가지고 잇기

		
			for(int i=0;i<arr.length;i++) {
				//알고 있어야 하는 값: 최소값, 최소값의 자리번호
				int minVal; //최소값
				int minPos; //최소값 자리번호
				
				minVal = arr[i];
				minPos = i;
				for(int j=i;j<arr.length;j++) {
					if(minVal>arr[j]) {
						minVal=arr[j]; //최소값 위치저장
						minPos=j;
					//배열은 그대로 있고 위치만 바뀐다.
					
					}
				}
				arr[minPos]= arr[i];
				arr[i]=minVal;
				//최소값을 찾아서 최소값과 현재 자리에 잇는 값을 위치 바꿔주기
			}
			System.out.println();
			for(int num:arr) {
				System.out.println(num);
			}
		
		
	    }
	}