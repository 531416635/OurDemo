function encryptJS(str){
	var publicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDOj0b49P+bgin1epHj3GC9d18QI+vkOynyczqlGUkZOLmBNPPlH2BTi3yg6NHOWNnqtOttO/NmKGj6/Bot41ARAybhip26FWOJ/jZZGiBqtz5zVTKP2hd63HeCmEFxCyS6SwiORHGTE2aTKRQ4M4zEvELcia5e87LLyeLxiLKdpwIDAQAB";
	setMaxDigits(129);
    var pwdMD5Twice = $.md5($.md5($("#txtPassword").attr("value")));
    var pwdRtn = encryptedString(key, pwdMD5Twice);
    $("#encrypted_pwd").attr("value", pwdRtn);
    $("#formLogin").submit();
    
    //http://www.cnblogs.com/guogangj/archive/2012/03/05/2381117.html
    return;
}