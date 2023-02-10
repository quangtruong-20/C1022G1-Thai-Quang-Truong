import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double number1 = Double.parseDouble(request.getParameter("n1"));
        double number2 = Double.parseDouble(request.getParameter("n2"));
        String operator = request.getParameter("operator");

        double result = 0;

        try{
            result = Calculator.calculate(number1,operator,number2);
            request.setAttribute("result",result);

        }catch (
                NumberFormatException e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
