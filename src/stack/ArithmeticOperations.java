package stack;

import java.util.Stack;

public class ArithmeticOperations {
	/*根据后缀式计算*/
	public int calculate(String suffix){
		Stack<Integer> stack=new Stack<>();
		String[] str=suffix.split(" ");
		int result=0;
		for(int i=0;i<str.length;i++){
			if(isOperator(str[i].charAt(0))){
				result=calculateHelper(stack.pop(),stack.pop(),str[i].charAt(0));
				stack.push(result);
			}
			else 
				stack.push(Integer.parseInt(str[i]));
		}
		stack.clear();
		return result;
	}
	
	/*中缀式转后缀式*/
	public String convertFromInfixToSuffix(String infix){
		StringBuilder suffix=new StringBuilder("");
		Stack<Character> stack=new Stack<>();
		char[] infixArray=infix.toCharArray();
		for(int i=0;i<infixArray.length;i++){
			if(isOperator(infixArray[i])){
				if(infixArray[i]=='(')//左括号直接入栈
					stack.push(infixArray[i]);
				else if(infixArray[i]==')'){//右括号将它与左括号之间的数据出栈
					char temp=stack.pop();
					while(temp!='('){
						suffix.append(temp+" ");
						temp=stack.pop();
					}
				}else{//+-*/操作符根据优先级出栈,若栈空则直接压栈，栈不空则比较优先级
					while(stack.size()>0&&judgePrior(infixArray[i], stack.peek()))
						suffix.append(stack.pop()+" ");
					stack.push(infixArray[i]);
				}
			}
			else{ //如果是数字则直接输出
				int temp=0;
				while(i<infixArray.length&&isDigit(infixArray[i]))
					temp=temp*10+(infixArray[i++]-'0');
				i--;
				suffix.append(temp+" ");
			}
		}
		while(stack.size()>0)//检查完所有元素后栈中还有值，直接全部出栈
			suffix.append(stack.pop()+" ");
		return suffix.toString();		
	}
	
	/*得到操作符的优先级*/
	public int prior(char operation){
		if(operation=='+'||operation=='-')
			return 1;
		if(operation=='*'||operation=='/')
			return 2;
		return 0;
	}
	
	/*判断操作符的优先级*/
	public boolean judgePrior(char operation1,char operation2){
		return prior(operation1)<=prior(operation2);
	}
	
	/*判定是否为操作符*/
	public boolean isOperator(char value){
		if(value=='+'||value=='-'||value=='*'||value=='/'||value=='('||value==')')
			return true;
		return false;
	}
	
	/*判定是否为数字*/
	public boolean isDigit(char value){
		if(value>='0'&&value<='9')
			return true;
		return false;
	}
	
	/*辅助计算*/
	public int calculateHelper(int add1,int add2,char operation){
		switch (operation) {
		case '+':
			return add2+add1;
		case '-':
			return add2-add1;
		case '*':
			return add2*add1;
		case '/':
			return add2/add1;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args){
		String str="9+(3-1)*3+10/2";
		ArithmeticOperations ao=new ArithmeticOperations();
		System.out.print(ao.calculate(ao.convertFromInfixToSuffix(str)));
	}
}
