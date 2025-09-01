/*
Herança
Polimorfismo
Encapsulamento

when one attribute on class is public he is visible in any lugar
when one attribute on class is private he is visible only in class
when one attribute on class is protect he is visible only in packages of coding main
*/

// Creating a separate class that can be used as a variable in other files
public class Aluno {
    public String nome;
    public Double b1;
    public Double b2;
    private String ra;
    protected String curso;

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}