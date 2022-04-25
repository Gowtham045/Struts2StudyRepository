package FiterPackage;

import javax.servlet.*;
import java.io.IOException;

public class Validation implements Filter {
    FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig)  {
        System.out.println("Hi----------------------------------------------------------");
           }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain){

        System.out.println("Hi----------------------------------------------------------");


    }

    @Override
    public void destroy() {

    }
}
