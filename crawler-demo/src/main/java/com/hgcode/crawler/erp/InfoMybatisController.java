package com.hgcode.crawler.erp;

import com.hgcode.crawler.entity.InfoEntity;
import com.hgcode.crawler.repository.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;



@RequestMapping("/info/db")
@Controller
public class InfoMybatisController {

    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping("/list")
    public String list(Model model){
        List<InfoEntity> list=infoMapper.find();
        model.addAttribute("list",list);
        return "list";
    }
}
