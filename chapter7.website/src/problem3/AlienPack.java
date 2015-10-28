package problem3;

public class AlienPack {

	private Alien[] aliens;
	
	public AlienPack(int numAliens)
	{
		aliens = new Alien[numAliens];
	}
	public void addAlien(Alien newAlien, int index)
	{
		aliens[index] = newAlien;
	}
	public Alien[] getAliens()
	{
		return aliens;
	}
	public int calculateDamage()
	{
		int damage =0;
		for(int i=0; i < aliens.length; i++)
		{
			if(aliens[i].type==Alien.SNAKE_ALIEN)
			{
				damage += 10;
			}
			else if(aliens[i].type== Alien.OGRE_ALIEN)
			{
				damage += 6;
			}
			else if(aliens[i].type==Alien.MARSHMALLOW_MAN_ALIEN)
			{
				damage +=1;
			}
		}
		return damage;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
