package su.myspringwebapps.core;

public class Core implements CoreInterface {

    public String calculate(String ageText, String heightText, String weightText, String sex) {

        try	{
            short age = Short.parseShort(ageText);
            short height = Short.parseShort(heightText);
            short weight = Short.parseShort(weightText);
            boolean male = (Byte.parseByte(sex) == 1);
            if ((age == 0) || (height == 0) || (weight == 0))
                return  "Вы ввели некорректные данные";
            else    {
                double idealWeight = (3*height - 450 + age)*0.25;
                if (male)	{
                    idealWeight += 45;
                }
                else	{
                    idealWeight += 40.4;
                }
                double fat = (weight - idealWeight)/weight*100;
                if (male)
                    fat += 15;
                else
                    fat += 22;
                return  ("Жирность вашего тела: " + String.format("%.2f", fat) + "%");
            }
        }
        catch	(Exception ex)	{
            return "Вы ввели некорректные данные";
        }



    }
}
