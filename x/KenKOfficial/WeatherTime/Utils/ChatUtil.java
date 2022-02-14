package x.KenKOfficial.WeatherTime.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] IIIl;
    
    private static String lIIll(String llIlllllIllllll, final String IlIlllllIllllll) {
        llIlllllIllllll = new String(Base64.getDecoder().decode(llIlllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllllllIllllll = new StringBuilder();
        final char[] lIllllllIllllll = IlIlllllIllllll.toCharArray();
        int IIllllllIllllll = ChatUtil.lIIl[0];
        final boolean IllIllllIllllll = (Object)llIlllllIllllll.toCharArray();
        final Exception lIlIllllIllllll = (Exception)IllIllllIllllll.length;
        boolean IIlIllllIllllll = ChatUtil.lIIl[0] != 0;
        while (lIlll(IIlIllllIllllll ? 1 : 0, (int)lIlIllllIllllll)) {
            final char lIIIIIIIlllllll = IllIllllIllllll[IIlIllllIllllll];
            IlllllllIllllll.append((char)(lIIIIIIIlllllll ^ lIllllllIllllll[IIllllllIllllll % lIllllllIllllll.length]));
            "".length();
            ++IIllllllIllllll;
            ++IIlIllllIllllll;
            "".length();
            if (" ".length() == (0xB4 ^ 0xB0)) {
                return null;
            }
        }
        return String.valueOf(IlllllllIllllll);
    }
    
    private static boolean lIlll(final int llIIIlllIllllll, final int IlIIIlllIllllll) {
        return llIIIlllIllllll < IlIIIlllIllllll;
    }
    
    private static String IIIll(final String IIIIlIIIlllllll, final String lIllIIIIlllllll) {
        try {
            final SecretKeySpec llIIlIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIlIIIlllllll = Cipher.getInstance("Blowfish");
            IlIIlIIIlllllll.init(ChatUtil.lIIl[2], llIIlIIIlllllll);
            return new String(IlIIlIIIlllllll.doFinal(Base64.getDecoder().decode(IIIIlIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIlllllll) {
            lIIIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public static String fixColor(final String lIIllIIIlllllll) {
        return lIIllIIIlllllll.replaceAll(ChatUtil.IIIl[ChatUtil.lIIl[0]], ChatUtil.IIIl[ChatUtil.lIIl[1]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[2]], ChatUtil.IIIl[ChatUtil.lIIl[3]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[4]], ChatUtil.IIIl[ChatUtil.lIIl[5]]).replace(ChatUtil.IIIl[ChatUtil.lIIl[6]], ChatUtil.IIIl[ChatUtil.lIIl[7]]);
    }
    
    private static String IlIll(final String llIlIlllIllllll, final String IlIlIlllIllllll) {
        try {
            final SecretKeySpec IlllIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIIl[8]), "DES");
            final Cipher lIllIlllIllllll = Cipher.getInstance("DES");
            lIllIlllIllllll.init(ChatUtil.lIIl[2], IlllIlllIllllll);
            return new String(lIllIlllIllllll.doFinal(Base64.getDecoder().decode(llIlIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIlllIllllll) {
            IIllIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IIlll() {
        (lIIl = new int[9])[0] = ((0x79 ^ 0x4A ^ (0x3D ^ 0x2F)) & (0x91 ^ 0xBC ^ (0x75 ^ 0x79) ^ -" ".length()));
        ChatUtil.lIIl[1] = " ".length();
        ChatUtil.lIIl[2] = "  ".length();
        ChatUtil.lIIl[3] = "   ".length();
        ChatUtil.lIIl[4] = (0x18 ^ 0x1C);
        ChatUtil.lIIl[5] = (0xB ^ 0xE);
        ChatUtil.lIIl[6] = (0x6D ^ 0x6B);
        ChatUtil.lIIl[7] = (106 + 50 - 121 + 99 ^ 88 + 11 + 7 + 23);
        ChatUtil.lIIl[8] = (187 + 1 - 136 + 152 ^ 162 + 148 - 140 + 26);
    }
    
    static {
        IIlll();
        llIll();
    }
    
    private static void llIll() {
        (IIIl = new String[ChatUtil.lIIl[8]])[ChatUtil.lIIl[0]] = IIIll("0Lr3ZN76erw=", "cAEIV");
        ChatUtil.IIIl[ChatUtil.lIIl[1]] = lIIll("w78=", "XYIyH");
        ChatUtil.IIIl[ChatUtil.lIIl[2]] = IlIll("6m19qlPSvoI=", "Vxstb");
        ChatUtil.IIIl[ChatUtil.lIIl[3]] = lIIll("w7o=", "Ambvi");
        ChatUtil.IIIl[ChatUtil.lIIl[4]] = IIIll("gsFf2pCscRQ=", "LynCs");
        ChatUtil.IIIl[ChatUtil.lIIl[5]] = lIIll("w7k=", "Rbqjd");
        ChatUtil.IIIl[ChatUtil.lIIl[6]] = lIIll("OTY1", "BxHZI");
        ChatUtil.IIIl[ChatUtil.lIIl[7]] = IIIll("fWhsJu7Yajo=", "DarKz");
    }
}
