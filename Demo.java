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


/*class stack{
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
	
	public int search(int data){
		for(int i=0; i<dataArray.length; i++){
			if(dataArray[i]==data){
				return i;
			}
		}
		return-1;
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
		
		System.out.println("index of 40 : "+s1.search(10));
	}
}*/


/*class stack{
	private int[] dataArray; 
	private int nextIndex;
	private double loadFacts;
	private int initSize;
	
	stack(int initSize, double loadFacts){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFacts=loadFacts;
		this.initSize=initSize;
	}
	
	public void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFacts*dataArray.length)];
		for(int i=0; i<dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	
	public void push(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	
	public void trimToSize(){
		int[] tempDataArray=new int[nextIndex];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	
	public int size(){
		return nextIndex;
	}
	
	public void trim(){
		//
	}
	
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	
	public void pop(){
		if(!isEmpty()){
			nextIndex--;
		}
	}
	
	public int search(int data){
		return -1;
	}
	
	public void display(){
		System.out.print("[");
		for(int i=nextIndex-1; i>=0; i--){
			System.out.print(dataArray[i]+",");
		}
		System.out.println(isEmpty()?"empty":"\b]");
	}
	
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	
	public int capacity(){
		return dataArray.length;
	}
	
	public int peek(){
		if(isEmpty()){
			return -1;
		}else{
			return dataArray[nextIndex-1];
		}
	}
	
	public int poll(){
		if(isEmpty()){
			return -1;
		}else{
			return dataArray[--nextIndex];
		}
	}
}

class Demo{
	public static void main(String[] args){
		stack s1=new stack(12,0.25);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		s1.push(100);
		s1.push(110);
		s1.push(120);
		
		s1.display();
		
		System.out.println("size : "+s1.size());
		System.out.println("capacity : "+s1.capacity());
		
		s1.push(130);
		
		s1.display();
		System.out.println("size : "+s1.size());
		System.out.println("capacity : "+s1.capacity());
		
		System.out.println("peek num :"+s1.peek());
		s1.display();
		
		System.out.println("--------------------------");
		
		System.out.println("poll num :"+s1.poll());
		s1.display();
		
	}
}*/



class Queue{
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	Queue(int initSize, double loadFact){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFact*dataArray.length)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray; 
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public int peek(){
		return isEmpty() ? -1: dataArray[0]; 
	}
	public int poll(){
		if(!isEmpty()){
			int firstData=dataArray[0];
			remove();
			return firstData;
		}
		return -1;
	}
	public void add(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void trimToSize(){
		int[] tempDataArray=new int[size()];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
	}
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	public void remove(){
		if(!isEmpty()){
			for (int i = 0; i <nextIndex-1; i++){
				dataArray[i]=dataArray[i+1];
			}
			nextIndex--;
		}
	}
	public int search(int data){
		for (int i = 0; i < nextIndex; i++){
			if(dataArray[i]==data){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return dataArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(12,0.25);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		q1.add(80);
		q1.add(90);
		q1.add(100);
		q1.add(110);
		q1.add(120);
		q1.display(); //[10,20,30,40,50 ........120]
		System.out.println("Size      : "+q1.size()); //12
		
		q1.remove();
		q1.display(); //[20,30,40,50 ........120]
		System.out.println("Size      : "+q1.size()); //11
		System.out.println("Index of 50 : "+q1.search(50)); //3
		
		int firstData=q1.peek();
		System.out.println("First data : "+firstData);
		System.out.println("Calling after peek()....");
		q1.display(); //[20,30,40,50 ........120]
		
		firstData=q1.poll();
		System.out.println("First data : "+firstData);
		System.out.println("Calling after poll()....");
		q1.display(); //[30,40,50 ........120]
	}
}
