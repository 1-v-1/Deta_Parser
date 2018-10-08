package org.tinos.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.tinos.engine.Analyzer;
import org.tinos.engine.imp.BinaryForestAnalyzerImp;
import org.tinos.engine.imp.CogsBinaryForestAnalyzerImp;
import org.tinos.engine.imp.BaseAnalyzerImp;
import org.tinos.engine.imp.PrettyAnalyzerImp;
@SuppressWarnings("unused")
public class PartOfSpeech{
	public static void main(String args[]) throws IOException{
		Analyzer analyzer = new CogsBinaryForestAnalyzerImp();  //��ϣɭ������ ����̰߳�ȫ ֧�ֲ���
		//Analyzer analyzer = new BinaryForestAnalyzerImp();  //��ϣɭ������ ���߳�
		//Analyzer analyzer = new FastAnalyzerImp();        //������������ ���߳�
		//Analyzer analyzer = new PrettyAnalyzerImp();      //����ɭ������ ���߳�
		//Analyzer analyzer = new BaseAnalyzerImp();        //һԪ��������
		//Analyzer analyzer = new ScoreAnalyzerImp();       //ɭ�ִ������
		analyzer.init();
		List<String> sets = new ArrayList<String>();
		String ss = "��d ����m δx ���d �� ��δx ���d ��s ����m δx ��d"  ;	
		System.out.println("");
		System.out.println("��ʱ��ʼ");
		long c=0;
		for(int i = 0; i < 10; i++) {//�ظ�ִ�� 4��� �൱��800 ���ִַ�
			sets = analyzer.parserString(ss); 
		}
		System.out.println("��ʱ����");
		System.out.println("�ִ�Ч������");
		int j=0;
		for(int i = 0; i < sets.size(); i++){
			System.out.print(sets.get(i)+"  |  ");
			j++;
			if(j>15) {//ÿ��15���������
				j=0;
				System.out.println("");
			}
		}
	}
}