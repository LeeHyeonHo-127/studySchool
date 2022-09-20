#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>


int  main() {
    if(access("linux.txt",F_OK) == -1) { //에러 발생시 access함수가-1반환
       perror("linux.txt");//오류 메시지를 출력하는 함수. 
       exit(1); //프로그램 종료
    }
    return 0; //프로그램 종료
}
