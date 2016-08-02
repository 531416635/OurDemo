package com.yao.utils;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * 发送HTML类型邮件工具类
 * 
 * @author yaoyuxiao
 * @createDate 2016年8月2日 下午6:03:09
 */
public class SpringMailUtils {
	public String sendMail(String toMailUrl,String regMailUrl) throws MessagingException {
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();  
		  
        // 设定mail server  
        senderImpl.setHost("smtp.163.com");  
  
        // 建立邮件消息,发送简单邮件和html邮件的区别  
        MimeMessage mailMessage = senderImpl.createMimeMessage();  
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);  
  
        // 设置收件人，寄件人  
        messageHelper.setTo(toMailUrl);  
        messageHelper.setFrom("username@163.com");  
        messageHelper.setSubject("测试HTML邮件！");  
        // true 表示启动HTML格式的邮件  
        messageHelper  
                .setText(  
                        "<html><head></head><body><pre>亲爱的用户K_BBB1000：您好！"+
"<br/>感谢您注册CSDN社区，您只需要点击下面链接，激活您的帐户，您便可以享受CSDN各项服务。"+
"<br/>https://passport.csdn.net/account/login?username=K_BBB1000&amp;activeCode=b5f9da9735929cef1c444bdbb395e5c5&amp;service=https://passport.csdn.net/account/register?action=userInfoView"+
"<br/>(如果无法点击该URL链接地址，请将它复制并粘帖到浏览器的地址输入框，然后单击回车即可。该链接使用后将立即失效。)"+
"<br/>注意:重复发送激活码，则历史激活码失效。请您在收到邮件24小时(2016-08-03 10:43:04前)进行激活，否则该激活码将会失效。7天后您的帐户将会失效。"+
"<br/>重新发送激活码：http://passport.csdn.net/account/register?action=resendActiveEmail&amp;username=K_BBB1000"+
"<br/><br/>关注好友动态，请访问CSDN个人空间：http://my.csdn.net/"+
"技术精品文章，请访问CSDN博客：http://blog.csdn.net/"+
"全球最大的中文技术讨论区，请访问CSDN论坛：http://bbs.csdn.net/"+
"分享您认为最好的内容，请访问CSDN下载频道：http://download.csdn.net/"+
"业界新闻、人才、外包 等等更多CSDN服务，请访问 http://www.csdn.net/"+
"<br/>我们将一如既往、热忱的为您服务！"+
"<br/>WWW.CSDN.NET - 中国最大的IT技术社区，为IT专业技术人员提供最全面的信息传播和服务平台"+
"用户服务支持：webmaster@csdn.net</pre></body></html>",  
                        true);  
  
        senderImpl.setUsername("username"); // 根据自己的情况,设置username  
        senderImpl.setPassword("password"); // 根据自己的情况, 设置password  
        Properties prop = new Properties();  
        prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确  
        prop.put("mail.smtp.timeout", "25000");  
        senderImpl.setJavaMailProperties(prop);  
        // 发送邮件  
        senderImpl.send(mailMessage);  
  
        System.out.println("邮件发送成功..");  
		return null;
	}
}