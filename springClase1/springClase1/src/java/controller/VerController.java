/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author heltonsmith
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {
    
    //siempre los métodos deben retornar String
    
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model){
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("preg1") String preg1,@RequestParam("preg2")
            String preg2,@RequestParam("preg3") String preg3, Model model){
        if (preg1.trim().equals("si") || preg2.trim().equals("si") || preg3.trim().equals("si")) {
            
            String a = "Te vas a morir de estres, ve por chela!!!";
            model.addAttribute("err", a);
            
            return "error";
        }
        else{
            return "exito";
        }
    }
    
}
