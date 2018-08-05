//����Ĳ��Ҳ���

//��ϰ����һ����������飬��Ҫ��һ��Ԫ�ز���������У���Ҫ��֤������������ġ�
//��λ�ȡ��Ԫ���������е�λ��

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

	

	//�۰���ҡ����Ч�ʣ����Ǳ���Ҫ��֤���������������
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

	//�۰�ĵڶ��ַ�ʽ
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

	//������ܣ���ȡkey��һ�γ����������е�λ�á��������-1����ô�������ڡ�
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