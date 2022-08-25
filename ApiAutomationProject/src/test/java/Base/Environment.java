package Base;

public class Environment {
    public static int versionCode = 108;
    public static String jwtToken = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyaWQiOjE2NDYyNSwidXNlcnR5cGUiOiJzaGlwcGVyIiwidXNlcm5hbWUiOiJUZXN0X1Nob3ZvbiBRQSIsInBob25lIjoiMDE4NDQ1MjY4NDAiLCJ1c2VyRGV0YWlsc0lkIjoxNjQ2MjMsInJlZnJlc2hLZXkiOiJSNGR0V25JczhaQ3lNT0JQMEpJSTVRPT0iLCJkZXZpY2VNb2RlbCI6bnVsbCwidXNlcklQIjoiZTU2YTg0YzIxMTM3MTQ1NzRiMDUzZTU4OTliZmZmMDE5NTdkMDQwM2Y3Zjc5ZDg0ZjRmNzMxMDljODMyYzFhNiIsInRva2VuIjpudWxsLCJpYXQiOjE2NjEwODMxMTEsImV4cCI6MTY2MzY3NTExMX0.JmRnv2ac0U11CJpotLZpVK-rBJXLAhG86C8ryJol_Ik";

    public static String adminPost = "https://n.trucklagbe.com/tl_gateway/adminPost/"+ versionCode ;
    public static String adminGet = "https://n.trucklagbe.com/tl_gateway/adminGet/"+ versionCode;
    public static String login = "https://n.trucklagbe.com/tl_login/" + versionCode;

    public static String loginWithPhoneNo = "https://n.trucklagbe.com/tl_login/"+versionCode+"/loginWithPhoneNo";
    public static String authorization = "https://n.trucklagbe.com/tl_login/"+versionCode+"/authToken";
    public String getUserInfoFromJWT = "https://n.trucklagbe.com/tl_gateway/appApi/"+versionCode+ "/userInfoFromJwt";
    public static String saas = "https://n.trucklagbe.com/tl_gateway/saas/api/admin/"+versionCode;


}
