package base.tools.screenshotmaker;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.JqueryCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class ScreenShotMaker {
    private String shName;
    private byte[] file;
    @Attachment
    public byte[] createFullScreensot(String pageUrl) {
        final Long devicePixelRatio = executeJavaScript("return window.devicePixelRatio;");
        final ShootingStrategy scalingStrategy = ShootingStrategies.scaling(Float.valueOf(devicePixelRatio + "f"));
        final ShootingStrategy viewportPastingStrategy = ShootingStrategies.viewportPasting(scalingStrategy, 100);
        final AShot aShot = new AShot()
                .shootingStrategy(viewportPastingStrategy)
                .coordsProvider(new JqueryCoordsProvider());
        Screenshot screenshot = aShot.takeScreenshot(WebDriverRunner.getWebDriver());
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/").append("fullScreen").append("-attachment-").append(System.currentTimeMillis()).append(".png");
            shName = stringBuilder.toString();
            ImageIO.write(screenshot.getImage(), "PNG", new File("build/allure-results" + shName));
            file = Files.readAllBytes(Paths.get("build/allure-results" + shName));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
