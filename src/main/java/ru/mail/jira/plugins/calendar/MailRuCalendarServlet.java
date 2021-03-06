package ru.mail.jira.plugins.calendar;

import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.sal.api.UrlMode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MailRuCalendarServlet extends HttpServlet {
    private final ApplicationProperties applicationProperties;

    public MailRuCalendarServlet(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(applicationProperties.getBaseUrl(UrlMode.ABSOLUTE) + "/secure/MailRuCalendar.jspa");
    }
}
