package x.KenKOfficial.WeatherTime.Main;

import org.bukkit.plugin.java.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.WeatherTime.Tasks.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.*;
import x.KenKOfficial.WeatherTime.Listeners.*;
import org.bukkit.event.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] Il;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] I;
    
    private static boolean IIIl(final int IIllllIllllllll, final int llIlllIllllllll) {
        return IIllllIllllllll < llIlllIllllllll;
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        this.registerTasks();
        System.out.println(Main.I[Main.Il[0]]);
        System.out.println(Main.I[Main.Il[1]]);
        System.out.println(Main.I[Main.Il[2]]);
        System.out.println(Main.I[Main.Il[3]]);
        System.out.println(Main.I[Main.Il[4]]);
        System.out.println(Main.I[Main.Il[5]]);
    }
    
    public void registerTasks() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.Il[13]]).append(this.getName())));
        new TimeTask().runTaskTimer((Plugin)this, 0L, 20L);
        "".length();
        new WeatherTask().runTaskTimer((Plugin)this, 0L, 20L);
        "".length();
    }
    
    private static void Ill() {
        (I = new String[Main.Il[14]])[Main.Il[0]] = I("7Bxj4wuPjh7sHGPjC4+OHuwcY+MLj44e7Bxj4wuPjh7sHGPjC4+OHuwcY+MLj44e7Bxj4wuPjh7ypXLlAiWyDw==", "PbXGt");
        Main.I[Main.Il[1]] = I("WES3LuMCMi7l9gl7dGh3wg==", "Qlgxd");
        Main.I[Main.Il[2]] = IIl("Ojw5MBkMY2tyXV10CSYHDA==", "mYKCs");
        Main.I[Main.Il[3]] = I("UjFWCEfsIzWX9qu4AWnWSg==", "sMbYQ");
        Main.I[Main.Il[4]] = lIl("5Bn+i7C5JW6Mxc1ZDVyitoxE4NyKVOzoGwgm1Bx3SuRUDHQt6c9poWOv06RVEZkVPSS1owJX25biIX+LdbturA==", "hUqWN");
        Main.I[Main.Il[5]] = lIl("GKxBkOOToOQYrEGQ45Og5BisQZDjk6DkGKxBkOOToOQYrEGQ45Og5BisQZDjk6DkGKxBkOOToOSuQv7j0xWCpw==", "BXYiB");
        Main.I[Main.Il[6]] = IIl("SXN3dWZJc3d1Zklzd3VmSXN3dWZJc3d1Zklzd3VmSXN3dWZJc3d1Zklzd3VmSXN3dWZJc3d1Zklzd3U=", "jPTVE");
        Main.I[Main.Il[7]] = IIl("HD8mDzwBFTcJDhYgKgwO", "dtCak");
        Main.I[Main.Il[8]] = I("+mEF+DCkEGaUO1yv2yPKMkHBVQQEroyU", "lzzdx");
        Main.I[Main.Il[9]] = IIl("CgEiET86HS8fIy8KIVE=", "NdXpT");
        Main.I[Main.Il[10]] = lIl("Bb2F124Y8hXvzU0JN7mRCF43tGxn5rwE85tsQi2QfYzLGvef7nKSSlLSTF3BozBKgi/Z+pxJO8P+V3RRdU0oCw==", "KggqJ");
        Main.I[Main.Il[11]] = lIl("17TBKTpabxTXtMEpOlpvFNe0wSk6Wm8U17TBKTpabxTXtMEpOlpvFNe0wSk6Wm8U17TBKTpabxRIXm+F1AJiKA==", "SWwhO");
        Main.I[Main.Il[12]] = IIl("PQoDCzMQBQ4BZBQdAgowHhxHHmQBBxIDLR8eXUQ=", "qkgdD");
        Main.I[Main.Il[13]] = IIl("IiocKxUPJREhQhoqCy8NGWsCZBICPh8tDBtxWA==", "nKxDb");
    }
    
    private static void lll() {
        (Il = new int[15])[0] = ((143 + 173 - 269 + 183 ^ 73 + 36 + 53 + 22) & (0x4C ^ 0x62 ^ (0x70 ^ 0x0) ^ -" ".length()));
        Main.Il[1] = " ".length();
        Main.Il[2] = "  ".length();
        Main.Il[3] = "   ".length();
        Main.Il[4] = (0x57 ^ 0x53);
        Main.Il[5] = (0x39 ^ 0x3C);
        Main.Il[6] = (0xF ^ 0x9);
        Main.Il[7] = (0x77 ^ 0x37 ^ (0x70 ^ 0x37));
        Main.Il[8] = (133 + 3 - 10 + 12 ^ 112 + 71 - 170 + 117);
        Main.Il[9] = (0x6 ^ 0xF);
        Main.Il[10] = (128 + 157 - 230 + 146 ^ 140 + 164 - 230 + 121);
        Main.Il[11] = (0x40 ^ 0x24 ^ (0x61 ^ 0xE));
        Main.Il[12] = (0x97 ^ 0xBE ^ (0xA5 ^ 0x80));
        Main.Il[13] = (0xBC ^ 0xB1);
        Main.Il[14] = (0x70 ^ 0x7E);
    }
    
    static {
        lll();
        Ill();
    }
    
    private static String lIl(final String IIlIIIlllllllll, final String llIIIIlllllllll) {
        try {
            final SecretKeySpec lllIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), Main.Il[8]), "DES");
            final Cipher IllIIIlllllllll = Cipher.getInstance("DES");
            IllIIIlllllllll.init(Main.Il[2], lllIIIlllllllll);
            return new String(IllIIIlllllllll.doFinal(Base64.getDecoder().decode(IIlIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlllllllll) {
            lIlIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.I[Main.Il[6]]);
        System.out.println(Main.I[Main.Il[7]]);
        System.out.println(Main.I[Main.Il[8]]);
        System.out.println(Main.I[Main.Il[9]]);
        System.out.println(Main.I[Main.Il[10]]);
        System.out.println(Main.I[Main.Il[11]]);
    }
    
    private static String I(final String lIIlIllllllllll, final String IIIlIllllllllll) {
        try {
            final SecretKeySpec IIllIllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIllllllllll = Cipher.getInstance("Blowfish");
            llIlIllllllllll.init(Main.Il[2], IIllIllllllllll);
            return new String(llIlIllllllllll.doFinal(Base64.getDecoder().decode(lIIlIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIllllllllll) {
            IlIlIllllllllll.printStackTrace();
            return null;
        }
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.Il[12]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static String IIl(String IIlIlIlllllllll, final String llIIlIlllllllll) {
        IIlIlIlllllllll = (byte)new String(Base64.getDecoder().decode(((String)IIlIlIlllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIlIlllllllll = new StringBuilder();
        final char[] IllIlIlllllllll = llIIlIlllllllll.toCharArray();
        int lIlIlIlllllllll = Main.Il[0];
        final String llllIIlllllllll = (Object)((String)IIlIlIlllllllll).toCharArray();
        final boolean IlllIIlllllllll = llllIIlllllllll.length != 0;
        int lIllIIlllllllll = Main.Il[0];
        while (IIIl(lIllIIlllllllll, IlllIIlllllllll ? 1 : 0)) {
            final char IlIllIlllllllll = llllIIlllllllll[lIllIIlllllllll];
            lllIlIlllllllll.append((char)(IlIllIlllllllll ^ IllIlIlllllllll[lIlIlIlllllllll % IllIlIlllllllll.length]));
            "".length();
            ++lIlIlIlllllllll;
            ++lIllIIlllllllll;
            "".length();
            if (-" ".length() >= ((84 + 76 - 94 + 138 ^ 32 + 5 + 47 + 75) & (108 + 82 + 18 + 9 ^ 73 + 50 - 30 + 45 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllIlIlllllllll);
    }
}
