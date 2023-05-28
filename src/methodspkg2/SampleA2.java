package methodspkg2;

public class SampleA2 
{
public static void studentinfo(int E, int F) 
{
System.out.println(E*F);	
}
public void information(int G, int H) 
{
System.out.println("addition of two number="+(G+H));	
}
//non-Static regular method with all paramters
public void allpara(String sname, int rollnum, float per, char grade) 
{
	System.out.println("Studentname :="+sname+System.lineSeparator()+"studentrollnum:"+rollnum+"\n"+"studentper:="+per+"%"+"\n"+"studentgarde:="+grade);
}
}
