class Array2demo
{
	public static void main(String[] args)
	{
//		int[] arr = new int[3]; //һά����

//		int[][] arr = new int [3][4];//����������Ϊarr�Ķ�ά����	

//		System.out.println(arr[0][1]);

		/*
		int[][]arr = new int [3][];
		System.out.println(arr[0]);  //��ӡ��null

		arr[0] = new int[3];		
		arr[1] = new int[1];
		arr[2] = new int[2];

		System.out.println(arr.length); //��ӡ�Ƕ�ά����ĳ���3

		System.out.println(arr[0].length);//��ӡ����ά�����е�һ��һά����ĳ���

		*/

		int[][]arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};	

		int sum = 0;
		for(int x=0; x<arr.length; x++)
		{
			sum = sum + arr[x][y];
		}

		System.out.println("sum="+sum);

	}
}