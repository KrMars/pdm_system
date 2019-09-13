package cn.clothe.pdm.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.clothe.pdm.model.entity.process.Evection;
import cn.clothe.pdm.model.entity.process.ProcessList;

public interface EvectionDao extends PagingAndSortingRepository<Evection, Long> {

	Evection findByProId(ProcessList process);

}
