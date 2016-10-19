import java.util.Scanner;
public class Point2 {
	double x, y, x0, y0;
	
	Point2() {
		x = 0;
		y = 0;
		x0 = 0;
		y0 = 0;
	}
	
	void scan()  { 
	    
	    Scanner sc = new Scanner(System.in);
 	    x = sc.nextDouble();
	    y = sc.nextDouble();
		x0 = sc.nextDouble();
		y0 = sc.nextDouble();
	}
	
	void setX(double coordinateX){ // сет ничего не возвращает, поэтому войд. сет делаем для того, чтобы можно было проверять значения 
		x = coordinateX;	
	}
	
	void setY(double coordinateY){
		y = coordinateY;
	}
	
	double getX(){ // дай, пожалуйста, икс. возвращаем. поэтому в скобках пусто.
		return x;
	}
	
	double getY(){
		return y;
	}
	
	void setX0(double coordinateX0){ // сет ничего не возвращает, поэтому войд. сет делаем для того, чтобы можно было проверять значения 
		x = coordinateX0;	
		
	}
	
	void setY0(double coordinateY0){
		y = coordinateY0;
	}
	
	double getX0(){ // дай, пожалуйста, икс. возвращаем. поэтому в скобках пусто.
		return x0;
	}
	
	double getY0(){
		return y0;
    }
	
}