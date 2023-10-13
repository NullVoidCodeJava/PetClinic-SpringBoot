/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 22:53 Project-Name : ownpetclinic
 */

package tech.vedantchimote.controllers;

import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.vedantchimote.bootstrap.DataLoader;
import tech.vedantchimote.model.Owner;
import tech.vedantchimote.services.OwnerService;

@Controller
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"/owners", "owners/index", "/owners/index.html"})
  public String listOwners(Model model) {

    model.addAttribute("owners", ownerService.findAll());
    return "owners/index";
  }

}
