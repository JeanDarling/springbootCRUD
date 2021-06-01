package my.stu.controller;

import my.stu.entity.Type;
import my.stu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 22:46
 * @description:
 */
@Controller
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
         typeService.save(type);
    }

    @RequestMapping("/update")
    public void update(String name,int id){
         typeService.update(name,id);
    }

    @RequestMapping("/delete")
    public void deleteById(int id){
         typeService.delete(id);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Type> findAll(){
      return  typeService.findAll();
    }
}
