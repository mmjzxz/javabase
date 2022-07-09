package Web.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * �����
 */


@Pro(className = "cn.itcast.annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        /*
            ǰ�᣺���ܸı������κδ��롣���Դ���������Ķ��󣬿���ִ�����ⷽ��
         */


        //1.����ע��
        //1.1��ȡ������ֽ����ļ�����
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.��ȡ�ϱߵ�ע�����
        //��ʵ�������ڴ���������һ����ע��ӿڵ�����ʵ�ֶ���
        /*

            public class ProImpl implements Pro{
                public String className(){
                    return "cn.itcast.annotation.Demo1";
                }
                public String methodName(){
                    return "show";
                }

            }
 */

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.����ע������ж���ĳ��󷽷�����ȡ����ֵ
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);





        //3.���ظ�����ڴ�
        Class cls = Class.forName(className);
        //4.��������
        Object obj = cls.newInstance();
        //5.��ȡ��������
        Method method = cls.getMethod(methodName);
        //6.ִ�з���
        method.invoke(obj);
    }
}
