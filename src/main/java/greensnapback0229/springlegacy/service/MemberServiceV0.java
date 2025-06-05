package greensnapback0229.springlegacy.service;

import greensnapback0229.springlegacy.domain.member.MemberEntity;
import greensnapback0229.springlegacy.dto.MemberDto;
import greensnapback0229.springlegacy.repository.MemberListRepositoryV0;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceV0 {
    private final MemberListRepositoryV0 memberListRepository = MemberListRepositoryV0.getRepository();

    public List<MemberDto> getMemberList() {
        List<MemberEntity> memberEntityList = memberListRepository.getMembers();

        List<MemberDto> memberDtoList = new ArrayList<>();

        for (MemberEntity memberEntity : memberEntityList) {
            MemberDto dto = new MemberDto(memberEntity.getEmail(), memberEntity.getName());
            memberDtoList.add(dto);
        }

        return memberDtoList;
    }
}
