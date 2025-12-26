
package com.tasc.app;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/places")
@CrossOrigin("*")
public class PlaceController {

    @GetMapping("/getAllPlace")
    public List<Map<String, Object>> getAllPlace() {
        return List.of(
            Map.of("id",1,"name","Ha Noi","description","Viet Nam"),
            Map.of("id",2,"name","Sai Gon","description","Viet Nam"),
            Map.of("id",3,"name","Paris","description","France")
        );
    }
}
