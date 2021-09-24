package com.revision.ventoux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentouxController {

    @GetMapping("api")
    private AppInformations getInformations(){
        return AppInformations.builder()
                .appName("Tourma3lich")
                .version("1.0.S")
                .build();
    }

}
