package x.KenKOfficial.WeatherTime.Tasks;

import org.bukkit.scheduler.*;
import x.KenKOfficial.WeatherTime.Main.*;
import org.bukkit.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class TimeTask extends BukkitRunnable
{
    private /* synthetic */ int i;
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String[] IIl;
    
    private static void llll() {
        (lIl = new int[4])[0] = ((0x1D ^ 0x41 ^ (0x4A ^ 0x27)) & (78 + 17 - 87 + 137 ^ 101 + 55 - 74 + 78 ^ -" ".length()));
        TimeTask.lIl[1] = " ".length();
        TimeTask.lIl[2] = "  ".length();
        TimeTask.lIl[3] = (0x3F ^ 0x37);
    }
    
    public void run() {
        if (IIIIl(Main.getPlugin().getConfig().getBoolean(TimeTask.IIl[TimeTask.lIl[1]]) ? 1 : 0)) {
            final int llllIllIlllllll = (int)Bukkit.getWorlds().iterator();
            while (IIIIl(((Iterator)llllIllIlllllll).hasNext() ? 1 : 0)) {
                final World IlIIlllIlllllll = ((Iterator<World>)llllIllIlllllll).next();
                IlIIlllIlllllll.setTime((long)this.i);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
    }
    
    public TimeTask() {
        this.i = Main.getPlugin().getConfig().getInt(TimeTask.IIl[TimeTask.lIl[0]]);
    }
    
    static {
        llll();
        Illl();
    }
    
    private static void Illl() {
        (IIl = new String[TimeTask.lIl[2]])[TimeTask.lIl[0]] = lIll("YM9YRd4fuBDjn6LQkDuuNg==", "RcAKe");
        TimeTask.IIl[TimeTask.lIl[1]] = lIll("q6H5bzCjw9KsSTTaD25xpQ==", "VboVF");
    }
    
    private static boolean IIIIl(final int lllllIlIlllllll) {
        return lllllIlIlllllll != 0;
    }
    
    private static String lIll(final String IIlIIllIlllllll, final String lIlIIllIlllllll) {
        try {
            final SecretKeySpec lIIlIllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIlllllll.getBytes(StandardCharsets.UTF_8)), TimeTask.lIl[3]), "DES");
            final Cipher IIIlIllIlllllll = Cipher.getInstance("DES");
            IIIlIllIlllllll.init(TimeTask.lIl[2], lIIlIllIlllllll);
            return new String(IIIlIllIlllllll.doFinal(Base64.getDecoder().decode(IIlIIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlllllll) {
            lllIIllIlllllll.printStackTrace();
            return null;
        }
    }
}
