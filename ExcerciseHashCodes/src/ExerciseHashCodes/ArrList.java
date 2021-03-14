package ExerciseHashCodes;
import java.util.*;
public class ArrList {
	public static void main(String[] args) {
		SimCards s1=new SimCards("Airtel",4);
		SimCards s2=new SimCards("Airtel",4);
		SimCards s3=new SimCards("IDea",4);
		SimCards s4=new SimCards("Jio",4);
		List<SimCards> simList=new ArrayList<>();
		simList.add(s1);
		simList.add(s2);
		simList.add(s3);
		simList.add(s4);
		//System.out.println(simList);
		SimCards s5=new SimCards("Airtel",4);
		System.out.println(simList.contains(s5));
		SimCards s6=new SimCards("Bsnl",4);
		System.out.println(simList.contains(s6));


	}
}
