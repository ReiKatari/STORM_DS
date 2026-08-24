package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Parcel;
import android.os.Trace;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.stormds.emulator.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb4  reason: default package */
/* loaded from: classes.dex */
public abstract class lb4 {
    public static Method k;
    public static boolean l;
    public static e33 n;
    public static final Object a = new Object();
    public static final zv0 b = new zv0(1006516898, false, new fn0(6));
    public static final zv0 c = new zv0(325879492, false, new fn0(7));
    public static final zv0 d = new zv0(-1862642174, false, new kw0(0));
    public static final zv0 e = new zv0(-1686313917, false, new kw0(1));
    public static final zv0 f = new zv0(-1333657403, false, new kw0(2));
    public static final zv0 g = new zv0(-127107155, false, new kw0(3));
    public static final int[] h = {0, 1996959894, -301047508, -1727442502, 124634137, 1886057615, -379345611, -1637575261, 249268274, 2044508324, -522852066, -1747789432, 162941995, 2125561021, -407360249, -1866523247, 498536548, 1789927666, -205950648, -2067906082, 450548861, 1843258603, -187386543, -2083289657, 325883990, 1684777152, -43845254, -1973040660, 335633487, 1661365465, -99664541, -1928851979, 997073096, 1281953886, -715111964, -1570279054, 1006888145, 1258607687, -770865667, -1526024853, 901097722, 1119000684, -608450090, -1396901568, 853044451, 1172266101, -589951537, -1412350631, 651767980, 1373503546, -925412992, -1076862698, 565507253, 1454621731, -809855591, -1195530993, 671266974, 1594198024, -972236366, -1324619484, 795835527, 1483230225, -1050600021, -1234817731, 1994146192, 31158534, -1731059524, -271249366, 1907459465, 112637215, -1614814043, -390540237, 2013776290, 251722036, -1777751922, -519137256, 2137656763, 141376813, -1855689577, -429695999, 1802195444, 476864866, -2056965928, -228458418, 1812370925, 453092731, -2113342271, -183516073, 1706088902, 314042704, -1950435094, -54949764, 1658658271, 366619977, -1932296973, -69972891, 1303535960, 984961486, -1547960204, -725929758, 1256170817, 1037604311, -1529756563, -740887301, 1131014506, 879679996, -1385723834, -631195440, 1141124467, 855842277, -1442165665, -586318647, 1342533948, 654459306, -1106571248, -921952122, 1466479909, 544179635, -1184443383, -832445281, 1591671054, 702138776, -1328506846, -942167884, 1504918807, 783551873, -1212326853, -1061524307, -306674912, -1698712650, 62317068, 1957810842, -355121351, -1647151185, 81470997, 1943803523, -480048366, -1805370492, 225274430, 2053790376, -468791541, -1828061283, 167816743, 2097651377, -267414716, -2029476910, 503444072, 1762050814, -144550051, -2140837941, 426522225, 1852507879, -19653770, -1982649376, 282753626, 1742555852, -105259153, -1900089351, 397917763, 1622183637, -690576408, -1580100738, 953729732, 1340076626, -776247311, -1497606297, 1068828381, 1219638859, -670225446, -1358292148, 906185462, 1090812512, -547295293, -1469587627, 829329135, 1181335161, -882789492, -1134132454, 628085408, 1382605366, -871598187, -1156888829, 570562233, 1426400815, -977650754, -1296233688, 733239954, 1555261956, -1026031705, -1244606671, 752459403, 1541320221, -1687895376, -328994266, 1969922972, 40735498, -1677130071, -351390145, 1913087877, 83908371, -1782625662, -491226604, 2075208622, 213261112, -1831694693, -438977011, 2094854071, 198958881, -2032938284, -237706686, 1759359992, 534414190, -2118248755, -155638181, 1873836001, 414664567, -2012718362, -15766928, 1711684554, 285281116, -1889165569, -127750551, 1634467795, 376229701, -1609899400, -686959890, 1308918612, 956543938, -1486412191, -799009033, 1231636301, 1047427035, -1362007478, -640263460, 1088359270, 936918000, -1447252397, -558129467, 1202900863, 817233897, -1111625188, -893730166, 1404277552, 615818150, -1160759803, -841546093, 1423857449, 601450431, -1285129682, -1000256840, 1567103746, 711928724, -1274298825, -1022587231, 1510334235, 755167117};
    public static final gn5 i = new gn5(23);
    public static final Object j = new Object();
    public static final af6 m = new af6(1);

