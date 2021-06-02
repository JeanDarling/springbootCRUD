package my.stu.controller;

import my.stu.entity.Type;
import my.stu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 22:46
 * @description:
 */
@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;


    @RequestMapping("/find")
    @ResponseBody
    public Type findbyId(int id){
        return typeService.findTypeByid(id);
    }

    @RequestMapping("/save")
    public void save(Type type){
        Type type1=new Type();
        type1.setType_name("新增");
        type1.setType_remark("新增");
         typeService.save(type1);
    }

    @RequestMapping("/update")
    public void update(String name,int id){
        Type one = typeService.findTypeByid(id);
        one.setType_name("修改");
        typeService.update(one.getType_name(),id);
    }

    @RequestMapping("/delete")
    public void deleteById(int id){
        Type typeByid = typeService.findTypeByid(2);
        typeService.delete(typeByid.getType_id());
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Type> findAll(){
      return  typeService.findAll();
    }
}
