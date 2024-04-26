package chicken.board.domain.support.board;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardRepository {
    private static final Map<Integer, Board> store = new HashMap<>();
    private static int sequence = 0;


    /**
     * 저장 기능
     * @param board
     * @return
     */
    public Board save(Board board){
        board.setIdx(++sequence);
        store.put(board.getIdx(), board);

        return board;
    }

    /**
     * idx값으로 게시판 찾기
     * @param idx
     * @return
     */
    public Board findById(int idx){
        return store.get(idx);
    }

    /**
     * 게시판 모두 찾기
     * @return
     */
    public List<Board> findAll(){
        return new ArrayList<>(store.values());
    }

    /**
     * 게시판 update
     * @param idx
     * @param board
     */
    public void update(int idx, Board board){
        Board findBoard = findById(idx);

        findBoard.setTitle(board.getTitle());
        findBoard.setContent(board.getContent());
        findBoard.setType(board.getType());
    }

    public void clearStore(){
        store.clear();
    }
}
