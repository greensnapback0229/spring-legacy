package greensnapback0229.springlegacy.service;

import greensnapback0229.springlegacy.domain.member.MemberEntity;
import greensnapback0229.springlegacy.repository.MemberRepositoryV1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MemberServiceV1 {
    private final MemberRepositoryV1 memberRepositoryv1;

    public MemberServiceV1(MemberRepositoryV1 memberRepositoryv1) {
        this.memberRepositoryv1 = memberRepositoryv1;
    }

    public List<MemberEntity> getMemberList() {
        return memberRepositoryv1.getMembers();
    }
}
