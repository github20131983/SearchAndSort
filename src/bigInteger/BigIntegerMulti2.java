package bigInteger;

public class BigIntegerMulti2 {
	public String multi(String str1,String str2){
		int[] resArray=new int[str1.length()+str2.length()];
		for(int i=str1.length()-1;i>=0;i--){
			int x=str1.charAt(i)-'0';
			for(int j=str2.length()-1;j>=0;j--){
				int y=str2.charAt(j)-'0';				
				resArray[i+j]+=(resArray[i+j+1]+x*y)/10;
				resArray[i+j+1]=(resArray[i+j+1]+x*y)%10;
			}
		}
		StringBuffer res=new StringBuffer("");
		for(int i=0;i<resArray.length;i++){
			if(i==0&&resArray[i]==0)continue;
			res.append(resArray[i]);
		}
		
		return res.toString();
	}
	public static void main(String[] args){
		String str1="72106547548473106236";
		String str2="982161082972751393";
		System.out.println(new BigIntegerMulti2().multi(str1, str2));
	}
}
