/*
һά����Ķ��巽ʽ��int[] x; int x[];
��ά����Ķ��巽ʽ: int[][]y; int y[][]; int [] y[];

int []x,y[]; // xһά��y��ά
����:
int[] x;
int[] y[];

a.
x[0]=y;  //error


b.
y[0] = x;  //yes

c.
y[0][0]=x;  //error

d.
x[0][0]=y; //error

e.
y[0][0]=x[0]; //yes

f.
x=y; //error


*/