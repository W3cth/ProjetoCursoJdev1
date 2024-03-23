package cursojava.classes;
/*AULA MTO IMPORTANTE 9.8 DO MODULO 9*/

public class AlunoClasse {
	
	/*Estes são os atributos do aluno ou seja caracteristicas do mundo real que representam o objeto*/
	private String nome;
	private double idade;
	private String cpf;
	private String dataNascimento;
	private String nomePai;
	private String nomeMae;
	
	private Disciplina disciplina = new Disciplina();
	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	
	/*Metodo que retorna a media do aluno*/
	public double getMediaNota() {
		return (disciplina.getNota() + disciplina.getNota()+
				disciplina.getNota()+ disciplina.getNota()) /4;
	}
	
	/*Metodo que retorna se foi aprovado ou não*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
			
		}else {
			return false;
		}
		
	}




	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoClasse other = (AlunoClasse) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return "AlunoClasse [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", disciplina=" + disciplina + "]";
	}
	
}

