import java.io.*;

public class helloWorldGender extends helloWorld
{
	private boolean Gender;

	public helloWorldGender(boolean Gender, String Name){
		super(Name);
		this.Gender=Gender;
	}
	public void print(){
		if(this.Gender)
			System.out.print("Hello Mr "+this.Name+"\n");
		else 
			System.out.print("Hello Mme "+this.Name+"\n");

	}
}

