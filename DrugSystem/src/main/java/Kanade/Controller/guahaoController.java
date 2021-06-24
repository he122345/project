package Kanade.Controller;

import Kanade.domain.guaHao;
import Kanade.domain.kaiYao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("guahao")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class guahaoController {
    @Autowired
    private Kanade.Service.guahaoService guahaoService;

    @RequestMapping(value = "getAllguahao", method = {RequestMethod.GET})
    public List<guaHao> getAllguahao() { return guahaoService.getAllguahao(); }

    @RequestMapping(value = "addguahao", method = {RequestMethod.POST})
    public int addguahao(guaHao guahao) { return guahaoService.addguahao(guahao); }

    @RequestMapping(value = "getUserByd_id/{d_id}", method = {RequestMethod.GET})
    public List<guaHao> getUserByd_id(@PathVariable("d_id") int d_id) {
        return guahaoService.getUserByd_id(d_id);
    }

    @RequestMapping(value = "addkaiyao", method = {RequestMethod.POST})
    public int addkaiyao(kaiYao kaiyao) { return guahaoService.addkaiyao(kaiyao); }

    @RequestMapping(value = "getUserBys_id/{s_id}", method = {RequestMethod.GET})
    public List<kaiYao> getUserBys_id(@PathVariable("s_id") int s_id) {
        return guahaoService.getUserBys_id(s_id);
    }

}

