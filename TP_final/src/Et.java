import java.util.Iterator;

public class Et extends Transformateur {

	@Override
	public void calculerSorties() 
	{
		this.portsSorties[0].setValeur(this.portsEntrees[0].isValeur() && this.portsEntrees[1].isValeur());
		this.portsSorties[0].propagerValeur();
	}
	
	public Et(int id)
	{
		portsEntrees = new PortEntree[2];
		portsSorties = new PortSortie[1];
		
		portsEntrees[0] = new PortEntree(this,0);
		portsEntrees[1] = new PortEntree(this,1);
		
		portsSorties[0] = new PortSortie(this,0);
		
	    this.id = id;
	}
	
	@Override
	public String toString()
	{
		

		String s = "<" + id + "| Et (" +  portsEntrees.length + "," +  portsSorties.length + ") -> " + portsSorties[0].isValeur() ;

		for (int i = 0; i < portsSorties.length; i++) 
		{
			s += "#" + portsSorties[i].getId_port() +"(";
					
			for (Iterator<PortEntree> it = portsSorties[i].getListePortEntreeConnectes().iterator(); it.hasNext();) {
				PortEntree pe = it.next();
				s+=  pe.getProprietairePort().getId() + "#" + pe.getId_port() + ",";				
			}		
			s+=")";			
		}

		s += ">";

		return s;
	}
}