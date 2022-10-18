
public class Onibus  extends Veiculo{
	
	private int assentos ;

	public Onibus(String placa, int Ano, int assentos) {
		this.setAssentos(assentos);
		this.setPlaca(placa);
		this.setAno(Ano);
	}
	
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	@Override
	public void exibirDados() {
		System.out.println(" onibus:  placa "+ getPlaca()+ " Ano "+ getAno()+ " Assentos: "+ getAssentos());
	}
	@Override
	public String toString(){
		   return "Placa: " + this.getPlaca() + " Ano: " + this.getAno() + " Assentos "+  this.getAssentos() + "\n";
	}	   
}