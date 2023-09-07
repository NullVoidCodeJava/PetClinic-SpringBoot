/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 20:12 Project-Name : ownpetclinic
 */

package tech.vedantchimote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping({"", "/", "index", "index.html"})
  public String index() {
    return "index";
  }
}
