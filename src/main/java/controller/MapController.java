package controller;

import api.DockApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
    @ResponseBody
    @RequestMapping("/map")
    public String mapController() {
        return DockApi.getRequest();
    }
}
