
public class Caminhao extends Veiculo{
	
	private int eixos;
	
	public Caminhao() {

	}

	public Caminhao(String placa, int Ano, int eixo) {
		this.eixos = eixo;
		this.setAno(Ano);
		this.setPlaca(placa);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Caminhão: placa "+ getPlaca()+ " Ano "+ getAno()+" Eixo: "+ getEixos());
		
	}
	@Override
	public String toString(){
		   return "Placa: " + this.getPlaca() + " Ano: " + this.getAno() + " eixo "+  this.getEixos()+ "\n";
		}
}