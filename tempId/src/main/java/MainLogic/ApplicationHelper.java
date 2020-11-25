package MainLogic;

import Services.CaptchaFighterService;
import Services.FileDataExtractorService;
import Services.HtmlParserService;
import Services.NotificationService;

public class ApplicationHelper {

    private NotificationService notificationService;
    private FileDataExtractorService fileDataExtractorService;
    private HtmlParserService htmlParserService;
    private CaptchaFighterService captchaFighterService;

    ApplicationHelper() {
        this.notificationService = new NotificationService();
        this.fileDataExtractorService = new FileDataExtractorService();
        this.htmlParserService = new HtmlParserService();
        this.captchaFighterService = new CaptchaFighterService();
    }

    NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    FileDataExtractorService getFileDataExtractorService() {
        return fileDataExtractorService;
    }

    public void setFileDataExtractorService(FileDataExtractorService fileDataExtractorService) {
        this.fileDataExtractorService = fileDataExtractorService;
    }

    HtmlParserService getHtmlParserService() {
        return htmlParserService;
    }

    public void setHtmlParserService(HtmlParserService htmlParserService) {
        this.htmlParserService = htmlParserService;
    }

    CaptchaFighterService getCaptchaFighterService() {
        return captchaFighterService;
    }

    public void setCaptchaFighterService(CaptchaFighterService captchaFighterService) {
        this.captchaFighterService = captchaFighterService;
    }
}