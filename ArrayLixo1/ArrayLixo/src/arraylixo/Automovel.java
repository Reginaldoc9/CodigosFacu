package arraylixo;

class Automovel {
    //Atributos da classe
    private String marca;
    private String modelo;
    private double motor;

    //toString: Para retornar os valores dos atributos da classe em String
    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}'+"\n";
    }
   //Construtor da classe:  serve para obrigar o usuario a inserir os valores dos atributos do objeto, o "this." serve para indicar que o construtor faz referência ao atributo do objeto
    public Automovel(String marca, String modelo, double motor){
        //this serve para transportar o valor inserido
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        
        
    }
        //get and set: Eles servem para pegarmos informações  de variáveis da classe que são definidas como 'private',
    //porém esses método são definidos como 'public'.

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
