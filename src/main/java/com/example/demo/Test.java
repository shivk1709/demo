package com.example.demo;

public interface Test
{
    int operation(int a, int b);

    default int getGridSize()
    {
        return 100;
    }
}
