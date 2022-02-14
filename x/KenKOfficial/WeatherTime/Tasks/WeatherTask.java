package x.KenKOfficial.WeatherTime.Tasks;

import org.bukkit.scheduler.*;
import x.KenKOfficial.WeatherTime.Main.*;
import org.bukkit.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class WeatherTask extends BukkitRunnable
{
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String[] Ill;
    
    private static void lIlIl() {
        (lll = new int[6])[0] = ((0x62 ^ 0x7C) & ~(0x11 ^ 0xF));
        WeatherTask.lll[1] = " ".length();
        WeatherTask.lll[2] = "  ".length();
        WeatherTask.lll[3] = "   ".length();
        WeatherTask.lll[4] = (0x19 ^ 0x1D);
        WeatherTask.lll[5] = (0x92 ^ 0x9A);
    }
    
    private static void IIlIl() {
        (Ill = new String[WeatherTask.lll[4]])[WeatherTask.lll[0]] = lIIIl("BRgvKRgoCiMzHgc=", "wyFGk");
        WeatherTask.Ill[WeatherTask.lll[1]] = IlIIl("DtubkX0Oh3cp1vE9syKdmA==", "XazXm");
        WeatherTask.Ill[WeatherTask.lll[2]] = llIIl("Ozve72iZO1ajGYFUYGdmMg==", "icuIK");
        WeatherTask.Ill[WeatherTask.lll[3]] = llIIl("3OOQBLGvLVPwF679suq5ag==", "FQTln");
    }
    
    public void run() {
        if (IllIl(Main.getPlugin().getConfig().getBoolean(WeatherTask.Ill[WeatherTask.lll[0]]) ? 1 : 0)) {
            final boolean lllIlIlIlllllll = (boolean)Bukkit.getWorlds().iterator();
            while (IllIl(((Iterator)lllIlIlIlllllll).hasNext() ? 1 : 0)) {
                final World lIIllIlIlllllll = ((Iterator<World>)lllIlIlIlllllll).next();
                if (IllIl(Main.getPlugin().getConfig().getBoolean(WeatherTask.Ill[WeatherTask.lll[1]]) ? 1 : 0)) {
                    lIIllIlIlllllll.setThundering((boolean)(WeatherTask.lll[0] != 0));
                    lIIllIlIlllllll.setStorm((boolean)(WeatherTask.lll[0] != 0));
                }
                if (IllIl(Main.getPlugin().getConfig().getBoolean(WeatherTask.Ill[WeatherTask.lll[2]]) ? 1 : 0)) {
                    lIIllIlIlllllll.setThundering((boolean)(WeatherTask.lll[1] != 0));
                    lIIllIlIlllllll.setStorm((boolean)(WeatherTask.lll[1] != 0));
                }
                if (IllIl(Main.getPlugin().getConfig().getBoolean(WeatherTask.Ill[WeatherTask.lll[3]]) ? 1 : 0)) {
                    lIIllIlIlllllll.setThundering((boolean)(WeatherTask.lll[0] != 0));
                    lIIllIlIlllllll.setStorm((boolean)(WeatherTask.lll[1] != 0));
                }
                "".length();
                if (((0x89 ^ 0xBE) & ~(0x7A ^ 0x4D)) == " ".length()) {
                    return;
                }
            }
        }
    }
    
    static {
        lIlIl();
        IIlIl();
    }
    
    private static boolean lllIl(final int lIIIIlIIlllllll, final int IIIIIlIIlllllll) {
        return lIIIIlIIlllllll < IIIIIlIIlllllll;
    }
    
    private static boolean IllIl(final int IllllIIIlllllll) {
        return IllllIIIlllllll != 0;
    }
    
    private static String IlIIl(final String lIIlIlIIlllllll, final String IllIIlIIlllllll) {
        try {
            final SecretKeySpec IIllIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), WeatherTask.lll[5]), "DES");
            final Cipher llIlIlIIlllllll = Cipher.getInstance("DES");
            llIlIlIIlllllll.init(WeatherTask.lll[2], IIllIlIIlllllll);
            return new String(llIlIlIIlllllll.doFinal(Base64.getDecoder().decode(lIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIIlllllll) {
            IlIlIlIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIl(final String IlllIIlIlllllll, final String lIllIIlIlllllll) {
        try {
            final SecretKeySpec lIIIlIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIlIlIlllllll = Cipher.getInstance("Blowfish");
            IIIIlIlIlllllll.init(WeatherTask.lll[2], lIIIlIlIlllllll);
            return new String(IIIIlIlIlllllll.doFinal(Base64.getDecoder().decode(IlllIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIlllllll) {
            llllIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIl(String lIIlllIIlllllll, final String IIIlllIIlllllll) {
        lIIlllIIlllllll = new String(Base64.getDecoder().decode(lIIlllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllllIIlllllll = new StringBuilder();
        final char[] llIlllIIlllllll = IIIlllIIlllllll.toCharArray();
        int IlIlllIIlllllll = WeatherTask.lll[0];
        final double IIlIllIIlllllll = (Object)lIIlllIIlllllll.toCharArray();
        final String llIIllIIlllllll = (String)IIlIllIIlllllll.length;
        short IlIIllIIlllllll = (short)WeatherTask.lll[0];
        while (lllIl(IlIIllIIlllllll, (int)llIIllIIlllllll)) {
            final char llllllIIlllllll = IIlIllIIlllllll[IlIIllIIlllllll];
            IIllllIIlllllll.append((char)(llllllIIlllllll ^ llIlllIIlllllll[IlIlllIIlllllll % llIlllIIlllllll.length]));
            "".length();
            ++IlIlllIIlllllll;
            ++IlIIllIIlllllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(IIllllIIlllllll);
    }
}
