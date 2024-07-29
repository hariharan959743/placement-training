#include <stdio.h>

int main() {
    int number;
    unsigned long long factorial = 1;

   
    printf("Enter an integer: ");
    scanf("%d", &number);

    
    if (number < 0) {
        printf("Factorial of a negative number doesn't exist.\n");
    } else {
        
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        printf("Factorial of %d = %llu\n", number, factorial);
    }

    return 0;
}
