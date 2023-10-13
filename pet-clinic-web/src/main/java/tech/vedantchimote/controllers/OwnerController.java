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

@Controller
public class OwnerController {

  @RequestMapping({"/owners", "owners/index", "/owners/index.html"})
  public String listOwners() {
    return "owners/index";
  }

}
