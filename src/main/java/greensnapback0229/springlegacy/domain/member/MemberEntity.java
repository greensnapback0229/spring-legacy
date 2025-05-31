package greensnapback0229.springlegacy.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    private Long id;
    private String name;
    private String email;
    private String grade;
    private Long asset;

}
