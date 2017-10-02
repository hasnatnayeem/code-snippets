public static boolean isInternetAvailable(Context context) {
    // Strict mode allows overriding default network security measure of android higher versions
    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.setThreadPolicy(policy);


    String address = "8.8.8.8";
    int port = 53;
    int timeoutMs = 5000;
    try {
        Socket sock = new Socket();
        SocketAddress sockaddr = new InetSocketAddress(address, port);
        sock.connect(sockaddr, timeoutMs); // This will block no more than timeoutMs
        sock.close();
        return true;

    } 
    catch (IOException e) { 
        return false; 
    }
}


