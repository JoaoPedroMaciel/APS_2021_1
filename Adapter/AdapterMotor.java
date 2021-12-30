public class AdapterMotor extends MotorGasolina {
	private MotorEletrico motorEletrico;

	public AdapterMotor(MotorEletrico motorEletrico) {
		this.motorEletrico = motorEletrico;
	}

	public void UsarGasolina() {
		motorEletrico.UsarEnergia();
	}
}
