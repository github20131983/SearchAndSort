package experiment;

import java.io.IOException;

import util.InputAndOutputRedirect;
import util.SortUtil;

//创建确定范围的确定数目的随机数数据,写入文件
public class createData {
	public static void main(String[] args) throws IOException{		
		SortUtil su=new SortUtil();
		int[] test=su.randomNum(100000, 100000);
		InputAndOutputRedirect.fopenOut("file/input.txt");
		su.print10(test);
		InputAndOutputRedirect.close();
	}	
}
