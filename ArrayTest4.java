//数组的查找操作

//练习：有一个有序的数组，想要将一个元素插入该数组中，还要保证该数组是有序的。
//如何获取该元素在数组中的位置

class ArrayTest4
{
	public static void main(String[] args)
	{
//		int[] arr = {3,1,5,4,2,9};
//		int index = getIndex(arr,20);
//		System.out.println("index="+index);


		int[] arr = {2,4,5,7,19,32,45};
		int index = halfSearch(arr,8);
		System.out.println("index="+index);

	}

	public static int getIndex_2(int[] arr, int key)
	{
		int min = 0,max = arr.length-1,mid;

		while(min<=max)
		{
			mid = (max+min)>>1;

			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid -1;
			else
				return mid;
		}
		return min;
	}

	

	//折半查找。提高效率，但是必须要保证数组是有序的数组
	public static	 int halfSearch(int[] arr, int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;

		while(arr[mid]!=key)
		{
			if(key>arr[mid])
			{
				min = mid + 1;	
			}
			else if(key<arr[mid])
				max = mid -1;

			if(min>max)
				return -1;
			
			mid = (max+min)/2;
		}
		return mid;
	}

	//折半的第二种方式
  	public static int halfSearch_2(int[] arr, int key)
	{
		int min = 0,max = arr.length-1,mid;

		while(min<=max)
		{
			mid = (max+min)>>1;

			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid -1;
			else
				return mid;
		}
		return -1;
	}

	//定义高能，获取key第一次出现在数组中的位置。如果返回-1，那么代表不存在。
	public static int getIndex(int[] arr, int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x] == key)
				return x;
		}
		return -1;
	}
}