package com.cn.computer;


import com.cn.computer.dao.model.User;
import com.cn.computer.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computer/")
public class ComputerController {
    @Autowired
    public MemoryService memoryService;

    /*@PostMapping(value = "testPost")
    public String testPost(){
        return "12345";
    }



    @Autowired
    public NetworkServers networkServers;
    @Autowired
    public MemoryService memoryService;


    //查询机器是否连通
    @PostMapping(value = "checkComputer/{ip}")
    public JSONObject checkComputer(@PathVariable String ip){
        return networkServers.checkComputer(ip);
    }


    @GetMapping(value = "execCmdInLinux/{cmd}")
    public String execCmdInLinux(String cmd){
        return memoryService.executeCmd(cmd);
    }
*/
    @GetMapping(value = "selectUserByUuid/{cmd}")
    public String selectUserByUuid(@PathVariable int cmd){
        User user = memoryService.selectUserByUuid(cmd);
        return user.toString();
    }
}
