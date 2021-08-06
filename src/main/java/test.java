import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2021/3/25 15:58
 */
public class test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("hello");

        Object o = BeanUtils.cloneBean(new test());
    }
}
