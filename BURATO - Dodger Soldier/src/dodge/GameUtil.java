package dodge;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

import java.util.Random;

public class GameUtil {
    public String iconPath;
    public String pathEnmyHeliFL, pathEnmyHeliFR;
    public String pathHlprHeliFL, pathHlprHeliFR;
    public String pathPlyrFL, pathPlyrFR;
    public String pathBlltFD;
    public String pathHlthPack;

    public static BufferedImage enemyHeliFL, enemyHeliFR;
    public static BufferedImage helperHeliFL, helperHeliFR;
    public static BufferedImage playerFL, playerFR;
    public static BufferedImage bulletFD, healthPack;
    public static BufferedImage setting, close, title, question, htp, htpTitle, gmechanics, gm, dt;

    private static Random r;

    public GameUtil() {
        iconPath = new String("Data/Icons/");
        pathEnmyHeliFL = new String("enemy-helicopter256-fl.png");
        pathEnmyHeliFR = new String("enemy-helicopter-fr.png");

        pathHlprHeliFL = new String("helper-helicopter-fl.png");
        pathHlprHeliFR = new String("helper-helicopter256-fr.png");

        pathPlyrFL = new String("player256-fl.png");
        pathPlyrFR = new String("player256-fr.png");

        pathBlltFD = new String("bullet256-fd.png");

        pathHlthPack = new String("health.png");

        try {
            enemyHeliFL = ImageIO.read(new File(iconPath + pathEnmyHeliFL));
            enemyHeliFR = ImageIO.read(new File(iconPath + pathEnmyHeliFR));

            helperHeliFL = ImageIO.read(new File(iconPath + pathHlprHeliFL));
            helperHeliFR = ImageIO.read(new File(iconPath + pathHlprHeliFR));

            playerFL = ImageIO.read(new File(iconPath + pathPlyrFL));
            playerFR = ImageIO.read(new File(iconPath + pathPlyrFR));

            bulletFD = ImageIO.read(new File(iconPath + pathBlltFD));
            healthPack = ImageIO.read(new File(iconPath + pathHlthPack));

            setting = ImageIO.read(new File(iconPath + "gear256.png"));
            close = ImageIO.read(new File(iconPath + "close256.png"));
            title = ImageIO.read(new File(iconPath + "game-title-final.png"));
            question = ImageIO.read(new File(iconPath + "question-mark.png"));
            htp = ImageIO.read(new File(iconPath + "htp.png"));
            htpTitle = ImageIO.read(new File(iconPath + "htp-title.png"));
            gmechanics = ImageIO.read(new File(iconPath + "gm-title.png"));
            gm = ImageIO.read(new File(iconPath + "gm.png"));
            dt = ImageIO.read(new File(iconPath + "diff-title.png"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        r = new Random();
    }

    public static int getRandom(int l, int h) {
        return l + r.nextInt(h - l + 1);
    }
}

