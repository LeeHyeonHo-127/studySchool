#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
    int n;
    extern char *optarg; //getopt 뒤에 별도의 parameter를 위한 변수 선언
    extern int optind;   //현재 가르키는 인덱스의 다음 인덱스를 가리키는 변수
    
    long r;

    while((n = getopt(argc, argv, "a:m:")) != -1) {//문자열 분석 함수 a,m 을 찾는다.
            switch (n) {
                    case 'a' : //a 일 경우 배열의 값 모두 더한 값을 r에 저장
                            r = 0;
                            for (--optind; optind < argc; optind++){
                                  r = r + atol(argv[optind]);}
                    break;
                    case 'm': //m일 경우 배열의 값을 모두 곱한 값을 r에 저장
                            r = 1;
                            for (--optind; optind < argc; optind++){
                                   r = r * atol(argv[optind]);}
                    break;
            }
            printf("res = %ld\n", r); //r값 출력
           }
     } 

   
