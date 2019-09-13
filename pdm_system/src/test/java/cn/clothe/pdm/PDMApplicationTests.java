package cn.clothe.pdm;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.clothe.pdm.mappers.NoticeMapper;
import cn.clothe.pdm.model.entity.system.SystemStatusList;
import cn.clothe.pdm.services.inform.InformService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PDMApplicationTests {
	
	@Autowired
	private NoticeMapper nm;
	
	@Autowired
	private InformService informService;
	
	

		
//		List<Map<String, Object>> list=informService.informList(listOne);
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}

	
	

}
