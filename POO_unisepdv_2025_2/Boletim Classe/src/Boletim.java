public class Boletim {
    public static void main(String[] args) {
    // INSTANCIAL UMA CLASSE
    // A CLASSE ALUNO VIRA UM OBJETO ALUNO
    Aluno aluno = new Aluno();
    aluno.b1 = 8.0;
    aluno.b2 = 9.0;
    aluno.setRa("student123");
    aluno.setCurso("analysis and Development of System");

// go get RA of student in class student
    System.out.println(aluno.getRa());
// go get Course of student in class student
    System.out.println(aluno.getCurso());
    }
}
