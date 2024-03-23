package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classes.AlunoClasse;

public class ExecutavelJava {
	public static void main (String[] args) {
	
	/*/*Informando DADOS pela captura feita pelo teclado*/
	String nome = JOptionPane.showInputDialog("Qual seu nome ?");
	String idade = JOptionPane.showInputDialog("Qual sua idade ?");
	String cpf = JOptionPane.showInputDialog("Qual seu CPF");
	String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento ?");
	String nomePai = JOptionPane.showInputDialog("Qual nome do seu pai ?");
	String nomeMae = JOptionPane.showInputDialog("Qual nome da sua mãe ?");
	String nota1 = JOptionPane.showInputDialog("Nota 1");
	String nota2 = JOptionPane.showInputDialog("Nota 2");
	String nota3 = JOptionPane.showInputDialog("Nota 3");
	String nota4 = JOptionPane.showInputDialog("Nota 4");
	
	/*new Aluno() é uma instancia (Criação do objeto)*/
	AlunoClasse aluno1 = new AlunoClasse();
	
	/*setando os dados para dentro do objeto*/
	/*aluno1 é uma referencia para o objeto Aluno*/
	aluno1.setNome(nome);
	aluno1.setIdade(Double.parseDouble(idade));
	aluno1.setCpf(cpf);
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setNomePai(nomePai);
	aluno1.setNomeMae(nomeMae);
	aluno1.getDisciplina().setNota(Double.parseDouble(nota1));
	aluno1.getDisciplina().setNota(Double.parseDouble(nota2));
	aluno1.getDisciplina().setNota(Double.parseDouble(nota3));
	aluno1.getDisciplina().setNota(Double.parseDouble(nota4));
	
	/*Imprimindo na tela*/
	System.out.println(aluno1.toString());
	System.out.println("A media do aluno é = " + aluno1.getMediaNota());
	System.out.println("Com as notas informadas acima o aluno está: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
		
		
		/*Equals e hashcode (Diferenciar e comparar objetos
		AlunoClasse aluno1 = new AlunoClasse();
		aluno1.setNome("Larry");
		
		AlunoClasse aluno2 = new AlunoClasse();
		aluno2.setNome("Larry");
		
		if (aluno1 .equals(aluno2)) {
			System.out.println("os alunos são iguais");
		} else {
			System.out.println("Os alunos não são iguais"); 
		}*/
	
		}
		
	}

