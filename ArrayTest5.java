class ArrayTest5
{
	public static void main(String[] args)
	{
		//toBin(6);
		System.out.println(Integer.toBinaryString(60));
	}


	//十进制-->二进制
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2);
			num = num / 2;
		}
		System.out.println(sb.reverse());
	}

	//十进制-->十六进制
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for(int x=0; x<8; x++)
		{
			int temp = num & 15;
			if(temp > 9)
			{
				sb.append((char)temp-10+'A');
				//System.out.println((char)temp-10+'A');
			}
			else 
				sb.append(temp);
				//System.out.println(temp);
			num = num >>> 4;  // >>>无符号右移
		}
		System.out.println(sb.reverse());
	}

}