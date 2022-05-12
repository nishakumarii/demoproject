#include<stdio.h>
#include<stdlib.h>
int main()
{ int n,r,s=0,temp;
printf("enter any valid number n");
scanf("%d",&n);
temp=n;
while(n>0)

{ r=n%10;

  s=s+(r*r*r);
  n=n/10;

} 
if (temp==s)
printf("armostrong number");
else
printf("not a armostrong number");

return 0;
}
