#include <stdio.h>
#include <unistd.h>
#include <errno.h>
#include <stdlib.h>
#include <string.h>



int main(int argc, char *argv[]){//argc에는 argv배열의 크기
                                 //argv는 배열
   int i, sum = 0;

   for(i = 1; i < argc; i++){ //배열값 들을 다 더한다.
     sum += atoi(argv[i]);    //atio() string->Int 함수
    }
    printf("%d\n", sum);
    return 0; //프로그램 종료
}
