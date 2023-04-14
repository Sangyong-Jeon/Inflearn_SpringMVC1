package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j로 대체가능

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name); // 로그는 레벨별로 남길 수 있지만, 이건 아니므로 사용 X

        // 로그 레벨은 아래순서대로
        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // 개발서버에서 디버그
        log.info("info log={}", name); // 운영서버에서도 중요한 정보
        log.warn("warn log={}", name); // 경고
        log.error("error log={}", name); // 에러(위험)

        return "ok";
    }
}
