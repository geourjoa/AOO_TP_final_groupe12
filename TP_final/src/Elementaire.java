import java.util.Iterator;

public abstract class Elementaire implements Composant {

	protected int id;
	
	protected PortEntree[] portsEntrees;

	protected PortSortie[] portsSorties;

	public int getId()
	{
		return id;
	}

	public PortSortie getNiemePortSortie(int n) {
		return portsSorties[n];
	}

	@Override
	public PortEntree getNiemePortEntree(int n) {
		return portsEntrees[n];
	}

	@Override
	public void definirPortEntreeComposant(PortEntree pe, int numeroPort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void definirPortSortieComposant(PortSortie ps, int numeroPort) {
		// TODO Auto-generated method stub
		
	}
	
}