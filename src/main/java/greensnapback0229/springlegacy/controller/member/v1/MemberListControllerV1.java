package greensnapback0229.springlegacy.controller.member.v1;

import greensnapback0229.springlegacy.dto.MemberDto;
import greensnapback0229.springlegacy.service.MemberServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberListControllerV1 {

    private final MemberServiceV1 memberServiceV1;

    public MemberListControllerV1(MemberServiceV1 memberServiceV1) {
        this.memberServiceV1 = memberServiceV1;
    }

    @GetMapping("/member/list")
    public String memberList(Model model) {

        List<MemberDto> memberList = memberServiceV1.getMemberList();
        model.addAttribute("memberList", memberList);

        return "member/list";
    }
}
