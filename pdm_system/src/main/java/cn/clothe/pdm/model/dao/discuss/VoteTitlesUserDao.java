package cn.clothe.pdm.model.dao.discuss;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothe.pdm.model.entity.discuss.VoteTitleUser;
import cn.clothe.pdm.model.entity.discuss.VoteTitles;
import cn.clothe.pdm.model.entity.user.User;

public interface VoteTitlesUserDao extends JpaRepository<VoteTitleUser, Long>{
	
	//在用户投票的标题表中查找所有的同一标题的集合
	List<VoteTitleUser> findByVoteTitles(VoteTitles voteTitles);
	
	//在用户投票的标题表中查找所有的同一投票的集合
	List<VoteTitleUser> findByVoteId(Long voteId);
	
	VoteTitleUser findByVoteTitlesAndUser(VoteTitles voteTitles,User user);
	
	

}
