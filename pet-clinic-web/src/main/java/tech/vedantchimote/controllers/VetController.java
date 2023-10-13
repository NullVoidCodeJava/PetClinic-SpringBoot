/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 22:47 Project-Name : ownpetclinic
 */

package tech.vedantchimote.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.vedantchimote.services.VetService;


@Controller
public class VetController {

  //cant set final as in some test method the default constructor is used
  private VetService vetService;
  ;

  @Autowired
  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  public VetController() {
  }

  @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
  public String vets(Model model) {

    model.addAttribute("vets", this.vetService.findAll());
    return "vets/index";
  }
}
