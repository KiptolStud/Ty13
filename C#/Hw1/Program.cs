// Задача 1: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.

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

if (value1==value2)
System.Console.WriteLine($"Первое число {value1} равно второму числу {value2}");
else 
if (value1>value2)
System.Console.WriteLine($"Первое число {value1} больше чем второе число {value2}");
else System.Console.WriteLine($"Второе число {value2} больше чем первое число {value1}");


