import java.util.Formatter;

public class TrigIdentity {
    public static void main(String[] args){
        //for (int i = 0; i<361; i++) {

        //}

          
        Formatter fmt = new Formatter();  
        fmt.format("%11s %9s %9s %10s %10s %9s %8s\n", "Degrees", "Radians", "sin(x)","sin^2(x)","cos(x)","cos^2(x)","Sum");;  
        for (int i = 0; i < 361; i++)   
        {  
            double Radians = Math.toRadians(i);
            double sin = Math.sin(Radians);
            double cos = Math.cos(Radians);
            double Sum = Math.pow(sin,2) + Math.pow(cos,2);
            fmt.format("%9.1f %9.2f %10.2f %9.2f %11.2f %8.2f %10.2f\n", Double.valueOf(i), Radians, sin, Math.pow(sin,2),cos,Math.pow(cos,2),Sum);  
        }  
        System.out.println(fmt); 
    }

}