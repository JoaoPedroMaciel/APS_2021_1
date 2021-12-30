class Main {
  public static void main(String[] args) {
    MotorEletrico carro = new MotorEletrico();

		AdapterMotor a = new AdapterMotor(carro);
		a.UsarGasolina();
  }
}