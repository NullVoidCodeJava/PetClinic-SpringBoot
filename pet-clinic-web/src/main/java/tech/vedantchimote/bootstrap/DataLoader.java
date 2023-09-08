/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 08-09-2023, Friday
 * @Time : 21:04
 **/

package tech.vedantchimote.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.vedantchimote.model.Owner;
import tech.vedantchimote.model.Vet;
import tech.vedantchimote.services.OwnerService;
import tech.vedantchimote.services.VetService;
import tech.vedantchimote.services.map.OwnerServiceMap;
import tech.vedantchimote.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader() {
    ownerService = new OwnerServiceMap();
    vetService = new VetServiceMap();
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Vedant");
    owner1.setLastName("Chimote");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Manthan");
    owner2.setLastName("Kale");

    ownerService.save(owner2);

    System.out.println("Loaded owners successfully");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Shivam");
    vet1.setLastName("Adhaoo");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Isha");
    vet2.setLastName("Adhaoo");

    System.out.println("Loaded vets successfully");
  }
}
