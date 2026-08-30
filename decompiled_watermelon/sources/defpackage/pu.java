package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public abstract class pu {
    public static final j11[] a = new j11[0];
    public static final et0 b = new et0(1106336085, false, new xk0(18));
    public static final et0 c = new et0(-77131700, false, new ot0(23));
    public static final et0 d = new et0(-762601867, false, new ot0(24));
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final Object[] g = new Object[0];
    public static final b27 h = new b27(6, true);
    public static final b27 i = new b27(2, true);
    public static final b27 j = new b27(4, false);
    public static final b27 k = new b27(3, true);
    public static final b27 l = new b27(5, true);
    public static final b27 m = new b27(7, true);
    public static final b27 n = new b27(8, false);
    public static final n43 o = new n43(2, true);
    public static final n43 p = new n43(3, true);
    public static final n43 q = new n43(0, true);
    public static final n43 r = new n43(1, true);
    public static final int[] s = {13, 15, 14};
    public static final byte[] t = {112, 114, 111, 0};
    public static final byte[] u = {112, 114, 109, 0};
    public static final gj v = new gj(1022);
    public static ax2 w;
    public static final /* synthetic */ int x = 0;
    public static final /* synthetic */ int y = 0;

    public static int[] A(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) jv3.V(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static pe1[] B(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, pe1[] pe1VarArr) {
        byte[] bArr3 = n40.r;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(n40.m, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int V = (int) jv3.V(fileInputStream, 1);
                    byte[] T = jv3.T(fileInputStream, (int) jv3.V(fileInputStream, 4), (int) jv3.V(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(T);
                        try {
                            pe1[] C = C(byteArrayInputStream, V, pe1VarArr);
                            byteArrayInputStream.close();
                            return C;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    i.n("Content found after the end of file");
                    return null;
                }
                i.n("Unsupported meta version");
                return null;
            }
            i.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, n40.s)) {
            int V2 = (int) jv3.V(fileInputStream, 2);
            byte[] T2 = jv3.T(fileInputStream, (int) jv3.V(fileInputStream, 4), (int) jv3.V(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(T2);
                try {
                    pe1[] D = D(byteArrayInputStream2, bArr2, V2, pe1VarArr);
                    byteArrayInputStream2.close();
                    return D;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            i.n("Content found after the end of file");
            return null;
        } else {
            i.n("Unsupported meta version");
            return null;
        }
    }

    public static pe1[] C(ByteArrayInputStream byteArrayInputStream, int i2, pe1[] pe1VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new pe1[0];
        }
        if (i2 == pe1VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = (int) jv3.V(byteArrayInputStream, 2);
                strArr[i3] = new String(jv3.S(byteArrayInputStream, (int) jv3.V(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                pe1 pe1Var = pe1VarArr[i4];
                if (pe1Var.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    pe1Var.e = i5;
                    pe1Var.h = A(byteArrayInputStream, i5);
                } else {
                    i.n("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return pe1VarArr;
        }
        i.n("Mismatched number of dex files found in metadata");
        return null;
    }

    public static pe1[] D(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, pe1[] pe1VarArr) {
        String str;
        pe1 pe1Var;
        if (byteArrayInputStream.available() == 0) {
            return new pe1[0];
        }
        if (i2 == pe1VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                jv3.V(byteArrayInputStream, 2);
                String str2 = new String(jv3.S(byteArrayInputStream, (int) jv3.V(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long V = jv3.V(byteArrayInputStream, 4);
                int V2 = (int) jv3.V(byteArrayInputStream, 2);
                if (pe1VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < pe1VarArr.length; i4++) {
                        if (pe1VarArr[i4].b.equals(str)) {
                            pe1Var = pe1VarArr[i4];
                            break;
                        }
                    }
                }
                pe1Var = null;
                if (pe1Var != null) {
                    pe1Var.d = V;
                    int[] A = A(byteArrayInputStream, V2);
                    if (Arrays.equals(bArr, n40.q)) {
                        pe1Var.e = V2;
                        pe1Var.h = A;
                    }
                } else {
                    i.n("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return pe1VarArr;
        }
        i.n("Mismatched number of dex files found in metadata");
        return null;
    }

    public static pe1[] E(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, n40.n)) {
            int V = (int) jv3.V(fileInputStream, 1);
            byte[] T = jv3.T(fileInputStream, (int) jv3.V(fileInputStream, 4), (int) jv3.V(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(T);
                try {
                    pe1[] F = F(byteArrayInputStream, str, V);
                    byteArrayInputStream.close();
                    return F;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i.n("Content found after the end of file");
            return null;
        }
        i.n("Unsupported version");
        return null;
    }

    public static pe1[] F(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new pe1[0];
        }
        pe1[] pe1VarArr = new pe1[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int V = (int) jv3.V(byteArrayInputStream, 2);
            pe1VarArr[i5] = new pe1(str, new String(jv3.S(byteArrayInputStream, (int) jv3.V(byteArrayInputStream, 2)), StandardCharsets.UTF_8), jv3.V(byteArrayInputStream, 4), V, (int) jv3.V(byteArrayInputStream, 4), (int) jv3.V(byteArrayInputStream, 4), new int[V], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            pe1 pe1Var = pe1VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = pe1Var.f;
            int i8 = pe1Var.g;
            TreeMap treeMap = pe1Var.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) jv3.V(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int V2 = (int) jv3.V(byteArrayInputStream, 2);
                while (V2 > 0) {
                    jv3.V(byteArrayInputStream, 2);
                    int V3 = (int) jv3.V(byteArrayInputStream, 1);
                    if (V3 != 6 && V3 != 7) {
                        while (V3 > 0) {
                            jv3.V(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int V4 = (int) jv3.V(byteArrayInputStream, 1); V4 > 0; V4--) {
                                jv3.V(byteArrayInputStream, 2);
                            }
                            V3--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    V2--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                pe1Var.h = A(byteArrayInputStream, pe1Var.e);
                BitSet valueOf = BitSet.valueOf(jv3.S(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
                for (int i15 = i13; i15 < i8; i15++) {
                    if (valueOf.get(i15)) {
                        i3 = 2;
                    } else {
                        i3 = i13;
                    }
                    if (valueOf.get(i15 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = Integer.valueOf(i13);
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6 = i14 + 1;
                i4 = i13;
            } else {
                i.n("Read too much data during profile line parse");
                return null;
            }
        }
        return pe1VarArr;
    }

    public static final zy3 G(zy3 zy3Var, sw5 sw5Var, jf4 jf4Var, eg egVar, boolean z, a92 a92Var, l14 l14Var, qh4 qh4Var) {
        zy3 t2;
        jf4 jf4Var2 = jf4.Vertical;
        wy3 wy3Var = wy3.a;
        if (jf4Var == jf4Var2) {
            t2 = a53.t(wy3Var, is2.c);
        } else {
            t2 = a53.t(wy3Var, is2.b);
        }
        return zy3Var.f(t2).f(new gw5(egVar, qh4Var, a92Var, l14Var, jf4Var, sw5Var, z, false));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, n75] */
    public static final Object H(ed2 ed2Var, int i2, mi2 mi2Var) {
        int i3;
        int i4;
        Object obj;
        ed2 ed2Var2;
        ui3 V0;
        int e2;
        zc0 zc0Var;
        if (!ed2Var.A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var = ed2Var.A.X;
        vf3 P = l.P(ed2Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (P != null) {
                if ((((yy3) P.A0.g).R & 1024) != 0) {
                    while (yy3Var != null) {
                        if ((yy3Var.L & 1024) != 0) {
                            ed2Var2 = yy3Var;
                            o24 o24Var = null;
                            while (ed2Var2 != null) {
                                if (ed2Var2 instanceof ed2) {
                                    break loop0;
                                }
                                if ((ed2Var2.L & 1024) != 0 && (ed2Var2 instanceof xc1)) {
                                    int i5 = 0;
                                    for (yy3 yy3Var2 = ((xc1) ed2Var2).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                                        if ((yy3Var2.L & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                ed2Var2 = yy3Var2;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (ed2Var2 != null) {
                                                    o24Var.b(ed2Var2);
                                                    ed2Var2 = null;
                                                }
                                                o24Var.b(yy3Var2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                ed2Var2 = l.p(o24Var);
                            }
                            continue;
                        }
                        yy3Var = yy3Var.X;
                    }
                }
                P = P.u();
                if (P != null && (zc0Var = P.A0) != null) {
                    yy3Var = (lm6) zc0Var.f;
                } else {
                    yy3Var = null;
                }
            } else {
                ed2Var2 = null;
                break;
            }
        }
        ed2 ed2Var3 = ed2Var2;
        if ((ed2Var3 == null || !b53.x(ed2Var3.V0(), ed2Var.V0())) && (V0 = ed2Var.V0()) != null) {
            int i6 = 5;
            if (i2 != 5) {
                i6 = 6;
                if (i2 != 6) {
                    i6 = 3;
                    if (i2 != 3) {
                        i6 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                i.n("Unsupported direction for beyond bounds layout");
                            }
                            if (V0.j0.a() <= 0 && V0.j0.c() && V0.i0) {
                                boolean S0 = V0.S0(i4);
                                vi3 vi3Var = V0.j0;
                                if (S0) {
                                    e2 = vi3Var.b();
                                } else {
                                    e2 = vi3Var.e();
                                }
                                ?? obj2 = new Object();
                                l50 l50Var = V0.k0;
                                l50Var.getClass();
                                pi3 pi3Var = new pi3(e2, e2);
                                l50Var.a.b(pi3Var);
                                obj2.A = pi3Var;
                                int d2 = V0.j0.d() * 2;
                                int a2 = V0.j0.a();
                                if (d2 > a2) {
                                    d2 = a2;
                                }
                                while (obj == null && V0.R0((pi3) obj2.A, i4) && i3 < d2) {
                                    pi3 pi3Var2 = (pi3) obj2.A;
                                    int i7 = pi3Var2.a;
                                    int i8 = pi3Var2.b;
                                    if (V0.S0(i4)) {
                                        i8++;
                                    } else {
                                        i7--;
                                    }
                                    l50 l50Var2 = V0.k0;
                                    l50Var2.getClass();
                                    pi3 pi3Var3 = new pi3(i7, i8);
                                    l50Var2.a.b(pi3Var3);
                                    V0.k0.a.k((pi3) obj2.A);
                                    obj2.A = pi3Var3;
                                    i3++;
                                    l.P(V0).k();
                                    obj = mi2Var.n(new ti3(V0, obj2, i4));
                                }
                                V0.k0.a.k((pi3) obj2.A);
                                l.P(V0).k();
                                return obj;
                            }
                            return mi2Var.n(ui3.m0);
                        }
                    }
                }
            }
            i4 = i6;
            if (V0.j0.a() <= 0) {
            }
            return mi2Var.n(ui3.m0);
        }
        return null;
    }

    public static int I(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return 270;
                    }
                    i.i(wh1.g(i2, "Unsupported surface rotation: "));
                    return 0;
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static final BlendMode J(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i2 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        } else if (i2 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        } else if (i2 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        } else if (i2 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        } else if (i2 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        } else if (i2 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        } else if (i2 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        } else if (i2 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        } else if (i2 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        } else if (i2 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (i2 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        } else if (i2 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        } else if (i2 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        } else if (i2 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        } else if (i2 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        } else if (i2 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        } else if (i2 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        } else if (i2 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        } else if (i2 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (i2 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (i2 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (i2 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (i2 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (i2 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        } else if (i2 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        } else if (i2 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        } else if (i2 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        } else if (i2 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        } else if (i2 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    public static final List K(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(arrayList));
            }
            return Collections.singletonList(tq0.K0(arrayList));
        }
        return pp1.A;
    }

    public static final Map L(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) tq0.J0(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return qp1.A;
    }

    public static final PorterDuff.Mode M(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i2 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean N(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, pe1[] pe1VarArr) {
        int length;
        byte[] bArr2 = n40.q;
        byte[] bArr3 = n40.p;
        byte[] bArr4 = n40.m;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                jv3.i0(byteArrayOutputStream2, pe1VarArr.length);
                int i3 = 2;
                int i4 = 2;
                for (pe1 pe1Var : pe1VarArr) {
                    jv3.h0(byteArrayOutputStream2, pe1Var.c, 4);
                    jv3.h0(byteArrayOutputStream2, pe1Var.d, 4);
                    jv3.h0(byteArrayOutputStream2, pe1Var.g, 4);
                    String s2 = s(pe1Var.a, pe1Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = s2.getBytes(charset).length;
                    jv3.i0(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(s2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 == byteArray.length) {
                    dj7 dj7Var = new dj7(h62.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList.add(dj7Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i5 = 0;
                    for (int i6 = 0; i6 < pe1VarArr.length; i6++) {
                        try {
                            pe1 pe1Var2 = pe1VarArr[i6];
                            jv3.i0(byteArrayOutputStream3, i6);
                            jv3.i0(byteArrayOutputStream3, pe1Var2.e);
                            i5 = i5 + 4 + (pe1Var2.e * i3);
                            int[] iArr = pe1Var2.h;
                            int length3 = iArr.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length3) {
                                int i9 = iArr[i7];
                                jv3.i0(byteArrayOutputStream3, i9 - i8);
                                i7++;
                                i3 = i3;
                                i8 = i9;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i5 == byteArray2.length) {
                        dj7 dj7Var2 = new dj7(h62.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList.add(dj7Var2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < pe1VarArr.length) {
                            try {
                                pe1 pe1Var3 = pe1VarArr[i10];
                                int i12 = i2;
                                for (Map.Entry entry : pe1Var3.i.entrySet()) {
                                    i12 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                T(byteArrayOutputStream4, i12, pe1Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                U(byteArrayOutputStream5, pe1Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                jv3.i0(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i11 + 6;
                                jv3.h0(byteArrayOutputStream3, length4, 4);
                                jv3.i0(byteArrayOutputStream3, i12);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i13 + length4;
                                i10++;
                                i2 = 0;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i11 == byteArray5.length) {
                            dj7 dj7Var3 = new dj7(h62.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList.add(dj7Var3);
                            long size = 12 + (arrayList.size() * 16);
                            jv3.h0(byteArrayOutputStream, arrayList.size(), 4);
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                dj7 dj7Var4 = (dj7) arrayList.get(i14);
                                h62 h62Var = dj7Var4.a;
                                byte[] bArr5 = dj7Var4.b;
                                jv3.h0(byteArrayOutputStream, h62Var.getValue(), 4);
                                jv3.h0(byteArrayOutputStream, size, 4);
                                if (dj7Var4.c) {
                                    long length5 = bArr5.length;
                                    byte[] p2 = jv3.p(bArr5);
                                    arrayList2.add(p2);
                                    jv3.h0(byteArrayOutputStream, p2.length, 4);
                                    jv3.h0(byteArrayOutputStream, length5, 4);
                                    length = p2.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    jv3.h0(byteArrayOutputStream, bArr5.length, 4);
                                    jv3.h0(byteArrayOutputStream, 0L, 4);
                                    length = bArr5.length;
                                }
                                size += length;
                            }
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i15));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr6 = n40.n;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] p3 = p(pe1VarArr, bArr6);
            jv3.h0(byteArrayOutputStream, pe1VarArr.length, 1);
            jv3.h0(byteArrayOutputStream, p3.length, 4);
            byte[] p4 = jv3.p(p3);
            jv3.h0(byteArrayOutputStream, p4.length, 4);
            byteArrayOutputStream.write(p4);
            return true;
        } else if (Arrays.equals(bArr, bArr3)) {
            jv3.h0(byteArrayOutputStream, pe1VarArr.length, 1);
            for (pe1 pe1Var4 : pe1VarArr) {
                String s3 = s(pe1Var4.a, pe1Var4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                jv3.i0(byteArrayOutputStream, s3.getBytes(charset2).length);
                jv3.i0(byteArrayOutputStream, pe1Var4.h.length);
                jv3.h0(byteArrayOutputStream, pe1Var4.i.size() * 4, 4);
                jv3.h0(byteArrayOutputStream, pe1Var4.c, 4);
                byteArrayOutputStream.write(s3.getBytes(charset2));
                for (Integer num : pe1Var4.i.keySet()) {
                    jv3.i0(byteArrayOutputStream, num.intValue());
                    jv3.i0(byteArrayOutputStream, 0);
                }
                for (int i16 : pe1Var4.h) {
                    jv3.i0(byteArrayOutputStream, i16);
                }
            }
            return true;
        } else {
            byte[] bArr7 = n40.o;
            if (Arrays.equals(bArr, bArr7)) {
                byte[] p5 = p(pe1VarArr, bArr7);
                jv3.h0(byteArrayOutputStream, pe1VarArr.length, 1);
                jv3.h0(byteArrayOutputStream, p5.length, 4);
                byte[] p6 = jv3.p(p5);
                jv3.h0(byteArrayOutputStream, p6.length, 4);
                byteArrayOutputStream.write(p6);
                return true;
            } else if (Arrays.equals(bArr, bArr2)) {
                jv3.i0(byteArrayOutputStream, pe1VarArr.length);
                for (pe1 pe1Var5 : pe1VarArr) {
                    String str = pe1Var5.a;
                    TreeMap treeMap = pe1Var5.i;
                    String s4 = s(str, pe1Var5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    jv3.i0(byteArrayOutputStream, s4.getBytes(charset3).length);
                    jv3.i0(byteArrayOutputStream, treeMap.size());
                    jv3.i0(byteArrayOutputStream, pe1Var5.h.length);
                    jv3.h0(byteArrayOutputStream, pe1Var5.c, 4);
                    byteArrayOutputStream.write(s4.getBytes(charset3));
                    for (Integer num2 : treeMap.keySet()) {
                        jv3.i0(byteArrayOutputStream, num2.intValue());
                    }
                    for (int i17 : pe1Var5.h) {
                        jv3.i0(byteArrayOutputStream, i17);
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public static final j27 O(j11 j11Var, e31 e31Var, Object obj) {
        j27 j27Var = null;
        if ((j11Var instanceof q31) && e31Var.I(nh0.R) != null) {
            q31 q31Var = (q31) j11Var;
            while (true) {
                if (!(q31Var instanceof lg1) && (q31Var = q31Var.g()) != null) {
                    if (q31Var instanceof j27) {
                        j27Var = (j27) q31Var;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j27Var != null) {
                j27Var.z0(e31Var, obj);
            }
        }
        return j27Var;
    }

    public static final void P(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                i.i("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            i.i("colors and colorStops arguments must have equal length.");
        }
    }

    public static final Object Q(e31 e31Var, Object obj, Object obj2, aj2 aj2Var, j11 j11Var) {
        Object j2;
        Object c2 = ts6.c(e31Var, obj2);
        try {
            cd6 cd6Var = new cd6(j11Var, e31Var);
            if (aj2Var == null) {
                j2 = nk2.c0(aj2Var, obj, cd6Var);
            } else {
                l07.q(2, aj2Var);
                j2 = aj2Var.j(obj, cd6Var);
            }
            ts6.a(e31Var, c2);
            if (j2 == p31.COROUTINE_SUSPENDED) {
                j11Var.getClass();
            }
            return j2;
        } catch (Throwable th) {
            ts6.a(e31Var, c2);
            throw th;
        }
    }

    public static void R(ByteArrayOutputStream byteArrayOutputStream, pe1 pe1Var) {
        U(byteArrayOutputStream, pe1Var);
        int i2 = pe1Var.g;
        int[] iArr = pe1Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            jv3.i0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : pe1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, pe1 pe1Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        jv3.i0(byteArrayOutputStream, str.getBytes(charset).length);
        jv3.i0(byteArrayOutputStream, pe1Var.e);
        jv3.h0(byteArrayOutputStream, pe1Var.f, 4);
        jv3.h0(byteArrayOutputStream, pe1Var.c, 4);
        jv3.h0(byteArrayOutputStream, pe1Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, int i2, pe1 pe1Var) {
        int i3 = pe1Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : pe1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, pe1 pe1Var) {
        int i2 = 0;
        for (Map.Entry entry : pe1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                jv3.i0(byteArrayOutputStream, intValue - i2);
                jv3.i0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy3 r16, java.lang.Object r17, defpackage.os r18, defpackage.xq0 r19, defpackage.bj2 r20, defpackage.tu0 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.a(zy3, java.lang.Object, os, xq0, bj2, tu0, int, int):void");
    }

    public static final void b(n6 n6Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        URL url;
        int i4;
        long b2;
        boolean z2;
        boolean z3;
        n6Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(624979067);
        if (sk2Var.f(n6Var)) {
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
        if (sk2Var.O(i5 & 1, z)) {
            Context context = (Context) sk2Var.j(ue.b);
            dy4 a2 = n6Var.a();
            boolean L = jv3.L(n6Var);
            long j2 = jd7.p;
            h20 h20Var = y60.k0;
            s72 s72Var = o76.c;
            long d2 = mh7.d(4279374102L);
            is2 is2Var = iq2.g;
            zy3 Y = b53.Y(dk7.i(s72Var, d2, is2Var), 56.0f, 36.0f);
            lr0 a3 = jr0.a(rt.d, h20Var, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a3);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            if (L) {
                url = a2.j;
            } else {
                url = a2.k;
            }
            String url2 = url.toString();
            wy3 wy3Var = wy3.a;
            zy3 t2 = a53.t(o76.h(wy3Var, 96.0f), gr5.b(12.0f));
            long j3 = xq0.d;
            cg2.b(url2, null, dk7.i(t2, xq0.b(0.06f, j3), is2Var), r01.a, RecyclerView.A1, sk2Var, 1572912, 4024);
            String a4 = a2.a();
            sd2 sd2Var = td7.a;
            ir6.b(a4, b53.b0(wy3Var, RecyclerView.A1, 18.0f, RecyclerView.A1, RecyclerView.A1, 13), j3, hi2.B(25), pe2.d0, sd2Var, 0L, new kn6(3), hi2.B(29), 2, false, 2, 0, null, null, sk2Var, 1772976, 3126, 119184);
            if (L) {
                i4 = R.string.retro_achievements_unlocked;
            } else {
                i4 = R.string.retro_achievements_locked;
            }
            String str = me2.X(sk2Var, i4) + " · " + a2.h + " " + me2.X(sk2Var, R.string.points_abbreviated);
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            if (L) {
                b2 = mh7.d(4285513546L);
            } else {
                b2 = xq0.b(0.5f, j3);
            }
            ml2 ml2Var = td7.c;
            ir6.b(upperCase, b53.b0(wy3Var, RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13), b2, hi2.B(10), null, ml2Var, hi2.A(0.8d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14158896, 0, 130864);
            sk2Var = sk2Var;
            if (!zg6.B0(a2.g)) {
                sk2Var.X(438763286);
                ir6.b(a2.g, o76.k(b53.b0(wy3Var, RecyclerView.A1, 12.0f, RecyclerView.A1, RecyclerView.A1, 13), 440.0f), xq0.b(0.7f, j3), hi2.B(14), null, null, 0L, new kn6(3), hi2.B(20), 2, false, 5, 0, null, null, sk2Var, 3504, 3126, 119280);
                sk2Var = sk2Var;
                z2 = false;
                sk2Var.p(false);
            } else {
                z2 = false;
                sk2Var.X(439148957);
                sk2Var.p(false);
            }
            if (a2.b()) {
                sk2Var.X(439225620);
                i20 i20Var = y60.h0;
                zy3 b0 = b53.b0(wy3Var, RecyclerView.A1, 14.0f, RecyclerView.A1, RecyclerView.A1, 13);
                sr5 a5 = rr5.a(rt.a, i20Var, sk2Var, 48);
                int hashCode2 = Long.hashCode(sk2Var.T);
                sm4 l3 = sk2Var.l();
                zy3 e02 = l07.e0(sk2Var, b0);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, a5);
                oo2.S(sk2Var, dnVar2, l3);
                b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar4, e02);
                ev2.b(ve2.J(sk2Var, R.drawable.ic_status_warn), null, o76.h(wy3Var, 14.0f), j2, sk2Var, 3512, 0);
                cg2.k(sk2Var, o76.k(wy3Var, 6.0f));
                String upperCase2 = me2.X(sk2Var, R.string.retro_achievements_filter_missable).toUpperCase(locale);
                upperCase2.getClass();
                sk2 sk2Var2 = sk2Var;
                ir6.b(upperCase2, null, j2, hi2.B(10), null, ml2Var, hi2.A(0.8d), null, 0L, 0, false, 0, 0, null, null, sk2Var2, 14159232, 0, 130866);
                sk2Var = sk2Var2;
                z3 = true;
                sk2Var.p(true);
                sk2Var.p(z2);
            } else {
                z3 = true;
                sk2Var.X(439982237);
                sk2Var.p(z2);
            }
            sk2Var.p(z3);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new zq1(n6Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0420, code lost:
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v2, types: [int] */
    /* JADX WARN: Type inference failed for: r48v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.rg5 r45, java.lang.String r46, java.lang.String r47, defpackage.tu0 r48, int r49) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.c(rg5, java.lang.String, java.lang.String, tu0, int):void");
    }

    public static final void d(String str, String str2, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        String str3 = str2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-419903673);
        if (sk2Var.f(str3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            wy3 wy3Var = wy3.a;
            zy3 e0 = l07.e0(sk2Var, wy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 h2 = o76.h(wy3Var, 17.0f);
            long j2 = xq0.d;
            zy3 z2 = b53.z(1.5f, xq0.b(0.4f, j2), h2, gr5.a);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, z2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(str, null, xq0.b(0.7f, j2), hi2.B(9), pe2.d0, null, 0L, new kn6(3), hi2.B(9), 0, false, 0, 0, null, null, sk2Var, 200070, 6, 129490);
            sk2Var.p(true);
            long b2 = xq0.b(0.5f, j2);
            ml2 ml2Var = td7.c;
            str3 = str2;
            ir6.b(str3, b53.b0(wy3Var, 6.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), b2, hi2.B(10), null, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, ((i4 >> 3) & 14) | 1576368, 0, 130992);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new x7(str, i2, str3);
        }
    }

    public static final void e(tu0 tu0Var, int i2) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-76582594);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            h20 h20Var = y60.k0;
            zy3 Y = b53.Y(o76.c, 60.0f, 30.0f);
            lr0 a2 = jr0.a(rt.d, h20Var, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            nd7.a(48.0f, 48, sk2Var, null);
            zy3 b0 = b53.b0(wy3.a, RecyclerView.A1, 16.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a3 = rr5.a(rt.a, y60.g0, sk2Var, 0);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, b0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            String X = me2.X(sk2Var, R.string.app_brand_watermelon);
            long j2 = xq0.d;
            sd2 sd2Var = td7.a;
            long B = hi2.B(34);
            pe2 pe2Var = pe2.d0;
            ir6.b(X, null, j2, B, pe2Var, sd2Var, hi2.A(-0.5d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772928, 0, 130834);
            ir6.b(me2.X(sk2Var, R.string.app_brand_ds), null, mh7.d(4285513546L), hi2.B(34), pe2Var, sd2Var, hi2.A(-0.5d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772928, 0, 130834);
            sk2Var = sk2Var;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new qt0(i2, 12);
        }
    }

    public static final void f(rg5 rg5Var, String str, String str2, tu0 tu0Var, int i2, int i3) {
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        boolean z;
        String str4;
        String str5;
        String str6;
        j20 j20Var;
        dn dnVar;
        s72 s72Var;
        int i8;
        long j2;
        dn dnVar2;
        yd ydVar;
        dn dnVar3;
        boolean z2;
        wy3 wy3Var;
        dn dnVar4;
        sk2 sk2Var;
        long j3;
        long j4 = rg5Var.j;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1211462661);
        if (sk2Var2.h(rg5Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if (sk2Var2.f(str)) {
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
            if (sk2Var2.f(str3)) {
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
        if (sk2Var2.O(i12 & 1, z)) {
            if (i11 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            Context context = (Context) sk2Var2.j(ue.b);
            if (str == null) {
                str6 = str5;
            } else {
                str6 = str;
            }
            s72 s72Var2 = o76.c;
            j20 j20Var2 = y60.L;
            tv3 d2 = d50.d(j20Var2, false);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, s72Var2);
            nu0.i.getClass();
            String str7 = str5;
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar5 = mu0.f;
            oo2.S(sk2Var2, dnVar5, d2);
            dn dnVar6 = mu0.e;
            oo2.S(sk2Var2, dnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar7 = mu0.g;
            oo2.S(sk2Var2, dnVar7, valueOf);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var2, ydVar2);
            dn dnVar8 = mu0.d;
            oo2.S(sk2Var2, dnVar8, e0);
            d50.a(dk7.h(s72Var2, f34.N(f34.M(rg5Var))), sk2Var2, 0);
            sn1 sn1Var = r01.a;
            if (str6 != null) {
                sk2Var2.X(397009350);
                j20Var = j20Var2;
                s72Var = s72Var2;
                dnVar = dnVar8;
                j2 = j4;
                dnVar3 = dnVar7;
                dnVar2 = dnVar6;
                i8 = i12;
                ydVar = ydVar2;
                cg2.b(str6, null, a53.n(s72Var2, 18.0f), sn1Var, 0.45f, sk2Var2, 14156208, 3896);
                sk2Var2.p(false);
            } else {
                j20Var = j20Var2;
                dnVar = dnVar8;
                s72Var = s72Var2;
                i8 = i12;
                j2 = j4;
                dnVar2 = dnVar6;
                ydVar = ydVar2;
                dnVar3 = dnVar7;
                sk2Var2.X(397288536);
                cg2.b(f34.O(context, rg5Var), null, a53.n(s72Var, 22.0f), sn1Var, 0.4f, sk2Var2, 14156208, 3896);
                sk2Var2.p(false);
            }
            long j5 = xq0.b;
            d50.a(dk7.h(s72Var, sn1.m(l07.c0(new xq0(xq0.b(0.72f, j5)), new xq0(xq0.b(0.35f, j5))))), sk2Var2, 6);
            i20 i20Var = y60.h0;
            zy3 Y = b53.Y(s72Var, 36.0f, 30.0f);
            lt ltVar = rt.a;
            sr5 a2 = rr5.a(ltVar, i20Var, sk2Var2, 48);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, Y);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, a2);
            oo2.S(sk2Var2, dnVar2, l3);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar, e02);
            wy3 wy3Var2 = wy3.a;
            zy3 t2 = a53.t(jk2.Q(l07.p(o76.k(wy3Var2, 150.0f), 1.117904f), 14.0f, gr5.b(12.0f), false, 0L, 28), gr5.b(12.0f));
            long j6 = xq0.d;
            s72 s72Var3 = s72Var;
            zy3 z3 = b53.z(1.0f, xq0.b(0.18f, j6), t2, gr5.b(12.0f));
            j20 j20Var3 = j20Var;
            tv3 d3 = d50.d(j20Var3, false);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            zy3 e03 = l07.e0(sk2Var2, z3);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, d3);
            oo2.S(sk2Var2, dnVar2, l4);
            b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar, e03);
            yd ydVar3 = ydVar;
            dn dnVar9 = dnVar;
            dn dnVar10 = dnVar3;
            f34.o(rg5Var, str, str7, s72Var3, hi2.B(44), null, false, null, sk2Var2, (i8 & 14) | 27648 | (i8 & 112) | (i8 & 896), 224);
            sk2 sk2Var3 = sk2Var2;
            sk2Var3.p(true);
            cg2.k(sk2Var3, o76.k(wy3Var2, 26.0f));
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var3, 0);
            int hashCode4 = Long.hashCode(sk2Var3.T);
            sm4 l5 = sk2Var3.l();
            zy3 e04 = l07.e0(sk2Var3, xg3Var);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar5, a3);
            oo2.S(sk2Var3, dnVar2, l5);
            b31.x(hashCode4, sk2Var3, dnVar10, sk2Var3, ydVar3);
            oo2.S(sk2Var3, dnVar9, e04);
            sr5 a4 = rr5.a(ltVar, i20Var, sk2Var3, 48);
            int hashCode5 = Long.hashCode(sk2Var3.T);
            sm4 l6 = sk2Var3.l();
            zy3 e05 = l07.e0(sk2Var3, wy3Var2);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar5, a4);
            oo2.S(sk2Var3, dnVar2, l6);
            b31.x(hashCode5, sk2Var3, dnVar10, sk2Var3, ydVar3);
            oo2.S(sk2Var3, dnVar9, e05);
            zy3 Y2 = b53.Y(dk7.i(a53.t(wy3Var2, gr5.b(5.0f)), xq0.b(0.14f, j6), iq2.g), 9.0f, 3.0f);
            tv3 d4 = d50.d(j20Var3, false);
            int hashCode6 = Long.hashCode(sk2Var3.T);
            sm4 l7 = sk2Var3.l();
            zy3 e06 = l07.e0(sk2Var3, Y2);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar5, d4);
            oo2.S(sk2Var3, dnVar2, l7);
            b31.x(hashCode6, sk2Var3, dnVar10, sk2Var3, ydVar3);
            oo2.S(sk2Var3, dnVar9, e06);
            String Q = f34.Q(rg5Var);
            ml2 ml2Var = td7.c;
            ir6.b(Q, null, j6, hi2.B(9), pe2.c0, ml2Var, hi2.A(0.6d), null, 0L, 0, false, 0, 0, null, null, sk2Var3, 14355840, 0, 130834);
            sk2Var3.p(true);
            if (rg5Var.k) {
                sk2Var3.X(-121365753);
                wy3Var = wy3Var2;
                z2 = false;
                dnVar4 = dnVar9;
                ev2.a(jk2.C(), null, o76.h(b53.b0(wy3Var, 9.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), 16.0f), mh7.d(4294955583L), sk2Var3, 3504, 0);
                sk2Var3 = sk2Var3;
                sk2Var3.p(false);
            } else {
                z2 = false;
                wy3Var = wy3Var2;
                dnVar4 = dnVar9;
                sk2Var3.X(-121071005);
                sk2Var3.p(false);
            }
            sk2Var3.p(true);
            String M = f34.M(rg5Var);
            sd2 sd2Var = td7.a;
            wy3 wy3Var3 = wy3Var;
            boolean z4 = z2;
            ir6.b(M, b53.b0(wy3Var, RecyclerView.A1, 10.0f, RecyclerView.A1, RecyclerView.A1, 13), j6, hi2.B(27), pe2.d0, sd2Var, 0L, null, hi2.B(31), 2, false, 3, 0, null, null, sk2Var3, 1772976, 3126, 119696);
            if (!zg6.B0(rg5Var.b)) {
                sk2Var3.X(676861774);
                sk2 sk2Var4 = sk2Var3;
                j3 = j6;
                ir6.b(rg5Var.b, b53.b0(wy3Var3, RecyclerView.A1, 6.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.65f, j6), hi2.B(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var4, 3504, 0, 131056);
                sk2Var = sk2Var4;
                sk2Var.p(z4);
            } else {
                sk2Var = sk2Var3;
                j3 = j6;
                sk2Var.X(677118919);
                sk2Var.p(z4);
            }
            long j7 = j2;
            if (!im1.d(j7, 0L)) {
                sk2Var.X(677207238);
                sk2 sk2Var5 = sk2Var;
                ir6.b(f34.B(j7), b53.b0(wy3Var3, RecyclerView.A1, 12.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.55f, j3), hi2.B(11), null, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var5, 1576368, 0, 130992);
                sk2Var2 = sk2Var5;
                sk2Var2.p(z4);
            } else {
                sk2Var2 = sk2Var;
                sk2Var2.X(677533575);
                sk2Var2.p(z4);
            }
            ot otVar = new ot(14.0f, true, new i(1));
            zy3 b0 = b53.b0(wy3Var3, RecyclerView.A1, 16.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a5 = rr5.a(otVar, y60.g0, sk2Var2, 6);
            int hashCode7 = Long.hashCode(sk2Var2.T);
            sm4 l8 = sk2Var2.l();
            zy3 e07 = l07.e0(sk2Var2, b0);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, a5);
            oo2.S(sk2Var2, dnVar2, l8);
            b31.x(hashCode7, sk2Var2, dnVar10, sk2Var2, ydVar3);
            oo2.S(sk2Var2, dnVar4, e07);
            d("A", me2.X(sk2Var2, R.string.external_hint_open), sk2Var2, 6);
            d("Y", me2.X(sk2Var2, R.string.external_hint_favorite), sk2Var2, 6);
            sk2Var2.p(true);
            sk2Var2.p(true);
            sk2Var2.p(true);
            sk2Var2.p(true);
            str4 = str7;
        } else {
            sk2Var2.R();
            str4 = str3;
        }
        m55 r2 = sk2Var2.r();
        if (r2 != null) {
            r2.d = new fl(rg5Var, str, str4, i2, i3, 10);
        }
    }

    public static final void g(long j2, tu0 tu0Var, int i2) {
        boolean z;
        boolean z2;
        float f2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-648156935);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            az2 s2 = nl2.s(nl2.P("externalBootDots", sk2Var, 0), RecyclerView.A1, 3.0f, ct3.t0(ct3.V0(1050, 0, cn1.c, 2), null, 6), "externalBootDotsPhase", sk2Var, 29112, 0);
            wy3 wy3Var = wy3.a;
            zy3 b0 = b53.b0(wy3Var, 9.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
            sr5 a2 = rr5.a(rt.a, y60.g0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, b0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            sk2Var.X(-1928006220);
            for (int i3 = 0; i3 < 3; i3++) {
                if (((int) ((Number) s2.R.getValue()).floatValue()) % 3 == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zy3 t2 = a53.t(o76.h(b53.Z(wy3Var, 3.0f, RecyclerView.A1, 2), 5.0f), gr5.a);
                if (z2) {
                    f2 = 0.95f;
                } else {
                    f2 = 0.28f;
                }
                d50.a(dk7.i(t2, xq0.b(f2, j2), iq2.g), sk2Var, 0);
            }
            sk2Var.p(false);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new rl1(j2, i2, 1);
        }
    }

    public static final void h(String str, List list, String str2, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        long b2;
        dn dnVar;
        ft5 ft5Var;
        j20 j20Var;
        yd ydVar;
        dn dnVar2;
        mv0 mv0Var;
        h20 h20Var;
        boolean z2;
        dn dnVar3;
        String valueOf;
        is2 is2Var = iq2.g;
        h20 h20Var2 = y60.j0;
        list.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-526984713);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (sk2Var.h(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.f(str2)) {
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
        if (sk2Var.O(i8 & 1, z)) {
            zy3 Y = b53.Y(dk7.i(o76.c, mh7.d(4061270294L), is2Var), 30.0f, 24.0f);
            mt mtVar = rt.c;
            lr0 a2 = jr0.a(mtVar, h20Var2, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var2 = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            dn dnVar4 = mu0.f;
            oo2.S(sk2Var, dnVar4, a2);
            dn dnVar5 = mu0.e;
            oo2.S(sk2Var, dnVar5, l2);
            Integer valueOf2 = Integer.valueOf(hashCode);
            dn dnVar6 = mu0.g;
            oo2.S(sk2Var, dnVar6, valueOf2);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var, ydVar2);
            dn dnVar7 = mu0.d;
            oo2.S(sk2Var, dnVar7, e0);
            boolean z3 = true;
            mt mtVar2 = mtVar;
            h20 h20Var3 = h20Var2;
            is2 is2Var2 = is2Var;
            ir6.b(str, null, xq0.d, hi2.B(19), pe2.d0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, (i8 & 14) | 1772928, 0, 130962);
            sk2 sk2Var2 = sk2Var;
            ot otVar = new ot(12.0f, true, new i(1));
            wy3 wy3Var = wy3.a;
            zy3 b0 = b53.b0(wy3Var, RecyclerView.A1, 16.0f, RecyclerView.A1, RecyclerView.A1, 13);
            wy3 wy3Var2 = wy3Var;
            sr5 a3 = rr5.a(otVar, y60.g0, sk2Var2, 6);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, b0);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var2);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar4, a3);
            oo2.S(sk2Var2, dnVar5, l3);
            b31.x(hashCode2, sk2Var2, dnVar6, sk2Var2, ydVar2);
            oo2.S(sk2Var2, dnVar7, e02);
            sk2Var2.X(-1431976155);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ft5) obj).b) {
                    arrayList.add(obj);
                }
            }
            List h1 = tq0.h1(4, arrayList);
            if (h1.isEmpty()) {
                h1 = tq0.h1(4, list);
            }
            Iterator it = h1.iterator();
            while (it.hasNext()) {
                ft5 ft5Var2 = (ft5) it.next();
                xg3 xg3Var = new xg3(1.0f, z3);
                h20 h20Var4 = h20Var3;
                mt mtVar3 = mtVar2;
                lr0 a4 = jr0.a(mtVar3, h20Var4, sk2Var2, 0);
                int hashCode3 = Long.hashCode(sk2Var2.T);
                sm4 l4 = sk2Var2.l();
                zy3 e03 = l07.e0(sk2Var2, xg3Var);
                nu0.i.getClass();
                mv0 mv0Var3 = mu0.b;
                sk2Var2.b0();
                if (sk2Var2.S) {
                    sk2Var2.k(mv0Var3);
                } else {
                    sk2Var2.k0();
                }
                dn dnVar8 = mu0.f;
                oo2.S(sk2Var2, dnVar8, a4);
                dn dnVar9 = mu0.e;
                oo2.S(sk2Var2, dnVar9, l4);
                Integer valueOf3 = Integer.valueOf(hashCode3);
                dn dnVar10 = mu0.g;
                oo2.S(sk2Var2, dnVar10, valueOf3);
                yd ydVar3 = mu0.h;
                oo2.P(sk2Var2, ydVar3);
                dn dnVar11 = mu0.d;
                oo2.S(sk2Var2, dnVar11, e03);
                zy3 t2 = a53.t(l07.p(o76.c(wy3Var2, 1.0f), 1.3333334f), gr5.b(9.0f));
                long j2 = xq0.d;
                Iterator it2 = it;
                is2 is2Var3 = is2Var2;
                zy3 i9 = dk7.i(t2, xq0.b(0.06f, j2), is2Var3);
                int i10 = ft5Var2.a;
                boolean z4 = ft5Var2.b;
                if (i10 == 0 && z4) {
                    b2 = mh7.d(4294198070L);
                } else {
                    b2 = xq0.b(0.12f, j2);
                }
                zy3 z5 = b53.z(2.0f, b2, i9, gr5.b(9.0f));
                j20 j20Var2 = y60.L;
                tv3 d2 = d50.d(j20Var2, false);
                int hashCode4 = Long.hashCode(sk2Var2.T);
                sm4 l5 = sk2Var2.l();
                zy3 e04 = l07.e0(sk2Var2, z5);
                sk2Var2.b0();
                if (sk2Var2.S) {
                    sk2Var2.k(mv0Var3);
                } else {
                    sk2Var2.k0();
                }
                oo2.S(sk2Var2, dnVar8, d2);
                oo2.S(sk2Var2, dnVar9, l5);
                b31.x(hashCode4, sk2Var2, dnVar10, sk2Var2, ydVar3);
                oo2.S(sk2Var2, dnVar11, e04);
                y60 y60Var = y60.n0;
                if (z4 && ft5Var2.d != null) {
                    sk2Var2.X(1644772984);
                    ydVar = ydVar3;
                    dnVar = dnVar11;
                    j20Var = j20Var2;
                    mv0Var = mv0Var3;
                    h20Var = h20Var4;
                    dnVar3 = dnVar9;
                    dnVar2 = dnVar10;
                    ft5Var = ft5Var2;
                    z2 = false;
                    cg2.b(ft5Var2.d, null, o76.c, r01.a, RecyclerView.A1, sk2Var2, 1573296, 4024);
                    sk2Var2.p(false);
                } else {
                    dnVar = dnVar11;
                    ft5Var = ft5Var2;
                    j20Var = j20Var2;
                    ydVar = ydVar3;
                    dnVar2 = dnVar10;
                    mv0Var = mv0Var3;
                    h20Var = h20Var4;
                    z2 = false;
                    dnVar3 = dnVar9;
                    sk2Var2.X(1645077466);
                    sk2Var2.p(false);
                }
                zy3 Y2 = b53.Y(dk7.i(a53.t(b53.b0(y60Var.i(wy3Var2, j20Var), 7.0f, 6.0f, RecyclerView.A1, RecyclerView.A1, 12), gr5.b(4.0f)), xq0.b(0.45f, xq0.b), is2Var3), 6.0f, 2.0f);
                tv3 d3 = d50.d(j20Var, z2);
                int hashCode5 = Long.hashCode(sk2Var2.T);
                sm4 l6 = sk2Var2.l();
                zy3 e05 = l07.e0(sk2Var2, Y2);
                sk2Var2.b0();
                if (sk2Var2.S) {
                    sk2Var2.k(mv0Var);
                } else {
                    sk2Var2.k0();
                }
                oo2.S(sk2Var2, dnVar8, d3);
                oo2.S(sk2Var2, dnVar3, l6);
                b31.x(hashCode5, sk2Var2, dnVar2, sk2Var2, ydVar);
                oo2.S(sk2Var2, dnVar, e05);
                ft5 ft5Var3 = ft5Var;
                int i11 = ft5Var3.a;
                if (i11 == 0) {
                    valueOf = "Q";
                } else {
                    valueOf = String.valueOf(i11);
                }
                ml2 ml2Var = td7.c;
                sk2 sk2Var3 = sk2Var2;
                wy3 wy3Var3 = wy3Var2;
                is2Var2 = is2Var3;
                h20 h20Var5 = h20Var;
                ir6.b(valueOf, null, j2, hi2.A(8.5d), pe2.c0, ml2Var, 0L, null, hi2.B(9), 0, false, 0, 0, null, null, sk2Var3, 1772928, 6, 129938);
                sk2Var3.p(true);
                sk2Var3.p(true);
                Date date = ft5Var3.c;
                ir6.b((date == null || (r0 = DateUtils.getRelativeTimeSpanString(date.getTime()).toString()) == null) ? "—" : "—", b53.b0(o76.c(wy3Var3, 1.0f), RecyclerView.A1, 6.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.5f, j2), hi2.A(9.5d), null, ml2Var, 0L, new kn6(3), 0L, 2, false, 1, 0, null, null, sk2Var3, 1576368, 3120, 120240);
                sk2Var2 = sk2Var3;
                sk2Var2.p(true);
                wy3Var2 = wy3Var3;
                z3 = true;
                it = it2;
                mtVar2 = mtVar3;
                h20Var3 = h20Var5;
            }
            boolean z6 = z3;
            sk2Var2.p(false);
            sk2Var2.p(z6);
            cg2.k(sk2Var2, new xg3(1.0f, z6));
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sk2 sk2Var4 = sk2Var2;
            ir6.b(upperCase, b53.b0(o76.c(wy3Var2, 1.0f), RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 4.0f, 7), xq0.b(0.4f, xq0.d), hi2.A(9.5d), null, td7.c, hi2.A(0.5d), new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var4, 14159280, 0, 130352);
            sk2Var = sk2Var4;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w3(str, list, str2, i2, 13);
        }
    }

    public static final void i(Drawable drawable, String str, String str2, String str3, tu0 tu0Var, int i2) {
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
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-618377427);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(drawable)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if (sk2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i3 | i4;
        if (sk2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (sk2Var.f(str3)) {
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
        if (sk2Var.O(i10 & 1, z)) {
            h20 h20Var = y60.k0;
            zy3 Y = b53.Y(o76.c, 60.0f, 30.0f);
            lr0 a2 = jr0.a(rt.d, h20Var, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            wy3 wy3Var = wy3.a;
            if (drawable != null) {
                sk2Var.X(-39418720);
                boolean f2 = sk2Var.f(drawable);
                Object L = sk2Var.L();
                if (!f2 && L != su0.a) {
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
                            i.i("bitmap is null");
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
                    L = new y20(new nh(bitmap));
                    sk2Var.h0(L);
                }
                ev2.b((y20) L, null, o76.h(wy3Var, 46.0f), mh7.d(j3), sk2Var, 3512, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(-38961935);
                ev2.a(mj2.A(), null, o76.h(wy3Var, 46.0f), mh7.d(4285513546L), sk2Var, 3504, 0);
                sk2Var.p(false);
            }
            long j4 = xq0.d;
            ir6.b(str, b53.b0(wy3Var, RecyclerView.A1, 14.0f, RecyclerView.A1, RecyclerView.A1, 13), j4, hi2.B(23), pe2.d0, td7.a, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, ((i10 >> 3) & 14) | 1772976, 0, 130448);
            sk2 sk2Var2 = sk2Var;
            if (str2 == null || zg6.B0(str2)) {
                j2 = j4;
                sk2Var2.X(-37992193);
                sk2Var2.p(false);
            } else {
                sk2Var2.X(-38367293);
                j2 = j4;
                ir6.b(str2, o76.k(b53.b0(wy3Var, RecyclerView.A1, 9.0f, RecyclerView.A1, RecyclerView.A1, 13), 420.0f), xq0.b(0.6f, j4), hi2.A(13.5d), null, null, 0L, new kn6(3), hi2.B(20), 2, false, 5, 0, null, null, sk2Var2, ((i10 >> 6) & 14) | 3504, 3126, 119280);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            }
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sk2 sk2Var3 = sk2Var2;
            ir6.b(upperCase, b53.b0(wy3Var, RecyclerView.A1, 16.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.35f, j2), hi2.A(9.5d), null, td7.c, hi2.A(0.6d), null, 0L, 0, false, 0, 0, null, null, sk2Var3, 14159280, 0, 130864);
            sk2Var = sk2Var3;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new rz(drawable, str, str2, str3, i2, 3);
        }
    }

    public static final ExecutorService j(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new jw0(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static void k(Throwable th, Throwable th2) {
        boolean z;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = s53.a;
            if (num != null && num.intValue() < 19) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = io4.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final int l(int i2, int i3, int[] iArr) {
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

    public static final int m(long[] jArr, int i2, long j2) {
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

    public static final zy3 n(zy3 zy3Var, o50 o50Var) {
        return zy3Var.f(new m50(o50Var));
    }

    public static final long o(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static byte[] p(pe1[] pe1VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (pe1 pe1Var : pe1VarArr) {
            i3 += ((((pe1Var.g * 2) + 7) & (-8)) / 8) + (pe1Var.e * 2) + s(pe1Var.a, pe1Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + pe1Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, n40.o)) {
            int length = pe1VarArr.length;
            while (i2 < length) {
                pe1 pe1Var2 = pe1VarArr[i2];
                S(byteArrayOutputStream, pe1Var2, s(pe1Var2.a, pe1Var2.b, bArr));
                R(byteArrayOutputStream, pe1Var2);
                i2++;
            }
        } else {
            for (pe1 pe1Var3 : pe1VarArr) {
                S(byteArrayOutputStream, pe1Var3, s(pe1Var3.a, pe1Var3.b, bArr));
            }
            int length2 = pe1VarArr.length;
            while (i2 < length2) {
                R(byteArrayOutputStream, pe1VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final ArrayList q(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dd1 dd1Var = (dd1) it.next();
            if (dd1Var.b) {
                obj = null;
            } else {
                obj = dd1Var.a;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final e31 r(e31 e31Var, e31 e31Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) e31Var.N(new qt0(7), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) e31Var2.N(new qt0(7), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return e31Var.C(e31Var2);
        }
        qt0 qt0Var = new qt0(8);
        mp1 mp1Var = mp1.A;
        e31 e31Var3 = (e31) e31Var.N(qt0Var, mp1Var);
        e31 e31Var4 = e31Var2;
        if (booleanValue2) {
            e31Var4 = e31Var2.N(new qt0(9), mp1Var);
        }
        return e31Var3.C(e31Var4);
    }

    public static String s(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = n40.p;
        byte[] bArr3 = n40.q;
        String str3 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    return b31.q(wh1.r(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : ":", str2);
                }
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static final ax2 t() {
        ax2 ax2Var = w;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new rk4(9.0f, 16.17f));
        arrayList.add(new qk4(4.83f, 12.0f));
        arrayList.add(new yk4(-1.42f, 1.41f));
        arrayList.add(new qk4(9.0f, 19.0f));
        arrayList.add(new qk4(21.0f, 7.0f));
        arrayList.add(new yk4(-1.41f, -1.41f));
        arrayList.add(nk4.c);
        zw2.a(zw2Var, arrayList, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        w = b2;
        return b2;
    }

    public static int u(int i2, boolean z, int i3) {
        int i4;
        if (z) {
            i4 = ((i3 - i2) + 360) % 360;
        } else {
            i4 = (i3 + i2) % 360;
        }
        if (ve2.G(2, ve2.a0("CameraOrientationUtil"))) {
            StringBuilder s2 = b31.s(i2, i3, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            s2.append(z);
            s2.append(", result=");
            s2.append(i4);
            ve2.v("CameraOrientationUtil", s2.toString());
        }
        return i4;
    }

    public static final f91 v(tu0 tu0Var) {
        mh4 mh4Var = e70.a;
        ye6 ye6Var = ir0.a;
        sk2 sk2Var = (sk2) tu0Var;
        long i2 = ((hr0) sk2Var.j(ye6Var)).i();
        long e2 = ((hr0) sk2Var.j(ye6Var)).e();
        if (true & true) {
            i2 = ((hr0) ((sk2) tu0Var).j(ir0.a)).g();
        }
        long j2 = i2;
        if (true & true) {
            e2 = ir0.b(j2, tu0Var);
        }
        long j3 = e2;
        ye6 ye6Var2 = ir0.a;
        sk2 sk2Var2 = (sk2) tu0Var;
        long r2 = mh7.r(xq0.b(0.12f, ((hr0) sk2Var2.j(ye6Var2)).f()), ((hr0) sk2Var2.j(ye6Var2)).j());
        sk2 sk2Var3 = (sk2) tu0Var;
        long f2 = ((hr0) sk2Var3.j(ye6Var2)).f();
        long j4 = ((xq0) sk2Var3.j(e01.a)).a;
        if (((hr0) sk2Var3.j(ye6Var2)).k()) {
            mh7.V(j4);
        } else {
            mh7.V(j4);
        }
        return new f91(j2, j3, r2, xq0.b(0.38f, f2));
    }

    public static final yb1 w(tu0 tu0Var) {
        float f2;
        float f3;
        ye6 ye6Var = ir0.a;
        sk2 sk2Var = (sk2) tu0Var;
        long i2 = ((hr0) sk2Var.j(ye6Var)).i();
        long c2 = ((hr0) sk2Var.j(ye6Var)).c();
        long b2 = xq0.b(iq2.o(tu0Var), ((hr0) sk2Var.j(ye6Var)).i());
        long b3 = xq0.b(iq2.o(tu0Var), ((hr0) sk2Var.j(ye6Var)).i());
        long b4 = xq0.b(iq2.o(tu0Var), ((hr0) sk2Var.j(ye6Var)).i());
        tv0 tv0Var = e01.a;
        long b5 = xq0.b(((Number) sk2Var.j(b01.a)).floatValue(), ((xq0) sk2Var.j(tv0Var)).a);
        long j2 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j2);
        } else {
            mh7.V(j2);
        }
        long b6 = xq0.b(0.38f, b5);
        long j3 = xq0.g;
        long b7 = ((hr0) sk2Var.j(ye6Var)).b();
        long j4 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j4);
        } else {
            mh7.V(j4);
        }
        long b8 = xq0.b(0.38f, c2);
        long b9 = ((hr0) sk2Var.j(ye6Var)).b();
        long b10 = xq0.b(0.54f, ((hr0) sk2Var.j(ye6Var)).f());
        long j5 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j5);
        } else {
            mh7.V(j5);
        }
        long b11 = xq0.b(0.38f, b10);
        long b12 = xq0.b(0.54f, ((hr0) sk2Var.j(ye6Var)).f());
        long j6 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j6);
        } else {
            mh7.V(j6);
        }
        long b13 = xq0.b(0.38f, b12);
        long b14 = ((hr0) sk2Var.j(ye6Var)).b();
        long f4 = ((hr0) sk2Var.j(ye6Var)).f();
        long j7 = ((xq0) sk2Var.j(tv0Var)).a;
        if (!((hr0) sk2Var.j(ye6Var)).k() ? mh7.V(j7) < 0.5d : mh7.V(j7) > 0.5d) {
            f2 = 0.74f;
        } else {
            f2 = 0.6f;
        }
        long b15 = xq0.b(f2, f4);
        long j8 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j8);
        } else {
            mh7.V(j8);
        }
        long b16 = xq0.b(0.38f, b15);
        long b17 = ((hr0) sk2Var.j(ye6Var)).b();
        long f5 = ((hr0) sk2Var.j(ye6Var)).f();
        long j9 = ((xq0) sk2Var.j(tv0Var)).a;
        if (!((hr0) sk2Var.j(ye6Var)).k() ? mh7.V(j9) < 0.5d : mh7.V(j9) > 0.5d) {
            f3 = 0.74f;
        } else {
            f3 = 0.6f;
        }
        long b18 = xq0.b(f3, f5);
        long j10 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j10);
        } else {
            mh7.V(j10);
        }
        return new yb1(b5, b6, i2, b7, b2, c2, b9, b8, b10, b11, b10, b12, b4, b13, b14, j3, b3, b15, b16, b17, b18, xq0.b(0.38f, b18));
    }

    public static final f91 x(tu0 tu0Var) {
        mh4 mh4Var = e70.a;
        return e70.a(((hr0) ((sk2) tu0Var).j(ir0.a)).i(), tu0Var, 5);
    }

    public static final e31 y(o31 o31Var, e31 e31Var) {
        e31 r2 = r(o31Var.w(), e31Var, true);
        bb1 bb1Var = tg1.a;
        if (r2 != bb1Var && r2.I(k45.Y) == null) {
            return r2.C(bb1Var);
        }
        return r2;
    }

    public static final byte[] z(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
