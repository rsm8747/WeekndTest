package Weekend_Test;

public class Actor 
{
	String actor_Name;int actor_Id;
	Actor(){}
	Actor(String actor_Name,int actor_Id)
	{
		this.actor_Name = actor_Name;
		this.actor_Id = actor_Id;
	}
	public String toString() {
		return "Name of the Actor " + actor_Name +" Actor Id " +actor_Id;
	}
}
class Movie
{
	String name;String producer;double budget;Actor ar;
	Movie(){}
	Movie(String name,String producer,double budget,Actor ar)
	{
		this.name = name;
		this.producer = producer;
		this.budget = budget;
		this.ar = ar;
	}
	public String toString() {
		return "Movie name :"+ name + "\nProducer name : " + producer + "\nBudget of Movie : " + budget + "\nActor : " + ar;
	}

}
