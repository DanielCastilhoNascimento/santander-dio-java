package intermeriario.Projeto_Bootcamp;

public class Curso extends Conteudo{


    private int cargaHoraria;    

    public Curso() {
    }

    public double CalcularXP(){
        return XP_PADRAO * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int CalcularXP(int inteiro){
        return inteiro;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
    
}
