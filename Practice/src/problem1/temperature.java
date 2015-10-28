package problem1;

class temperature1{
	private double value;//declaring variables
	private char scale;
	
public temperature1()//constructor
{
	value = 0;//initializing variables
	scale = 'C';
}
public temperature1(double value, char scale)// constructor
{
	set_temperature1(value, scale);
}
public double getTempInCelcius()//accessor
{
		if(scale == 'C')
			return value;//accessor always has return value
		else
			return (double).55*(value-32);
}
public double getTempInFahrenheit()
{
	if(scale == 'F')
		return value;
	else
		return (double)(1.8*(value))+32;
}
public void setValue(double value)//mutator
{
	this.value = value;//always contains this.
}
public void setScale(char scale)
{
	this.scale = scale;
	if(scale == 'F')
	this.scale = scale;
	else
		this.scale = scale;
	
}
public boolean isGreater(temperature1 another){
return(this.getTempInCelcius()>another.getTempInCelcius());
}
public boolean equals(temperature1 another){
return(this.getTempInCelcius()==another.getTempInCelcius());
}
public boolean isLess(temperature1 another){
return(this.getTempInCelcius()<another.getTempInCelcius()); 	
	
}
}
