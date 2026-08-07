package com.kuricompany.springboot4developer;

import com.kuricompany.springboot4developer.entity.Member;
import com.kuricompany.springboot4developer.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        return testService.getAllMembers();
    }

}
