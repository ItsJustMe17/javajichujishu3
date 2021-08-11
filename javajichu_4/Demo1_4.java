package javajichu_4;

import java.util.Scanner;

public class Demo1_4 {
//	某次数学考试结束后，录入班级人数和学员成绩，统计分数大于等于 80 分的学生比例
//	continue的运用
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int renshu=sc.nextInt();
		int i=1;
		double chengji=0;
		int n=0;
		while(i<=renshu) {
			System.out.println("请输入第"+i+"个学生的成绩：");
			chengji=sc.nextDouble();
			i++;
			if(chengji<80) {
				continue;
			}
			n++;
		}
		double scale=(double)n/renshu;
		System.out.println("比例为："+scale);
	}
}
