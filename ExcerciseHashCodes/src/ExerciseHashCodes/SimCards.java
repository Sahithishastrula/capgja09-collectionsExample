package ExerciseHashCodes;

public class SimCards {
	private String name;
	private int speed;
	public SimCards() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SimCards(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Hascode is"+this.name+" & "+this.speed);
		return speed+name.length();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Equals is used for "+this.name+"& "+speed);
		boolean res=false;
		if(obj instanceof SimCards) {
			SimCards s=(SimCards)obj;
			boolean a=this.speed==s.speed;
			boolean b=this.name.equals(s.name);
			return a&&b;
		}
		else {
			res=false;
		}
		return res;
	}

}
