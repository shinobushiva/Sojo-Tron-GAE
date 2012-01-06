package jp.ac.sojou.cis.izumi.tron.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserAcconutFilter implements Filter {

    public void init(FilterConfig arg0) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain filterChain) throws IOException, ServletException {

        try {
            HttpSession session = ((HttpServletRequest) request).getSession();

            if (session == null) {
                /* まだ認証されていない */
                session = ((HttpServletRequest) request).getSession(true);
                ((HttpServletResponse) response).sendRedirect("/loginForm");
                return;
            } else {
                Object loginCheck = session.getAttribute("userId");
                if (loginCheck == null) {
                    /* まだ認証されていない */
                    ((HttpServletResponse) response).sendRedirect("/loginForm");
                    return;
                }
            }

            filterChain.doFilter(request, response);
        } catch (ServletException se) {
        } catch (IOException e) {
        }
    }

    public void destroy() {
    }

}
