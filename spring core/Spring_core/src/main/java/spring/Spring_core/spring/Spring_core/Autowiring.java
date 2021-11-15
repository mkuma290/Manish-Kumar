package spring.Spring_core.spring.Spring_core;

public class Autowiring 
  {
	private Banker banker;

	public Banker getBanker() {
		return banker;
	}

	public void setBanker(Banker banker) {
		this.banker = banker;
	}

	

	public Autowiring() {
		super();
		
	}

	@Override
	public String toString() {
		return "Autowiring [banker=" + banker + "]";
	}
	
}
