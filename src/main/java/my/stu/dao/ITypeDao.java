package my.stu.dao;

import my.stu.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author: Jean
 * @date: 2021/6/1 22:32
 * @description:
 */
public interface ITypeDao extends JpaRepository<Type,Integer> {
    @Modifying
    @Query("update type set type_name=?1 where  type_id=?2")
    void updateType(String  name, Integer id);
}
