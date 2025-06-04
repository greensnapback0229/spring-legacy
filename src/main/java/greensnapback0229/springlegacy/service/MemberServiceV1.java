package greensnapback0229.springlegacy.service;

import greensnapback0229.springlegacy.domain.member.MemberEntity;
import greensnapback0229.springlegacy.dto.MemberDto;
import greensnapback0229.springlegacy.repository.MemberRepositoryV1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceV1 {
    private final MemberRepositoryV1 memberRepositoryv1;

    public MemberServiceV1(MemberRepositoryV1 memberRepositoryv1) {
        this.memberRepositoryv1 = memberRepositoryv1;
    }

    public List<MemberDto> getMemberList() {
        List<MemberEntity> memberList =  memberRepositoryv1.getMembers();
        List<MemberDto> memberDtoList = new ArrayList<>();

        for(MemberEntity memberEntity : memberList) {
            MemberDto dto = new MemberDto(memberEntity.getEmail(), memberEntity.getName());
            memberDtoList.add(dto);
        }

        return memberDtoList;
    }
}
