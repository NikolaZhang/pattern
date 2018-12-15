package prototype;

import java.io.*;

public class Test {
	public static void main(String[] args) {
		// 浅拷贝 Nikola Zhang  【2018/12/14 0014 20:51】
	    Model modelA = new Model("AAA","1111");
		Model modelB = (Model)modelA.clone();
		
		System.out.println(modelA);
		System.out.println(modelB);
		System.out.println(modelA.getA());
		System.out.println(modelB.getA());
		System.out.println(modelB.getPrice());
		System.out.println(modelB.getName());

        // 深拷贝 Nikola Zhang  【2018/12/14 0014 20:51】
		ModelS modelS = new ModelS("SSS","2222");
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(modelS);
            oos.flush();
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            ModelS modelS1 =  (ModelS)ois.readObject();
            System.out.println(modelS.getA());
            System.out.println(modelS1.getA());
            ois.close();
            oos.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
