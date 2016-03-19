package ds;
import java.rmi.*;
import java.io.*;
public class dsimpl implements dsint
{
   byte[] buffer;
   public byte[] getvideo(String filename)throws RemoteException
  {
     try
        {
           File f=new File(filename);
          FileInputStream fis=new FileInputStream(f);
          buffer=new byte[(int)f.length()];
          fis.read(buffer);
          fis.close();
        }
     catch(Exception e)
        {
             System.out.println(e);
        }
return buffer;
}
}