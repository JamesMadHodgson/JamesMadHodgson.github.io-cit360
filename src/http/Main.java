package http;



import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


 class HttpURLConnectionExample {
     /**
      * in the main function There are 3 try and catch blocks
      * get
      * head
      * post
      * to handle error responses in http requests
      * @param args
      */
    public static void main(String[] args)  {

        HttpURLConnectionExample obj = new HttpURLConnectionExample();

        System.out.print("Testing 1 - Send Http GET request");

        try{
            obj.sendGet();
        }catch(Exception e){

        }

        System.out.print("Testing 2 - Send Http HEAD request");
        try{
            obj.sendHead();
        }catch(Exception e){

        }

        System.out.print("Testing 3 - Send Http POST request");
        try {
            obj.sendPost();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

     /**
      * In the sendGet request
      * http ask for the html document of the requested sight
      * the response returns all the html doc information
      * there is more returned then I expected
      * @throws Exception
      */

    private void sendGet() throws Exception {

        String url = "https://www.google.com";

        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();

        // optional default is GET
        httpClient.setRequestMethod("GET");

        //add request header
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            System.out.println(response.toString());

        }

        System.out.println("");

    }

     /**
      * A head request the same as a get
      * the head will not return information
      * This method is often used for testing hypertext links for validity, accessibility, and recent modification.
      * @throws Exception
      */
    private void sendHead() throws Exception {

        String url = "https://www.google.com/search?q=audi";

        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();

        // set request method to HEAD
        httpClient.setRequestMethod("HEAD");

        //add request header
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'HEAD' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            System.out.println(response.toString());

        }

        System.out.println("");

    }

     /**
      * POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line.
      * POST is designed to allow a uniform method to cover the following functions:
      *
      *       - Annotation of existing resources;
      *       - Posting a message to a bulletin board, newsgroup, mailing list,
      *         or similar group of articles;
      *       - Providing a block of data, such as the result of submitting a
      *         form, to a data-handling process;
      *       - Extending a database through an append operation.
      * @throws Exception
      */

  private void sendPost() throws Exception {

        // url is missing?
        //String url = "https://selfsolve.apple.com/wcResults.do";
        String url = "https://httpbin.org/post";

        HttpsURLConnection httpClient = (HttpsURLConnection) new URL(url).openConnection();

        //add request header
        httpClient.setRequestMethod("POST");

      // post form request is used in this example
        String urlParameters = "usr=James&password=12345";

        // Send post request
        httpClient.setDoOutput(true);
        try (DataOutputStream wr = new DataOutputStream(httpClient.getOutputStream())) {
            wr.writeBytes(urlParameters);
            wr.flush();
        }

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            System.out.println(response.toString());

        }

        System.out.println("");

    }

}