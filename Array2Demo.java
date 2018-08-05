class Array2demo
{
	public static void main(String[] args)
	{
//		int[] arr = new int[3]; //一维数组

//		int[][] arr = new int [3][4];//定义了名称为arr的二维数组	

//		System.out.println(arr[0][1]);

		/*
		int[][]arr = new int [3][];
		System.out.println(arr[0]);  //打印出null

		arr[0] = new int[3];		
		arr[1] = new int[1];
		arr[2] = new int[2];

		System.out.println(arr.length); //打印是二维数组的长度3

		System.out.println(arr[0].length);//打印出二维数组中第一个一维数组的长度

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