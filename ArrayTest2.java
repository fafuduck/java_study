// import java.util.*; //��ʵ����ʱ���õ�����
//  ��3 1 4  2  7 5��������

class ArrayTest2
{

	//��ӡ����ģ��
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

	//��������ģ��  ��С����
	public static void selectSort(int[] arr)  
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])             //�Ӵ�С��>�ĳ�<
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

	//ð������  ���Գ���
	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-x-1; y++) // -x:��ÿһ�αȽϵ�Ԫ�ؼ��٣�
							   //-1������Ǳ�Խ�� 
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

	//��������ʲô���򣬶���Ҫ������������Ԫ�ؽ���λ���û���
	//���Կ��԰��ⲿ����ͬ�Դ�����ȡ������������װ��һ������.
	public static void swap(int[] arr,int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};

		printArray(arr); //����ǰ��ӡ


		Array.sort(arr);  //java���Ѿ�����ö�һ������ʽ��������ʹ��

		selectSort(arr);

		printArray(arr);//������ӡ
	}
}