package cn.clothe.pdm.model.dao.address;


import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothe.pdm.model.entity.note.Director;

public interface AddressDao extends JpaRepository<Director, Long> {

	//根据姓名首拼模糊查询
	
}
