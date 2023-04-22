package enumeraciones;

public enum Continentes {
	AFRICA(53, "1.2 billones"),
	EUROPA(46, "1.1 billones"),
	ASIA(44, "1.9 millones"),
	AMERICA(34, "1.2 millones"),
	OCEANIA(14, "1.2 billones");
	
	private final int paises;
	private String habitantes;
	
	Continentes(int paises, String habitantes){
		this.paises = paises;
		this.habitantes = habitantes;
	}
	
	//Método GET
	public int getPaises() {
		return this.paises;
	}
	
	//Método GET
		public String getHabitantes() {
			return this.habitantes;
		}


}
