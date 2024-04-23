package chicken.board.module.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/boards/")
public class BoardController {


    @GetMapping("/{type}")
    public String boardList(@PathVariable String type){

      log.debug("==============> boardList --> type : {}", type);

        return "/board/list";
    }

}
