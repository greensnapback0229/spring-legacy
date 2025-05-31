package greensnapback0229.springlegacy.controller.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MemberHomeController {

    @GetMapping("/member")
    public String home() {
        log.info("Member Home page");
        return "member/index";
    }
}
