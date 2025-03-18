package br.com.stpaes.PradroesProjetos.Facade;

public class Apartamento {

    private Long codigo;
    private String end;

    public Apartamento(Long codigo, String end) {
        this.codigo = codigo;
        this.end = end;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ApartamentoService{" +
                "codigo=" + codigo +
                ", end='" + end + '\'' +
                '}';
    }
}
