class Stack{
	private int[] dataArray;
	//stack(){
		//dataArray=new int[0];
	//}
	private void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+1];
		for(int i=0; i<dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
		}
	
	public void push(int data){
		extendsArray();
		dataArray[dataArray.length-1]=data;
	}
	
	public void pop(){
		
	}
	
	public int search(int data){
		return-1;
	}
	
	public void display(){
		
	}
}

class Demo{
	public static void main(String[] args){
		Stack s1=new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.display();
		s1.pop();
		s1.display();
	}
}
