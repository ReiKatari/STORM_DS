package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb3  reason: default package */
/* loaded from: classes.dex */
public abstract class nb3 {
    public static final wo a = new wo(Float.POSITIVE_INFINITY);
    public static final xo b = new xo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final yo c = new yo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final zo d = new zo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final wo e = new wo(Float.NEGATIVE_INFINITY);
    public static final xo f = new xo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final yo g = new yo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final zo h = new zo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final Object[] i = new Object[0];
    public static final zv0 j = new zv0(-544900339, false, new fn0(23));
    public static final Object k = new Object();
    public static final p33 l = new p33(false);
    public static final int[] m = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] n = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] o = {3, 6};
    public static final int[] p = {1, 2, 4, 5, 7, 8};
    public static final int[] q = {13, 15, 14};
    public static final byte[] r = {112, 114, 111, 0};
    public static final byte[] s = {112, 114, 109, 0};
    public static final sj t = new sj(1022);
    public static e33 u;
    public static e33 v;
    public static final /* synthetic */ int w = 0;

    public static final void A(l61 l61Var, Throwable th) {
        Throwable runtimeException;
        for (o61 o61Var : p61.a) {
            try {
                o61Var.u(l61Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    mb3.q(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            mb3.q(th, new vi1(l61Var));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean B(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean C() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        if ("HWANE".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean D() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        if (!"B2N".equalsIgnoreCase(str3) && !"B2N_sprout".equalsIgnoreCase(str3)) {
            return false;
        }
        return true;
    }

    public static boolean E() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        if ("OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean F() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        if ("OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean G() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        if ("joyeuse".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
        }
        if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
            String str3 = Build.MODEL;
            str3.getClass();
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (qs6.j0(upperCase, "SM-A057", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean I() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if ("J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean J() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if ("ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean K() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        if (!"q4q".equalsIgnoreCase(str3) && !"SCG16".equalsIgnoreCase(str3) && !"SC-55C".equalsIgnoreCase(str3)) {
            return false;
        }
        return true;
    }

    public static final yc1 L(CharSequence charSequence, String str, int i2, qn2 qn2Var) {
        char charAt = charSequence.charAt(i2);
        if (((Boolean) qn2Var.g(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return M(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i2);
    }

    public static final yc1 M(CharSequence charSequence, String str) {
        StringBuilder r2 = i61.r(str, " when parsing an Instant from \"");
        r2.append(e0(64, charSequence));
        r2.append('\"');
        return new yc1(charSequence, r2.toString());
    }

    public static final int N(int i2, CharSequence charSequence) {
        return (charSequence.charAt(i2 + 1) - '0') + ((charSequence.charAt(i2) - '0') * 10);
    }

    public static int[] O(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) nw7.m0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static ti1[] P(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, ti1[] ti1VarArr) {
        byte[] bArr3 = f04.C;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f04.x, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m0 = (int) nw7.m0(fileInputStream, 1);
                    byte[] l0 = nw7.l0(fileInputStream, (int) nw7.m0(fileInputStream, 4), (int) nw7.m0(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(l0);
                        try {
                            ti1[] Q = Q(byteArrayInputStream, m0, ti1VarArr);
                            byteArrayInputStream.close();
                            return Q;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    i.m("Content found after the end of file");
                    return null;
                }
                i.m("Unsupported meta version");
                return null;
            }
            i.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, f04.D)) {
            int m02 = (int) nw7.m0(fileInputStream, 2);
            byte[] l02 = nw7.l0(fileInputStream, (int) nw7.m0(fileInputStream, 4), (int) nw7.m0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(l02);
                try {
                    ti1[] R = R(byteArrayInputStream2, bArr2, m02, ti1VarArr);
                    byteArrayInputStream2.close();
                    return R;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            i.m("Content found after the end of file");
            return null;
        } else {
            i.m("Unsupported meta version");
            return null;
        }
    }

    public static ti1[] Q(ByteArrayInputStream byteArrayInputStream, int i2, ti1[] ti1VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new ti1[0];
        }
        if (i2 == ti1VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = (int) nw7.m0(byteArrayInputStream, 2);
                strArr[i3] = new String(nw7.k0(byteArrayInputStream, (int) nw7.m0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                ti1 ti1Var = ti1VarArr[i4];
                if (ti1Var.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    ti1Var.e = i5;
                    ti1Var.h = O(byteArrayInputStream, i5);
                } else {
                    i.m("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return ti1VarArr;
        }
        i.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static ti1[] R(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, ti1[] ti1VarArr) {
        String str;
        ti1 ti1Var;
        if (byteArrayInputStream.available() == 0) {
            return new ti1[0];
        }
        if (i2 == ti1VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                nw7.m0(byteArrayInputStream, 2);
                String str2 = new String(nw7.k0(byteArrayInputStream, (int) nw7.m0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m0 = nw7.m0(byteArrayInputStream, 4);
                int m02 = (int) nw7.m0(byteArrayInputStream, 2);
                if (ti1VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < ti1VarArr.length; i4++) {
                        if (ti1VarArr[i4].b.equals(str)) {
                            ti1Var = ti1VarArr[i4];
                            break;
                        }
                    }
                }
                ti1Var = null;
                if (ti1Var != null) {
                    ti1Var.d = m0;
                    int[] O = O(byteArrayInputStream, m02);
                    if (Arrays.equals(bArr, f04.B)) {
                        ti1Var.e = m02;
                        ti1Var.h = O;
                    }
                } else {
                    i.m("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return ti1VarArr;
        }
        i.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static ti1[] S(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f04.y)) {
            int m0 = (int) nw7.m0(fileInputStream, 1);
            byte[] l0 = nw7.l0(fileInputStream, (int) nw7.m0(fileInputStream, 4), (int) nw7.m0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(l0);
                try {
                    ti1[] T = T(byteArrayInputStream, str, m0);
                    byteArrayInputStream.close();
                    return T;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i.m("Content found after the end of file");
            return null;
        }
        i.m("Unsupported version");
        return null;
    }

    public static ti1[] T(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new ti1[0];
        }
        ti1[] ti1VarArr = new ti1[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int m0 = (int) nw7.m0(byteArrayInputStream, 2);
            ti1VarArr[i5] = new ti1(str, new String(nw7.k0(byteArrayInputStream, (int) nw7.m0(byteArrayInputStream, 2)), StandardCharsets.UTF_8), nw7.m0(byteArrayInputStream, 4), m0, (int) nw7.m0(byteArrayInputStream, 4), (int) nw7.m0(byteArrayInputStream, 4), new int[m0], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            ti1 ti1Var = ti1VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = ti1Var.f;
            int i8 = ti1Var.g;
            TreeMap treeMap = ti1Var.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) nw7.m0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int m02 = (int) nw7.m0(byteArrayInputStream, 2);
                while (m02 > 0) {
                    nw7.m0(byteArrayInputStream, 2);
                    int m03 = (int) nw7.m0(byteArrayInputStream, 1);
                    if (m03 != 6 && m03 != 7) {
                        while (m03 > 0) {
                            nw7.m0(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int m04 = (int) nw7.m0(byteArrayInputStream, 1); m04 > 0; m04--) {
                                nw7.m0(byteArrayInputStream, 2);
                            }
                            m03--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    m02--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                ti1Var.h = O(byteArrayInputStream, ti1Var.e);
                BitSet valueOf = BitSet.valueOf(nw7.k0(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
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
                i.m("Read too much data during profile line parse");
                return null;
            }
        }
        return ti1VarArr;
    }

    public static final s76 U(px0 px0Var) {
        Object[] objArr = new Object[0];
        boolean d2 = ((xq2) px0Var).d(0);
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (d2 || P == ox0.a) {
            P = new kt5(6);
            xq2Var.l0(P);
        }
        return (s76) qo2.J(objArr, s76.j, (on2) P, xq2Var, 0);
    }

    public static void V(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static a74 W(a74 a74Var, s76 s76Var, boolean z) {
        lo4 lo4Var;
        a74 g2;
        if (z) {
            lo4Var = lo4.Vertical;
        } else {
            lo4Var = lo4.Horizontal;
        }
        lo4 lo4Var2 = lo4Var;
        r94 r94Var = s76Var.d;
        lo4 lo4Var3 = lo4.Vertical;
        x64 x64Var = x64.a;
        if (lo4Var2 == lo4Var3) {
            g2 = u24.g(x64Var, jy2.c);
        } else {
            g2 = u24.g(x64Var, jy2.b);
        }
        return a74Var.d(g2).d(new t76(null, null, null, r94Var, lo4Var2, s76Var, true, true)).d(new g86(s76Var, z));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [dh5, java.lang.Object] */
    public static final Object X(vh2 vh2Var, int i2, qn2 qn2Var) {
        int i3;
        int i4;
        Object obj;
        vh2 vh2Var2;
        sp3 V0;
        int e2;
        if0 if0Var;
        if (!vh2Var.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = vh2Var.A.X;
        sm3 f0 = nc1.f0(vh2Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (f0 != null) {
                if ((((z64) f0.B0.g).R & 1024) != 0) {
                    while (z64Var != null) {
                        if ((z64Var.L & 1024) != 0) {
                            vh2Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (vh2Var2 != null) {
                                if (vh2Var2 instanceof vh2) {
                                    break loop0;
                                }
                                if ((vh2Var2.L & 1024) != 0 && (vh2Var2 instanceof zg1)) {
                                    int i5 = 0;
                                    for (z64 z64Var2 = ((zg1) vh2Var2).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                        if ((z64Var2.L & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                vh2Var2 = z64Var2;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (vh2Var2 != null) {
                                                    ua4Var.b(vh2Var2);
                                                    vh2Var2 = null;
                                                }
                                                ua4Var.b(z64Var2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                vh2Var2 = nc1.A(ua4Var);
                            }
                            continue;
                        }
                        z64Var = z64Var.X;
                    }
                }
                f0 = f0.v();
                if (f0 != null && (if0Var = f0.B0) != null) {
                    z64Var = (vy6) if0Var.f;
                } else {
                    z64Var = null;
                }
            } else {
                vh2Var2 = null;
                break;
            }
        }
        vh2 vh2Var3 = vh2Var2;
        if ((vh2Var3 == null || !k(vh2Var3.V0(), vh2Var.V0())) && (V0 = vh2Var.V0()) != null) {
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
                                i.m("Unsupported direction for beyond bounds layout");
                            }
                            if (V0.k0.a() <= 0 && V0.k0.d() && V0.j0) {
                                boolean S0 = V0.S0(i4);
                                tp3 tp3Var = V0.k0;
                                if (S0) {
                                    e2 = tp3Var.b();
                                } else {
                                    e2 = tp3Var.e();
                                }
                                ?? obj2 = new Object();
                                p70 p70Var = V0.l0;
                                p70Var.getClass();
                                np3 np3Var = new np3(e2, e2);
                                p70Var.a.b(np3Var);
                                obj2.A = np3Var;
                                int c2 = V0.k0.c() * 2;
                                int a2 = V0.k0.a();
                                if (c2 > a2) {
                                    c2 = a2;
                                }
                                while (obj == null && V0.R0((np3) obj2.A, i4) && i3 < c2) {
                                    np3 np3Var2 = (np3) obj2.A;
                                    int i7 = np3Var2.a;
                                    int i8 = np3Var2.b;
                                    if (V0.S0(i4)) {
                                        i8++;
                                    } else {
                                        i7--;
                                    }
                                    p70 p70Var2 = V0.l0;
                                    p70Var2.getClass();
                                    np3 np3Var3 = new np3(i7, i8);
                                    p70Var2.a.b(np3Var3);
                                    V0.l0.a.j((np3) obj2.A);
                                    obj2.A = np3Var3;
                                    i3++;
                                    nc1.f0(V0).k();
                                    obj = qn2Var.g(new rp3(V0, obj2, i4));
                                }
                                V0.l0.a.j((np3) obj2.A);
                                nc1.f0(V0).k();
                                return obj;
                            }
                            return qn2Var.g(sp3.n0);
                        }
                    }
                }
            }
            i4 = i6;
            if (V0.k0.a() <= 0) {
            }
            return qn2Var.g(sp3.n0);
        }
        return null;
    }

    public static void Y(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 24);
        bArr[i2 + 1] = (byte) (i3 >>> 16);
        bArr[i2 + 2] = (byte) (i3 >>> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static int Z(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return 270;
                    }
                    i.h(lb1.g(i2, "Unsupported surface rotation: "));
                    return 0;
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static final void a(final on2 on2Var, final zv0 zv0Var, a74 a74Var, final eo2 eo2Var, final eo2 eo2Var2, final ke6 ke6Var, final long j2, long j3, jj1 jj1Var, px0 px0Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var;
        a74 a74Var2;
        final long j4;
        final jj1 jj1Var2;
        long b2;
        x64 x64Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1409209698);
        int i5 = i2 | RendererDebugBridge.CAPTURE_HEIGHT;
        if (xq2Var2.f(ke6Var)) {
            i3 = 131072;
        } else {
            i3 = 65536;
        }
        int i6 = i5 | i3;
        if (xq2Var2.e(j2)) {
            i4 = 1048576;
        } else {
            i4 = 524288;
        }
        int i7 = i6 | i4 | 104857600;
        if ((38347923 & i7) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i7 & 1, z)) {
            xq2Var2.X();
            if ((i2 & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
                x64Var = a74Var;
                b2 = j3;
                jj1Var2 = jj1Var;
            } else {
                b2 = vt0.b(j2, xq2Var2);
                jj1Var2 = new jj1(7, false, false);
                x64Var = x64.a;
            }
            xq2Var2.q();
            a74Var2 = x64Var;
            xq2Var = xq2Var2;
            nw7.o(on2Var, jj1Var2, n16.I(-488319269, new gc(zv0Var, x64Var, eo2Var, eo2Var2, ke6Var, j2, b2), xq2Var2), xq2Var, 438, 0);
            j4 = b2;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            a74Var2 = a74Var;
            j4 = j3;
            jj1Var2 = jj1Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            final a74 a74Var3 = a74Var2;
            t2.d = new eo2(zv0Var, a74Var3, eo2Var, eo2Var2, ke6Var, j2, j4, jj1Var2, i2) { // from class: jd
                public final /* synthetic */ zv0 B;
                public final /* synthetic */ a74 L;
                public final /* synthetic */ eo2 R;
                public final /* synthetic */ eo2 X;
                public final /* synthetic */ ke6 Y;
                public final /* synthetic */ long Z;
                public final /* synthetic */ long d0;
                public final /* synthetic */ jj1 e0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(27703);
                    nb3.a(on2.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static void a0(String str) {
        RuntimeException runtimeException = new RuntimeException(lb1.A("lateinit property ", str, " has not been initialized"));
        V(runtimeException, nb3.class.getName());
        throw runtimeException;
    }

    public static gn b(float f2) {
        return new gn(Float.valueOf(f2), nw7.e0, Float.valueOf(0.01f), 8);
    }

    public static final Object[] b0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = i;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static v80 c(int i2, m80 m80Var, qn2 qn2Var, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            m80Var = m80.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            qn2Var = null;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        if (m80Var == m80.SUSPEND) {
                            return new v80(i2, qn2Var);
                        }
                        return new hz0(i2, m80Var, qn2Var);
                    }
                    return new v80(Integer.MAX_VALUE, qn2Var);
                } else if (m80Var == m80.SUSPEND) {
                    return new v80(0, qn2Var);
                } else {
                    return new hz0(1, m80Var, qn2Var);
                }
            } else if (m80Var == m80.SUSPEND) {
                return new hz0(1, m80.DROP_OLDEST, qn2Var);
            } else {
                i.h("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (m80Var == m80.SUSPEND) {
            ul0.h.getClass();
            return new v80(tl0.b, qn2Var);
        } else {
            return new hz0(1, m80Var, qn2Var);
        }
    }

    public static final Object[] c0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final a74 a74Var, final lq4 lq4Var, final List list, final qn2 qn2Var, final eo2 eo2Var, lq4 lq4Var2, px0 px0Var, final int i2, final int i3) {
        int i4;
        lq4 lq4Var3;
        int i5;
        boolean z;
        xq2 xq2Var;
        final lq4 lq4Var4;
        cf5 t2;
        lq4 lq4Var5;
        pr3 pr3Var;
        vs0 vs0Var;
        boolean z2;
        int i6;
        xq2 xq2Var2;
        boolean z3;
        boolean z4;
        int i7;
        lq4 lq4Var6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(1764478774);
        if ((i2 & 6) == 0) {
            if (xq2Var3.f(a74Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var3.f(lq4Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var3.h(list)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var3.h(qn2Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var3.h(eo2Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        int i13 = i3 & 32;
        if (i13 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            lq4Var3 = lq4Var2;
            if (xq2Var3.f(lq4Var3)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
            if ((74899 & i4) == 74898) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var3.S(i4 & 1, z)) {
                if (i13 != 0) {
                    lq4Var5 = px5.a;
                } else {
                    lq4Var5 = lq4Var3;
                }
                pr3 a2 = qr3.a(xq2Var3);
                Object P = xq2Var3.P();
                vs0 vs0Var2 = ox0.a;
                if (P == vs0Var2) {
                    P = np2.I(new sa1(a2, 0));
                    xq2Var3.l0(P);
                }
                pp6 pp6Var = (pp6) P;
                yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var3, 0);
                int hashCode = Long.hashCode(xq2Var3.T);
                xv4 l2 = xq2Var3.l();
                a74 E = l.E(xq2Var3, a74Var);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, ix0.f, a3);
                yh2.K(xq2Var3, ix0.e, l2);
                yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var3, ix0.h);
                yh2.K(xq2Var3, ix0.d, E);
                if (((Boolean) pp6Var.getValue()).booleanValue()) {
                    xq2Var3.b0(1262543969);
                    xq2Var2 = xq2Var3;
                    pr3Var = a2;
                    vs0Var = vs0Var2;
                    z2 = false;
                    i6 = 131072;
                    l.c(null, 0L, RecyclerView.B1, xq2Var2, 0, 15);
                    xq2Var2.p(false);
                } else {
                    pr3Var = a2;
                    vs0Var = vs0Var2;
                    z2 = false;
                    i6 = 131072;
                    xq2Var2 = xq2Var3;
                    xq2Var2.b0(1262575682);
                    xq2Var2.p(false);
                }
                boolean h2 = xq2Var2.h(list);
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean h3 = h2 | z3 | xq2Var2.h(eo2Var);
                if ((458752 & i4) == i6) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                boolean z5 = h3 | z4;
                Object P2 = xq2Var2.P();
                if (z5 || P2 == vs0Var) {
                    i7 = i4;
                    cn cnVar = new cn(4, qn2Var, eo2Var, lq4Var5, list);
                    lq4Var6 = lq4Var5;
                    xq2Var2.l0(cnVar);
                    P2 = cnVar;
                } else {
                    i7 = i4;
                    lq4Var6 = lq4Var5;
                }
                xq2 xq2Var4 = xq2Var2;
                gi2.e(null, pr3Var, lq4Var, null, null, null, false, null, (qn2) P2, xq2Var4, (i7 << 3) & 896, 505);
                xq2Var = xq2Var4;
                xq2Var.p(true);
                lq4Var4 = lq4Var6;
            } else {
                xq2Var = xq2Var3;
                xq2Var.V();
                lq4Var4 = lq4Var3;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new eo2() { // from class: ta1
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nb3.d(a74.this, lq4Var, list, qn2Var, eo2Var, lq4Var4, (px0) obj, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        lq4Var3 = lq4Var2;
        if ((74899 & i4) == 74898) {
        }
        if (!xq2Var3.S(i4 & 1, z)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean d0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, ti1[] ti1VarArr) {
        int length;
        byte[] bArr2 = f04.B;
        byte[] bArr3 = f04.A;
        byte[] bArr4 = f04.x;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                nw7.x0(byteArrayOutputStream2, ti1VarArr.length);
                int i3 = 2;
                int i4 = 2;
                for (ti1 ti1Var : ti1VarArr) {
                    nw7.w0(byteArrayOutputStream2, ti1Var.c, 4);
                    nw7.w0(byteArrayOutputStream2, ti1Var.d, 4);
                    nw7.w0(byteArrayOutputStream2, ti1Var.g, 4);
                    String v2 = v(ti1Var.a, ti1Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = v2.getBytes(charset).length;
                    nw7.x0(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(v2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 == byteArray.length) {
                    ay7 ay7Var = new ay7(bb2.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList.add(ay7Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i5 = 0;
                    for (int i6 = 0; i6 < ti1VarArr.length; i6++) {
                        try {
                            ti1 ti1Var2 = ti1VarArr[i6];
                            nw7.x0(byteArrayOutputStream3, i6);
                            nw7.x0(byteArrayOutputStream3, ti1Var2.e);
                            i5 = i5 + 4 + (ti1Var2.e * i3);
                            int[] iArr = ti1Var2.h;
                            int length3 = iArr.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length3) {
                                int i9 = iArr[i7];
                                nw7.x0(byteArrayOutputStream3, i9 - i8);
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
                        ay7 ay7Var2 = new ay7(bb2.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList.add(ay7Var2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < ti1VarArr.length) {
                            try {
                                ti1 ti1Var3 = ti1VarArr[i10];
                                int i12 = i2;
                                for (Map.Entry entry : ti1Var3.i.entrySet()) {
                                    i12 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                i0(byteArrayOutputStream4, i12, ti1Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                j0(byteArrayOutputStream5, ti1Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                nw7.x0(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i11 + 6;
                                nw7.w0(byteArrayOutputStream3, length4, 4);
                                nw7.x0(byteArrayOutputStream3, i12);
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
                            ay7 ay7Var3 = new ay7(bb2.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList.add(ay7Var3);
                            long size = 12 + (arrayList.size() * 16);
                            nw7.w0(byteArrayOutputStream, arrayList.size(), 4);
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                ay7 ay7Var4 = (ay7) arrayList.get(i14);
                                bb2 bb2Var = ay7Var4.a;
                                byte[] bArr5 = ay7Var4.b;
                                nw7.w0(byteArrayOutputStream, bb2Var.getValue(), 4);
                                nw7.w0(byteArrayOutputStream, size, 4);
                                if (ay7Var4.c) {
                                    long length5 = bArr5.length;
                                    byte[] Q = nw7.Q(bArr5);
                                    arrayList2.add(Q);
                                    nw7.w0(byteArrayOutputStream, Q.length, 4);
                                    nw7.w0(byteArrayOutputStream, length5, 4);
                                    length = Q.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    nw7.w0(byteArrayOutputStream, bArr5.length, 4);
                                    nw7.w0(byteArrayOutputStream, 0L, 4);
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
        byte[] bArr6 = f04.y;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] r2 = r(ti1VarArr, bArr6);
            nw7.w0(byteArrayOutputStream, ti1VarArr.length, 1);
            nw7.w0(byteArrayOutputStream, r2.length, 4);
            byte[] Q2 = nw7.Q(r2);
            nw7.w0(byteArrayOutputStream, Q2.length, 4);
            byteArrayOutputStream.write(Q2);
            return true;
        } else if (Arrays.equals(bArr, bArr3)) {
            nw7.w0(byteArrayOutputStream, ti1VarArr.length, 1);
            for (ti1 ti1Var4 : ti1VarArr) {
                String v3 = v(ti1Var4.a, ti1Var4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                nw7.x0(byteArrayOutputStream, v3.getBytes(charset2).length);
                nw7.x0(byteArrayOutputStream, ti1Var4.h.length);
                nw7.w0(byteArrayOutputStream, ti1Var4.i.size() * 4, 4);
                nw7.w0(byteArrayOutputStream, ti1Var4.c, 4);
                byteArrayOutputStream.write(v3.getBytes(charset2));
                for (Integer num : ti1Var4.i.keySet()) {
                    nw7.x0(byteArrayOutputStream, num.intValue());
                    nw7.x0(byteArrayOutputStream, 0);
                }
                for (int i16 : ti1Var4.h) {
                    nw7.x0(byteArrayOutputStream, i16);
                }
            }
            return true;
        } else {
            byte[] bArr7 = f04.z;
            if (Arrays.equals(bArr, bArr7)) {
                byte[] r3 = r(ti1VarArr, bArr7);
                nw7.w0(byteArrayOutputStream, ti1VarArr.length, 1);
                nw7.w0(byteArrayOutputStream, r3.length, 4);
                byte[] Q3 = nw7.Q(r3);
                nw7.w0(byteArrayOutputStream, Q3.length, 4);
                byteArrayOutputStream.write(Q3);
                return true;
            } else if (Arrays.equals(bArr, bArr2)) {
                nw7.x0(byteArrayOutputStream, ti1VarArr.length);
                for (ti1 ti1Var5 : ti1VarArr) {
                    String str = ti1Var5.a;
                    TreeMap treeMap = ti1Var5.i;
                    String v4 = v(str, ti1Var5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    nw7.x0(byteArrayOutputStream, v4.getBytes(charset3).length);
                    nw7.x0(byteArrayOutputStream, treeMap.size());
                    nw7.x0(byteArrayOutputStream, ti1Var5.h.length);
                    nw7.w0(byteArrayOutputStream, ti1Var5.c, 4);
                    byteArrayOutputStream.write(v4.getBytes(charset3));
                    for (Integer num2 : treeMap.keySet()) {
                        nw7.x0(byteArrayOutputStream, num2.intValue());
                    }
                    for (int i17 : ti1Var5.h) {
                        nw7.x0(byteArrayOutputStream, i17);
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public static final void e(xa1 xa1Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xa1 xa1Var2;
        j71 j71Var;
        int i5;
        on2Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1504194021);
        int i6 = i2 | 2;
        if (xq2Var.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            xq2Var.X();
            if ((i2 & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i5 = i8 & (-15);
                xa1Var2 = xa1Var;
            } else {
                bp7 a2 = ey3.a(xq2Var);
                if (a2 != null) {
                    if (a2 instanceof mw2) {
                        j71Var = ((mw2) a2).getDefaultViewModelCreationExtras();
                    } else {
                        j71Var = h71.b;
                    }
                    i5 = i8 & (-15);
                    xa1Var2 = (xa1) nj2.G(gh5.a(xa1.class), a2, null, j71Var, xq2Var);
                } else {
                    i.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            xq2Var.q();
            pa1 pa1Var = (pa1) np2.C(xa1Var2.e, xq2Var).getValue();
            boolean h2 = xq2Var.h(xa1Var2);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new z(xa1Var2, (r41) null, 29);
                xq2Var.l0(P);
            }
            f(pa1Var, on2Var, qn2Var, (eo2) P, xq2Var, i5 & 1008);
        } else {
            xq2Var.V();
            xa1Var2 = xa1Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new x3(xa1Var2, on2Var, qn2Var, i2, 13);
        }
    }

    public static final String e0(int i2, CharSequence charSequence) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }

    public static final void f(pa1 pa1Var, on2 on2Var, qn2 qn2Var, eo2 eo2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-661086427);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(pa1Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(eo2Var)) {
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
            if (ft7.b(xq2Var, 0).a.a >= 840) {
                xq2Var.b0(-2000294509);
                j(pa1Var, on2Var, qn2Var, eo2Var, xq2Var, i3 & 8190);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-2000088018);
                h(pa1Var, on2Var, qn2Var, eo2Var, xq2Var, i3 & 8190);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new ra1(pa1Var, on2Var, qn2Var, eo2Var, i2, 0);
        }
    }

    public static final void f0(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                i.h("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            i.h("colors and colorStops arguments must have equal length.");
        }
    }

    public static final void g(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(419579728);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.no_dsiware_roms_found), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new f5(a74Var, i2, 4, (byte) 0);
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, ti1 ti1Var) {
        j0(byteArrayOutputStream, ti1Var);
        int i2 = ti1Var.g;
        int[] iArr = ti1Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            nw7.x0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ti1Var.i.entrySet()) {
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

    public static final void h(pa1 pa1Var, on2 on2Var, qn2 qn2Var, eo2 eo2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-83231447);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(pa1Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(eo2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i8 = i3;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            ln2.c(on2Var, n16.I(479601184, new p4((Object) on2Var, (Object) pa1Var, qn2Var, (Object) eo2Var, 6), xq2Var), xq2Var, ((i8 >> 3) & 14) | 48);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new ra1(pa1Var, on2Var, qn2Var, eo2Var, i2, 1);
        }
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, ti1 ti1Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        nw7.x0(byteArrayOutputStream, str.getBytes(charset).length);
        nw7.x0(byteArrayOutputStream, ti1Var.e);
        nw7.w0(byteArrayOutputStream, ti1Var.f, 4);
        nw7.w0(byteArrayOutputStream, ti1Var.c, 4);
        nw7.w0(byteArrayOutputStream, ti1Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void i(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(351969663);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 O = ge7.O(a74Var, 16.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(null, 0L, RecyclerView.B1, 0L, 0, xq2Var, 0, 31);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new f5(a74Var, i2, 5, (byte) 0);
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, int i2, ti1 ti1Var) {
        int i3 = ti1Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : ti1Var.i.entrySet()) {
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

    public static final void j(pa1 pa1Var, on2 on2Var, qn2 qn2Var, eo2 eo2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-289244578);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(pa1Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(eo2Var)) {
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
            q60.a(yh2.O(xq2Var, R.string.select_dsiware_title), on2Var, n16.I(2112373737, new qa1(pa1Var, qn2Var, eo2Var, 1), xq2Var), n16.I(433906343, new j10(on2Var, 5, (byte) 0), xq2Var), false, xq2Var, (i3 & 112) | 28032, 0);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new ra1(pa1Var, on2Var, qn2Var, eo2Var, i2, 2);
        }
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, ti1 ti1Var) {
        int i2 = 0;
        for (Map.Entry entry : ti1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                nw7.x0(byteArrayOutputStream, intValue - i2);
                nw7.x0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static final qa4 l(le2 le2Var, pp0 pp0Var, px0 px0Var, int i2) {
        xq2 xq2Var = (xq2) px0Var;
        return m(le2Var, pp0Var, ((hu3) xq2Var.j(zx3.a)).getLifecycle(), tt3.STARTED, px0Var, i2 & 112);
    }

    public static final qa4 m(le2 le2Var, Object obj, ut3 ut3Var, tt3 tt3Var, px0 px0Var, int i2) {
        boolean z;
        vt1 vt1Var = vt1.A;
        Object[] objArr = {le2Var, ut3Var, tt3Var, vt1Var};
        xq2 xq2Var = (xq2) px0Var;
        boolean h2 = xq2Var.h(ut3Var);
        if ((((i2 & 7168) ^ 3072) > 2048 && xq2Var.d(tt3Var.ordinal())) || (i2 & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = z | h2 | xq2Var.h(vt1Var) | xq2Var.h(le2Var);
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (h3 || P == vs0Var) {
            l5 l5Var = new l5(ut3Var, tt3Var, le2Var, (r41) null, 11);
            xq2Var.l0(l5Var);
            P = l5Var;
        }
        eo2 eo2Var = (eo2) P;
        Object P2 = xq2Var.P();
        if (P2 == vs0Var) {
            P2 = np2.Y(obj);
            xq2Var.l0(P2);
        }
        qa4 qa4Var = (qa4) P2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h4 = xq2Var.h(eo2Var);
        Object P3 = xq2Var.P();
        if (h4 || P3 == vs0Var) {
            P3 = new km6(eo2Var, qa4Var, null, 3);
            xq2Var.l0(P3);
        }
        mb3.k(copyOf, (eo2) P3, xq2Var);
        return qa4Var;
    }

    public static final qa4 n(rp6 rp6Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        return m(rp6Var, rp6Var.getValue(), ((hu3) xq2Var.j(zx3.a)).getLifecycle(), tt3.STARTED, px0Var, 0);
    }

    public static final Object o(r41 r41Var, ne2 ne2Var, on2 on2Var, fo2 fo2Var, le2[] le2VarArr) {
        cu0 cu0Var = new cu0(null, ne2Var, on2Var, fo2Var, le2VarArr);
        o66 o66Var = new o66(r41Var, r41Var.b());
        Object Z = mp2.Z(o66Var, true, o66Var, cu0Var);
        if (Z == x61.COROUTINE_SUSPENDED) {
            return Z;
        }
        return jg7.a;
    }

    public static int p(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        if (i2 == i3) {
            return 0;
        }
        return 1;
    }

    public static int q(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }

    public static byte[] r(ti1[] ti1VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (ti1 ti1Var : ti1VarArr) {
            i3 += ((((ti1Var.g * 2) + 7) & (-8)) / 8) + (ti1Var.e * 2) + v(ti1Var.a, ti1Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + ti1Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f04.z)) {
            int length = ti1VarArr.length;
            while (i2 < length) {
                ti1 ti1Var2 = ti1VarArr[i2];
                h0(byteArrayOutputStream, ti1Var2, v(ti1Var2.a, ti1Var2.b, bArr));
                g0(byteArrayOutputStream, ti1Var2);
                i2++;
            }
        } else {
            for (ti1 ti1Var3 : ti1VarArr) {
                h0(byteArrayOutputStream, ti1Var3, v(ti1Var3.a, ti1Var3.b, bArr));
            }
            int length2 = ti1VarArr.length;
            while (i2 < length2) {
                g0(byteArrayOutputStream, ti1VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static long s(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i4, 262142);
        int i8 = Integer.MAX_VALUE;
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
                s21.k(i6);
                e41.c();
                return 0L;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i3);
        }
        return s21.a(Math.min(i7, i2), i8, min2, min);
    }

    public static long t(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i2, 262142);
        int i8 = Integer.MAX_VALUE;
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
                s21.k(i6);
                e41.c();
                return 0L;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i5);
        }
        return s21.a(min2, min, Math.min(i7, i4), i8);
    }

    public static final void u(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static String v(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f04.A;
        byte[] bArr3 = f04.B;
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
                    return i61.n(lb1.s(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : ":", str2);
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

    public static final int w(Bitmap bitmap) {
        int i2;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i2 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i2 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i2 = 8;
                        }
                    }
                    i2 = 4;
                }
                return height * i2;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config3 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final e33 x() {
        e33 e33Var = v;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(6.0f, 19.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(8.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.t(7.0f);
        ww2Var.k(6.0f);
        ww2Var.u(12.0f);
        ww2Var.g();
        ww2Var.o(19.0f, 4.0f);
        ww2Var.l(-3.5f);
        ww2Var.n(-1.0f, -1.0f);
        ww2Var.l(-5.0f);
        ww2Var.n(-1.0f, 1.0f);
        ww2Var.k(5.0f);
        ww2Var.u(2.0f);
        ww2Var.l(14.0f);
        ww2Var.t(4.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        v = b2;
        return b2;
    }

    public static int y(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static int z(int i2, boolean z, int i3) {
        int i4;
        if (z) {
            i4 = ((i3 - i2) + 360) % 360;
        } else {
            i4 = (i3 + i2) % 360;
        }
        if (kj2.J(2, kj2.c0("CameraOrientationUtil"))) {
            StringBuilder q2 = i61.q(i2, i3, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            q2.append(z);
            q2.append(", result=");
            q2.append(i4);
            kj2.t("CameraOrientationUtil", q2.toString());
        }
        return i4;
    }
}
