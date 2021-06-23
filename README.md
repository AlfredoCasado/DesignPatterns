# DesignPatterns

The goal of this exercises is to understand the different patterns and think in some useful use cases for them.
Also, we want to think about how those patterns related with other design principles such as 
SOLID and TDD.

## Decorator

1 - Try to use the decorator pattern and create two decorator to separate the functionality related to security and to monitoring

2 - Add the capability to monitor errors. When the process throws an exception monitor this exception

3 - Add via a new decorator the capability to make process retries

## Adapter

We have a class CityTemperature with return the temperature in a city. for some new 
scenario we want to get the temperature of a city having a postal code. 

1 - Create an Adapter that allows us to obtain the temperature of a city using
the postal code.

2 - The CityTemperature class return the temperature using celsius. This is not
reflected in the interface that simple return a double (Connascence of meaning problem here!). 
In our application sometimes we need the temperature in farenheit as well.At the end we have this 
four combinations:

    - City -> celsius
    - Postal Code -> celsius
    - City -> farenheit
    - Postal code -> celsius

What is the best design we can do to fulfill this need?. 

Note: the class CityTemperature is and old and complex system that we don't want to touch in 
any way.
        
