package javajichu_4;

import java.util.Scanner;

public class Demo1_4 {
//	ĳ����ѧ���Խ�����¼��༶������ѧԱ�ɼ���ͳ�Ʒ������ڵ��� 80 �ֵ�ѧ������
//	continue������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������༶������");
		int renshu=sc.nextInt();
		int i=1;
		double chengji=0;
		int n=0;
		while(i<=renshu) {
			System.out.println("�������"+i+"��ѧ���ĳɼ���");
			chengji=sc.nextDouble();
			i++;
			if(chengji<80) {
				continue;
			}
			n++;
		}
		double scale=(double)n/renshu;
		System.out.println("����Ϊ��"+scale);
	}
}
