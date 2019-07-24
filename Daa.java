class AssignmentProblem{
	public AssignmentProblem(){}
		
	
	int costFunction(int i,int j,int k,int l)
	{return i+j+k+l;}
	
	public void ExhaustiveSearch(int person[][]){
	int answer[] = new int[4];
	int min = 99999;

	for(int i=0;i<person.length;i++)
	{
		for(int j=0;j<person.length;j++){
				
				for(int k=0;k<person.length;k++)
				{
				
					for(int l=0;l<person.length;l++)
					{
						if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
						{
							if(min>costFunction(person[0][i],person[1][j],person[2][k],person[3][l]))
							{
									min = costFunction(person[0][i],person[1][j],person[2][k],person[3][l]);
									answer[0] = i;
									answer[1] = j;
									answer[2] = k;
									answer[3] = l;
							}
						
						}
					
					
					}
				}
		}
	
	}
	
	
	System.out.println("person(1,2,3,4) : "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]);
	System.out.println("CostFunction: "+costFunction(person[0][answer[0]],person[1][answer[1]],person[2][answer[2]],person[3][answer[3]]));
	
	}

}


public class Daa{

public static void main(String args[])
{
	AssignmentProblem a = new AssignmentProblem();
	
	int person[][] = {{9,2,7,8},{6,4,3,7},{5,8,1,8},{7,6,9,4}};
	a.ExhaustiveSearch(person);


}

}