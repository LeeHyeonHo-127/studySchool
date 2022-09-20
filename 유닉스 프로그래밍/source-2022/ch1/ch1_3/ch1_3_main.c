#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main() {
    char *str;

    //str = malloc(sizeof(char) * 20); //20byte 메모리 동적 할당
   
    strcpy(str, "Hello"); //문자열 복사 함수
    printf("%s\n", str); //str 내부 문자열 출력
   
    strcpy(str, "Good morning");//문자열 복사
    printf("%s\n", str);//str 출력

    free(str); //메모리 할당 해제
    return 0; //프로그램 종료
}
