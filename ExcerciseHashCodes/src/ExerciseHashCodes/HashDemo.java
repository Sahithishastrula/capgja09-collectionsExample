package ExerciseHashCodes;
import java.util.*;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SimCards s1=new SimCards("Airtel",4);
			SimCards s2=new SimCards("Airtel",4);
			SimCards s3=new SimCards("IDea",4);
			SimCards s4=new SimCards("Jio",4);
			Set<SimCards> simHash=new HashSet<>();
			simHash.add(s1);
			simHash.add(s2);
			simHash.add(s3);
			simHash.add(s4);
			System.out.println(simHash);
			SimCards s5=new SimCards("Airtel",4);
			System.out.println(simHash.contains(s5));
			SimCards s6=new SimCards("Bsnl",4);
			System.out.println(simHash.contains(s6));


	}

}
