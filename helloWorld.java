import java.io.*;

public class helloWorld
{
	private String Name;

	public void helloWorld(String Name){
		this.Name=Name;
	}
	public String getName(){
		return this.Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public void print(){
		System.out.print("Hello "+this.Name+"\n");

	}
}

