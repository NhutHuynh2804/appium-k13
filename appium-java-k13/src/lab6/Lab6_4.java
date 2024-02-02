package lab6;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "http://google.com";
        checkUrl(url);

    }

    private static void checkUrl(String url) {
        String[] parts = url.split("://", 2);
        if (parts.length != 2) {
            System.out.println("Invalid format url ");
        }
        String protocol = parts[0];
        String domain = parts[1];

        String protocolMessage;
        if (protocol.contains("s")) {
            protocolMessage = "HTTPS";
        } else {
            protocolMessage = "HTTP";
        }

        String domainMessage;
        if (domain.contains(".com")) {
            domainMessage = "dotcom";
        } else {
            domainMessage = "dotnet";
        }
        System.out.println("Protocol is\n " + protocolMessage);
        System.out.println("Domain name is \n" + domainMessage + domain);

    }

    }

