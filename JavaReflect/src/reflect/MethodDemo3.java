package reflect;

/**
 * Created by Thpffcj on 2017/8/4.
 */
public class MethodDemo3 {

    public static void main(String[] args) {
        User u1 = new User("zhangsan", "123456", 30);
        System.out.println(BeanUtil.getValueByPropertyName(u1, "username"));
        System.out.println(BeanUtil.getValueByPropertyName(u1, "userpass"));
    }
}
