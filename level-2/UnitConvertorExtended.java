import java.util.Scanner;
public class UnitConvertorExtended
{
	public static void main(String[] args)
	{
		
	}
	public static double convertKmToMiles(double km)
	{
		double km2miles = 0.621371;
		return km*km2miles;
	}
	public static double convertMilesToKm(double miles)
	{
		double miles2km = 1.60934;
		return miles*miles2km;

	}
	public static double convertMetersToFeet(double meters)
	{
		double meters2feet = 3.28084;
		return meters*meters2feet;
	}
	public static double convertFeetToMeters(double feet)
	{
		double feet2meters = 0.3048;
		return feet*feet2meters;
	}
	public static double convertYardsToFeet(double yards)
	{
		double yards2feet = 3;
		return yards*yards2feet;
	}
	public static double convertFeetToYard(double feet)
	{
		double feet2yards = 0.333333;
		return feet*feet2yards;
	}
	public static double convertMetersToInches(double meters)
	{
		double meters2inches = 39.3701;
		return meters*meters2inches
	}
	public static double convertInchesToMeter(double inches)
	{
		double inches2meters = 0.0254;
		return inches*inches2meters;
	}
	public static double convertInchesToCentimeter(double inches)
	{
		double inches2cm = 2.54;
		return inches*inches2cm;
	}
	public static double convertFarhenheitToCelsius(double farhenheit)
	{
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius
	}
	public static double convertCelsiusToFahrenheit(double celsius)
	{
		return double celsius2farhenheit = (celsius * 9 / 5) + 32;
	}
	public static double convertPoundsToKilograms(double pounds)
	{
		double pounds2kilograms = 0.453592;
	}
	public static double convertKilogramsToPounds(double kilograms)
	{
		double kilograms2pounds = 2.20462;
		return kilograms*kilograms2pounds;
	}
	public static double ConvertGallonsToLiters(double gallons)
	{
		double gallons2liters = 3.78541;
		return gallons*gallons2liters;
	}
	public static double convertLitersToGallons(double liters)
	{
		double liters2gallons = 0.264172; 
		return liters*liters2gallons;
	}
	
}