    public static boolean A(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (!str2.equalsIgnoreCase(str)) {
            String str3 = Build.BRAND;
            str3.getClass();
            if (!str3.equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean B(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean C() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str2 = Build.HARDWARE;
        str2.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (!xs6.g0(lowerCase, "ums", false)) {
            if (A("Itel")) {
                String lowerCase2 = str2.toLowerCase(locale);
                lowerCase2.getClass();
                if (xs6.g0(lowerCase2, "sp", false)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final a74 D(a74 a74Var, String str) {
        return a74Var.d(new bm3(str));
    }

    public static final a74 E(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new ul4(qn2Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r5 != 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r3.getName().equals("locales") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r1.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String G(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused2) {
                return "";
            }
        }
        return str;
    }

    public static final Object H(Object obj) {
        if (obj instanceof av0) {
            return oi2.p(((av0) obj).a);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pc1] */
    public static final sr0 I(fp fpVar) {
        List list;
        SpannableString spannableString;
        byte b2;
        List list2 = fpVar.L;
        List list3 = yt1.A;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = fpVar.B;
        if (!list.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(str);
            ?? obj = new Object();
            obj.a = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i2 = 0;
            while (i2 < size) {
                ep epVar = (ep) list2.get(i2);
                nn6 nn6Var = (nn6) epVar.a;
                int i3 = epVar.b;
                int i4 = epVar.c;
                obj.a.recycle();
                obj.a = Parcel.obtain();
                e37 e37Var = nn6Var.a;
                long j2 = nn6Var.l;
                long j3 = nn6Var.h;
                int i5 = i2;
                long j4 = nn6Var.b;
                List list4 = list2;
                int i6 = size;
                long b3 = e37Var.b();
                long j5 = kt0.h;
                if (!kt0.d(b3, j5)) {
                    obj.c((byte) 1);
                    spannableString = spannableString2;
                    obj.a.writeLong(nn6Var.a.b());
                } else {
                    spannableString = spannableString2;
                }
                long j6 = x47.c;
                byte b4 = 2;
                if (!x47.a(j4, j6)) {
                    obj.c((byte) 2);
                    obj.e(j4);
                }
                oj2 oj2Var = nn6Var.c;
                if (oj2Var != null) {
                    obj.c((byte) 3);
                    obj.a.writeInt(oj2Var.A);
                }
                ij2 ij2Var = nn6Var.d;
                if (ij2Var != null) {
                    int i7 = ij2Var.a;
                    obj.c((byte) 4);
                    if (i7 == 0 || i7 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    obj.c(b2);
                }
                jj2 jj2Var = nn6Var.e;
                if (jj2Var != null) {
                    int i8 = jj2Var.a;
                    obj.c((byte) 5);
                    if (i8 != 0) {
                        if (i8 == 65535) {
                            b4 = 1;
                        } else if (i8 != 1) {
                            if (i8 == 2) {
                                b4 = 3;
                            }
                        }
                        obj.c(b4);
                    }
                    b4 = 0;
                    obj.c(b4);
                }
                String str2 = nn6Var.g;
                if (str2 != null) {
                    obj.c((byte) 6);
                    obj.a.writeString(str2);
                }
                if (!x47.a(j3, j6)) {
                    obj.c((byte) 7);
                    obj.e(j3);
                }
                x20 x20Var = nn6Var.i;
                if (x20Var != null) {
                    float f2 = x20Var.a;
                    obj.c((byte) 8);
                    obj.d(f2);
                }
                f37 f37Var = nn6Var.j;
                if (f37Var != null) {
                    obj.c((byte) 9);
                    obj.d(f37Var.a);
                    obj.d(f37Var.b);
                }
                if (!kt0.d(j2, j5)) {
                    obj.c((byte) 10);
                    obj.a.writeLong(j2);
                }
                b17 b17Var = nn6Var.m;
                if (b17Var != null) {
                    obj.c((byte) 11);
                    obj.a.writeInt(b17Var.a);
                }
                ge6 ge6Var = nn6Var.n;
                if (ge6Var != null) {
                    obj.c((byte) 12);
                    obj.a.writeLong(ge6Var.a);
                    long j7 = ge6Var.b;
                    obj.d(Float.intBitsToFloat((int) (j7 >> 32)));
                    obj.d(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    obj.d(ge6Var.c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.a.marshall(), 0)), i3, i4, 33);
                i2 = i5 + 1;
                spannableString2 = spannableString3;
                list2 = list4;
                size = i6;
            }
            str = spannableString2;
        }
        return new sr0(ClipData.newPlainText("plain text", str));
    }

    public static final void J(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static a74 K(a74 a74Var, ag1 ag1Var) {
        return a74Var.d(new l97(ag1Var, new h37(8)));
    }

    public static final void a(l3 l3Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1852700408);
        if (xq2Var.h(l3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            boolean h2 = xq2Var.h(l3Var);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new a6(l3Var, null, 0);
                xq2Var.l0(P);
            }
            mb3.i(xq2Var, (eo2) P, l3Var);
            f04.a(ge7.O(x64.a, 8.0f), l3Var.a.j, l3Var.e, null, n16.I(-315922898, new ov4(l3Var, 2), xq2Var), xq2Var, 24582, 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(l3Var, i2, 0);
        }
    }

    public static final void b(a74 a74Var, xn0 xn0Var, lq4 lq4Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2059675956);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(xn0Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(lq4Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new nh2();
                xq2Var.l0(P);
            }
            nh2 nh2Var = (nh2) P;
            a74 N = ge7.N(a74Var, lq4Var);
            yt0 a2 = wt0.a(new gu(16.0f, true, new i(1)), d90.k0, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, N);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            py0 py0Var = n47.a;
            hv.d(py0Var.a(new m47(((ut0) xq2Var.j(vt0.a)).i(), ((m47) xq2Var.j(py0Var)).b)), n16.I(-1778091006, new x3(nh2Var, xn0Var, on2Var, 6), xq2Var), xq2Var, 56);
            xq2Var.p(true);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new sn0(nh2Var, null, 0);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, jg7.a);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(a74Var, xn0Var, lq4Var, on2Var, i2, 1);
        }
    }

    public static final void c(jn0 jn0Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        jn0Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-548343735);
        if (xq2Var.f(jn0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (xq2Var.h(on2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        boolean z2 = true;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            if (!jn0Var.equals(hn0.b)) {
                xq2Var.b0(-1947384047);
                Object[] objArr = {jn0Var};
                ap3 ap3Var = xn0.g;
                if ((((i8 & 14) ^ 6) <= 4 || !xq2Var.f(jn0Var)) && (i8 & 6) != 4) {
                    z2 = false;
                }
                Object P = xq2Var.P();
                if (z2 || P == ox0.a) {
                    P = new a5(jn0Var, 15);
                    xq2Var.l0(P);
                }
                xn0 xn0Var = (xn0) qo2.J(objArr, ap3Var, (on2) P, xq2Var, 0);
                if (ft7.b(xq2Var, 0).a.a >= 840) {
                    xq2Var.b0(-1947118501);
                    e(xn0Var, on2Var, qn2Var, xq2Var, i8 & 1008);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-1946923914);
                    d(xn0Var, on2Var, qn2Var, xq2Var, i8 & 1008);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1946730567);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(jn0Var, on2Var, qn2Var, i2, 7);
        }
    }

    public static final void d(xn0 xn0Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1421209610);
        if (xq2Var.f(xn0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (xq2Var.h(on2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            if ((i8 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i8 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z5 || P == vs0Var) {
                P = new kn0(xn0Var, qn2Var, 1);
                xq2Var.l0(P);
            }
            on2 on2Var2 = (on2) P;
            if ((((Configuration) xq2Var.j(kf.a)).uiMode & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Context context = (Context) xq2Var.j(kf.b);
            View view = (View) xq2Var.j(kf.f);
            boolean f2 = xq2Var.f(context) | xq2Var.f(view);
            Object P2 = xq2Var.P();
            if (f2 || P2 == vs0Var) {
                context.getClass();
                P2 = new cv7(((Activity) context).getWindow(), view);
                xq2Var.l0(P2);
            }
            cv7 cv7Var = (cv7) P2;
            cv7Var.getClass();
            boolean h2 = xq2Var.h(cv7Var) | xq2Var.g(z4);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new g00(cv7Var, z4, 1);
                xq2Var.l0(P3);
            }
            mb3.d(jg7.a, (qn2) P3, xq2Var);
            ln2.c(on2Var, n16.I(-1505530067, new rn0(xn0Var, on2Var, on2Var2, 0), xq2Var), xq2Var, ((i8 >> 3) & 14) | 48);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new qn0(xn0Var, on2Var, qn2Var, i2, 1);
        }
    }

    public static final void e(xn0 xn0Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1520793769);
        if (xq2Var.f(xn0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i2;
        if (xq2Var.h(on2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        boolean z3 = true;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            if ((i10 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i10 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object P = xq2Var.P();
            if (z4 || P == ox0.a) {
                P = new kn0(xn0Var, qn2Var, 0);
                xq2Var.l0(P);
            }
            on2 on2Var2 = (on2) P;
            if (xn0Var.a) {
                i6 = -1193917191;
                i7 = R.string.new_cheat;
            } else {
                i6 = -1193915910;
                i7 = R.string.edit_cheat;
            }
            q60.a(i61.l(xq2Var, i6, i7, xq2Var, false), on2Var, n16.I(-979761630, new on0(xn0Var, on2Var2, 0), xq2Var), n16.I(-1109498528, new pn0(on2Var, on2Var2, 0), xq2Var), false, xq2Var, (i10 & 112) | 3456, 16);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new qn0(xn0Var, on2Var, qn2Var, i2, 0);
        }
    }

    public static final sf f(String str) {
        return new sf(ii2.R(str));
    }

    public static final jk4 g(mw6 mw6Var, oy4 oy4Var, os0 os0Var) {
        long j2;
        long j3;
        int i2 = oy4Var.e;
        List list = oy4Var.a;
        if ((i2 & 4096) != 0) {
            int i3 = oy4Var.f;
            if (i3 == 6 || i3 == 10 || i3 == 11 || i3 == 12) {
                ow6 ow6Var = mw6Var.Y;
                long P = os0Var.P(mw6Var, oy4Var);
                vy4 vy4Var = (vy4) gt0.J0(list);
                if (vy4Var != null) {
                    long j4 = vy4Var.l ^ (-9223372034707292160L);
                    List b2 = vy4Var.b();
                    jk4 jk4Var = new jk4(0L);
                    int size = b2.size();
                    int i4 = 0;
                    while (true) {
                        j3 = jk4Var.a;
                        if (i4 >= size) {
                            break;
                        }
                        jk4Var = new jk4(jk4.e(j3, ((vx2) b2.get(i4)).d));
                        i4++;
                    }
                    j2 = jk4.f(j4, j3);
                } else {
                    j2 = 0;
                }
                long f2 = jk4.f(P, j2);
                if (!jk4.c(f2, 0L)) {
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((vy4) list.get(i5)).a();
                    }
                    return new jk4(f2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final jk4 h(oy4 oy4Var) {
        long j2;
        long j3;
        int i2 = oy4Var.f;
        List list = oy4Var.a;
        if (i2 == 10 || i2 == 11 || i2 == 12) {
            vy4 vy4Var = (vy4) gt0.J0(list);
            if (vy4Var != null) {
                long j4 = vy4Var.l ^ (-9223372034707292160L);
                List b2 = vy4Var.b();
                jk4 jk4Var = new jk4(0L);
                int size = b2.size();
                int i3 = 0;
                while (true) {
                    j3 = jk4Var.a;
                    if (i3 >= size) {
                        break;
                    }
                    jk4Var = new jk4(jk4.e(j3, ((vx2) b2.get(i3)).d));
                    i3++;
                }
                j2 = jk4.f(j4, j3);
            } else {
                j2 = 0;
            }
            if (!jk4.c(j2, 0L)) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((vy4) list.get(i4)).a();
                }
                return new jk4(j2);
            }
            return null;
        }
        return null;
    }

    public static final Float i(oy4 oy4Var) {
        int i2 = oy4Var.f;
        List list = oy4Var.a;
        if (i2 == 7 || i2 == 8 || i2 == 9) {
            int size = list.size();
            float f2 = 1.0f;
            for (int i3 = 0; i3 < size; i3++) {
                vy4 vy4Var = (vy4) list.get(i3);
                f2 *= vy4Var.k;
                List b2 = vy4Var.b();
                int size2 = b2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    f2 *= ((vx2) b2.get(i4)).c;
                }
            }
            if (f2 != 1.0f) {
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((vy4) list.get(i5)).a();
                }
                return Float.valueOf(f2);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ae, code lost:
        if (((java.lang.Boolean) r11.g(new defpackage.jk4(r3))).booleanValue() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030a, code lost:
        if (((java.lang.Boolean) r11.g(new defpackage.jk4(r3))).booleanValue() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03bd, code lost:
        if (r15 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03bf, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
        r10 = r1.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0134, code lost:
        if (r10 != 10) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0139, code lost:
        if (r10 != 11) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
        if (r10 != 12) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
        if (r10 != 7) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
        if (r10 != 8) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
        if (r10 != 9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014d, code lost:
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014f, code lost:
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c4 A[EDGE_INSN: B:160:0x03c4->B:148:0x03c4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0130 A[EDGE_INSN: B:164:0x0130->B:34:0x0130 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Type inference failed for: r10v8, types: [qn2] */
    /* JADX WARN: Type inference failed for: r10v9, types: [qn2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d20, m97] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r8v14, types: [qn2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0399 -> B:141:0x03a4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(mw6 mw6Var, v80 v80Var, ro5 ro5Var, d20 d20Var) {
        m97 m97Var;
        x61 x61Var;
        int i2;
        oy4 oy4Var;
        float f2;
        ro5 ro5Var2;
        mw6 mw6Var2;
        ul0 ul0Var;
        float f3;
        int i3;
        int i4;
        long j2;
        float f4;
        int i5;
        int i6;
        float f5;
        mw6 mw6Var3;
        float f6;
        ul0 ul0Var2;
        ro5 ro5Var3;
        int i7;
        float f7;
        int size;
        float f8;
        int i8;
        int i9;
        x61 x61Var2;
        ro5 ro5Var4;
        long j3;
        int i10;
        float f9;
        int i11;
        Object c2;
        x61 x61Var3;
        float f10;
        long j4;
        float f11;
        ro5 ro5Var5;
        float f12;
        float f13;
        x61 x61Var4;
        int i12;
        float f14;
        boolean z;
        long e2;
        float f15;
        long j5;
        int i13;
        int i14;
        int i15;
        float f16;
        int size2;
        int i16;
        int i17;
        Object c3;
        if (d20Var instanceof m97) {
            m97 m97Var2 = (m97) d20Var;
            int i18 = m97Var2.l0;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                m97Var2.l0 = i18 - Integer.MIN_VALUE;
                m97Var = m97Var2;
                Object obj = m97Var.k0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i2 = m97Var.l0;
                float f17 = RecyclerView.B1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                int i19 = m97Var.j0;
                                int i20 = m97Var.i0;
                                f5 = m97Var.f0;
                                i11 = m97Var.h0;
                                long j6 = m97Var.g0;
                                float f18 = m97Var.e0;
                                f6 = m97Var.d0;
                                oy4 oy4Var2 = m97Var.Z;
                                ?? r8 = m97Var.Y;
                                ul0 ul0Var3 = m97Var.X;
                                mw6 mw6Var4 = m97Var.R;
                                oi2.Y(obj);
                                c2 = obj;
                                int i21 = i20;
                                x61Var3 = x61Var;
                                f8 = 0.0f;
                                mw6 mw6Var5 = mw6Var4;
                                ul0 ul0Var4 = ul0Var3;
                                float f19 = f18;
                                j2 = j6;
                                ro5 ro5Var6 = r8;
                                List list = ((oy4) c2).a;
                                int size3 = list.size();
                                int i22 = i19;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < size3) {
                                        if (((vy4) list.get(i23)).c()) {
                                            break;
                                        }
                                        i23++;
                                    } else {
                                        break;
                                    }
                                }
                                boolean z2 = false;
                                if (i22 == 0 && !z2) {
                                    List list2 = oy4Var2.a;
                                    int size4 = list2.size();
                                    int i24 = 0;
                                    while (i24 < size4) {
                                        if (((vy4) list2.get(i24)).d) {
                                            i6 = i21;
                                            x61Var = x61Var3;
                                            ro5Var2 = ro5Var6;
                                            f4 = f19;
                                            mw6Var2 = mw6Var5;
                                            f3 = f6;
                                            f2 = f5;
                                            i5 = i11;
                                            f17 = f8;
                                            oy4Var = null;
                                            ul0Var = ul0Var4;
                                            m97Var.R = mw6Var2;
                                            m97Var.X = ul0Var;
                                            m97Var.Y = ro5Var2;
                                            m97Var.Z = oy4Var;
                                            m97Var.d0 = f3;
                                            m97Var.e0 = f4;
                                            m97Var.g0 = j2;
                                            m97Var.h0 = i5;
                                            m97Var.f0 = f2;
                                            m97Var.i0 = i6;
                                            m97Var.l0 = 2;
                                            c3 = mw6Var2.c(py4.Main, m97Var);
                                            if (c3 != x61Var) {
                                                ro5 ro5Var7 = ro5Var2;
                                                i7 = i5;
                                                obj = c3;
                                                f5 = f2;
                                                f7 = f4;
                                                ro5Var3 = ro5Var7;
                                                ul0 ul0Var5 = ul0Var;
                                                f6 = f3;
                                                ul0Var2 = ul0Var5;
                                                mw6Var3 = mw6Var2;
                                                oy4 oy4Var3 = (oy4) obj;
                                                List list3 = oy4Var3.a;
                                                size = list3.size();
                                                int i25 = i6;
                                                f8 = f17;
                                                i8 = 0;
                                                while (true) {
                                                    if (i8 >= size) {
                                                        break;
                                                    } else if (((vy4) list3.get(i8)).c()) {
                                                        break;
                                                    } else {
                                                        i8++;
                                                    }
                                                }
                                                if (i9 != 0) {
                                                    float r = np2.r(oy4Var3, true);
                                                    float r2 = np2.r(oy4Var3, false);
                                                    if (r == f8 || r2 == f8) {
                                                        f10 = 1.0f;
                                                    } else {
                                                        f10 = r / r2;
                                                    }
                                                    int size5 = list3.size();
                                                    float f20 = f7;
                                                    int i26 = 0;
                                                    int i27 = 0;
                                                    while (i26 < size5) {
                                                        int i28 = i26;
                                                        vy4 vy4Var = (vy4) list3.get(i26);
                                                        int i29 = i7;
                                                        if (vy4Var.h && vy4Var.d) {
                                                            i17 = 1;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                        i27 += i17;
                                                        i26 = i28 + 1;
                                                        i7 = i29;
                                                    }
                                                    int i30 = i7;
                                                    if (i27 < 2) {
                                                        x61Var2 = x61Var;
                                                        j4 = j2;
                                                        ro5Var5 = ro5Var3;
                                                        f12 = f6;
                                                        f13 = f8;
                                                        f11 = 180.0f;
                                                    } else {
                                                        j4 = j2;
                                                        f11 = 180.0f;
                                                        long q = np2.q(oy4Var3, true, new h37(7));
                                                        ro5 ro5Var8 = ro5Var3;
                                                        long q2 = np2.q(oy4Var3, false, new h37(7));
                                                        int size6 = list3.size();
                                                        float f21 = f8;
                                                        float f22 = f21;
                                                        int i31 = 0;
                                                        while (i31 < size6) {
                                                            int i32 = size6;
                                                            vy4 vy4Var2 = (vy4) list3.get(i31);
                                                            ro5 ro5Var9 = ro5Var8;
                                                            if (vy4Var2.d && vy4Var2.h) {
                                                                i12 = i31;
                                                                long j7 = vy4Var2.c;
                                                                x61Var4 = x61Var;
                                                                f14 = f6;
                                                                long e3 = jk4.e(vy4Var2.g, q2);
                                                                long e4 = jk4.e(j7, q);
                                                                float l2 = np2.l(e4) - np2.l(e3);
                                                                float d2 = jk4.d(jk4.f(e4, e3)) / 2.0f;
                                                                if (l2 > 180.0f) {
                                                                    l2 -= 360.0f;
                                                                } else if (l2 < -180.0f) {
                                                                    l2 += 360.0f;
                                                                }
                                                                f22 = (l2 * d2) + f22;
                                                                f21 += d2;
                                                            } else {
                                                                x61Var4 = x61Var;
                                                                i12 = i31;
                                                                f14 = f6;
                                                            }
                                                            i31 = i12 + 1;
                                                            ro5Var8 = ro5Var9;
                                                            size6 = i32;
                                                            x61Var = x61Var4;
                                                            f6 = f14;
                                                        }
                                                        x61Var2 = x61Var;
                                                        ro5Var5 = ro5Var8;
                                                        f12 = f6;
                                                        if (f21 == f8) {
                                                            f13 = f8;
                                                        } else {
                                                            f13 = f22 / f21;
                                                        }
                                                    }
                                                    long q3 = np2.q(oy4Var3, true, new h37(7));
                                                    if (jk4.c(q3, 9205357640488583168L)) {
                                                        e2 = 0;
                                                        z = false;
                                                    } else {
                                                        z = false;
                                                        e2 = jk4.e(q3, np2.q(oy4Var3, false, new h37(7)));
                                                    }
                                                    if (i30 == 0) {
                                                        f15 = f20 * f10;
                                                        f6 = f12 + f13;
                                                        long f23 = jk4.f(j4, e2);
                                                        float r3 = np2.r(oy4Var3, z);
                                                        float abs = Math.abs(1.0f - f15) * r3;
                                                        float abs2 = Math.abs(((3.1415927f * f6) * r3) / f11);
                                                        float d3 = jk4.d(f23);
                                                        if (abs <= f5 && abs2 <= f5) {
                                                            if (d3 > f5) {
                                                                ro5Var4 = ro5Var5;
                                                            } else {
                                                                ro5Var4 = ro5Var5;
                                                            }
                                                            j5 = f23;
                                                            i13 = i30;
                                                        } else {
                                                            ro5Var4 = ro5Var5;
                                                        }
                                                        ul0Var2.c(g97.f);
                                                        i13 = 1;
                                                        j5 = f23;
                                                        i14 = 0;
                                                        if (i13 == 0) {
                                                            long q4 = np2.q(oy4Var3, false, new h37(7));
                                                            if (i14 != 0) {
                                                                f16 = f8;
                                                            } else {
                                                                f16 = f13;
                                                            }
                                                            if (f16 == f8) {
                                                                i15 = i13;
                                                                if (f10 == 1.0f) {
                                                                    if (!jk4.c(e2, 0L)) {
                                                                    }
                                                                    size2 = list3.size();
                                                                    i16 = 0;
                                                                    while (i16 < size2) {
                                                                        vy4 vy4Var3 = (vy4) list3.get(i16);
                                                                        int i33 = i16;
                                                                        int i34 = i14;
                                                                        int i35 = size2;
                                                                        if (!jk4.c(ej2.R(vy4Var3, false), 0L)) {
                                                                            vy4Var3.a();
                                                                        }
                                                                        i16 = i33 + 1;
                                                                        i14 = i34;
                                                                        size2 = i35;
                                                                    }
                                                                }
                                                            } else {
                                                                i15 = i13;
                                                            }
                                                            ul0Var2.c(new f97(q4, f10, e2, f16));
                                                            size2 = list3.size();
                                                            i16 = 0;
                                                            while (i16 < size2) {
                                                            }
                                                        } else {
                                                            i15 = i13;
                                                        }
                                                        int i36 = i14;
                                                        i11 = i15;
                                                        f9 = f15;
                                                        j3 = j5;
                                                        i10 = i36;
                                                    } else {
                                                        ro5Var4 = ro5Var5;
                                                        f15 = f20;
                                                        j5 = j4;
                                                        i13 = i30;
                                                        f6 = f12;
                                                    }
                                                    i14 = i25;
                                                    if (i13 == 0) {
                                                    }
                                                    int i362 = i14;
                                                    i11 = i15;
                                                    f9 = f15;
                                                    j3 = j5;
                                                    i10 = i362;
                                                } else {
                                                    x61Var2 = x61Var;
                                                    ro5Var4 = ro5Var3;
                                                    j3 = j2;
                                                    ul0Var2.c(h97.f);
                                                    i10 = i25;
                                                    f9 = f7;
                                                    i11 = i7;
                                                }
                                                py4 py4Var = py4.Final;
                                                m97Var.R = mw6Var3;
                                                m97Var.X = ul0Var2;
                                                m97Var.Y = ro5Var4;
                                                m97Var.Z = oy4Var3;
                                                m97Var.d0 = f6;
                                                m97Var.e0 = f9;
                                                m97Var.g0 = j3;
                                                m97Var.h0 = i11;
                                                m97Var.f0 = f5;
                                                m97Var.i0 = i10;
                                                m97Var.j0 = i9;
                                                m97Var.l0 = 3;
                                                c2 = mw6Var3.c(py4Var, m97Var);
                                                x61Var3 = x61Var2;
                                                if (c2 != x61Var3) {
                                                    return x61Var3;
                                                }
                                                i21 = i10;
                                                i19 = i9;
                                                ul0Var4 = ul0Var2;
                                                f19 = f9;
                                                j2 = j3;
                                                ro5Var6 = ro5Var4;
                                                mw6Var5 = mw6Var3;
                                                oy4Var2 = oy4Var3;
                                                List list4 = ((oy4) c2).a;
                                                int size32 = list4.size();
                                                int i222 = i19;
                                                int i232 = 0;
                                                while (true) {
                                                    if (i232 < size32) {
                                                    }
                                                    i232++;
                                                }
                                                boolean z22 = false;
                                                if (i222 == 0) {
                                                    List list22 = oy4Var2.a;
                                                    int size42 = list22.size();
                                                    int i242 = 0;
                                                    while (i242 < size42) {
                                                    }
                                                }
                                            }
                                            return x61Var;
                                        }
                                        i242++;
                                    }
                                }
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = m97Var.i0;
                        float f24 = m97Var.f0;
                        i7 = m97Var.h0;
                        j2 = m97Var.g0;
                        float f25 = m97Var.e0;
                        float f26 = m97Var.d0;
                        ?? r10 = m97Var.Y;
                        ul0 ul0Var6 = m97Var.X;
                        mw6 mw6Var6 = m97Var.R;
                        oi2.Y(obj);
                        f6 = f26;
                        ul0Var2 = ul0Var6;
                        f5 = f24;
                        f7 = f25;
                        ro5Var3 = r10;
                        mw6Var3 = mw6Var6;
                        oy4 oy4Var32 = (oy4) obj;
                        List list32 = oy4Var32.a;
                        size = list32.size();
                        int i252 = i6;
                        f8 = f17;
                        i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                            }
                            i8++;
                        }
                        if (i9 != 0) {
                        }
                        py4 py4Var2 = py4.Final;
                        m97Var.R = mw6Var3;
                        m97Var.X = ul0Var2;
                        m97Var.Y = ro5Var4;
                        m97Var.Z = oy4Var32;
                        m97Var.d0 = f6;
                        m97Var.e0 = f9;
                        m97Var.g0 = j3;
                        m97Var.h0 = i11;
                        m97Var.f0 = f5;
                        m97Var.i0 = i10;
                        m97Var.j0 = i9;
                        m97Var.l0 = 3;
                        c2 = mw6Var3.c(py4Var2, m97Var);
                        x61Var3 = x61Var2;
                        if (c2 != x61Var3) {
                        }
                    } else {
                        oy4Var = null;
                        int i37 = m97Var.i0;
                        f2 = m97Var.f0;
                        int i38 = m97Var.h0;
                        j2 = m97Var.g0;
                        f4 = m97Var.e0;
                        f3 = m97Var.d0;
                        ?? r102 = m97Var.Y;
                        ul0Var = m97Var.X;
                        mw6Var2 = m97Var.R;
                        oi2.Y(obj);
                        i4 = i37;
                        i3 = i38;
                        ro5Var2 = r102;
                    }
                } else {
                    oy4Var = null;
                    oi2.Y(obj);
                    f2 = mw6Var.f().f();
                    m97Var.R = mw6Var;
                    m97Var.X = v80Var;
                    ro5Var2 = ro5Var;
                    m97Var.Y = ro5Var2;
                    m97Var.d0 = RecyclerView.B1;
                    m97Var.e0 = 1.0f;
                    m97Var.g0 = 0L;
                    m97Var.h0 = 0;
                    m97Var.f0 = f2;
                    m97Var.i0 = 0;
                    m97Var.l0 = 1;
                    if (hz6.b(mw6Var, m97Var, 2) != x61Var) {
                        mw6Var2 = mw6Var;
                        ul0Var = v80Var;
                        f3 = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        j2 = 0;
                        f4 = 1.0f;
                    }
                    return x61Var;
                }
                int i39 = i4;
                i5 = i3;
                i6 = i39;
                m97Var.R = mw6Var2;
                m97Var.X = ul0Var;
                m97Var.Y = ro5Var2;
                m97Var.Z = oy4Var;
                m97Var.d0 = f3;
                m97Var.e0 = f4;
                m97Var.g0 = j2;
                m97Var.h0 = i5;
                m97Var.f0 = f2;
                m97Var.i0 = i6;
                m97Var.l0 = 2;
                c3 = mw6Var2.c(py4.Main, m97Var);
                if (c3 != x61Var) {
                }
                return x61Var;
            }
        }
        m97Var = new s41(d20Var);
        Object obj2 = m97Var.k0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i2 = m97Var.l0;
        float f172 = RecyclerView.B1;
        if (i2 == 0) {
        }
        int i392 = i4;
        i5 = i3;
        i6 = i392;
        m97Var.R = mw6Var2;
        m97Var.X = ul0Var;
        m97Var.Y = ro5Var2;
        m97Var.Z = oy4Var;
        m97Var.d0 = f3;
        m97Var.e0 = f4;
        m97Var.g0 = j2;
        m97Var.h0 = i5;
        m97Var.f0 = f2;
        m97Var.i0 = i6;
        m97Var.l0 = 2;
        c3 = mw6Var2.c(py4.Main, m97Var);
        if (c3 != x61Var) {
        }
        return x61Var;
    }

    public static final x61 k(hb4 hb4Var, hw6 hw6Var) {
        Object k0 = np2.k0(kb4.d0, hb4Var, hw6Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        if (k0 != x61Var) {
            np2.V(hw6Var).i(jg7.a);
        }
        return x61Var;
    }

    public static final void l(v2 v2Var, xa6 xa6Var) {
        ta6 ta6Var = xa6Var.d;
        ja4 ja4Var = ta6Var.A;
        Object g2 = ta6Var.A.g(bb6.z);
        y1 y1Var = null;
        if (g2 == null) {
            g2 = null;
        }
        mq5 mq5Var = (mq5) g2;
        if (n16.i(xa6Var)) {
            if (mq5Var == null || mq5Var.a != 8) {
                Object g3 = ja4Var.g(sa6.y);
                if (g3 == null) {
                    g3 = null;
                }
                y1 y1Var2 = (y1) g3;
                if (y1Var2 != null) {
                    v2Var.b(new p2(16908358, y1Var2.a));
                }
                Object g4 = ja4Var.g(sa6.A);
                if (g4 == null) {
                    g4 = null;
                }
                y1 y1Var3 = (y1) g4;
                if (y1Var3 != null) {
                    v2Var.b(new p2(16908359, y1Var3.a));
                }
                Object g5 = ja4Var.g(sa6.z);
                if (g5 == null) {
                    g5 = null;
                }
                y1 y1Var4 = (y1) g5;
                if (y1Var4 != null) {
                    v2Var.b(new p2(16908360, y1Var4.a));
                }
                Object g6 = ja4Var.g(sa6.B);
                if (g6 != null) {
                    y1Var = g6;
                }
                y1 y1Var5 = y1Var;
                if (y1Var5 != null) {
                    v2Var.b(new p2(16908361, y1Var5.a));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(ut3 ut3Var, s41 s41Var) {
        d dVar;
        int i2;
        ut3 ut3Var2;
        dh5 dh5Var;
        Throwable th;
        gu3 gu3Var;
        gu3 gu3Var2;
        if (s41Var instanceof d) {
            d dVar2 = (d) s41Var;
            int i3 = dVar2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar2.Z = i3 - Integer.MIN_VALUE;
                dVar = dVar2;
                Object obj = dVar.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = dVar.Z;
                jg7 jg7Var = jg7.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        dh5Var = dVar.X;
                        ut3Var2 = dVar.R;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            gu3Var = (gu3) dh5Var.A;
                            if (gu3Var != null) {
                            }
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (!ut3Var.b().isAtLeast(tt3.STARTED)) {
                        ?? obj2 = new Object();
                        try {
                            dVar.R = ut3Var;
                            dVar.X = obj2;
                            dVar.Z = 1;
                            rj0 rj0Var = new rj0(1, np2.V(dVar));
                            rj0Var.v();
                            e eVar = new e(rj0Var);
                            obj2.A = eVar;
                            ut3Var.a(eVar);
                            if (rj0Var.s() == x61Var) {
                                return x61Var;
                            }
                            ut3Var2 = ut3Var;
                            dh5Var = obj2;
                        } catch (Throwable th3) {
                            ut3Var2 = ut3Var;
                            dh5Var = obj2;
                            th = th3;
                            gu3Var = (gu3) dh5Var.A;
                            if (gu3Var != null) {
                                ut3Var2.c(gu3Var);
                            }
                            throw th;
                        }
                    }
                    return jg7Var;
                }
                gu3Var2 = (gu3) dh5Var.A;
                if (gu3Var2 != null) {
                    ut3Var2.c(gu3Var2);
                }
                return jg7Var;
            }
        }
        dVar = new s41(s41Var);
        Object obj3 = dVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = dVar.Z;
        jg7 jg7Var2 = jg7.a;
        if (i2 == 0) {
        }
        gu3Var2 = (gu3) dh5Var.A;
        if (gu3Var2 != null) {
        }
        return jg7Var2;
    }

    public static final void o(lw7 lw7Var, String str) {
        rx7 b2;
        WorkDatabase workDatabase = lw7Var.c;
        workDatabase.getClass();
        dx7 w = workDatabase.w();
        zh1 r = workDatabase.r();
        ArrayList d0 = hf.d0(str);
        while (!d0.isEmpty()) {
            String str2 = (String) gt0.Y0(d0);
            iw7 c2 = w.c(str2);
            if (c2 != iw7.SUCCEEDED && c2 != iw7.FAILED) {
                ((Number) hv.Q(w.a, false, true, new c70(str2, 24))).intValue();
            }
            d0.addAll(r.a(str2));
        }
        o35 o35Var = lw7Var.f;
        o35Var.getClass();
        synchronized (o35Var.k) {
            ga0 f2 = ga0.f();
            String str3 = o35.l;
            f2.b(str3, "Processor cancelling " + str);
            o35Var.i.add(str);
            b2 = o35Var.b(str);
        }
        o35.d(str, b2, 1);
        for (e66 e66Var : lw7Var.e) {
            e66Var.d(str);
        }
    }

    public static final void p(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    u34.t();
                    return;
                }
            }
            try {
                xg6.z(autoCloseable);
            } catch (Throwable th2) {
                mb3.q(th, th2);
            }
        }
    }

    public static final p66 q(jq1 jq1Var) {
        jq1Var.getClass();
        int i2 = kq1.a[jq1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return p66.TOP;
                }
                i.d();
                return null;
            }
            return p66.BOTTOM;
        }
        return p66.TOP;
    }

    public static final p66 r(jq1 jq1Var) {
        jq1Var.getClass();
        int i2 = kq1.a[jq1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return p66.TOP;
                }
                i.d();
                return null;
            }
            return p66.TOP;
        }
        return p66.BOTTOM;
    }

    public static final nl1 s(le2 le2Var, qn2 qn2Var) {
        if (le2Var instanceof nl1) {
            nl1 nl1Var = (nl1) le2Var;
            if (nl1Var.B == qn2Var) {
                return nl1Var;
            }
        }
        return new nl1(le2Var, qn2Var);
    }

    public static final String[] t(d41 d41Var) {
        d41Var.getClass();
        return (String[]) ((sf) d41Var).b.toArray(new String[0]);
    }

    public static final Object u(x24 x24Var) {
        cm3 cm3Var;
        Object B = x24Var.B();
        if (B instanceof cm3) {
            cm3Var = (cm3) B;
        } else {
            cm3Var = null;
        }
        if (cm3Var == null) {
            return null;
        }
        return cm3Var.k0;
    }

    public static String v() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String w() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String x(Context context, int i2) {
        if (i2 != -1) {
            try {
                return context.getResources().getResourceEntryName(i2);
            } catch (Exception unused) {
                return lb1.g(i2, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String y(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final void z(xq2 xq2Var, eo2 eo2Var) {
        eo2Var.getClass();
        ge7.p(2, eo2Var);
        eo2Var.o(xq2Var, 1);
    }

    public abstract int m(int i2, int i3, kk3 kk3Var);
}
