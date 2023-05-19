//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import java.net.URI;
//import java.security.cert.X509Certificate;
//import java.util.Base64;
//
//import org.apache.hc.client5.http.fluent.Request;
//import org.apache.hc.core5.http.HttpHost;
//
//public class ProxyRequest {
//    public static void main(final String... args) throws Exception {
//        ignoreCertWarning();
//
//        URI uri = new URI("http://0a6173c3b794c45e3aec3491a054fec57fd1f1a4:@proxy.zenrows.com:8001");
//        String basicAuth = new String(Base64.getEncoder().encode(uri.getUserInfo().getBytes()));
//        String response = Request.get("https://codepen.io")
//                .addHeader("Proxy-Authorization", "Basic " + basicAuth)
//                .viaProxy(HttpHost.create(uri))
//                .execute().returnContent().asString();
//
//        System.out.println(response);
//    }
//
//    private static void ignoreCertWarning() {
//        SSLContext ctx = null;
//        TrustManager[] trustAllCerts = new X509TrustManager[] { new X509TrustManager() {
//            public X509Certificate[] getAcceptedIssuers() {return null;}
//            public void checkClientTrusted(X509Certificate[] certs, String authType) {}
//            public void checkServerTrusted(X509Certificate[] certs, String authType) {}
//        } };
//
//        try {
//            ctx = SSLContext.getInstance("SSL");
//            ctx.init(null, trustAllCerts, null);
//            SSLContext.setDefault(ctx);
//        } catch (Exception e) {}
//    }
//}