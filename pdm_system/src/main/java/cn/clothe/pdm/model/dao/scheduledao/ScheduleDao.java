package cn.clothe.pdm.model.dao.scheduledao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cn.clothe.pdm.model.entity.schedule.ScheduleList;

@Repository
public interface ScheduleDao extends JpaRepository<ScheduleList, Long>{

	@Query("from ScheduleList s where s.user.userId=?1")
	List<ScheduleList> findstart(long userid);
}
