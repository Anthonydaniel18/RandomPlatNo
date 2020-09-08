import java.util.*;
public class randomplatnomor{
	public static void main(String[] args){
	Random rand = new Random();

	String alphabet= "abcdefghijklmnopqrstuvwxyz";
	Random random = new Random();
	int randomLen = 1+random.nextInt(9);

	String m = "";
	{char c = alphabet.charAt(random.nextInt(26));
	 m+=c;}
		System.out.print(m);

	int n = rand.nextInt(9)+0;
		System.out.print(n);

	int o = rand.nextInt(9)+0;
		System.out.print(o);

	int p = rand.nextInt(9)+0;
		System.out.print(p);

	int q = rand.nextInt(9)+0;
		System.out.print(q);

	String r = "";
	{char c = alphabet.charAt(random.nextInt(26));
	 r+=c;}
		System.out.print(r);

	String s = "";
	{char c = alphabet.charAt(random.nextInt(26));
	 s+=c;}
		System.out.print(s);

	String t = "";
	{char c = alphabet.charAt(random.nextInt(26));
	 t+=c;}
		System.out.println(t);

}
}