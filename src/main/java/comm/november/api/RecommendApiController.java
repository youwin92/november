package comm.november.api;

import comm.november.service.RecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RecommendApiController {

    @Autowired
    private RecommendService recommendService;


}
