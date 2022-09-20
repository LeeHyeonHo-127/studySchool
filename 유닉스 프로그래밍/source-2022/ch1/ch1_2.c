#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>


int  main() {
    if(access("linux.txt",F_OK) == -1) {
       perror("linux.txt");
       exit(1);
    }
    return 0;
}
