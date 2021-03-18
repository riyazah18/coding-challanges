package com.io.riyaz;

public class BinarySearchImpl {
	
public static void search(int arr[],int item){
	int leastIndex=0;
	int highestIndex=arr.length-1;
	int MiddleIndex =(leastIndex+highestIndex)/2;
	
	while(leastIndex <= highestIndex) {
		if(arr[MiddleIndex] == item) {
			System.out.println("Element is at index "+MiddleIndex);
			break;
		}else if(arr[MiddleIndex] < item) {
			leastIndex=MiddleIndex+1;			
		}else {
			highestIndex=MiddleIndex-1;
		}
		MiddleIndex=(leastIndex+highestIndex)/2;
	}
	
		
	}

	public static void main(String[] args) {
		int arr[]= {2,5,7,9,12,14,17,19,20,21,23,24,29};
		search(arr,5);

	}

}
