/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 22:47 Project-Name : ownpetclinic
 */

package tech.vedantchimote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VetController {

  @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
  public String vets() {
    return "vets/index";
  }
}
