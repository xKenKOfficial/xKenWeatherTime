package x.KenKOfficial.WeatherTime.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.WeatherTime.Main.*;
import x.KenKOfficial.WeatherTime.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] l;
    private static final /* synthetic */ int[] ll;
    
    private static String Il(String IIlIlIIllllllll, final String llIIlIIllllllll) {
        IIlIlIIllllllll = new String(Base64.getDecoder().decode(IIlIlIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIlIIllllllll = new StringBuilder();
        final char[] IllIlIIllllllll = llIIlIIllllllll.toCharArray();
        int lIlIlIIllllllll = PlayerJoin.ll[0];
        final String llllIIIllllllll = (Object)IIlIlIIllllllll.toCharArray();
        final String IlllIIIllllllll = (String)llllIIIllllllll.length;
        long lIllIIIllllllll = PlayerJoin.ll[0];
        while (IIll((int)lIllIIIllllllll, (int)IlllIIIllllllll)) {
            final char IlIllIIllllllll = llllIIIllllllll[lIllIIIllllllll];
            lllIlIIllllllll.append((char)(IlIllIIllllllll ^ IllIlIIllllllll[lIlIlIIllllllll % IllIlIIllllllll.length]));
            "".length();
            ++lIlIlIIllllllll;
            ++lIllIIIllllllll;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIlIIllllllll);
    }
    
    static {
        IlIl();
        lIIl();
    }
    
    private static String l(final String lllIIlIllllllll, final String IllIIlIllllllll) {
        try {
            final SecretKeySpec IIllIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIlIllllllll = Cipher.getInstance("Blowfish");
            llIlIlIllllllll.init(PlayerJoin.ll[2], IIllIlIllllllll);
            return new String(llIlIlIllllllll.doFinal(Base64.getDecoder().decode(lllIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIllllllll) {
            IlIlIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIl() {
        (ll = new int[14])[0] = ((0xDA ^ 0x8D) & ~(0x3D ^ 0x6A));
        PlayerJoin.ll[1] = " ".length();
        PlayerJoin.ll[2] = "  ".length();
        PlayerJoin.ll[3] = "   ".length();
        PlayerJoin.ll[4] = (0xA7 ^ 0xA3);
        PlayerJoin.ll[5] = (0x98 ^ 0x9D);
        PlayerJoin.ll[6] = (0x27 ^ 0x21);
        PlayerJoin.ll[7] = (0x30 ^ 0x37);
        PlayerJoin.ll[8] = (0x6E ^ 0x66);
        PlayerJoin.ll[9] = (0x7 ^ 0xE);
        PlayerJoin.ll[10] = (0x7F ^ 0x75);
        PlayerJoin.ll[11] = (0x1E ^ 0x15);
        PlayerJoin.ll[12] = (0x73 ^ 0x7F);
        PlayerJoin.ll[13] = (0xCC ^ 0xC1);
    }
    
    private static String ll(final String IIlIIIIllllllll, final String lIIIIIIllllllll) {
        try {
            final SecretKeySpec lllIIIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.ll[8]), "DES");
            final Cipher IllIIIIllllllll = Cipher.getInstance("DES");
            IllIIIIllllllll.init(PlayerJoin.ll[2], lllIIIIllllllll);
            return new String(IllIIIIllllllll.doFinal(Base64.getDecoder().decode(IIlIIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIllllllll) {
            lIlIIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIlIllIllllllll) {
        final Player llIIllIllllllll = IIlIllIllllllll.getPlayer();
        if (llIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.l[PlayerJoin.ll[0]]) ? 1 : 0) && llIl(llIIllIllllllll.hasPermission(PlayerJoin.l[PlayerJoin.ll[1]]) ? 1 : 0)) {
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[2]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[3]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[4]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[5]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[6]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[7]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[8]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[9]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[10]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[11]]));
            llIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.l[PlayerJoin.ll[12]]));
        }
    }
    
    private static boolean llIl(final int lIIllllIlllllll) {
        return lIIllllIlllllll != 0;
    }
    
    private static boolean IIll(final int IIlllllIlllllll, final int llIllllIlllllll) {
        return IIlllllIlllllll < llIllllIlllllll;
    }
    
    private static void lIIl() {
        (l = new String[PlayerJoin.ll[13]])[PlayerJoin.ll[0]] = l("PS30SVZogToQCE/krfeZ1A==", "oKLwz");
        PlayerJoin.l[PlayerJoin.ll[1]] = Il("NRgMCBIoEh0OAD8HAAsAYxINCwwjXRkKECoaBw==", "Msife");
        PlayerJoin.l[PlayerJoin.ll[2]] = Il("fk1pAG5lSHJRbmVIclEIfkZpACsTECE7NjkBJwkhDBwiCXVgUyMxbmVIclFuZUhyUQ==", "XuOlS");
        PlayerJoin.l[PlayerJoin.ll[3]] = ll("It0vwmM2TKU=", "GMHDR");
        PlayerJoin.l[PlayerJoin.ll[4]] = ll("lgXZSjW+kX3cD2OJbKPndEE2MLjkOuk9", "kdFPI");
        PlayerJoin.l[PlayerJoin.ll[5]] = l("p6QyLoaHLSs=", "AprIw");
        PlayerJoin.l[PlayerJoin.ll[6]] = Il("enxzDRsuMis+SGJgZGoMIhEhIiUVPCIlDTM7KA==", "ZZDLn");
        PlayerJoin.l[PlayerJoin.ll[7]] = Il("", "kLuGY");
        PlayerJoin.l[PlayerJoin.ll[8]] = l("H42XfXKT3YVVrXN2oCH/K+ZFKopz6WoejT59ZtaytZu56zN0kmdB9fHw1S3DkCJk", "vCBWr");
        PlayerJoin.l[PlayerJoin.ll[9]] = l("OFzNjnvHqh4=", "LKzLM");
        PlayerJoin.l[PlayerJoin.ll[10]] = Il("clZOFxkmBRg6GygRGjwTdEhDdlQwQU14QmBeS2ZAYAJXdh1yFxYyCHxQSGJIYkU=", "RpyVr");
        PlayerJoin.l[PlayerJoin.ll[11]] = l("VjELdKdp010=", "ixtIu");
        PlayerJoin.l[PlayerJoin.ll[12]] = ll("emeLFU4kCOcBfuA9GtaEqz43IeXV9PrNsVkzLWpyjCdkTOhdPQLlY+02VFBm9TExr/B/x95DHMg=", "PYNLY");
    }
}
