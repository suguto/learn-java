package object;

public class Wand {
	private String name;
	private double power;
	//�A�N�Z�X�C���q�Ő�������ׂ�getter��setter��p�ӂ��܂��B
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		//���O��3�����ȏ�ɂ���
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("��ɐݒ肳��悤�Ƃ��Ă��閼�O���ُ�ł��B");
		}
		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	//�O�D�T�ȏ�P�O�O�ȉ��ɂ���
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("��ɐݒ肳��悤�Ƃ��Ă��閂�͂��ُ�ł�");
		}
		this.power = power;
	}
}
