package dataCollector;

public class Constants {
    /**
     * Facebook base url.
     */
    static final String BASE_URL = "https://www.facebook.com/";

    /**
     * Parameters.
     */
    static final String LOGIN = "login";
    static final String PASSWORD = "password";

    /**
     * Login page locators.
     */
    public static final String LOGIN_FIELD_LOCATOR_BY_CSS = "input[name=\"email\"]";
    public static final String PASSWORD_FIELD_LOCATOR_BY_CSS = "input[name=\"pass\"]";
    public static final String SUBMIT_INPUT_BUTTON_LOCATOR_BY_CSS = "input[type=\"submit\"]";
    public static final String SUBMIT_BUTTON_LOCATOR_BY_CSS = "button[type=\"submit\"]";
    public static final String PROFILE_URL_LOCATOR_BY_CSS = "div[class=\"_1k67 _cy7\"]>a";

    /**
     * Friends list locators.
     */
    public static final String VISIBLE_FRIENDS_LOCATOR_BY_CSS = "div>a[class=\"_5q6s _8o _8t lfloat _ohe\"]>img";

    /**
     * Video list locators.
     */
    static final String DATE_FORMAT = "yyyy-MM-dd";

    /**
     * Post list locators.
     */
    static final int POST_COUNT = 1000/10;

    /**
     * Photo list locators.
     */
    public static final String FIRST_PHOTO_LOCATOR_BY_CSS = "div[class=\"tagWrapper\"]";
    public static final String IMAGE_LOCATOR_BY_CSS = "div[class=\"_2-sx\"]>img";
    public static final String IMAGE_DATE_LOCATOR_BY_CSS = "span[id=\"fbPhotoSnowliftTimestamp\"]>a>abbr";
    public static final String IMAGE_TEXT_LOCATOR_BY_CSS = "span[class=\"hasCaption\"]";
    public static final String IMAGE_PLACE_LOCATOR_BY_CSS = "span[class=\"fcg\"]>:nth-last-child(1)>a";
    public static final String IMAGE_ATTACHED_PEOPLE_FIRST_LOCATOR_BY_XPATH = "//*[@class=\"ogTagItem\"]/span/a";
    public static final String IMAGE_ATTACHED_PEOPLE_SECOND_LOCATOR_BY_XPATH = "//*[@class=\"fcg\"]/span[@class=\"fbPhotoTagListTag withTagItem tagItem\"]/a";

    /**
     * Feed locators.
     */
    static final String FEED_POST_IMAGE_LOCATOR_FIRST_BY_CSS = "div[class=\"uiScaledImageContainer _6m5 fbStoryAttachmentImage\"]>img";
    static final String FEED_POST_IMAGE_LOCATOR_SECOND_BY_CSS = "div[class=\"uiScaledImageContainer _517g\"]>img";

    /**
     *Elements attribute names.
     */
    public static final String IMG_ATTRIBUTE_ARIA_LABEL = "aria-label";
    public static final String ABBR_ATTRIBUTE_TITLE = "title";
    public static final String IMG_ATTRIBUTE_SRC = "src";
    public static final String A_ATTRIBUTE_HREF = "href";

    /**
     * Photos, friends, videos, places urls.
     */
    public static final String PHOTOS = "/photos_all";
    public static final String FRIENDS = "/friends";

    /**
     * Browser name.
     */
    static final String CHROME = "chrome";
}