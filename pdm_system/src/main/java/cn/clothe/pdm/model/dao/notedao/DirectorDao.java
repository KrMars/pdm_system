package cn.clothe.pdm.model.dao.notedao;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.clothe.pdm.model.entity.note.Director;
import cn.clothe.pdm.model.entity.note.Note;

public interface DirectorDao  extends PagingAndSortingRepository<Director, Long>{

}
