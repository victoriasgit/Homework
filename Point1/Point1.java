import java.util.Scanner;
import java.io.*;
public class Point1 {
	double x, y, x0, y0;
	
	Point1() {
		x = 0;
		y = 0;
		x0 = 0;
		y0 = 0;
	}
	
	void scan() throws FileNotFoundException { 
	    File f = new File("C:\\Lessons\\Point.txt");   //����
	    Scanner sc = new Scanner(f);   //���������� ����
		sc.useDelimiter(", ");
 	    x = sc.nextDouble();
		y = sc.nextDouble();
		x0 = sc.nextDouble();
		y0 = sc.nextDouble();
	}
	
	void setX(double coordinateX){ // ��� ������ �� ����������, ������� ����. ��� ������ ��� ����, ����� ����� ���� ��������� �������� 
		x = coordinateX;	
	}
	
	void setY(double coordinateY){
		y = coordinateY;
	}
	
	double getX(){ // ���, ����������, ���. ����������. ������� � ������� �����.
		return x;
	}
	
	double getY(){
		return y;
	}
	
	void setX0(double coordinateX0){ // ��� ������ �� ����������, ������� ����. ��� ������ ��� ����, ����� ����� ���� ��������� �������� 
		x = coordinateX0;	
		
	}
	
	void setY0(double coordinateY0){
		y = coordinateY0;
	}
	
	double getX0(){ // ���, ����������, ���. ����������. ������� � ������� �����.
		return x0;
	}
	
	double getY0(){
		return y0;
    }
	
}