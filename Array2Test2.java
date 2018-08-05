/*
一维数组的定义方式：int[] x; int x[];
二维数组的定义方式: int[][]y; int y[][]; int [] y[];

int []x,y[]; // x一维，y二维
解释:
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