package Web.annotation;

import java.lang.annotation.*;

/**

 Ԫע�⣺��������ע���ע��
     * @Target������ע���ܹ����õ�λ��
     * @Retention������ע�ⱻ�����Ľ׶�
     * @Documented������ע���Ƿ񱻳�ȡ��api�ĵ���
     * @Inherited������ע���Ƿ�����̳�


 *
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {
}
