package test1;

import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Ashish on 05-07-2017.
 */
public final class LogUtil {

    private LogUtil() {
    }

    @Step("{0}")
    public static void log(final String message){
        //intentionally empty
    }
}
