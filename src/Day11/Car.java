package Day11;

public class Car {
	private String brand;

	Mirror[] mirrors;

	private Engine engine;

	Tyre[] tyres = new Tyre[4];
	{
		for (int i = 0; i < tyres.length; i++) {
			tyres[i] = new Tyre();
		}
	}
	// EARLY INSTANTIATION BY CREATING NON-STATIC BLOCK
//	{
//		engine = new Engine(4, "100hp", "hybrid");
//	}

	public void getMirror(){
		mirrors=new Mirror[4];
		for(int i=0;i<mirrors.length;i++) {
			mirrors[i]=new Mirror();
		}
	}
	Car(String brand, Engine engine) {
		this.brand = brand;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine eng) {
		this.engine = eng;
	}

}
