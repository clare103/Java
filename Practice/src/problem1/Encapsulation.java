package problem1;
/* File name : EncapTest.java */
class Encapsulation {

	private String name;
	private String idNum;
	private int age;
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getIdNum(){
		return idNum;
	}
	public void setAge( int newAge){
		age = newAge;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setIdNum( String newId){
		idNum = newId;
	}
}
public class Encapsulation{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encap = new Encapsulation();
		encap.setName("Ross");
		encap.setAge(23);
		encap.setIdNum("1711240");
		
		System.out.println("Name: " + encap.getName()+ " Age: "+ encap.getAge());
	}

}
