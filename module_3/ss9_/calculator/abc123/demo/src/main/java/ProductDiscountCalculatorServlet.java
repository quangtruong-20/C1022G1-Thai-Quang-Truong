import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculatorServlet", value = "/ProductDiscountCalculatorServlet")
public class ProductDiscountCalculatorServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("description");
        double productPrice = Double.parseDouble(request.getParameter("price"));
        double productDiscount = Double.parseDouble(request.getParameter("discount"));

        double productDiscountAmount = productPrice * productDiscount * 0.01;

        double productDiscountPrice = - productDiscountAmount + productPrice ;


        request.setAttribute("productDiscountAmount",productDiscountAmount);
        request.setAttribute("productDiscountPrice",productDiscountPrice);
        request.setAttribute("productDescription",productDescription);
        request.setAttribute("productPrice",productPrice);
        request.setAttribute("productDiscount",productDiscount);


        request.getRequestDispatcher("/ketqua.jsp").forward(request,response);

    }
}
