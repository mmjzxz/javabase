package Web.annotation;

import java.util.Date;

/**
 * JDK��Ԥ�����һЩע��
 * 		* @Override	����ⱻ��ע���ע�ķ����Ƿ��Ǽ̳��Ը���(�ӿ�)��
 * 		* @Deprecated����ע���ע�����ݣ���ʾ�ѹ�ʱ
 * 		* @SuppressWarnings��ѹ�ƾ���
 *
 *
 */

@SuppressWarnings("all")
public class AnnoDemo2 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //��ȱ��
    }

    public void show2(){
        //���show1����
    }

    public void demo(){
        show1();
        Date date = new Date();
    }
}
