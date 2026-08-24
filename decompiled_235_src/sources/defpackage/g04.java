package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.ModelPPM;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g04  reason: default package */
/* loaded from: classes.dex */
public abstract class g04 {
    public static volatile ov2 a;
    public static final zv0 b = new zv0(269254275, false, new kw0(14));
    public static final zv0 c = new zv0(1260131259, false, new kw0(15));
    public static final zv0 d = new zv0(-1154709106, false, new fn0(25));
    public static final zv0 e = new zv0(-2062285735, false, new iw0(3));
    public static final zv0 f = new zv0(1944772221, false, new iw0(4));
    public static final int[] g = new int[0];
    public static final long[] h = new long[0];
    public static final Object[] i = new Object[0];
    public static final int[] j = {619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, 419, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, 611, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, 105, 170, 607, 520, 932, 727, 476, 693, 425, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, 500, 594, 612, 641, 801, 220, 162, 819, 984, 589, 513, 495, 799, 161, 604, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, 414, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, 224, 469, 68, 770, 919, 190, 373, 294, 822, 808, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 184, 943, 795, RendererDebugBridge.CAPTURE_HEIGHT, 383, 461, Compress.HUFF_TABLE_SIZE, 758, 839, 887, 715, 67, 618, 276, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 918, 873, 777, 604, 560, 951, 160, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, 447, 318, 353, 859, 672, 112, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, 609, 772, 154, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, 411, 521, 938, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, 821, 78, 343, 175, 128, 250, 170, 774, 972, 275, 999, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, ModelPPM.MAX_FREQ, 737, 594, 701, 612, 669, 112, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, 344, 805, 988, 739, 511, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, MlKitException.MODEL_HASH_MISMATCH, 654, 459, 51, 686, 754, 806, 760, 493, 403, 415, 394, 687, 700, 946, 670, 656, 610, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 700, 707, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, 606, 134, 108, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, 140, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, 905, 758, 745, 193, 768, 550, 608, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, 106, 366, 905, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, 135, 780, 773, 635, 389, 707, 100, 626, 958, 165, 504, 920, 176, 193, 713, 857, 265, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 50, 668, 108, 645, 990, 626, 197, 510, 357, 358, 850, 858, 364, 936, 638};
    public static e33 k;
    public static e33 l;
    public static final /* synthetic */ int m = 0;
    public static e33 n;
    public static final /* synthetic */ int o = 0;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (defpackage.ak7.N(r9, r1, r3, r2, r8) == 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap A(Drawable drawable, Bitmap.Config config, wi6 wi6Var, y56 y56Var, boolean z) {
        BitmapDrawable bitmapDrawable;
        int intrinsicWidth;
        int intrinsicHeight;
        int d2;
        int d3;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap.Config config2;
        int d4;
        int d5;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config config3 = bitmap3.getConfig();
            if (config != null && !nb3.B(config)) {
                config2 = config;
            } else {
                config2 = Bitmap.Config.ARGB_8888;
            }
            if (config3 == config2) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    wi6 wi6Var2 = wi6.c;
                    if (nb3.k(wi6Var, wi6Var2)) {
                        d4 = bitmap3.getWidth();
                    } else {
                        d4 = k.d(wi6Var.a, y56Var);
                    }
                    if (nb3.k(wi6Var, wi6Var2)) {
                        d5 = bitmap3.getHeight();
                    } else {
                        d5 = k.d(wi6Var.b, y56Var);
                    }
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = k.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable2 = null;
        if (z2) {
            bitmapDrawable = (BitmapDrawable) mutate;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap2 = bitmapDrawable.getBitmap()) != null) {
            intrinsicWidth = bitmap2.getWidth();
        } else {
            intrinsicWidth = mutate.getIntrinsicWidth();
        }
        int i2 = 512;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        if (z2) {
            bitmapDrawable2 = (BitmapDrawable) mutate;
        }
        if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
            intrinsicHeight = bitmap.getHeight();
        } else {
            intrinsicHeight = mutate.getIntrinsicHeight();
        }
        if (intrinsicHeight > 0) {
            i2 = intrinsicHeight;
        }
        wi6 wi6Var3 = wi6.c;
        if (nb3.k(wi6Var, wi6Var3)) {
            d2 = intrinsicWidth;
        } else {
            d2 = k.d(wi6Var.a, y56Var);
        }
        if (nb3.k(wi6Var, wi6Var3)) {
            d3 = i2;
        } else {
            d3 = k.d(wi6Var.b, y56Var);
        }
        double N = ak7.N(intrinsicWidth, i2, d2, d3, y56Var);
        int D = u24.D(intrinsicWidth * N);
        int D2 = u24.D(N * i2);
        if (config == null || nb3.B(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(D, D2, config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, D, D2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static long[] B(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static final Object C(eo2 eo2Var, r41 r41Var) {
        o66 o66Var = new o66(r41Var, r41Var.b());
        Object Z = mp2.Z(o66Var, true, o66Var, eo2Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r2.a(r10, r0) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(ne2 ne2Var, ul0 ul0Var, boolean z, r41 r41Var) {
        se2 se2Var;
        int i2;
        CancellationException cancellationException;
        n80 it;
        n80 n80Var;
        ne2 ne2Var2;
        Object b2;
        try {
            if (r41Var instanceof se2) {
                se2 se2Var2 = (se2) r41Var;
                int i3 = se2Var2.e0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    se2Var2.e0 = i3 - Integer.MIN_VALUE;
                    se2Var = se2Var2;
                    Object obj = se2Var.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i2 = se2Var.e0;
                    cancellationException = null;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                z = se2Var.Z;
                                n80Var = se2Var.Y;
                                ul0Var = se2Var.X;
                                ne2Var2 = se2Var.R;
                                oi2.Y(obj);
                                it = n80Var;
                                ne2Var = ne2Var2;
                                se2Var.R = ne2Var;
                                se2Var.X = ul0Var;
                                se2Var.Y = it;
                                se2Var.Z = z;
                                se2Var.e0 = 1;
                                b2 = it.b(se2Var);
                                if (b2 == x61Var) {
                                    ne2Var2 = ne2Var;
                                    n80Var = it;
                                    obj = b2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object c2 = n80Var.c();
                                        se2Var.R = ne2Var2;
                                        se2Var.X = ul0Var;
                                        se2Var.Y = n80Var;
                                        se2Var.Z = z;
                                        se2Var.e0 = 2;
                                    } else {
                                        if (z) {
                                            ul0Var.h(null);
                                        }
                                        return jg7.a;
                                    }
                                } else {
                                    return x61Var;
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            z = se2Var.Z;
                            n80Var = se2Var.Y;
                            ul0Var = se2Var.X;
                            ne2Var2 = se2Var.R;
                            oi2.Y(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        oi2.Y(obj);
                        if (!(ne2Var instanceof w57)) {
                            it = ul0Var.iterator();
                            se2Var.R = ne2Var;
                            se2Var.X = ul0Var;
                            se2Var.Y = it;
                            se2Var.Z = z;
                            se2Var.e0 = 1;
                            b2 = it.b(se2Var);
                            if (b2 == x61Var) {
                            }
                        } else {
                            throw ((w57) ne2Var).A;
                        }
                    }
                }
            }
            if (i2 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    if (th instanceof CancellationException) {
                        cancellationException = th;
                    }
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    ul0Var.h(cancellationException);
                }
                throw th2;
            }
        }
        se2Var = new s41(r41Var);
        Object obj2 = se2Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = se2Var.e0;
        cancellationException = null;
    }

    public static final boolean E(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean F() {
        Object obj;
        Method method;
        try {
            if (te.I1 == null) {
                te.I1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (te.J1 == null) {
                Class cls = te.I1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                te.J1 = method;
            }
            Method method2 = te.J1;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = obj;
            }
            return nb3.k(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final a74 G(a74 a74Var, gb3 gb3Var) {
        return a74Var.d(new cb3(gb3Var));
    }

    public static final boolean H(w61 w61Var) {
        rc3 rc3Var = (rc3) w61Var.A().Z(vs0.h0);
        if (rc3Var != null) {
            return rc3Var.e();
        }
        return true;
    }

    public static boolean I(int i2) {
        if (i2 == 6 || i2 == 1 || i2 == 2 || i2 == 4) {
            return true;
        }
        return false;
    }

    public static boolean J(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static String K(i03 i03Var) {
        i03Var.getClass();
        da0 da0Var = da0.R;
        return xd5.o(i03Var.i).c("MD5").e();
    }

    public static final a74 L(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new pk4(qn2Var));
    }

    public static final a74 M(a74 a74Var, float f2, float f3) {
        return a74Var.d(new kk4(f2, f3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r6 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        y(16);
        r0 = java.lang.Integer.toString(r10, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int N(fe5 fe5Var) {
        try {
            k80 k80Var = fe5Var.B;
            fe5Var.g0(1L);
            long j2 = 0;
            while (true) {
                long j3 = j2 + 1;
                if (!fe5Var.T(j3)) {
                    break;
                }
                byte v = k80Var.v(j2);
                if ((v < 48 || v > 57) && (j2 != 0 || v != 45)) {
                    break;
                }
                j2 = j3;
            }
            long U = k80Var.U();
            String y = fe5Var.y(Long.MAX_VALUE);
            if (U >= 0 && U <= 2147483647L && y.length() <= 0) {
                return (int) U;
            }
            throw new IOException("expected an int but was \"" + U + y + '\"');
        } catch (NumberFormatException e2) {
            e41.i(e2.getMessage());
            return 0;
        }
    }

    public static final a74 O(a74 a74Var, boolean z, n43 n43Var, boolean z2, mq5 mq5Var, on2 on2Var) {
        a74 p;
        if (n43Var != null) {
            p = new x96(z, null, n43Var, false, z2, mq5Var, on2Var);
        } else if (n43Var == null) {
            p = new x96(z, null, null, false, z2, mq5Var, on2Var);
        } else {
            p = l.p(x64.a, new y96(n43Var, z, z2, mq5Var, on2Var));
        }
        return a74Var.d(p);
    }

    public static a74 P(a74 a74Var, boolean z, mq5 mq5Var, on2 on2Var, int i2) {
        if ((i2 & 4) != 0) {
            mq5Var = null;
        }
        return a74Var.d(new x96(z, null, null, true, true, mq5Var, on2Var));
    }

    public static final void Q(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < RecyclerView.B1) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public static boolean R(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final z42 S(ga7 ga7Var, qn2 qn2Var, Object obj, px0 px0Var) {
        z42 z42Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.Z(-422486745, ga7Var);
        boolean g2 = ga7Var.g();
        gx0 gx0Var = ga7Var.a;
        if (g2) {
            xq2Var.b0(-212166497);
            xq2Var.p(false);
            if (((Boolean) qn2Var.g(obj)).booleanValue()) {
                z42Var = z42.Visible;
            } else if (((Boolean) qn2Var.g(gx0Var.f())).booleanValue()) {
                z42Var = z42.PostExit;
            } else {
                z42Var = z42.PreEnter;
            }
        } else {
            xq2Var.b0(-211892364);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            if (((Boolean) qn2Var.g(gx0Var.f())).booleanValue()) {
                qa4Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) qn2Var.g(obj)).booleanValue()) {
                z42Var = z42.Visible;
            } else if (((Boolean) qa4Var.getValue()).booleanValue()) {
                z42Var = z42.PostExit;
            } else {
                z42Var = z42.PreEnter;
            }
            xq2Var.p(false);
        }
        xq2Var.p(false);
        return z42Var;
    }

    public static tx T(int i2) {
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
                                            e41.A(df0.a(i2), "Unexpected CameraError: ");
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
        return new tx(i3);
    }

    public static final List U(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(arrayList));
            }
            return Collections.singletonList(gt0.H0(arrayList));
        }
        return yt1.A;
    }

    public static final Map V(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) gt0.G0(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return zt1.A;
    }

    public static final a74 W(boolean z, r94 r94Var, boolean z2, mq5 mq5Var, qn2 qn2Var) {
        return new y77(z, r94Var, z2, mq5Var, qn2Var);
    }

    public static Set X(yw2 yw2Var) {
        int size = yw2Var.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(yw2Var.b(i2))) {
                String d2 = yw2Var.d(i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                for (String str : qs6.J0(d2, new char[]{','}, 6)) {
                    treeSet.add(qs6.T0(str).toString());
                }
            }
        }
        if (treeSet == null) {
            return du1.A;
        }
        return treeSet;
    }

    public static final a74 Y(a74 a74Var, gb3 gb3Var) {
        return a74Var.d(new ib3(gb3Var));
    }

    public static final void a(nx1 nx1Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        on2 on2Var2;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-597835300);
        if (xq2Var.h(nx1Var)) {
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
            on2Var2 = on2Var;
            nw7.o(on2Var2, new jj1(3, false, false), n16.I(10994917, new b4(nx1Var, on2Var, qn2Var), xq2Var), xq2Var, ((i8 >> 3) & 14) | 432, 0);
        } else {
            on2Var2 = on2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new b4(nx1Var, on2Var2, qn2Var, i2);
        }
    }

    public static final void b(ga7 ga7Var, qn2 qn2Var, a74 a74Var, o52 o52Var, z72 z72Var, eo2 eo2Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        sl0 sl0Var;
        z72 z72Var2;
        wc7 wc7Var;
        ha7 ha7Var;
        ha7 ha7Var2;
        sl0 sl0Var2;
        ga7 ga7Var2;
        on2 on2Var;
        w97 w97Var;
        w97 w97Var2;
        w97 w97Var3;
        w97 w97Var4;
        boolean z6;
        boolean z7;
        boolean z8;
        w97 w97Var5;
        boolean z9;
        w97 w97Var6;
        w97 w97Var7;
        w97 w97Var8;
        z72 z72Var3;
        o52 o52Var2;
        boolean z10;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zv0 zv0Var2 = zv0Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1912839215);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(ga7Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.f(o52Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var.f(z72Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var.h(eo2Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        int i12 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            if (xq2Var.h(zv0Var2)) {
                i5 = 8388608;
            } else {
                i5 = Compress.MAXWINSIZE;
            }
            i12 |= i5;
        }
        int i13 = i12;
        if ((4793491 & i13) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i13 & 1, z)) {
            vs4 vs4Var = ga7Var.d;
            gx0 gx0Var = ga7Var.a;
            if (!((Boolean) qn2Var.g(vs4Var.getValue())).booleanValue() && !((Boolean) qn2Var.g(gx0Var.f())).booleanValue() && !ga7Var.g() && !ga7Var.d()) {
                xq2Var.b0(-229362829);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-232386135);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                if (((i16 ^ 6) > 4 && xq2Var.f(ga7Var)) || (i15 & 6) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (z2 || P == vs0Var) {
                    P = gx0Var.f();
                    xq2Var.l0(P);
                }
                if (ga7Var.g()) {
                    P = gx0Var.f();
                }
                xq2Var.b0(1844425648);
                z42 S = S(ga7Var, qn2Var, P, xq2Var);
                xq2Var.p(false);
                Object value = ga7Var.d.getValue();
                xq2Var.b0(1844425648);
                z42 S2 = S(ga7Var, qn2Var, value, xq2Var);
                xq2Var.p(false);
                ga7 r = n16.r(ga7Var, S, S2, "EnterExitTransition", xq2Var, i16 | 3072);
                xq2Var = xq2Var;
                wc7 wc7Var2 = i52.a;
                boolean f2 = xq2Var.f(r);
                Object P2 = xq2Var.P();
                if (f2 || P2 == vs0Var) {
                    P2 = np2.Y(o52Var);
                    xq2Var.l0(P2);
                }
                qa4 qa4Var = (qa4) P2;
                gx0 gx0Var2 = r.a;
                gx0 gx0Var3 = r.a;
                vs4 vs4Var2 = r.d;
                if (gx0Var2.f() == vs4Var2.getValue() && gx0Var3.f() == z42.Visible) {
                    if (r.g()) {
                        qa4Var.setValue(o52Var);
                    } else {
                        qa4Var.setValue(o52.b);
                    }
                } else if (vs4Var2.getValue() == z42.Visible) {
                    qa4Var.setValue(((o52) qa4Var.getValue()).a(o52Var));
                }
                o52 o52Var3 = (o52) qa4Var.getValue();
                boolean f3 = xq2Var.f(r);
                Object P3 = xq2Var.P();
                if (f3 || P3 == vs0Var) {
                    P3 = np2.Y(z72Var);
                    xq2Var.l0(P3);
                }
                qa4 qa4Var2 = (qa4) P3;
                if (gx0Var3.f() == vs4Var2.getValue() && gx0Var3.f() == z42.Visible) {
                    if (r.g()) {
                        qa4Var2.setValue(z72Var);
                    } else {
                        qa4Var2.setValue(z72.b);
                    }
                } else if (vs4Var2.getValue() != z42.Visible) {
                    qa4Var2.setValue(((z72) qa4Var2.getValue()).a(z72Var));
                }
                z72 z72Var4 = (z72) qa4Var2.getValue();
                qa4 b0 = np2.b0(eo2Var, xq2Var);
                Object o2 = eo2Var.o(gx0Var3.f(), vs4Var2.getValue());
                boolean f4 = xq2Var.f(r) | xq2Var.f(b0);
                Object P4 = xq2Var.P();
                if (f4 || P4 == vs0Var) {
                    P4 = new b0(r, b0, null, 7);
                    xq2Var.l0(P4);
                }
                eo2 eo2Var2 = (eo2) P4;
                Object P5 = xq2Var.P();
                if (P5 == vs0Var) {
                    P5 = np2.Y(o2);
                    xq2Var.l0(P5);
                }
                qa4 qa4Var3 = (qa4) P5;
                boolean h2 = xq2Var.h(eo2Var2);
                Object P6 = xq2Var.P();
                if (h2 || P6 == vs0Var) {
                    P6 = new km6(eo2Var2, qa4Var3, null, 0);
                    xq2Var.l0(P6);
                }
                mb3.i(xq2Var, (eo2) P6, jg7.a);
                Object f5 = gx0Var3.f();
                z42 z42Var = z42.PostExit;
                if (f5 == z42Var && vs4Var2.getValue() == z42Var && ((Boolean) qa4Var3.getValue()).booleanValue()) {
                    xq2Var.b0(-229368781);
                    z10 = false;
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-230699766);
                    if (i14 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Object P7 = xq2Var.P();
                    if (z3 || P7 == vs0Var) {
                        P7 = new ko(r);
                        xq2Var.l0(P7);
                    }
                    ko koVar = (ko) P7;
                    wc7 wc7Var3 = nw7.k0;
                    Object P8 = xq2Var.P();
                    if (P8 == vs0Var) {
                        P8 = iy0.f0;
                        xq2Var.l0(P8);
                    }
                    on2 on2Var2 = (on2) P8;
                    xq2Var.b0(-167964673);
                    xq2Var.p(false);
                    xq2Var.b0(-167961890);
                    xq2Var.p(false);
                    ha7 ha7Var3 = o52Var3.a;
                    ha7 ha7Var4 = z72Var4.a;
                    sl0 sl0Var3 = ha7Var4.c;
                    pj6 pj6Var = ha7Var3.b;
                    sl0 sl0Var4 = ha7Var3.c;
                    if (pj6Var == null && ha7Var4.b == null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (sl0Var4 == null && sl0Var3 == null) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z4) {
                        xq2Var.b0(-911488127);
                        Object P9 = xq2Var.P();
                        if (P9 == vs0Var) {
                            P9 = "Built-in slide";
                            xq2Var.l0("Built-in slide");
                        }
                        String str = (String) P9;
                        i4 = i13;
                        sl0Var = sl0Var3;
                        ha7Var = ha7Var3;
                        ha7Var2 = ha7Var4;
                        sl0Var2 = sl0Var4;
                        on2Var = on2Var2;
                        w97Var = null;
                        z72Var2 = z72Var4;
                        ga7Var2 = r;
                        w97 s = n16.s(ga7Var2, wc7Var3, str, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        wc7Var = wc7Var3;
                        xq2Var.p(false);
                        w97Var2 = s;
                    } else {
                        i4 = i13;
                        sl0Var = sl0Var3;
                        z72Var2 = z72Var4;
                        wc7Var = wc7Var3;
                        ha7Var = ha7Var3;
                        ha7Var2 = ha7Var4;
                        sl0Var2 = sl0Var4;
                        ga7Var2 = r;
                        on2Var = on2Var2;
                        w97Var = null;
                        xq2Var.b0(-911382324);
                        xq2Var.p(false);
                        w97Var2 = null;
                    }
                    if (z5) {
                        xq2Var.b0(-911290533);
                        wc7 wc7Var4 = nw7.l0;
                        Object P10 = xq2Var.P();
                        if (P10 == vs0Var) {
                            P10 = "Built-in shrink/expand";
                            xq2Var.l0("Built-in shrink/expand");
                        }
                        w97 s2 = n16.s(ga7Var2, wc7Var4, (String) P10, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        xq2Var.p(false);
                        w97Var3 = s2;
                    } else {
                        xq2Var.b0(-911179709);
                        xq2Var.p(false);
                        w97Var3 = w97Var;
                    }
                    if (z5) {
                        xq2Var.b0(-911106083);
                        Object P11 = xq2Var.P();
                        if (P11 == vs0Var) {
                            P11 = "Built-in InterruptionHandlingOffset";
                            xq2Var.l0("Built-in InterruptionHandlingOffset");
                        }
                        w97 s3 = n16.s(ga7Var2, wc7Var, (String) P11, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        xq2Var.p(false);
                        w97Var4 = s3;
                    } else {
                        xq2Var.b0(-910935677);
                        xq2Var.p(false);
                        w97Var4 = w97Var;
                    }
                    if ((sl0Var2 != null && !sl0Var2.d) || ((sl0Var != null && !sl0Var.d) || !z5)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    float[] fArr = qt0.a;
                    xq2Var.b0(-910130296);
                    xq2Var.p(false);
                    wc7 wc7Var5 = nw7.e0;
                    if (ha7Var.a == null && ha7Var2.a == null) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (ha7Var.d == null && ha7Var2.d == null) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z7) {
                        xq2Var.b0(-703879421);
                        Object P12 = xq2Var.P();
                        if (P12 == vs0Var) {
                            P12 = "Built-in alpha";
                            xq2Var.l0("Built-in alpha");
                        }
                        w97 s4 = n16.s(ga7Var2, wc7Var5, (String) P12, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        xq2Var.p(false);
                        w97Var5 = s4;
                    } else {
                        xq2Var.b0(-703709976);
                        xq2Var.p(false);
                        w97Var5 = w97Var;
                    }
                    if (z8) {
                        xq2Var.b0(-703642333);
                        Object P13 = xq2Var.P();
                        if (P13 == vs0Var) {
                            P13 = "Built-in scale";
                            xq2Var.l0("Built-in scale");
                        }
                        w97Var6 = n16.s(ga7Var2, wc7Var5, (String) P13, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        z9 = false;
                        xq2Var.p(false);
                    } else {
                        z9 = false;
                        xq2Var.b0(-703472888);
                        xq2Var.p(false);
                        w97Var6 = w97Var;
                    }
                    if (z8) {
                        xq2Var.b0(-703395232);
                        w97Var7 = w97Var6;
                        w97Var8 = n16.s(ga7Var2, i52.a, "TransformOriginInterruptionHandling", xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        xq2Var.p(z9);
                    } else {
                        w97Var7 = w97Var6;
                        xq2Var.b0(-703222904);
                        xq2Var.p(z9);
                        w97Var8 = w97Var;
                    }
                    boolean h3 = xq2Var.h(w97Var5) | xq2Var.f(o52Var3) | xq2Var.f(z72Var2) | xq2Var.h(w97Var7) | xq2Var.f(ga7Var2) | xq2Var.h(w97Var8);
                    Object P14 = xq2Var.P();
                    if (!h3 && P14 != vs0Var) {
                        z72Var3 = z72Var2;
                        o52Var2 = o52Var3;
                    } else {
                        z72Var3 = z72Var2;
                        o52Var2 = o52Var3;
                        P14 = new b52(w97Var5, w97Var7, ga7Var2, o52Var2, z72Var3, w97Var8);
                        xq2Var.l0(P14);
                    }
                    b52 b52Var = (b52) P14;
                    boolean g2 = xq2Var.g(z6) | xq2Var.f(on2Var);
                    Object P15 = xq2Var.P();
                    if (g2 || P15 == vs0Var) {
                        P15 = new g52(on2Var, z6);
                        xq2Var.l0(P15);
                    }
                    x64 x64Var = x64.a;
                    a74 d2 = hv.G(x64Var, (qn2) P15).d(new a52(ga7Var2, w97Var3, w97Var4, w97Var2, o52Var2, z72Var3, on2Var, b52Var)).d(x64Var);
                    xq2Var.b0(-7404393);
                    xq2Var.p(false);
                    a74 d3 = a74Var.d(d2.d(x64Var));
                    Object P16 = xq2Var.P();
                    if (P16 == vs0Var) {
                        P16 = new zn(koVar);
                        xq2Var.l0(P16);
                    }
                    zn znVar = (zn) P16;
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l2 = xq2Var.l();
                    a74 E = l.E(xq2Var, d3);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, znVar);
                    yh2.K(xq2Var, ix0.e, l2);
                    yh2.x(xq2Var, Integer.valueOf(hashCode), ix0.g);
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    zv0Var2 = zv0Var;
                    zv0Var2.e(koVar, xq2Var, Integer.valueOf((i4 >> 18) & 112));
                    xq2Var.p(true);
                    z10 = false;
                    xq2Var.p(false);
                }
                xq2Var.p(z10);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo(ga7Var, qn2Var, a74Var, o52Var, z72Var, eo2Var, zv0Var2, i2);
        }
    }

    public static final void c(zt0 zt0Var, boolean z, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        x64 x64Var;
        o52 o52Var2;
        z72 z72Var2;
        String str2;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1799879339);
        if ((i2 & 48) == 0) {
            if (xq2Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 224640;
        if ((i2 & 1572864) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i6 |= i4;
        }
        if ((599185 & i6) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            o52 a2 = i52.d(null, 3).a(i52.c(15));
            z72 a3 = i52.e(null, 3).a(i52.g(null, 15));
            int i7 = i6 >> 3;
            ga7 N = n16.N(Boolean.valueOf(z), "AnimatedVisibility", xq2Var, (i7 & 14) | ((i6 >> 12) & 112), 0);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = ne.l0;
                xq2Var.l0(P);
            }
            x64 x64Var2 = x64.a;
            g(N, (qn2) P, x64Var2, a2, a3, zv0Var, xq2Var, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i7 & 458752));
            x64Var = x64Var2;
            o52Var2 = a2;
            z72Var2 = a3;
            str2 = "AnimatedVisibility";
        } else {
            xq2Var.V();
            x64Var = a74Var;
            o52Var2 = o52Var;
            z72Var2 = z72Var;
            str2 = str;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ho(zt0Var, z, x64Var, o52Var2, z72Var2, str2, zv0Var, i2, 1);
        }
    }

    public static final void d(ta4 ta4Var, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        x64 x64Var;
        String str2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(657024243);
        if (xq2Var.f(ta4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3 | 48;
        if (xq2Var.f(o52Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4 | 24576;
        if ((74899 & i6) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            ga7 J = n16.J(ta4Var, "AnimatedVisibility", xq2Var, (i6 & 14) | 48, 0);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = ne.m0;
                xq2Var.l0(P);
            }
            x64 x64Var2 = x64.a;
            g(J, (qn2) P, x64Var2, o52Var, z72Var, zv0Var, xq2Var, ((i6 << 3) & 7168) | 221616);
            x64Var = x64Var2;
            str2 = "AnimatedVisibility";
        } else {
            xq2Var.V();
            x64Var = a74Var;
            str2 = str;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new nn(ta4Var, x64Var, o52Var, z72Var, str2, zv0Var, i2);
        }
    }

    public static final void e(m26 m26Var, boolean z, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        x64 x64Var;
        o52 o52Var2;
        z72 z72Var2;
        String str2;
        e40 e40Var;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(234057107);
        if ((i2 & 48) == 0) {
            if (xq2Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 224640;
        if ((i2 & 1572864) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i6 |= i4;
        }
        if ((599185 & i6) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            o52 a2 = i52.d(null, 3).a(i52.a(15));
            z72 e2 = i52.e(null, 3);
            of5 of5Var = vq7.a;
            io6 U = ge7.U(RecyclerView.B1, 400.0f, new q93(4294967297L), 1);
            c40 c40Var = d90.m0;
            ne neVar = ne.y0;
            if (nb3.k(c40Var, d90.k0)) {
                e40Var = d90.Y;
            } else if (nb3.k(c40Var, c40Var)) {
                e40Var = d90.d0;
            } else {
                e40Var = d90.Z;
            }
            z72 a3 = e2.a(i52.f(U, e40Var, new h52(0, neVar)));
            int i7 = i6 >> 3;
            ga7 N = n16.N(Boolean.valueOf(z), "AnimatedVisibility", xq2Var, (i7 & 14) | ((i6 >> 12) & 112), 0);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = ne.k0;
                xq2Var.l0(P);
            }
            int i8 = (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i7 & 458752);
            x64 x64Var2 = x64.a;
            g(N, (qn2) P, x64Var2, a2, a3, zv0Var, xq2Var, i8);
            x64Var = x64Var2;
            o52Var2 = a2;
            z72Var2 = a3;
            str2 = "AnimatedVisibility";
        } else {
            xq2Var.V();
            x64Var = a74Var;
            o52Var2 = o52Var;
            z72Var2 = z72Var;
            str2 = str;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ho(m26Var, z, x64Var, o52Var2, z72Var2, str2, zv0Var, i2, 0);
        }
    }

    public static final void f(boolean z, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        String str2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1448730565);
        if (xq2Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (xq2Var.f(a74Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 24576;
        if ((74899 & i6) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            ga7 N = n16.N(Boolean.valueOf(z), "AnimatedVisibility", xq2Var, (i6 & 14) | 48, 0);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = ne.j0;
                xq2Var.l0(P);
            }
            g(N, (qn2) P, a74Var, o52Var, z72Var, zv0Var, xq2Var, ((i6 << 3) & 896) | 224304);
            str2 = "AnimatedVisibility";
        } else {
            xq2Var.V();
            str2 = str;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new go(z, a74Var, o52Var, z72Var, str2, zv0Var, i2);
        }
    }

    public static final void g(ga7 ga7Var, qn2 qn2Var, a74 a74Var, o52 o52Var, z72 z72Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        o52 o52Var2;
        z72 z72Var2;
        zv0 zv0Var2;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1706321816);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(ga7Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            o52Var2 = o52Var;
            if (xq2Var.f(o52Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            o52Var2 = o52Var;
        }
        if ((i2 & 24576) == 0) {
            z72Var2 = z72Var;
            if (xq2Var.f(z72Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            z72Var2 = z72Var;
        }
        if ((i2 & 196608) == 0) {
            zv0Var2 = zv0Var;
            if (xq2Var.h(zv0Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        } else {
            zv0Var2 = zv0Var;
        }
        boolean z3 = false;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            int i10 = i3 & 112;
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i11 = i3 & 14;
            if (i11 == 4) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z4 || P == vs0Var) {
                P = new io(qn2Var, ga7Var);
                xq2Var.l0(P);
            }
            a74 L = ge7.L(a74Var, (fo2) P);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = pn.R;
                xq2Var.l0(P2);
            }
            b(ga7Var, qn2Var, L, o52Var2, z72Var2, (eo2) P2, zv0Var2, xq2Var, 196608 | i11 | i10 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new on(ga7Var, qn2Var, a74Var, o52Var, z72Var, zv0Var, i2);
        }
    }

    public static w40 h(zh zhVar, int i2) {
        Bitmap bitmap = zhVar.a;
        w40 w40Var = new w40(zhVar, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        w40Var.Z = i2;
        return w40Var;
    }

    public static final o41 i(l61 l61Var) {
        if (l61Var.Z(vs0.h0) == null) {
            l61Var = l61Var.N(yh2.c());
        }
        return new o41(l61Var);
    }

    public static final void j(o6 o6Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        URL url;
        int i4;
        long c2;
        boolean z2;
        boolean z3;
        o6Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(624979067);
        if (xq2Var.f(o6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i5 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            o75 a2 = o6Var.a();
            boolean C = l.C(o6Var);
            long j2 = es7.p;
            c40 c40Var = d90.l0;
            lc2 lc2Var = dj6.c;
            long c3 = hv.c(4279374102L);
            jy2 jy2Var = u24.m;
            a74 P = ge7.P(vy7.L(lc2Var, c3, jy2Var), 56.0f, 36.0f);
            yt0 a3 = wt0.a(ju.d, c40Var, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a3);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            if (C) {
                url = a2.j;
            } else {
                url = a2.k;
            }
            String url2 = url.toString();
            x64 x64Var = x64.a;
            a74 g2 = u24.g(dj6.i(x64Var, 96.0f), z16.b(12.0f));
            long j3 = kt0.d;
            gi2.b(url2, null, vy7.L(g2, kt0.c(0.06f, j3), jy2Var), y31.a, RecyclerView.B1, xq2Var, 1572912, 4024);
            String a4 = a2.a();
            pi2 pi2Var = qs7.a;
            x37.b(a4, ge7.S(x64Var, RecyclerView.B1, 18.0f, RecyclerView.B1, RecyclerView.B1, 13), j3, hi2.E(25), oj2.e0, pi2Var, 0L, new wz6(3), hi2.E(29), 2, false, 2, 0, null, null, xq2Var, 1772976, 3126, 119184);
            if (C) {
                i4 = R.string.retro_achievements_unlocked;
            } else {
                i4 = R.string.retro_achievements_locked;
            }
            String str = yh2.O(xq2Var, i4) + " · " + a2.h + " " + yh2.O(xq2Var, R.string.points_abbreviated);
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            if (C) {
                c2 = hv.c(4285513546L);
            } else {
                c2 = kt0.c(0.5f, j3);
            }
            sr2 sr2Var = qs7.c;
            x37.b(upperCase, ge7.S(x64Var, RecyclerView.B1, 8.0f, RecyclerView.B1, RecyclerView.B1, 13), c2, hi2.E(10), null, sr2Var, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14158896, 0, 130864);
            xq2Var = xq2Var;
            if (!qs6.v0(a2.g)) {
                xq2Var.b0(438763286);
                x37.b(a2.g, dj6.l(ge7.S(x64Var, RecyclerView.B1, 12.0f, RecyclerView.B1, RecyclerView.B1, 13), 440.0f), kt0.c(0.7f, j3), hi2.E(14), null, null, 0L, new wz6(3), hi2.E(20), 2, false, 5, 0, null, null, xq2Var, 3504, 3126, 119280);
                xq2Var = xq2Var;
                z2 = false;
                xq2Var.p(false);
            } else {
                z2 = false;
                xq2Var.b0(439148957);
                xq2Var.p(false);
            }
            if (a2.b()) {
                xq2Var.b0(439225620);
                d40 d40Var = d90.i0;
                a74 S = ge7.S(x64Var, RecyclerView.B1, 14.0f, RecyclerView.B1, RecyclerView.B1, 13);
                l26 a5 = k26.a(ju.a, d40Var, xq2Var, 48);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l3 = xq2Var.l();
                a74 E2 = l.E(xq2Var, S);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, a5);
                yh2.K(xq2Var, pnVar2, l3);
                i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E2);
                i13.b(kj2.R(xq2Var, R.drawable.ic_status_warn), null, dj6.i(x64Var, 14.0f), j2, xq2Var, 3512, 0);
                gi2.h(xq2Var, dj6.l(x64Var, 6.0f));
                String upperCase2 = yh2.O(xq2Var, R.string.retro_achievements_filter_missable).toUpperCase(locale);
                upperCase2.getClass();
                xq2 xq2Var2 = xq2Var;
                x37.b(upperCase2, null, j2, hi2.E(10), null, sr2Var, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var2, 14159232, 0, 130866);
                xq2Var = xq2Var2;
                z3 = true;
                xq2Var.p(true);
                xq2Var.p(z2);
            } else {
                z3 = true;
                xq2Var.b0(439982237);
                xq2Var.p(z2);
            }
            xq2Var.p(z3);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ju1(o6Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0437, code lost:
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r48v3, types: [int] */
    /* JADX WARN: Type inference failed for: r48v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(pq5 pq5Var, String str, String str2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        jy2 jy2Var;
        pn pnVar;
        pn pnVar2;
        pn pnVar3;
        iy0 iy0Var;
        int i6;
        e40 e40Var;
        int i7;
        ne neVar;
        ?? r48;
        long j2;
        String str3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-263585550);
        if (xq2Var.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (xq2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            lc2 lc2Var = dj6.c;
            long c2 = hv.c(4279374102L);
            jy2 jy2Var2 = u24.m;
            a74 L = vy7.L(lc2Var, c2, jy2Var2);
            e40 e40Var2 = d90.L;
            e34 d2 = h70.d(e40Var2, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, L);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            pn pnVar4 = ix0.f;
            yh2.K(xq2Var, pnVar4, d2);
            pn pnVar5 = ix0.e;
            yh2.K(xq2Var, pnVar5, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar6 = ix0.g;
            yh2.K(xq2Var, pnVar6, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar7 = ix0.d;
            yh2.K(xq2Var, pnVar7, E);
            h70.a(vy7.J(lc2Var, hf.l0(hf.k0(pq5Var))), xq2Var, 0);
            vs0 vs0Var = y31.a;
            if (str != null) {
                xq2Var.b0(-293759169);
                i6 = i10;
                i7 = 14;
                jy2Var = jy2Var2;
                pnVar = pnVar5;
                iy0Var = iy0Var2;
                pnVar2 = pnVar7;
                pnVar3 = pnVar6;
                e40Var = e40Var2;
                neVar = neVar2;
                gi2.b(str, null, n16.o(lc2Var, 22.0f), vs0Var, 0.4f, xq2Var, ((i10 >> 3) & 14) | 14156208, 3896);
                xq2Var.p(false);
            } else {
                jy2Var = jy2Var2;
                pnVar = pnVar5;
                pnVar2 = pnVar7;
                pnVar3 = pnVar6;
                iy0Var = iy0Var2;
                i6 = i10;
                e40Var = e40Var2;
                i7 = 14;
                neVar = neVar2;
                xq2Var.b0(-293483796);
                gi2.b(hf.m0(context, pq5Var), null, n16.o(lc2Var, 24.0f), vs0Var, 0.38f, xq2Var, 14156208, 3896);
                xq2Var.p(false);
            }
            long j3 = kt0.b;
            h70.a(vy7.J(lc2Var, d90.k(hf.c0(new kt0(kt0.c(0.78f, j3)), new kt0(kt0.c(0.42f, j3))), RecyclerView.B1, RecyclerView.B1, i7)), xq2Var, 6);
            d40 d40Var = d90.i0;
            a74 P = ge7.P(lc2Var, 36.0f, 30.0f);
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, P);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar4, a2);
            yh2.K(xq2Var, pnVar, l3);
            pn pnVar8 = pnVar3;
            i61.w(hashCode2, xq2Var, pnVar8, xq2Var, neVar);
            pn pnVar9 = pnVar2;
            yh2.K(xq2Var, pnVar9, E2);
            x64 x64Var = x64.a;
            a74 g2 = u24.g(nj2.E(ak7.H(dj6.l(x64Var, 150.0f), 1.117904f), 14.0f, z16.b(12.0f), false, 0L, 28), z16.b(12.0f));
            long j4 = kt0.d;
            a74 I = ak7.I(g2, 1.0f, kt0.c(0.18f, j4), z16.b(12.0f));
            e40 e40Var3 = e40Var;
            e34 d3 = h70.d(e40Var3, false);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, I);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar4, d3);
            yh2.K(xq2Var, pnVar, l4);
            i61.w(hashCode3, xq2Var, pnVar8, xq2Var, neVar);
            yh2.K(xq2Var, pnVar9, E3);
            ne neVar3 = neVar;
            hf.u(pq5Var, str, null, lc2Var, hi2.E(44), null, false, null, xq2Var, (i6 & 14) | 28032 | (i6 & 112), 224);
            xq2Var = xq2Var;
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 26.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E4 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar4, a3);
            yh2.K(xq2Var, pnVar, l5);
            i61.w(hashCode4, xq2Var, pnVar8, xq2Var, neVar3);
            yh2.K(xq2Var, pnVar9, E4);
            a74 P2 = ge7.P(vy7.L(u24.g(x64Var, z16.b(5.0f)), kt0.c(0.14f, j4), jy2Var), 9.0f, 3.0f);
            e34 d4 = h70.d(e40Var3, false);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E5 = l.E(xq2Var, P2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar4, d4);
            yh2.K(xq2Var, pnVar, l6);
            i61.w(hashCode5, xq2Var, pnVar8, xq2Var, neVar3);
            yh2.K(xq2Var, pnVar9, E5);
            String n0 = hf.n0(pq5Var);
            sr2 sr2Var = qs7.c;
            long E6 = hi2.E(9);
            oj2 oj2Var = oj2.d0;
            pn pnVar10 = pnVar;
            x37.b(n0, null, j4, E6, oj2Var, sr2Var, hi2.D(0.6d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355840, 0, 130834);
            xq2Var.p(true);
            String k0 = hf.k0(pq5Var);
            pi2 pi2Var = qs7.a;
            x37.b(k0, ge7.S(x64Var, RecyclerView.B1, 10.0f, RecyclerView.B1, RecyclerView.B1, 13), j4, hi2.E(27), oj2.e0, pi2Var, 0L, null, hi2.E(31), 2, false, 3, 0, null, null, xq2Var, 1772976, 3126, 119696);
            if (!qs6.v0(pq5Var.b)) {
                xq2Var.b0(-1827481129);
                r48 = 1;
                j2 = j4;
                x37.b(pq5Var.b, ge7.S(x64Var, RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.65f, j4), hi2.E(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3504, 0, 131056);
                xq2Var.p(false);
            } else {
                r48 = 1;
                j2 = j4;
                xq2Var.b0(-1827223984);
                xq2Var.p(false);
            }
            a74 S = ge7.S(x64Var, RecyclerView.B1, 20.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a4 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l7 = xq2Var.l();
            a74 E7 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar4, a4);
            yh2.K(xq2Var, pnVar10, l7);
            i61.w(hashCode6, xq2Var, pnVar8, xq2Var, neVar3);
            yh2.K(xq2Var, pnVar9, E7);
            if (str2 != null) {
                if (!qs6.v0(str2)) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
            }
            str3 = "Iniciando juego";
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            x37.b(upperCase, null, kt0.c(0.7f, j2), hi2.E(11), oj2Var, sr2Var, hi2.E(r48), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355840, 0, 130834);
            o(hv.c(4285513546L), xq2Var, 6);
            boolean z2 = r48;
            xq2Var.p(z2);
            i61.y(xq2Var, z2, z2, z2);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(pq5Var, str, str2, i2, 16);
        }
    }

    public static final void l(String str, String str2, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        String str3 = str2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-419903673);
        if (xq2Var.f(str3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            x64 x64Var = x64.a;
            a74 E = l.E(xq2Var, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 i6 = dj6.i(x64Var, 17.0f);
            long j2 = kt0.d;
            a74 I = ak7.I(i6, 1.5f, kt0.c(0.4f, j2), z16.a);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, I);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, kt0.c(0.7f, j2), hi2.E(9), oj2.e0, null, 0L, new wz6(3), hi2.E(9), 0, false, 0, 0, null, null, xq2Var, 200070, 6, 129490);
            xq2Var.p(true);
            long c2 = kt0.c(0.5f, j2);
            sr2 sr2Var = qs7.c;
            str3 = str2;
            x37.b(str3, ge7.S(x64Var, 6.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), c2, hi2.E(10), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, ((i5 >> 3) & 14) | 1576368, 0, 130992);
            xq2Var = xq2Var;
            i4 = 1;
            xq2Var.p(true);
        } else {
            i4 = 1;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new y7(str, i2, i4, str3);
        }
    }

    public static final void m(px0 px0Var, int i2) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-76582594);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            c40 c40Var = d90.l0;
            a74 P = ge7.P(dj6.c, 60.0f, 30.0f);
            yt0 a2 = wt0.a(ju.d, c40Var, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            js7.a(48.0f, 48, xq2Var, null);
            a74 S = ge7.S(x64.a, RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a3 = k26.a(ju.a, d90.h0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            String O = yh2.O(xq2Var, R.string.app_brand_watermelon);
            long j2 = kt0.d;
            pi2 pi2Var = qs7.a;
            long E3 = hi2.E(34);
            oj2 oj2Var = oj2.e0;
            x37.b(O, null, j2, E3, oj2Var, pi2Var, hi2.D(-0.5d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772928, 0, 130834);
            x37.b(yh2.O(xq2Var, R.string.app_brand_ds), null, hv.c(4278248959L), hi2.E(34), oj2Var, pi2Var, hi2.D(-0.5d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772928, 0, 130834);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new lw0(i2);
        }
    }

    public static final void n(pq5 pq5Var, String str, String str2, px0 px0Var, int i2, int i3) {
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        boolean z;
        String str4;
        String str5;
        String str6;
        e40 e40Var;
        pn pnVar;
        lc2 lc2Var;
        int i8;
        long j2;
        pn pnVar2;
        ne neVar;
        pn pnVar3;
        boolean z2;
        x64 x64Var;
        pn pnVar4;
        xq2 xq2Var;
        long j3;
        long j4 = pq5Var.j;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1211462661);
        if (xq2Var2.h(pq5Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if (xq2Var2.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        int i11 = i3 & 4;
        if (i11 != 0) {
            i7 = i10 | RendererDebugBridge.CAPTURE_HEIGHT;
            str3 = str2;
        } else {
            str3 = str2;
            if (xq2Var2.f(str3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i10 | i6;
        }
        int i12 = i7;
        if ((i12 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i12 & 1, z)) {
            if (i11 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            Context context = (Context) xq2Var2.j(kf.b);
            if (str == null) {
                str6 = str5;
            } else {
                str6 = str;
            }
            lc2 lc2Var2 = dj6.c;
            e40 e40Var2 = d90.L;
            e34 d2 = h70.d(e40Var2, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, lc2Var2);
            jx0.i.getClass();
            String str7 = str5;
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var2, pnVar5, d2);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var2, pnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var2, pnVar7, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var2, neVar2);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var2, pnVar8, E);
            h70.a(vy7.J(lc2Var2, hf.l0(hf.k0(pq5Var))), xq2Var2, 0);
            vs0 vs0Var = y31.a;
            if (str6 != null) {
                xq2Var2.b0(397009350);
                e40Var = e40Var2;
                lc2Var = lc2Var2;
                pnVar = pnVar8;
                j2 = j4;
                pnVar3 = pnVar7;
                pnVar2 = pnVar6;
                i8 = i12;
                neVar = neVar2;
                gi2.b(str6, null, n16.o(lc2Var2, 18.0f), vs0Var, 0.45f, xq2Var2, 14156208, 3896);
                xq2Var2.p(false);
            } else {
                e40Var = e40Var2;
                pnVar = pnVar8;
                lc2Var = lc2Var2;
                i8 = i12;
                j2 = j4;
                pnVar2 = pnVar6;
                neVar = neVar2;
                pnVar3 = pnVar7;
                xq2Var2.b0(397288536);
                gi2.b(hf.m0(context, pq5Var), null, n16.o(lc2Var, 22.0f), vs0Var, 0.4f, xq2Var2, 14156208, 3896);
                xq2Var2.p(false);
            }
            long j5 = kt0.b;
            h70.a(vy7.J(lc2Var, d90.k(hf.c0(new kt0(kt0.c(0.72f, j5)), new kt0(kt0.c(0.35f, j5))), RecyclerView.B1, RecyclerView.B1, 14)), xq2Var2, 6);
            d40 d40Var = d90.i0;
            a74 P = ge7.P(lc2Var, 36.0f, 30.0f);
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, P);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, a2);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar, E2);
            x64 x64Var2 = x64.a;
            a74 g2 = u24.g(nj2.E(ak7.H(dj6.l(x64Var2, 150.0f), 1.117904f), 14.0f, z16.b(12.0f), false, 0L, 28), z16.b(12.0f));
            long j6 = kt0.d;
            lc2 lc2Var3 = lc2Var;
            a74 I = ak7.I(g2, 1.0f, kt0.c(0.18f, j6), z16.b(12.0f));
            e40 e40Var3 = e40Var;
            e34 d3 = h70.d(e40Var3, false);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, I);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, d3);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar, E3);
            ne neVar3 = neVar;
            pn pnVar9 = pnVar;
            pn pnVar10 = pnVar3;
            hf.u(pq5Var, str, str7, lc2Var3, hi2.E(44), null, false, null, xq2Var2, (i8 & 14) | 27648 | (i8 & 112) | (i8 & 896), 224);
            xq2 xq2Var3 = xq2Var2;
            xq2Var3.p(true);
            gi2.h(xq2Var3, dj6.l(x64Var2, 26.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var3, 0);
            int hashCode4 = Long.hashCode(xq2Var3.T);
            xv4 l5 = xq2Var3.l();
            a74 E4 = l.E(xq2Var3, vn3Var);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar5, a3);
            yh2.K(xq2Var3, pnVar2, l5);
            i61.w(hashCode4, xq2Var3, pnVar10, xq2Var3, neVar3);
            yh2.K(xq2Var3, pnVar9, E4);
            l26 a4 = k26.a(duVar, d40Var, xq2Var3, 48);
            int hashCode5 = Long.hashCode(xq2Var3.T);
            xv4 l6 = xq2Var3.l();
            a74 E5 = l.E(xq2Var3, x64Var2);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar5, a4);
            yh2.K(xq2Var3, pnVar2, l6);
            i61.w(hashCode5, xq2Var3, pnVar10, xq2Var3, neVar3);
            yh2.K(xq2Var3, pnVar9, E5);
            a74 P2 = ge7.P(vy7.L(u24.g(x64Var2, z16.b(5.0f)), kt0.c(0.14f, j6), u24.m), 9.0f, 3.0f);
            e34 d4 = h70.d(e40Var3, false);
            int hashCode6 = Long.hashCode(xq2Var3.T);
            xv4 l7 = xq2Var3.l();
            a74 E6 = l.E(xq2Var3, P2);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar5, d4);
            yh2.K(xq2Var3, pnVar2, l7);
            i61.w(hashCode6, xq2Var3, pnVar10, xq2Var3, neVar3);
            yh2.K(xq2Var3, pnVar9, E6);
            String n0 = hf.n0(pq5Var);
            sr2 sr2Var = qs7.c;
            x37.b(n0, null, j6, hi2.E(9), oj2.d0, sr2Var, hi2.D(0.6d), null, 0L, 0, false, 0, 0, null, null, xq2Var3, 14355840, 0, 130834);
            xq2Var3.p(true);
            if (pq5Var.k) {
                xq2Var3.b0(-121365753);
                x64Var = x64Var2;
                z2 = false;
                pnVar4 = pnVar9;
                i13.a(kj2.D(), null, dj6.i(ge7.S(x64Var, 9.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), 16.0f), hv.c(4294955583L), xq2Var3, 3504, 0);
                xq2Var3 = xq2Var3;
                xq2Var3.p(false);
            } else {
                z2 = false;
                x64Var = x64Var2;
                pnVar4 = pnVar9;
                xq2Var3.b0(-121071005);
                xq2Var3.p(false);
            }
            xq2Var3.p(true);
            String k0 = hf.k0(pq5Var);
            pi2 pi2Var = qs7.a;
            x64 x64Var3 = x64Var;
            boolean z3 = z2;
            x37.b(k0, ge7.S(x64Var, RecyclerView.B1, 10.0f, RecyclerView.B1, RecyclerView.B1, 13), j6, hi2.E(27), oj2.e0, pi2Var, 0L, null, hi2.E(31), 2, false, 3, 0, null, null, xq2Var3, 1772976, 3126, 119696);
            if (!qs6.v0(pq5Var.b)) {
                xq2Var3.b0(676861774);
                xq2 xq2Var4 = xq2Var3;
                j3 = j6;
                x37.b(pq5Var.b, ge7.S(x64Var3, RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.65f, j6), hi2.E(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 3504, 0, 131056);
                xq2Var = xq2Var4;
                xq2Var.p(z3);
            } else {
                xq2Var = xq2Var3;
                j3 = j6;
                xq2Var.b0(677118919);
                xq2Var.p(z3);
            }
            long j7 = j2;
            if (!oq1.d(j7, 0L)) {
                xq2Var.b0(677207238);
                xq2 xq2Var5 = xq2Var;
                x37.b(hf.P(j7), ge7.S(x64Var3, RecyclerView.B1, 12.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.55f, j3), hi2.E(11), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var5, 1576368, 0, 130992);
                xq2Var2 = xq2Var5;
                xq2Var2.p(z3);
            } else {
                xq2Var2 = xq2Var;
                xq2Var2.b0(677533575);
                xq2Var2.p(z3);
            }
            gu guVar = new gu(14.0f, true, new i(1));
            a74 S = ge7.S(x64Var3, RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a5 = k26.a(guVar, d90.h0, xq2Var2, 6);
            int hashCode7 = Long.hashCode(xq2Var2.T);
            xv4 l8 = xq2Var2.l();
            a74 E7 = l.E(xq2Var2, S);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, a5);
            yh2.K(xq2Var2, pnVar2, l8);
            i61.w(hashCode7, xq2Var2, pnVar10, xq2Var2, neVar3);
            yh2.K(xq2Var2, pnVar4, E7);
            l("A", yh2.O(xq2Var2, R.string.external_hint_open), xq2Var2, 6);
            l("Y", yh2.O(xq2Var2, R.string.external_hint_favorite), xq2Var2, 6);
            xq2Var2.p(true);
            xq2Var2.p(true);
            xq2Var2.p(true);
            xq2Var2.p(true);
            str4 = str7;
        } else {
            xq2Var2.V();
            str4 = str3;
        }
        cf5 t = xq2Var2.t();
        if (t != null) {
            t.d = new rl(pq5Var, str, str4, i2, i3, 10);
        }
    }

    public static final void o(long j2, px0 px0Var, int i2) {
        boolean z;
        boolean z2;
        float f2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-648156935);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            e53 h2 = yh2.h(yh2.H("externalBootDots", xq2Var, 0), RecyclerView.B1, 3.0f, ge7.G(ge7.Y(1050, 0, ir1.c, 2), null, 6), "externalBootDotsPhase", xq2Var, 29112, 0);
            x64 x64Var = x64.a;
            a74 S = ge7.S(x64Var, 9.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
            l26 a2 = k26.a(ju.a, d90.h0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, S);
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
            xq2Var.b0(-1928006220);
            for (int i3 = 0; i3 < 3; i3++) {
                if (((int) ((Number) h2.R.getValue()).floatValue()) % 3 == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a74 g2 = u24.g(dj6.i(ge7.Q(x64Var, 3.0f, RecyclerView.B1, 2), 5.0f), z16.a);
                if (z2) {
                    f2 = 0.95f;
                } else {
                    f2 = 0.28f;
                }
                h70.a(vy7.L(g2, kt0.c(f2, j2), u24.m), xq2Var, 0);
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yp1(j2, i2, 1);
        }
    }

    public static final void p(String str, List list, String str2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        long c2;
        pn pnVar;
        c46 c46Var;
        e40 e40Var;
        ne neVar;
        pn pnVar2;
        iy0 iy0Var;
        c40 c40Var;
        boolean z2;
        pn pnVar3;
        String valueOf;
        jy2 jy2Var = u24.m;
        c40 c40Var2 = d90.k0;
        list.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-526984713);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (xq2Var.h(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var.f(str2)) {
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
            a74 P = ge7.P(vy7.L(dj6.c, hv.c(4061270294L), jy2Var), 30.0f, 24.0f);
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var2, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            pn pnVar4 = ix0.f;
            yh2.K(xq2Var, pnVar4, a2);
            pn pnVar5 = ix0.e;
            yh2.K(xq2Var, pnVar5, l2);
            Integer valueOf2 = Integer.valueOf(hashCode);
            pn pnVar6 = ix0.g;
            yh2.K(xq2Var, pnVar6, valueOf2);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar7 = ix0.d;
            yh2.K(xq2Var, pnVar7, E);
            boolean z3 = true;
            eu euVar2 = euVar;
            c40 c40Var3 = c40Var2;
            jy2 jy2Var2 = jy2Var;
            x37.b(str, null, kt0.d, hi2.E(19), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, (i8 & 14) | 1772928, 0, 130962);
            xq2 xq2Var2 = xq2Var;
            gu guVar = new gu(12.0f, true, new i(1));
            x64 x64Var = x64.a;
            a74 S = ge7.S(x64Var, RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13);
            x64 x64Var2 = x64Var;
            l26 a3 = k26.a(guVar, d90.h0, xq2Var2, 6);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, S);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var2);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar4, a3);
            yh2.K(xq2Var2, pnVar5, l3);
            i61.w(hashCode2, xq2Var2, pnVar6, xq2Var2, neVar2);
            yh2.K(xq2Var2, pnVar7, E2);
            xq2Var2.b0(-1431976155);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((c46) obj).b) {
                    arrayList.add(obj);
                }
            }
            List e1 = gt0.e1(arrayList, 4);
            if (e1.isEmpty()) {
                e1 = gt0.e1(list, 4);
            }
            Iterator it = e1.iterator();
            while (it.hasNext()) {
                c46 c46Var2 = (c46) it.next();
                vn3 vn3Var = new vn3(1.0f, z3);
                c40 c40Var4 = c40Var3;
                eu euVar3 = euVar2;
                yt0 a4 = wt0.a(euVar3, c40Var4, xq2Var2, 0);
                int hashCode3 = Long.hashCode(xq2Var2.T);
                xv4 l4 = xq2Var2.l();
                a74 E3 = l.E(xq2Var2, vn3Var);
                jx0.i.getClass();
                iy0 iy0Var3 = ix0.b;
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var3);
                } else {
                    xq2Var2.o0();
                }
                pn pnVar8 = ix0.f;
                yh2.K(xq2Var2, pnVar8, a4);
                pn pnVar9 = ix0.e;
                yh2.K(xq2Var2, pnVar9, l4);
                Integer valueOf3 = Integer.valueOf(hashCode3);
                pn pnVar10 = ix0.g;
                yh2.K(xq2Var2, pnVar10, valueOf3);
                ne neVar3 = ix0.h;
                yh2.F(xq2Var2, neVar3);
                pn pnVar11 = ix0.d;
                yh2.K(xq2Var2, pnVar11, E3);
                a74 g2 = u24.g(ak7.H(dj6.c(x64Var2, 1.0f), 1.3333334f), z16.b(9.0f));
                long j2 = kt0.d;
                Iterator it2 = it;
                jy2 jy2Var3 = jy2Var2;
                a74 L = vy7.L(g2, kt0.c(0.06f, j2), jy2Var3);
                int i9 = c46Var2.a;
                boolean z4 = c46Var2.b;
                if (i9 == 0 && z4) {
                    c2 = hv.c(4294198070L);
                } else {
                    c2 = kt0.c(0.12f, j2);
                }
                a74 I = ak7.I(L, 2.0f, c2, z16.b(9.0f));
                e40 e40Var2 = d90.L;
                e34 d2 = h70.d(e40Var2, false);
                int hashCode4 = Long.hashCode(xq2Var2.T);
                xv4 l5 = xq2Var2.l();
                a74 E4 = l.E(xq2Var2, I);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var3);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar8, d2);
                yh2.K(xq2Var2, pnVar9, l5);
                i61.w(hashCode4, xq2Var2, pnVar10, xq2Var2, neVar3);
                yh2.K(xq2Var2, pnVar11, E4);
                vs0 vs0Var = vs0.Y;
                if (z4 && c46Var2.d != null) {
                    xq2Var2.b0(1644772984);
                    neVar = neVar3;
                    pnVar = pnVar11;
                    e40Var = e40Var2;
                    iy0Var = iy0Var3;
                    c40Var = c40Var4;
                    pnVar3 = pnVar9;
                    pnVar2 = pnVar10;
                    c46Var = c46Var2;
                    z2 = false;
                    gi2.b(c46Var2.d, null, dj6.c, y31.a, RecyclerView.B1, xq2Var2, 1573296, 4024);
                    xq2Var2.p(false);
                } else {
                    pnVar = pnVar11;
                    c46Var = c46Var2;
                    e40Var = e40Var2;
                    neVar = neVar3;
                    pnVar2 = pnVar10;
                    iy0Var = iy0Var3;
                    c40Var = c40Var4;
                    z2 = false;
                    pnVar3 = pnVar9;
                    xq2Var2.b0(1645077466);
                    xq2Var2.p(false);
                }
                a74 P2 = ge7.P(vy7.L(u24.g(ge7.S(vs0Var.n(x64Var2, e40Var), 7.0f, 6.0f, RecyclerView.B1, RecyclerView.B1, 12), z16.b(4.0f)), kt0.c(0.45f, kt0.b), jy2Var3), 6.0f, 2.0f);
                e34 d3 = h70.d(e40Var, z2);
                int hashCode5 = Long.hashCode(xq2Var2.T);
                xv4 l6 = xq2Var2.l();
                a74 E5 = l.E(xq2Var2, P2);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar8, d3);
                yh2.K(xq2Var2, pnVar3, l6);
                i61.w(hashCode5, xq2Var2, pnVar2, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar, E5);
                c46 c46Var3 = c46Var;
                int i10 = c46Var3.a;
                if (i10 == 0) {
                    valueOf = "Q";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sr2 sr2Var = qs7.c;
                xq2 xq2Var3 = xq2Var2;
                x64 x64Var3 = x64Var2;
                jy2Var2 = jy2Var3;
                c40 c40Var5 = c40Var;
                x37.b(valueOf, null, j2, hi2.D(8.5d), oj2.d0, sr2Var, 0L, null, hi2.E(9), 0, false, 0, 0, null, null, xq2Var3, 1772928, 6, 129938);
                xq2Var3.p(true);
                xq2Var3.p(true);
                Date date = c46Var3.c;
                x37.b((date == null || (r0 = DateUtils.getRelativeTimeSpanString(date.getTime()).toString()) == null) ? "—" : "—", ge7.S(dj6.c(x64Var3, 1.0f), RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.5f, j2), hi2.D(9.5d), null, sr2Var, 0L, new wz6(3), 0L, 2, false, 1, 0, null, null, xq2Var3, 1576368, 3120, 120240);
                xq2Var2 = xq2Var3;
                xq2Var2.p(true);
                x64Var2 = x64Var3;
                z3 = true;
                it = it2;
                euVar2 = euVar3;
                c40Var3 = c40Var5;
            }
            boolean z5 = z3;
            xq2Var2.p(false);
            xq2Var2.p(z5);
            gi2.h(xq2Var2, new vn3(1.0f, z5));
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            xq2 xq2Var4 = xq2Var2;
            x37.b(upperCase, ge7.S(dj6.c(x64Var2, 1.0f), RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 4.0f, 7), kt0.c(0.4f, kt0.d), hi2.D(9.5d), null, qs7.c, hi2.D(0.5d), new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var4, 14159280, 0, 130352);
            xq2Var = xq2Var4;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(str, list, str2, i2, 15);
        }
    }

    public static final void q(Drawable drawable, String str, String str2, String str3, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        long j2;
        long j3;
        Bitmap bitmap;
        int i7;
        str.getClass();
        str3.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-618377427);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(drawable)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i3 | i4;
        if (xq2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (xq2Var.f(str3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            c40 c40Var = d90.l0;
            a74 P = ge7.P(dj6.c, 60.0f, 30.0f);
            yt0 a2 = wt0.a(ju.d, c40Var, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
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
            x64 x64Var = x64.a;
            if (drawable != null) {
                xq2Var.b0(-39418720);
                boolean f2 = xq2Var.f(drawable);
                Object P2 = xq2Var.P();
                if (!f2 && P2 != ox0.a) {
                    j3 = 4285513546L;
                } else {
                    if (drawable instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                        if (bitmapDrawable.getBitmap() != null) {
                            if (96 == bitmapDrawable.getBitmap().getWidth() && 96 == bitmapDrawable.getBitmap().getHeight()) {
                                bitmap = bitmapDrawable.getBitmap();
                            } else {
                                bitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), 96, 96, true);
                            }
                            j3 = 4285513546L;
                        } else {
                            i.h("bitmap is null");
                            return;
                        }
                    } else {
                        Rect bounds = drawable.getBounds();
                        int i11 = bounds.left;
                        j3 = 4285513546L;
                        int i12 = bounds.top;
                        int i13 = bounds.right;
                        int i14 = bounds.bottom;
                        Bitmap createBitmap = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
                        drawable.setBounds(0, 0, 96, 96);
                        drawable.draw(new Canvas(createBitmap));
                        drawable.setBounds(i11, i12, i13, i14);
                        bitmap = createBitmap;
                    }
                    P2 = new w40(new zh(bitmap));
                    xq2Var.l0(P2);
                }
                i13.b((w40) P2, null, dj6.i(x64Var, 46.0f), hv.c(j3), xq2Var, 3512, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-38961935);
                i13.a(oi2.C(), null, dj6.i(x64Var, 46.0f), hv.c(4285513546L), xq2Var, 3504, 0);
                xq2Var.p(false);
            }
            long j4 = kt0.d;
            x37.b(str, ge7.S(x64Var, RecyclerView.B1, 14.0f, RecyclerView.B1, RecyclerView.B1, 13), j4, hi2.E(23), oj2.e0, qs7.a, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, ((i10 >> 3) & 14) | 1772976, 0, 130448);
            xq2 xq2Var2 = xq2Var;
            if (str2 == null || qs6.v0(str2)) {
                j2 = j4;
                xq2Var2.b0(-37992193);
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(-38367293);
                j2 = j4;
                x37.b(str2, dj6.l(ge7.S(x64Var, RecyclerView.B1, 9.0f, RecyclerView.B1, RecyclerView.B1, 13), 420.0f), kt0.c(0.6f, j4), hi2.D(13.5d), null, null, 0L, new wz6(3), hi2.E(20), 2, false, 5, 0, null, null, xq2Var2, ((i10 >> 6) & 14) | 3504, 3126, 119280);
                xq2Var2 = xq2Var2;
                xq2Var2.p(false);
            }
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            xq2 xq2Var3 = xq2Var2;
            x37.b(upperCase, ge7.S(x64Var, RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.35f, j2), hi2.D(9.5d), null, qs7.c, hi2.D(0.6d), null, 0L, 0, false, 0, 0, null, null, xq2Var3, 14159280, 0, 130864);
            xq2Var = xq2Var3;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(drawable, str, str2, str3, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(String str, String str2, eo2 eo2Var, px0 px0Var, int i2, int i3) {
        int i4;
        String str3;
        int i5;
        int i6;
        eo2 eo2Var2;
        int i7;
        boolean z;
        String str4;
        eo2 eo2Var3;
        cf5 t;
        int i8;
        String str5;
        boolean z2;
        xq2 xq2Var;
        es7 es7Var;
        int i9;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1837067861);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            str3 = str2;
            if (xq2Var2.f(str3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= RendererDebugBridge.CAPTURE_HEIGHT;
            } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                eo2Var2 = eo2Var;
                if (xq2Var2.h(eo2Var2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
                if ((i4 & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq2Var2.S(i4 & 1, z)) {
                    if (i10 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        eo2Var3 = null;
                    } else {
                        eo2Var3 = eo2Var2;
                    }
                    es7 F = bl2.F(xq2Var2);
                    yt0 a2 = wt0.a(new gu(2.0f, true, new i(1)), d90.l0, xq2Var2, 54);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    x64 x64Var = x64.a;
                    a74 E = l.E(xq2Var2, x64Var);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a2);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    if (eo2Var3 != null) {
                        xq2Var2.b0(675485477);
                        eo2Var3.o(xq2Var2, Integer.valueOf((i4 >> 6) & 14));
                        xq2Var2.p(false);
                        i8 = i4;
                        str5 = str3;
                        z2 = true;
                        xq2Var = xq2Var2;
                        es7Var = F;
                    } else if (str3 != null) {
                        xq2Var2.b0(675555971);
                        i8 = i4;
                        a74 L = vy7.L(u24.g(dj6.i(x64Var, 16.0f), z16.a), F.d, u24.m);
                        e34 d2 = h70.d(d90.Z, false);
                        int hashCode2 = Long.hashCode(xq2Var2.T);
                        xv4 l3 = xq2Var2.l();
                        a74 E2 = l.E(xq2Var2, L);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, d2);
                        yh2.K(xq2Var2, pnVar2, l3);
                        i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E2);
                        es7Var = F;
                        z2 = true;
                        x37.b(str3, null, F.i, hi2.E(8), null, null, 0L, new wz6(3), hi2.E(8), 0, false, 0, 0, null, null, xq2Var2, ((i8 >> 3) & 14) | 3072, 6, 129522);
                        str5 = str3;
                        xq2Var = xq2Var2;
                        xq2Var.p(true);
                        xq2Var.p(false);
                    } else {
                        i8 = i4;
                        str5 = str3;
                        z2 = true;
                        xq2Var = xq2Var2;
                        es7Var = F;
                        xq2Var.b0(676048003);
                        xq2Var.p(false);
                    }
                    xq2 xq2Var3 = xq2Var;
                    x37.b(str, null, es7Var.i, hi2.D(7.5d), null, qs7.c, 0L, new wz6(3), hi2.E(9), 0, false, 0, 0, null, null, xq2Var3, (i8 & 14) | 1575936, 6, 129458);
                    xq2Var2 = xq2Var3;
                    xq2Var2.p(z2);
                    str4 = str5;
                } else {
                    xq2Var2.V();
                    str4 = str3;
                    eo2Var3 = eo2Var2;
                }
                t = xq2Var2.t();
                if (t != null) {
                    t.d = new g4(str, str4, eo2Var3, i2, i3, 0);
                    return;
                }
                return;
            }
            eo2Var2 = eo2Var;
            if ((i4 & 147) != 146) {
            }
            if (xq2Var2.S(i4 & 1, z)) {
            }
            t = xq2Var2.t();
            if (t != null) {
            }
        }
        str3 = str2;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        eo2Var2 = eo2Var;
        if ((i4 & 147) != 146) {
        }
        if (xq2Var2.S(i4 & 1, z)) {
        }
        t = xq2Var2.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sw, java.lang.Object] */
    public static final sw s(boolean z) {
        ?? obj = new Object();
        obj.a = z ? 1 : 0;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uw, java.lang.Object] */
    public static final uw t(int i2) {
        ?? obj = new Object();
        obj.a = i2;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xw] */
    public static final xw u(Object obj) {
        ?? obj2 = new Object();
        obj2.a = obj;
        return obj2;
    }

    public static final int v(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static final int w(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 > 0) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final void x(w61 w61Var, CancellationException cancellationException) {
        rc3 rc3Var = (rc3) w61Var.A().Z(vs0.h0);
        if (rc3Var != null) {
            rc3Var.h(cancellationException);
        } else {
            e41.h(w61Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void y(int i2) {
        if (2 <= i2 && i2 < 37) {
            return;
        }
        i.j(xg6.t("radix ", i2, " was not in valid range "), new j93(2, 36, 1));
    }

    public static int z(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
