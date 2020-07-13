package site.javaee.jsr.service.Impl;

import org.springframework.stereotype.Component;
import site.javaee.jsr.bean.voucher.Ufinterface;
import site.javaee.jsr.bean.voucher.Ufinterface2;
import site.javaee.jsr.service.U8cInterfaceService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Tao
 * @Date 2020/7/11
 * @Time 17:43
 */
@Path("/u8c")
@Component
public class U8cInterfaceServiceImpl implements U8cInterfaceService {

    @GET
    @Path("/getXml")
    @Produces({MediaType.APPLICATION_XML})
    @Override
    public Ufinterface getXml() {
        Ufinterface ufinterface = new Ufinterface();
        ufinterface.setAccount("account");
        return  ufinterface;
    }


    @GET
    @Path("/getXml2")
    @Produces({MediaType.APPLICATION_XML})
    public Ufinterface2 getXml2() {
        Ufinterface2 ufinterface = new Ufinterface2();
        return  ufinterface;
    }


}
