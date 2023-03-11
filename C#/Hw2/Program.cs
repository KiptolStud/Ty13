//Задача 2: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

int Prompt(string message)
{    
    Console.Write(message);
    string firststring = Console.ReadLine();
    int value1 = Convert.ToInt32 (firststring);
    return value1;
}
int Prompt2(string message)
{    
    Console.Write(message);
    string firststring = Console.ReadLine();
    int value2 = Convert.ToInt32 (firststring);
    return value2;
}
int Prompt3(string message)
{    
    Console.Write(message);
    string firststring = Console.ReadLine();
    int value3 = Convert.ToInt32 (firststring);
    return value3;
}
int value1 = Prompt("Введите первое число ");
int value2 = Prompt2("Введите второе число ");
int value3 = Prompt3("Введите второе число ");
int valuemax = Convert.ToInt32("0");
 if (value1 >= value2 && value1 >= value3)
                valuemax = value1;
            else if (value2 >= value1 && value2 >=value3 )
                valuemax = value2;
            else if (value3 >= value1 && value3 >= value2)
                valuemax = value3;
System.Console.WriteLine($"Максимальным числом из чисел {value1},{value2},{value3} является число {valuemax}");


