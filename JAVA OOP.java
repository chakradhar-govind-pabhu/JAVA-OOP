import java.util.Scanner;
import javafx.animation.ScaleTransition; 
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 


public class OOP
{ 
	public static void str_name(String name) {
        System.out.println("My name is " + name);		
	}

	// Example 1
	static void sayHello() {
      System.out.println("Hello World!");
    }

    // Example 2
    static void sayHello1(String name) {
        System.out.println("My name is " + name);
    }    
    
    // Example 3
    static int sum(int val1, int val2) {
      return val1 + val2;
    }
	
	   public void start(Stage stage) {      
      //Drawing a Circle 
      Circle circle = new Circle(); 
      
      //Setting the position of the circle 
      circle.setCenterX(300.0f); 
      circle.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(50.0f); 
      
      //Setting the color of the circle 
      circle.setFill(Color.BROWN); 
      
      //Setting the stroke width of the circle 
      circle.setStrokeWidth(20); 
       
      //Creating scale Transition 
      ScaleTransition scaleTransition = new ScaleTransition(); 
      
      //Setting the duration for the transition 
      scaleTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      scaleTransition.setNode(circle); 
      
      //Setting the dimensions for scaling 
      scaleTransition.setByY(1.5); 
      scaleTransition.setByX(1.5); 
      
      //Setting the cycle count for the translation 
      scaleTransition.setCycleCount(50); 
      
      //Setting auto reverse value to true 
      scaleTransition.setAutoReverse(false); 
      
      //Playing the animation 
      scaleTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object  
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting title to the Stage 
      stage.setTitle("Scale transition example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   }
    


	
	public static void main(String[] args) { 
		String[] names = {"Skail","David","Tom"}; 
		str_name(names[0]);
		sayHello(); // Outputs "Hello World!"
		
		
		System.out.println("");
		System.out.println("Example 2");
		

		System.out.println("");
		System.out.println("Example 4");
		int res = max(7, 42);
        System.out.println(res); //42
		
		New_test_class val_new = new New_test_class();
		val_new.outputs_test();
	}
	
	
	   public void Nbonaci(int n,int m){
   
    int[ ] row = new int[m];// containsNbonaci
    int sum=0; // calculating
    int index=n; // for the array
    int lastZeroIndex=n-2;// for the array 

    // starting problem, print zeros
    for(int i=0;i<=lastZeroIndex;i++)
    System.out.println(row[i]+" ");
    
    //adding the 1
    row[lastZeroIndex+1]=1;
  System.out.println(row[lastZeroIndex+1]+" ");
    
    // calc the rest of nbonaci
    while(index<=(m-1)){
        sum=0;
        // always the last n elements sum
        for(int i=0;i<=n;i++){
        sum=row[index-i]+sum;    
        }
        row[index]=sum; // sum=next value 
        System.out.println(row[index]+" ");
        index++;
    }
   }
   
       public static void main(String[] args) {
        char[] white = {9820,9822,9821,9818,9819,9821,9822,9820,9823};
        char[] black = {9814,9816,9815,9812,9813,9815,9816,9814,9817};
        char x00 = 9556;
        char x01 = 9552;
        char x02 = 9574;

        
        System.out.print(""+x00+x01);
        for (int i=0;i<7;i++)
        System.out.print(""+x02+x01);
        System.out.print(""+x03+"\n");
        
        for (int i=0;i<9;i++) {
        if (i!=8)
        System.out.print(""+x10+white[i]);
        else
        System.out.print(""+x10+"\n");
        }
        
        //for (int i=0;i<8;i++)
        //System.out.print(""+x11+x01);
        //System.out.print(""+x12+"\n");
        
        for (int i=0;i<9;i++) {
        if (i!=8)
        System.out.print(""+x10+white[8]);
        else
        System.out.print(""+x10+"\n");
        }
        
        
        
        for (int i=0;i<9;i++) {
        if (i!=8)
        System.out.print(""+x10+black[i]);
        else
        System.out.print(""+x10+"\n");
        }
        
        System.out.print(""+x20+x01);
        for (int i=0;i<7;i++)
        System.out.print(""+x21+x01);
        System.out.print(""+x22+"\n");
    }
}


public class New_test_class {
    void outputs_test () {
        System.out.println("Hello World and Class New_test_class!");
    }
}
