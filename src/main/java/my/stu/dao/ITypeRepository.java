package my.stu.dao;

import my.stu.entity.Type;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 22:32
 * @description:
 */
@Repository
public interface ITypeRepository extends JpaRepository<Type,Integer> {
    @Select("select * from type where type_id=?1")
    Type findByType_id(int id);

    @Modifying
    @Query("update type set type_name=?1 where  type_id=?2")
    Type updateType(String  name, Integer id);
}
