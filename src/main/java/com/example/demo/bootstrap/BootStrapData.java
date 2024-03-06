package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;


    private PartService partService;

    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        //creating products
        Product MacPC= new Product("MacPC",800.0,5);
        Product DellPC= new Product("DellPC",500.0,5);
        Product HPPC= new Product("HPPC",550.0,5);
        Product LenovoPC= new Product("LenovoPC",900.0,5);
        Product WindowsPC= new Product("WindowsPC",700.0,5);

        //creating parts
        Part keyboard = new Part("keyboard", 15.0, 5,1, 49);
        Part mouse = new Part("Mouse", 10.0, 5, 1, 49);
        Part monitor = new Part("Monitor", 8.0, 5, 1, 49);
        Part computer = new Part("Computer", 300.0, 5, 1 , 49);
        Part webcam = new Part("Webcam", 20.0, 5, 1, 49);

        if(productRepository.count() == 0 && partRepository.count() == 0) {

            productRepository.save(MacPC);
            productRepository.save(DellPC);
            productRepository.save(HPPC);
            productRepository.save(LenovoPC);
            productRepository.save(WindowsPC);


            partRepository.save(keyboard);
            partRepository.save(mouse);
            partRepository.save(monitor);
            partRepository.save(computer);
            partRepository.save(webcam);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
