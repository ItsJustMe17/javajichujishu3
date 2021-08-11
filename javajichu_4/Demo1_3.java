package javajichu_4;

import java.util.Scanner;

public class Demo1_3 {
//	任务 1-3：某次数学考试结束后，录入班级人数和学员成绩，计算班级学员的平均成绩,一旦分数录入为
//	负，停止录入并提示录入错误
//	break的运用
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int renshu=sc.nextInt();
		int i=1;
		double chengji=0;
		double sum=0;
		boolean isWang=false;
		while(i<=renshu) {
			System.out.println("请输入第"+i+"个学生的成绩：");
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
			System.out.println("录入有误");
		}else {
			double avg=sum/renshu;
			System.out.println("平均成绩为："+avg);
		}
	}
}
