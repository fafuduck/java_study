class ArrayTest6
{
	public static void main(String[] args)
	{
		toHex(60);
	}

	public static void toBin(int num)
	{
		//��������Ƶı�
		char[] chs = {'0','1'};

		//����һ����ʱ�洢����
		char[] arr = new char[32];

		//����һ�����������ָ��
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & 1;
			
			arr[--pos] = chs[temp];
			
			num = num >>>1;
		}

		for(int x=0; x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

	/*
	�����������Ԫ����ʱ�洢������������Ӧ��ϵ
	ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����Ҷ�Ӧ��Ԫ��
	������-10+'a'�򵥵Ķ�
		
	�������ô������
	����ͨ���������ʽ������

	�������ڳ�����ˣ������Ƿ��ŵġ���Ҫ������������ͨ��StringBuffer reverse���������
	����������߻�û��ѧϰ

	���Կ���ʹ���Ѿ�ѧϰ������������������ɴ洢
	
	*/



	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3',
				'4','5','6','7',
				'8','9','A','B',
				'C','D','E','F'};

		//����һ����ʱ����
		char[] arr = new char[8];//'\u0000s'

		int pos = arr.length-1;
		

		while(num!=0)
		{
			int temp = num&15;
		//	System.out.println(chs[temp]);	
			arr[--pos] = chs[temp];

			num = num >>>4;
		}	
		System.out.println("pos="+pos);
		//�洢���ݵ�arr�������
		for(int x =pos; x<arr.length; x++)
		{
			System.out.print(arr[x]+",");
		}		

	}



}
	