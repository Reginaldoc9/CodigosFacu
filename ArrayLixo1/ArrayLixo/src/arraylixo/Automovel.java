package arraylixo;

class Automovel {
    private String marca;
    private String modelo;
    private double motor;

    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}'+"\n";
    }
    
    public Automovel(String marca, String modelo, double motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        
        
    }
        

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
