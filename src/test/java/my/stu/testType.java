package my.stu;

import my.stu.entity.Type;
//import org.junit.Test;
import my.stu.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 23:01
 * @description:
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringbootJpaApplication.class)
@SpringBootTest
public class testType {
    @Autowired
    private TypeService typeService;

   @Test
    public void testDelte(){
       Type typeByid = typeService.findTypeByid(1);
       System.out.println("删除了id为---"+typeByid.getType_id());
       List<Type> all = typeService.findAll();
       System.out.println(all);
       typeService.delete(typeByid.getType_id());
       List<Type> all1 = typeService.findAll();
       System.out.println(all1);
   }


}
