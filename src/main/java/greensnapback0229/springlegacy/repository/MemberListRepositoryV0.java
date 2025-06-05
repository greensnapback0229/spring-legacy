package greensnapback0229.springlegacy.repository;

import greensnapback0229.springlegacy.domain.member.MemberEntity;

import java.util.ArrayList;
import java.util.List;

public class MemberListRepositoryV0 {

    private static MemberListRepositoryV0 instance;


    public List<MemberEntity> getMembers() {
        List<MemberEntity> memberList = new ArrayList<>();

        memberList.add(new MemberEntity(1L, "ronaldo@exmaple.com", "호날두", "플레티넘", 300000000L));
        memberList.add(new MemberEntity(2L, "sjk@exmaple.com", "송중기", "플레티넘", 3000000L));
        memberList.add(new MemberEntity(3L, "greensnapback0229@exmaple.com", "초록모자", "아이언", 10L));

        return memberList;
    }

    public static synchronized MemberListRepositoryV0 getRepository() {
        if(instance == null) {
            instance = new MemberListRepositoryV0();
        }
        return instance;
    }
}
