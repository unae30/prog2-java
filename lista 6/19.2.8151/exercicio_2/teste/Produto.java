package tryingex2;


	public abstract class Produto {

		private String identificacao;
		private double custoDeFabricacao;
		
		Produto (String i, double c){
			this.identificacao = i;
			this.custoDeFabricacao = c;
		}
		
		public String getIdentificacao() {
			return identificacao;
		}

		public void setIdentificacao(String identificacao) {
			this.identificacao = identificacao;
		}

		public double getCustoDeFabricacao() {
			return custoDeFabricacao;
		}

		public void setCustoDeFabricacao(double custoDeFabricacao) {
			this.custoDeFabricacao = custoDeFabricacao;
		}
		
		public abstract String toString(double i);
		public abstract void novoCusto(double nc);
	}

