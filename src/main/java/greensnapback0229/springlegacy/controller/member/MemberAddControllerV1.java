package greensnapback0229.springlegacy.controller.member;

import greensnapback0229.springlegacy.service.MemberServiceV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class MemberAddControllerV1 {

    private final MemberServiceV1 memberServiceV1;
    public MemberAddControllerV1(MemberServiceV1 memberServiceV1) {
        this.memberServiceV1 = memberServiceV1;
    }

    @PostMapping("member/add")
    public String addMember(HttpServletRequest request) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        memberServiceV1.addMember(email, name);

        return "redirect:/member/list";
    }

    @GetMapping("/member/add")
    public String addMemberPage(Model model) {
        return "member/add";
    }

}
