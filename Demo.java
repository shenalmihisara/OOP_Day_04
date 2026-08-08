/*class stack{
	private int[] dataArray;
	stack(){
		dataArray=new int[0];
	}
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
		int[] tempDataArray=new int[dataArray.length-1];
		if(!isEmpty()){
			for(int i=0; i<tempDataArray.length; i++){
				tempDataArray[i]=dataArray[i];
			}
			dataArray=tempDataArray;
		}
	}
	
	public int search(int data){
		return-1;
	}
	
	public void display(){
		System.out.print("[");
		for(int i=dataArray.length-1; i>=0; i--){
			System.out.print(dataArray[i]+",");
		}
		System.out.println(isEmpty()? "empty":"\b]");
	}
	
	public boolean isEmpty(){
		return dataArray.length<=0;
	}
}

class Demo{
	public static void main(String[] args){
		stack s1=new stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.display();
		s1.pop();
		s1.display();
	}
}*/


class stack{
	private int[] dataArray; 
	stack(){
		dataArray=new int[0];
	}
	public void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+1];
		for(int i=0; i<dataArray.length; i++){
			tempDataArray[i+1]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	
	public void push(int data){
		extendsArray();
		dataArray[0]=data;
	}
	
	public void pop(){
		int[] tempDataArray=new int[dataArray.length-1];
		if(!isEmpty()){
			for(int i=0; i<tempDataArray.length; i++){
				tempDataArray[i]=dataArray[i+1];
			}
			dataArray=tempDataArray;
		}
	}
	
	public void display(){
		System.out.print("[");
		for(int i=0; i<dataArray.length; i++){
			System.out.print(dataArray[i]+",");
		}
		System.out.println(isEmpty()? "empty":"\b]");
	}
	public boolean isEmpty(){
		return dataArray.length<=0;
	}
}

class Demo{
	public static void main(String[] args){
		stack s1=new stack();
		
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
