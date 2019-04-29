package pro.sunhao.goldguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sunhao.goldguide.service.HandlerService;

import java.io.*;

@RestController
public class TestController {

    @Autowired
    private HandlerService handlerService;

    @RequestMapping(value="/test")
    public String test() {

//        try {
//            String templatePath = ResourceUtils.getURL("classpath:").getPath() + "templates" + File.separator + "goldGuideEmail.html";
//            //System.out.println(templatePath);
//            StringBuffer stringBuffer = new StringBuffer();
//            readToBuffer(stringBuffer, templatePath);
//            System.out.println(stringBuffer);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return "Hello World";
    }

//    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
//        InputStream inputStream = new FileInputStream(filePath);
//        String line;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        line = reader.readLine();
//        while (line != null) {
//            buffer.append(line);
//            line = reader.readLine();
//        }
//        reader.close();
//        inputStream.close();
//    }
}
