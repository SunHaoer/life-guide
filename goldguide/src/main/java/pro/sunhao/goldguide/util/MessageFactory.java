package pro.sunhao.goldguide.util;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.List;

public class MessageFactory {

    final private static String FROM_ADDRESS = "2457302636@qq.com";
    final private static String[] EMAIL_SUBJECT = {"gold guide"};
    final private static String[] EMAIL_TEMPLATE_NAME = {"goldGuideEmail.txt"};
    final private static String[] TEXT_PARM = {"#{latestPrice}", "#{hopePrice}"};

    public static SimpleMailMessage getMessage(int num, String sendToAddress, List<String> paramList) {
        SimpleMailMessage message = null;
        if(num == 0) {    // 提醒黄金价格邮件
            message = new SimpleMailMessage();
            message.setFrom(FROM_ADDRESS);
            message.setTo(sendToAddress);
            message.setSubject(EMAIL_SUBJECT[0]);
            message.setText(getEmailTemplate(num, paramList));
        }
        return message;
    }

    private static String getEmailTemplate(int num, List<String> paramList) {
        String resultText = null;
        try {
            String templatePath = ResourceUtils.getURL("classpath:").getPath() + "templates" + File.separator + EMAIL_TEMPLATE_NAME[num];
            StringBuffer stringBuffer = new StringBuffer();
            readToBuffer(stringBuffer, templatePath);
            resultText = stringBuffer.toString();
            for(int i = 0; i < paramList.size(); i++) {
                resultText = resultText.replace(TEXT_PARM[i], paramList.get(i));
            }
            System.out.println(resultText);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultText;
    }

    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream inputStream = new FileInputStream(filePath);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        line = reader.readLine();
        while (line != null) {
            buffer.append(line);
            buffer.append("\n");
            line = reader.readLine();
        }
        reader.close();
        inputStream.close();
    }

}
