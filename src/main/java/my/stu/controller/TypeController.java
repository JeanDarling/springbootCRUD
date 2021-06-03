package my.stu.controller;

import my.stu.dao.ITypeRepository;
import my.stu.entity.Type;
//import my.stu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

//    @Autowired
//    private TypeService typeService;
//

    @Autowired
    private ITypeRepository repository;

    @RequestMapping("/find")
    public  Type findbyId(int id){
        Type type= repository.findByType_id(id);
        System.out.println("find----"+type);
        return type;
    }

    @RequestMapping("/save")
    public  void save(Type type){
        Type type1=new Type();
        type1.setType_name("新增");
        type1.setType_remark("新增");
        repository.save(type1);
        System.out.println();
    }

    @RequestMapping("/update")
    public void update(String name,int id){
        Type one = repository.findByType_id(id);
        one.setType_name("修改");
        repository.updateType(one.getType_name(),id);
    }

    @RequestMapping("/delete")
    public void deleteById(int id){

        repository.deleteById(2);
    }

    @RequestMapping("/findAll")

    public  List<Type> findAll(){
        List<Type> all = repository.findAll();
        for(Type t:all){
            System.out.println(t);
        }
        return  all;
    }
}
