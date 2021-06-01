package my.stu.service.impl;

import my.stu.dao.ITypeDao;
import my.stu.entity.Type;
import my.stu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 22:40
 * @description:
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private ITypeDao dao;

    @Override
    public Type findTypeByid(int id) {
        return dao.getById(id);
    }

    @Override
    public void save(Type type) {
            dao.save(type);
    }

    @Override
    public void update(String name, int id) {
            dao.updateType(name,id);
    }

    @Override
    public void delete(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Type> findAll() {
        return dao.findAll();
    }
}
