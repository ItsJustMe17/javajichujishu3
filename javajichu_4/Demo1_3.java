package javajichu_4;

import java.util.Scanner;

public class Demo1_3 {
//	���� 1-3��ĳ����ѧ���Խ�����¼��༶������ѧԱ�ɼ�������༶ѧԱ��ƽ���ɼ�,һ������¼��Ϊ
//	����ֹͣ¼�벢��ʾ¼�����
//	break������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������༶������");
		int renshu=sc.nextInt();
		int i=1;
		double chengji=0;
		double sum=0;
		boolean isWang=false;
		while(i<=renshu) {
			System.out.println("�������"+i+"��ѧ���ĳɼ���");
			chengji=sc.nextDouble();
			if(chengji<0) {
				isWang=true;
				break;
			}else {
				sum+=chengji;
				i++;
			}
		}
		if(isWang) {
			System.out.println("¼������");
		}else {
			double avg=sum/renshu;
			System.out.println("ƽ���ɼ�Ϊ��"+avg);
		}
	}
}
