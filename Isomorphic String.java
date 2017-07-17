# Isomorphic-String
import java.io.*;
import java.util.*;
public class Ismorphic String
{
public static void main(String args[])throws IOException
{
BufferedReader br=new Bufferedreader(new InputStreamReader(System.in));
String a,b;
if(a.length()!=b.length())
return false;
HashMap<character, character>map=new HashMap<character, character>();
for(int i=0;i<s.length();i++)
{
char s1=s.charAt(i);
char s2=s.charAt(i);
if(map.containsKey(s1))
{
if(map.get(s1)!=s2)
{
if(map.get(s1)!=s2)
return false;
}
else
{
if(map.containsValue(s2))
return false;
map.put(s1,s2);
}
return true;
}
if(ismorphic)
{
System.out.println("s1+ "and" +s2+" are Ismorphic");
}
else
{
System.out.println("s1+ "and" +s2+" are not Ismorphic");
}
}
}
