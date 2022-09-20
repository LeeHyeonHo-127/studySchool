#include <sys/socket.h>
#include <unistd.h>
#include <netdb.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#define PORTNUM 9004

int main() {
    int sd, len;
    char buf[256];
    struct sockaddr_in sin;

    memset((char *)&sin, '\0', sizeof(sin));
    sin.sin_family = AF_INET;
    sin.sin_port = htons(PORTNUM);
    sin.sin_addr.s_addr = inet_addr("192.168.147.129");

    if ((sd = socket(AF_INET, SOCK_STREAM, 0)) == -1) {
        perror("socket");
        exit(1);
    }

    printf("==> Create Socket\n");
    if (connect(sd, (struct sockaddr *)&sin, sizeof(sin))) {
        perror("connect");
        exit(1);
    }

    printf("==> Connect Server\n");
    if ((len = recv(sd, buf, sizeof(buf), 0)) == -1) {
        perror("recv");
        exit(1);
    }
    buf[len] = '\0';

    printf("==> From Server : %s\n", buf);

    strcpy(buf, "I want a TELNET Service.");
    if (send(sd, buf, sizeof(buf) + 1, 0) == -1) {
        perror("send");
        exit(1);
    }

    close(sd);
}
