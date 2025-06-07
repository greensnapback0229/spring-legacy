package greensnapback0229.springlegacy.repository;

import greensnapback0229.springlegacy.domain.member.MemberEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepositoryV1 {

    private List<MemberEntity> memberList = new ArrayList<>();

    public MemberRepositoryV1 (){
        memberList.add(new MemberEntity(1L, "ronaldo@exmaple.com", "호날두", "플레티넘", 300000000L));
        memberList.add(new MemberEntity(2L, "sjk@exmaple.com", "송중기", "플레티넘", 3000000L));
        memberList.add(new MemberEntity(3L, "greensnapback0229@exmaple.com", "초록모자", "아이언", 10L));
    }

    public List<MemberEntity> getMembers(){
        return memberList;
    }

    public void save(MemberEntity memberEntity) {
        memberEntity.setId((long) memberList.size() + 1);
        memberList.add(memberEntity);
    }
}
