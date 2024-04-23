package chicken.board.domain.support;

import lombok.Data;

@Data
public class Board {
    private Integer idx;
    private String title;
    private String content;
    private String regDate;
    private String modifyDate;
    private char type;

    private String memberId;


}
