package files;

public class Filter {
	//�t�B���^�Ƃ̓X�g���[���̓r���ŕϊ��������邱�ƁB�@�Í�������Ȃ�
	//FilterReader�AFilterWriter�AFilterInputStream�AFilterOutputStream�̂����ꂩ�̃N���X���p�����Ă��܂�
	//�t�B���^�̓X�g���[���ɐڑ����邽�߂̓���Ȃ̂Ńt�B���^�P�Ƃ�new���邱�Ƃ͂ł��܂���
	//���łɑ��݂���X�g���[����ڑ���Ƃ��ăR���X�g���N�^�Ɏw�肵�܂�
	
//	STEP1
//	FileOutputStream fos = new FileOutputStream("Bainary.txt");
//	
//	STEP2
//	CipherOutputStream cos = new CipherOutputStream(fos, algo);
//	
//	STEP3�@�@�Í������ꂽ�����Ńt�@�C���ɗ���Ă���
//	cos.write(65);

	//�����Ă���ɘA���o����
//	STEP3    �X�ɕ����o�C�g��ϊ�����X�g���[��osw��ڑ�
//	OutputstreamWriter osw = new OutputStreamWriter(cos);
//	
//	STEP4
//	osw.write("AB");
	
	
	//�o�b�t�@�����O�t�B���^�Ƃ͕ϊ����Ȃ����܂Ƃ܂����ʂɂȂ����Ƃ���ň�C�ɉ����֗���
	//�������p�F�@BufferedReader, BufferedWriter	
	//�o�C�g���p�F�@BufferedInputStream, BufferedOutputStream
	
//	FileReader fr = new FileReader("java.txt");
//	BufferedReader br = new BufferedReader(fr);
//	String line = null;
//	while((line = br.readLine()) ! = null) {		readLine()�͉��s�܂ł�1�s���̃f�[�^��String�^�ŕԂ��Ă����
//		//line�̏���������
//	}
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
