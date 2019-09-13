package cn.clothe.pdm.model.dao.processdao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.clothe.pdm.model.entity.process.EvectionMoney;
import cn.clothe.pdm.model.entity.process.Stay;

public interface StayDao extends PagingAndSortingRepository<Stay, Long>{
 
	List<Stay> findByEvemoney(EvectionMoney money);
}
