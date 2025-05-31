package greensnapback0229.springlegacy.controller.member;

import greensnapback0229.springlegacy.domain.member.MemberEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberListControllerV1 {

    @GetMapping("/member/list")
    public String memberList(Model model) {
        List<MemberEntity> memberList = new ArrayList<>();

        memberList.add(new MemberEntity(1L, "ronaldo@exmaple.com", "호날두", "플레티넘", 300000000L));
        memberList.add(new MemberEntity(2L, "sjk@exmaple.com", "송중기", "플레티넘", 3000000L));
        memberList.add(new MemberEntity(3L, "greensnapback0229@exmaple.com", "초록모자", "아이언", 10L));

        model.addAttribute("memberList",memberList);
        return "member/list";
    }
}
