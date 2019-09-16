package bigInteger;

import java.math.BigInteger;

public class BigIntegerMulti {
public String multiSingle(String num1,String num2,int e){
	String result="";
	int carry=0,sum=0;
	for(int i=num1.length()-1;i>=0;i--){
		int temp=Integer.parseInt(String.valueOf(num1.charAt(i)))*
				Integer.parseInt(String.valueOf(num2.charAt(0)))+carry;
		carry=temp/10;
		sum=temp%10;
		result=String.valueOf(sum)+result;
	}
	if(carry>0)result=carry+result;
	while(e-->0)result+=0;
	return result;
}

public String multi(String num1,String num2){
	String res="";
	for(int i=num2.length()-1;i>=0;i--){
		String temp=multiSingle(num1, String.valueOf(num2.charAt(i)), num2.length()-i-1);
		res=add(temp, res);
	}		
	return res;	
}

public String add(String num1,String num2){
	if(num1==null||num1.isEmpty())
		   return num2;
	    if(num2==null||num2.isEmpty())
		   return num1;
	    char num1Array[]=num1.toCharArray();
	    char num2Array[]=num2.toCharArray();
	    StringBuffer c=new StringBuffer();
	    
	    int num1len=num1.length()-1;
	    int num2len=num2.length()-1;
	    int aSingle,bSingle;
	    int carry=0;	    
     int result;
     
     while(num1len>=0||num2len>=0||carry>0){
     	aSingle=(num1len>=0)?Character.getNumericValue(num1Array[num1len--]):0;
     	bSingle=(num2len>=0)?Character.getNumericValue(num2Array[num2len--]):0;
     	result=(aSingle+bSingle+carry)%10;
     	carry=(aSingle+bSingle+carry>=10)?1:0;
     	c.append(result);
     }
     return c.reverse().toString();
}

public static void main(String[] args){
	BigIntegerMulti mbi=new BigIntegerMulti();
	BigInteger x=new BigInteger("991086334737101014141447823434124179111084831929311089596731075933473557543639836");
	BigInteger y=new BigInteger("73378335716510109111963597814326771110829569262663543213269127839633");
	System.out.println(x.multiply(y));
	System.out.println(mbi.multi("991086334737101014141447823434124179111084831929311089596731075933473557543639836", 
			                     "73378335716510109111963597814326771110829569262663543213269127839633"));
}
}
