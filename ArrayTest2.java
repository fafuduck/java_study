// import java.util.*; //真实开发时候用的排序
//  对3 1 4  2  7 5进行排序

class ArrayTest2
{

	//打印数组模块
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
			{
				System.out.print(arr[x]+",");
			}
			else 
			{
				System.out.println(arr[x]+"]");
			}
		}
	}

	//排序数组模块  从小到大
	public static void selectSort(int[] arr)  
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])             //从大到小把>改成<
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp; 	
					*/
					swap(arr,x,y);
				}
			}	
		}
	}

	//冒泡排序  面试常考
	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-x-1; y++) // -x:让每一次比较的元素减少，
							   //-1：避免角标越界 
			{
				if(arr[y]>arr[y+1])
				{
					/*
					int temp = arr[y];			
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,x,y);
				}
			}
		}
	}

	//发现无论什么排序，都需要对满足条件对元素进行位置置换。
	//所以可以把这部分相同对代码提取出来，单独封装成一个函数.
	public static void swap(int[] arr,int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};

		printArray(arr); //排序前打印


		Array.sort(arr);  //java中已经定义好对一种排序方式。开发中使用

		selectSort(arr);

		printArray(arr);//排序后打印
	}
}