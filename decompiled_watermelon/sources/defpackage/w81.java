package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import android.text.TextPaint;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w81  reason: default package */
/* loaded from: classes.dex */
public abstract class w81 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f = {16842755, 16843213};
    public static final float[][] g = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] h = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] i = {95.047f, 100.0f, 108.883f};
    public static final float[][] j = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final et0 k = new et0(636288403, false, new kt0(0));
    public static final et0 l = new et0(-1357803046, false, new kt0(1));
    public static final int[] m = {0, 1996959894, -301047508, -1727442502, 124634137, 1886057615, -379345611, -1637575261, 249268274, 2044508324, -522852066, -1747789432, 162941995, 2125561021, -407360249, -1866523247, 498536548, 1789927666, -205950648, -2067906082, 450548861, 1843258603, -187386543, -2083289657, 325883990, 1684777152, -43845254, -1973040660, 335633487, 1661365465, -99664541, -1928851979, 997073096, 1281953886, -715111964, -1570279054, 1006888145, 1258607687, -770865667, -1526024853, 901097722, 1119000684, -608450090, -1396901568, 853044451, 1172266101, -589951537, -1412350631, 651767980, 1373503546, -925412992, -1076862698, 565507253, 1454621731, -809855591, -1195530993, 671266974, 1594198024, -972236366, -1324619484, 795835527, 1483230225, -1050600021, -1234817731, 1994146192, 31158534, -1731059524, -271249366, 1907459465, 112637215, -1614814043, -390540237, 2013776290, 251722036, -1777751922, -519137256, 2137656763, 141376813, -1855689577, -429695999, 1802195444, 476864866, -2056965928, -228458418, 1812370925, 453092731, -2113342271, -183516073, 1706088902, 314042704, -1950435094, -54949764, 1658658271, 366619977, -1932296973, -69972891, 1303535960, 984961486, -1547960204, -725929758, 1256170817, 1037604311, -1529756563, -740887301, 1131014506, 879679996, -1385723834, -631195440, 1141124467, 855842277, -1442165665, -586318647, 1342533948, 654459306, -1106571248, -921952122, 1466479909, 544179635, -1184443383, -832445281, 1591671054, 702138776, -1328506846, -942167884, 1504918807, 783551873, -1212326853, -1061524307, -306674912, -1698712650, 62317068, 1957810842, -355121351, -1647151185, 81470997, 1943803523, -480048366, -1805370492, 225274430, 2053790376, -468791541, -1828061283, 167816743, 2097651377, -267414716, -2029476910, 503444072, 1762050814, -144550051, -2140837941, 426522225, 1852507879, -19653770, -1982649376, 282753626, 1742555852, -105259153, -1900089351, 397917763, 1622183637, -690576408, -1580100738, 953729732, 1340076626, -776247311, -1497606297, 1068828381, 1219638859, -670225446, -1358292148, 906185462, 1090812512, -547295293, -1469587627, 829329135, 1181335161, -882789492, -1134132454, 628085408, 1382605366, -871598187, -1156888829, 570562233, 1426400815, -977650754, -1296233688, 733239954, 1555261956, -1026031705, -1244606671, 752459403, 1541320221, -1687895376, -328994266, 1969922972, 40735498, -1677130071, -351390145, 1913087877, 83908371, -1782625662, -491226604, 2075208622, 213261112, -1831694693, -438977011, 2094854071, 198958881, -2032938284, -237706686, 1759359992, 534414190, -2118248755, -155638181, 1873836001, 414664567, -2012718362, -15766928, 1711684554, 285281116, -1889165569, -127750551, 1634467795, 376229701, -1609899400, -686959890, 1308918612, 956543938, -1486412191, -799009033, 1231636301, 1047427035, -1362007478, -640263460, 1088359270, 936918000, -1447252397, -558129467, 1202900863, 817233897, -1111625188, -893730166, 1404277552, 615818150, -1160759803, -841546093, 1423857449, 601450431, -1285129682, -1000256840, 1567103746, 711928724, -1274298825, -1022587231, 1510334235, 755167117};
    public static final nh5 n = new nh5(12);
    public static final int[] o = {619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, 205, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, 419, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, 611, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, 105, 170, 607, 520, 932, 727, 476, 693, 425, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, 500, 594, 612, 641, 801, 220, 162, 819, 984, 589, 513, 495, 799, 161, 604, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, 414, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, 224, 469, 68, 770, 919, 190, 373, 294, 822, 808, 206, 184, 943, 795, RendererDebugBridge.CAPTURE_HEIGHT, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, 604, 560, 951, 160, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, 447, 318, 353, 859, 672, 112, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, 609, 772, 154, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, 411, 521, 938, 300, 821, 78, 343, 175, 128, 250, 170, 774, 972, 275, 999, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, 124, 737, 594, 701, 612, 669, 112, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, 344, 805, 988, 739, 511, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, 102, 654, 459, 51, 686, 754, 806, 760, 493, 403, 415, 394, 687, 700, 946, 670, 656, 610, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, 707, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, 606, 134, 108, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, 140, 206, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, 905, 758, 745, 193, 768, 550, 608, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, 106, 366, 905, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, 135, 780, 773, 635, 389, 707, 100, 626, 958, 165, 504, 920, 176, 193, 713, 857, 265, 203, 50, 668, 108, 645, 990, 626, 197, 510, 357, 358, 850, 858, 364, 936, 638};
    public static final y55 p = new y55(RecyclerView.A1, RecyclerView.A1, 10.0f, 10.0f);
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    public static final zy3 A(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new ha3(mi2Var, null));
    }

    public static final zy3 B(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new ha3(null, mi2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.e80 C(defpackage.xq2 r26) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.C(xq2):e80");
    }

    public static final void D(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < RecyclerView.A1) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public static String E(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static rw F(int i2) {
        int i3 = 6;
        if (i2 != 0) {
            int i4 = 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    i4 = 5;
                    if (i2 != 3) {
                        if (i2 == 4) {
                            i3 = 3;
                        } else if (i2 != 5) {
                            if (i2 != 6) {
                                i4 = 7;
                                if (i2 != 7 && i2 != 8) {
                                    if (i2 == 9) {
                                        i3 = 4;
                                    } else if (i2 != 10) {
                                        if (i2 != 11 && i2 != 12 && i2 != 13) {
                                            f81.i(uc0.a(i2), "Unexpected CameraError: ");
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i3 = i4;
            }
            i3 = 2;
        }
        return new rw(i3);
    }

    public static final String G(j11 j11Var) {
        Object kc5Var;
        if (j11Var instanceof jg1) {
            return ((jg1) j11Var).toString();
        }
        try {
            kc5Var = j11Var + '@' + s(j11Var);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (nc5.a(kc5Var) != null) {
            kc5Var = j11Var.getClass().getName() + '@' + s(j11Var);
        }
        return (String) kc5Var;
    }

    public static final zy3 H(boolean z, l14 l14Var, boolean z2, og5 og5Var, mi2 mi2Var) {
        return new hv6(z, l14Var, z2, og5Var, mi2Var);
    }

    public static final Object I(zz5 zz5Var, Object obj) {
        Object c2 = zz5Var.c(obj);
        if (!(c2 instanceof wj0)) {
            o27 o27Var = (o27) c2;
            return o27.a;
        }
        return ((xj0) tq5.A(mp1.A, new a0(zz5Var, obj, null, 14))).a;
    }

    public static float J() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(zy3 zy3Var, dy4 dy4Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        dy4 dy4Var2 = dy4Var;
        zy3Var.getClass();
        dy4Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-835742261);
        if (sk2Var.f(zy3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (sk2Var.h(dy4Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            boolean f2 = sk2Var.f(dy4Var2);
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (f2 || L == obj) {
                L = me2.G(er4.SHOW_ICON);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            boolean f3 = sk2Var.f(k24Var);
            Object L2 = sk2Var.L();
            if (f3 || L2 == obj) {
                L2 = new x5(k24Var, null, 0);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, dy4Var2);
            jd7 jd7Var = kd7.a;
            zy3 t = a53.t(o76.l(400.0f, 1, jk2.Q(b53.X(zy3Var, 16.0f), 12.0f, gr5.b(13.0f), false, 0L, 28)), gr5.b(13.0f));
            long j2 = jd7Var.d;
            is2 is2Var = iq2.g;
            zy3 z2 = b53.z(1.0f, xq0.b(0.35f, jd7.p), dk7.i(t, j2, is2Var), gr5.b(13.0f));
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, z2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            wy3 wy3Var = wy3.a;
            zy3 L3 = n40.L(b53.X(wy3Var, 8.0f), u43.Min);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, L3);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            zy3 z3 = b53.z(1.0f, jd7Var.l, dk7.i(a53.t(o76.h(wy3Var, 42.0f), gr5.b(10.0f)), jd7Var.m, is2Var), gr5.b(10.0f));
            tv3 d3 = d50.d(j20Var, false);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, z3);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d3);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            zy3 h2 = o76.h(wy3Var, 42.0f);
            tw2 tw2Var = new tw2((Context) sk2Var.j(ue.b));
            dy4Var2 = dy4Var;
            tw2Var.c = dy4Var2.j.toString();
            tw2Var.b(false);
            cg2.a(tw2Var.a(), h2, ve2.J(sk2Var, R.drawable.ic_trophy), ve2.J(sk2Var, R.drawable.ic_trophy), sk2Var, 37296);
            sk2Var.p(true);
            zy3 b2 = o76.b(wy3Var, 1.0f);
            er4 er4Var = (er4) k24Var.getValue();
            Object L4 = sk2Var.L();
            if (L4 == obj) {
                L4 = new k4(5);
                sk2Var.h0(L4);
            }
            b53.c(er4Var, b2, (mi2) L4, null, "content-animation", null, ct3.H0(-418559101, new w5(0, dy4Var2, jd7Var), sk2Var), sk2Var, 1597872);
            sk2Var = sk2Var;
            i5 = 1;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            i5 = 1;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new s4(i2, i5, zy3Var, dy4Var2);
        }
    }

    public static y20 b(nh nhVar, int i2) {
        Bitmap bitmap = nhVar.a;
        y20 y20Var = new y20(nhVar, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        y20Var.Z = i2;
        return y20Var;
    }

    public static final void c(bq6 bq6Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        zy3 W;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1533506138);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(bq6Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            sk2Var.X(-885604480);
            if (!bq6Var.k()) {
                W = wy3.a;
            } else {
                W = se.W(mh7.f0(new vp6(bq6Var, null, 0)), bq6Var.y, new oa0(bq6Var, null, 3), new wp6(bq6Var, null, 0), new k21(bq6Var, 2));
            }
            nl2.k(W, et0Var, sk2Var, i3 & 112);
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new ds0(bq6Var, et0Var, i2, 0);
        }
    }

    public static rd1 d() {
        return new rd1(1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aw, java.lang.Object] */
    public static final aw e(boolean z) {
        ?? obj = new Object();
        obj.a = z ? 1 : 0;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cw, java.lang.Object] */
    public static final cw f(int i2) {
        ?? obj = new Object();
        obj.a = i2;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fw, java.lang.Object] */
    public static final fw g(Object obj) {
        ?? obj2 = new Object();
        obj2.a = obj;
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.rm3 r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.d
            if (r0 == 0) goto L13
            r0 = r7
            d r0 = (defpackage.d) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            d r0 = new d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            o27 r3 = defpackage.o27.a
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            n75 r6 = r0.X
            rm3 r0 = r0.R
            defpackage.me2.a0(r7)     // Catch: java.lang.Throwable -> L2d
            goto L70
        L2d:
            r7 = move-exception
            goto L7f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L36:
            defpackage.me2.a0(r7)
            qm3 r7 = r6.b()
            qm3 r2 = defpackage.qm3.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L46
            goto L79
        L46:
            n75 r7 = new n75
            r7.<init>()
            r0.R = r6     // Catch: java.lang.Throwable -> L7a
            r0.X = r7     // Catch: java.lang.Throwable -> L7a
            r0.Z = r4     // Catch: java.lang.Throwable -> L7a
            ih0 r2 = new ih0     // Catch: java.lang.Throwable -> L7a
            j11 r0 = defpackage.nk2.J(r0)     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7a
            r2.x()     // Catch: java.lang.Throwable -> L7a
            e r0 = new e     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            r7.A = r0     // Catch: java.lang.Throwable -> L7a
            r6.a(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.v()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r6
            r6 = r7
        L70:
            java.lang.Object r6 = r6.A
            en3 r6 = (defpackage.en3) r6
            if (r6 == 0) goto L79
            r0.c(r6)
        L79:
            return r3
        L7a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L7f:
            java.lang.Object r6 = r6.A
            en3 r6 = (defpackage.en3) r6
            if (r6 == 0) goto L88
            r0.c(r6)
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.h(rm3, k11):java.lang.Object");
    }

    public static String i(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (defpackage.jv3.q(r9, r1, r3, r2, r8) == 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap j(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.h76 r7, defpackage.uu5 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.j(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, h76, uu5, boolean):android.graphics.Bitmap");
    }

    public static final jh1 k(u92 u92Var, mi2 mi2Var) {
        if (u92Var instanceof jh1) {
            jh1 jh1Var = (jh1) u92Var;
            if (jh1Var.B == mi2Var) {
                return jh1Var;
            }
        }
        return new jh1(u92Var, mi2Var);
    }

    public static long l(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i4, 262142);
        int i8 = Preference.DEFAULT_ORDER;
        if (i5 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i5, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i6 = min2;
        } else {
            i6 = min;
        }
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i7 = 65534;
            } else if (i6 < 65535) {
                i7 = 32766;
            } else if (i6 < 262143) {
                i7 = 8190;
            } else {
                nz0.k(i6);
                f81.c();
                return 0L;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i3);
        }
        return nz0.a(Math.min(i7, i2), i8, min2, min);
    }

    public static long m(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i2, 262142);
        int i8 = Preference.DEFAULT_ORDER;
        if (i3 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i3, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i6 = min2;
        } else {
            i6 = min;
        }
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i7 = 65534;
            } else if (i6 < 65535) {
                i7 = 32766;
            } else if (i6 < 262143) {
                i7 = 8190;
            } else {
                nz0.k(i6);
                f81.c();
                return 0L;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i5);
        }
        return nz0.a(min2, min, Math.min(i7, i4), i8);
    }

    public static final g31 n(Executor executor) {
        return new n22(executor);
    }

    public static final j14 o(lz5 lz5Var, mi2 mi2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            iz5 a2 = lz5Var.a();
            vf3 vf3Var = a2.c;
            if (vf3Var.I() && vf3Var.H()) {
                y55 g2 = a2.g();
                j14 j14Var = new j14(48);
                dz4 dz4Var = new dz4(5);
                dz4Var.z(gk2.e0(g2));
                r(mi2Var, j14Var, new dz4(5), dz4Var, a2, a2);
                return j14Var;
            }
            j14 j14Var2 = z23.a;
            j14Var2.getClass();
            return j14Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void p(mi2 mi2Var, j14 j14Var, dz4 dz4Var, dz4 dz4Var2, iz5 iz5Var, iz5 iz5Var2) {
        boolean z;
        dz4 dz4Var3 = dz4Var;
        Region region = (Region) dz4Var3.A;
        dz4 dz4Var4 = dz4Var2;
        Region region2 = (Region) dz4Var4.A;
        vf3 vf3Var = iz5Var2.c;
        vf3 vf3Var2 = iz5Var2.c;
        if (vf3Var.I() && vf3Var2.H() && !region2.isEmpty()) {
            y55 m2 = iz5Var2.m();
            if (m2.f()) {
                gz5 f2 = iz5Var2.f();
                if (f2 == null) {
                    vz2 vz2Var = (vz2) vf3Var2.A0.d;
                    m2 = me2.s(vz2Var).L(vz2Var, false);
                } else {
                    yy3 yy3Var = ((yy3) f2).A;
                    Object g2 = iz5Var2.d.A.g(dz5.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    if (g2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m2 = nl2.J(yy3Var, z, false);
                }
            }
            e33 e0 = gk2.e0(m2);
            dz4Var3.z(e0);
            if (region.op(region2, Region.Op.INTERSECT)) {
                int i2 = iz5Var2.f;
                if (i2 == iz5Var.f) {
                    i2 = -1;
                }
                Rect bounds = region.getBounds();
                j14Var.i(i2, new kz5(iz5Var2, new e33(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                List j2 = iz5.j(4, iz5Var2);
                int size = j2.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) mi2Var.n(j2.get(size))).booleanValue()) {
                        p(mi2Var, j14Var, dz4Var3, dz4Var4, iz5Var, (iz5) j2.get(size));
                    }
                    size--;
                    dz4Var3 = dz4Var;
                    dz4Var4 = dz4Var2;
                }
                if (w(iz5Var2)) {
                    region2.op(e0.a, e0.b, e0.c, e0.d, Region.Op.DIFFERENCE);
                }
            }
        } else if (iz5Var2.o()) {
            q(j14Var, iz5Var, iz5Var2);
        }
    }

    public static final void q(j14 j14Var, iz5 iz5Var, iz5 iz5Var2) {
        y55 y55Var;
        vf3 vf3Var;
        iz5 l2 = iz5Var2.l();
        if (l2 != null && (vf3Var = l2.c) != null && vf3Var.I()) {
            y55Var = l2.g();
        } else {
            y55Var = p;
        }
        int i2 = iz5Var2.f;
        if (i2 == iz5Var.f) {
            i2 = -1;
        }
        j14Var.i(i2, new kz5(iz5Var2, gk2.e0(y55Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(defpackage.mi2 r17, defpackage.j14 r18, defpackage.dz4 r19, defpackage.dz4 r20, defpackage.iz5 r21, defpackage.iz5 r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.r(mi2, j14, dz4, dz4, iz5, iz5):void");
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void t(e31 e31Var, Throwable th) {
        if (th instanceof ig1) {
            th = ((ig1) th).A;
        }
        try {
            h31 h31Var = (h31) e31Var.I(iq0.d0);
            if (h31Var != null) {
                h31Var.J(e31Var, th);
            } else {
                n40.K(e31Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                pu.k(runtimeException, th);
                th = runtimeException;
            }
            n40.K(e31Var, th);
        }
    }

    public static int u(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = i;
        return gr0.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static final boolean v(iz5 iz5Var) {
        boolean z;
        m74 d2 = iz5Var.d();
        d24 d24Var = iz5Var.d.A;
        if (d2 != null) {
            z = d2.g1();
        } else {
            z = false;
        }
        if (!z && !d24Var.c(mz5.q) && !d24Var.c(mz5.p)) {
            return false;
        }
        return true;
    }

    public static final boolean w(iz5 iz5Var) {
        if (!v(iz5Var)) {
            ez5 ez5Var = iz5Var.d;
            if (!ez5Var.L) {
                d24 d24Var = ez5Var.A;
                Object[] objArr = d24Var.b;
                Object[] objArr2 = d24Var.c;
                long[] jArr = d24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    Object obj2 = objArr2[i5];
                                    if (((qz5) obj).c) {
                                        return true;
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean x(int i2) {
        if (i2 == 6 || i2 == 1 || i2 == 2 || i2 == 4) {
            return true;
        }
        return false;
    }

    public static float y(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final zy3 z(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new pc4(mi2Var));
    }
}
