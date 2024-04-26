package chicken.board.domain.support.board;

import chicken.board.domain.support.Timestamped;
import lombok.Data;


@Data
public class Board extends Timestamped {
    private Integer idx;
    private String title;
    private String content;
    private String regDate;
    private String modifyDate;
    private char type;

    private String memberId;

    public Board() {
    }

    public Board(Integer idx, String title, String content) {
        this.idx = idx;
        this.title = title;
        this.content = content;
    }
}
