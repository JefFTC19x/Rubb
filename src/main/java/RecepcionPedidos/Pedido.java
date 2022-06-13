package RecepcionPedidos;

public class Pedido 
{
    public String marca;
    public String Medida;
    public String Banda;
    public int Cantidad;    
    public String Codigo;
    public String DOT;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String medida) {
        this.Medida = medida;
    }

    public String getBanda() {
        return Banda;
    }

    public void setBanda(String Banda) {
        this.Banda = Banda;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public Pedido(String marca, String medida, String Banda,int cantidad, String DOT, String Codigo ) {
        this.marca = marca;
        this.DOT = DOT;
        this.Codigo = Codigo;
        this.Medida = medida;
        this.Banda = Banda;
        this.Cantidad = cantidad;
    }
}
