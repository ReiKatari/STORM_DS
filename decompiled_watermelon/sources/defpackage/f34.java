package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.system.Os;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f34  reason: default package */
/* loaded from: classes.dex */
public abstract class f34 {
    public static final float[] a = new float[91];
    public static final et0 b = new et0(1006516898, false, new xk0(6));
    public static final et0 c = new et0(325879492, false, new xk0(7));
    public static final et0 d = new et0(2130912738, false, new pt0(2));
    public static final et0 e = new et0(-111945959, false, new pt0(3));
    public static final et0 f = new et0(-887041510, false, new pt0(4));
    public static final et0 g = new et0(-1662137061, false, new pt0(5));
    public static final Class[] h = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final pj i = new pj(2);
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public static final oi1 k = new Object();
    public static ax2 l;
    public static ax2 m;
    public static final /* synthetic */ int n = 0;

    public static final int A(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int E = b53.E(((k53) list.get(i4)).b, i2);
            if (E < 0) {
                i3 = i4 + 1;
            } else if (E > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final String B(long j2) {
        hm1 hm1Var = im1.B;
        if (im1.d(j2, 0L)) {
            return "";
        }
        long k2 = im1.k(j2, om1.HOURS);
        long k3 = im1.k(j2, om1.MINUTES) % 60;
        if (k2 >= 1) {
            return String.format("%dh %02dm", Arrays.copyOf(new Object[]{Long.valueOf(k2), Long.valueOf(k3)}, 2));
        }
        if (k3 >= 1) {
            return k3 + "m";
        }
        return "<1m";
    }

    public static String C(Context context, Uri uri) {
        String substring;
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            int z0 = zg6.z0(uri2, "://", 0, false, 6);
            if (z0 == -1) {
                substring = null;
            } else {
                d33 t0 = io2.t0(0, z0);
                t0.getClass();
                substring = uri2.substring(t0.A, t0.B + 1);
            }
            if (b53.x(substring, "content")) {
                boolean isDocumentUri = DocumentsContract.isDocumentUri(context, uri);
                try {
                    if (isDocumentUri) {
                        return D(context, uri);
                    }
                    return E(context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
                } catch (Exception unused) {
                    if (isDocumentUri) {
                        return uh1.g(context, uri).i();
                    }
                    return uh1.h(context, uri).i();
                }
            } else if (b53.x(substring, "file")) {
                String uri3 = uri.toString();
                uri3.getClass();
                return uri3.substring(zg6.z0(uri3, "://", 0, false, 6) + 3);
            }
        }
        return null;
    }

    public static String D(Context context, Uri uri) {
        uri.getClass();
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                int fd = openFileDescriptor.getFd();
                String readlink = Os.readlink(new File("/proc/self/fd/" + fd).getAbsolutePath());
                openFileDescriptor.close();
                return readlink;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:46|(4:48|49|50|(8:52|(1:56)|57|58|(1:61)|64|(2:66|(1:68)(1:70))(2:71|72)|(2:17|18)(8:19|(1:21)|22|(1:24)(1:37)|25|(1:27)|28|(2:30|(2:32|33)(2:34|35))(1:36))))(1:80)|77|(2:54|56)|57|58|(1:73)(1:61)|64|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        r2 = null;
        r16 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[Catch: Exception -> 0x0141, TryCatch #2 {Exception -> 0x0141, blocks: (B:41:0x00e8, B:45:0x0121, B:46:0x0128, B:48:0x0133, B:50:0x013c), top: B:82:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String E(android.content.Context r18, android.net.Uri r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.E(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static Application F(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        f81.z(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static final float G(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final boolean H(tc0 tc0Var, String str) {
        str.getClass();
        tc0Var.getClass();
        if (b53.x(Build.FINGERPRINT, "robolectric")) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
                return true;
            }
            return true;
        }
        try {
            od0.a(str);
            ce0 b2 = tc0.b(tc0Var, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((ia0) b2).c(key);
            if (iArr == null) {
                return false;
            }
            return nu.Y(iArr, 0);
        } catch (CameraAccessException e2) {
            if (ve2.E()) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e2);
            }
            throw new Exception(e2);
        }
    }

    public static final boolean I(long j2) {
        if ((j2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean J(long j2) {
        if ((j2 & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final InputConfiguration K(String str, List list) {
        list.getClass();
        str.getClass();
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                g03 g03Var = (g03) tq0.K0(list);
                return new InputConfiguration(g03Var.a, g03Var.b, g03Var.c);
            }
            ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g03 g03Var2 = (g03) it.next();
                dd.C();
                arrayList.add(dd.i(g03Var2.a, g03Var2.b, str));
            }
            return dd.h(((g03) tq0.K0(list)).c, arrayList);
        }
        i.n("Call to create InputConfiguration but list of InputConfigData is empty.");
        return null;
    }

    public static final void L(z86 z86Var, int i2, Object obj) {
        int h2 = z86Var.h(i2);
        Object[] objArr = z86Var.c;
        Object obj2 = objArr[h2];
        objArr[h2] = su0.a;
        if (obj == obj2) {
            return;
        }
        xu0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final String M(rg5 rg5Var) {
        rg5Var.getClass();
        String str = rg5Var.f.e;
        if (str == null) {
            return rg5Var.a;
        }
        return str;
    }

    public static final zn3 N(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        int i2 = xq0.i;
        return new zn3(l07.c0(new xq0(iq0.q(Math.abs(hashCode) % 360, 0.68f, 0.47f)), new xq0(iq0.q(Math.abs(hashCode / 360) % 360, 0.6f, 0.26f))), null, 0L, 9187343241974906880L, 0);
    }

    public static final vw2 O(Context context, rg5 rg5Var) {
        context.getClass();
        rg5Var.getClass();
        tw2 tw2Var = new tw2(context);
        tw2Var.c = rg5Var;
        tw2Var.f = new ow3(wh1.i(rg5Var.d, "rom-icon:"));
        tw2Var.b(false);
        return tw2Var.a();
    }

    public static final String P(String str) {
        str.getClass();
        List P0 = zg6.P0(str, new char[]{' ', '-', ':', '_'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : P0) {
            String str2 = (String) obj;
            if (!zg6.B0(str2)) {
                if (str2.length() != 0) {
                    if (Character.isLetterOrDigit(str2.charAt(0))) {
                        arrayList.add(obj);
                    }
                } else {
                    vd6.e("Char sequence is empty.");
                    return null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            String upperCase = zg6.Y0(1, str).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return upperCase;
        } else if (arrayList.size() == 1) {
            String upperCase2 = zg6.Y0(1, (String) arrayList.get(0)).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            return upperCase2;
        } else {
            String upperCase3 = zg6.Y0(1, (String) arrayList.get(0)).concat(zg6.Y0(1, (String) arrayList.get(1))).toUpperCase(Locale.ROOT);
            upperCase3.getClass();
            return upperCase3;
        }
    }

    public static final String Q(rg5 rg5Var) {
        rg5Var.getClass();
        if (rg5Var.h) {
            return "DSi";
        }
        return "DS";
    }

    public static final void R(Activity activity, kd3 kd3Var) {
        int i2;
        kd3Var.getClass();
        int i3 = s8.a[kd3Var.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 6;
                } else {
                    i.c();
                    return;
                }
            } else {
                i2 = 7;
            }
        } else {
            i2 = -1;
        }
        if (activity.getRequestedOrientation() != i2) {
            activity.setRequestedOrientation(i2);
        }
    }

    public static final zy3 S(boolean z, boolean z2, ki2 ki2Var) {
        zy3 zy3Var = wy3.a;
        if (z && nh6.a) {
            if (z2) {
                zy3Var = new oh6(k);
            }
            return zy3Var.f(new lh6(ki2Var));
        }
        return zy3Var;
    }

    public static final Bitmap.Config T(int i2) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i2 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i3 >= 26 && i2 == 4) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final boolean U(Throwable th, ki2 ki2Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = s53.a;
        qe1 qe1Var = null;
        if (num != null && num.intValue() < 19) {
            Method method = io4.b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = pp1.A;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) asList.get(i2)) instanceof qe1) {
                return false;
            }
        }
        try {
            ju0 ju0Var = (ju0) ki2Var.c();
            if (ju0Var != null) {
                boolean z2 = ju0Var.b;
                List list = ju0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((lu0) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                ju0Var.getClass();
                qe1Var = new qe1(ju0Var);
            }
        } catch (Throwable th2) {
            qe1Var = th2;
        }
        if (qe1Var != null) {
            pu.k(th, qe1Var);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r21, defpackage.zy3 r22, long r23, long r25, long r27, long r29, final int r31, boolean r32, final int r33, int r34, defpackage.mi2 r35, defpackage.ds6 r36, defpackage.tu0 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.a(java.lang.String, zy3, long, long, long, long, int, boolean, int, int, mi2, ds6, tu0, int, int):void");
    }

    public static final void b(zy3 zy3Var, ih4 ih4Var, gn0 gn0Var, mi2 mi2Var, mi2 mi2Var2, aj2 aj2Var, mi2 mi2Var3, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        gn0Var.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        aj2Var.getClass();
        mi2Var3.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1133390423);
        if (sk2Var.f(ih4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i2 | i3;
        if (sk2Var.f(gn0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (sk2Var.h(mi2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (sk2Var.h(mi2Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (sk2Var.h(aj2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if (sk2Var.h(mi2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i14 & 1, z)) {
            if (gn0Var instanceof en0) {
                sk2Var.X(1733508728);
                me2.b(b53.W(zy3Var, ih4Var), sk2Var, 0);
                sk2Var.p(false);
            } else if (gn0Var instanceof fn0) {
                sk2Var.X(1733511804);
                f(zy3Var, ih4Var, (List) ((fn0) gn0Var).a, mi2Var, mi2Var2, aj2Var, mi2Var3, sk2Var, i14 & 4193406);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, 1733507284, false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xl0(zy3Var, ih4Var, gn0Var, mi2Var, mi2Var2, aj2Var, mi2Var3, i2, 0);
        }
    }

    public static final void c(rg5 rg5Var, String str, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(938739646);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(rg5Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            if (str != null) {
                sk2Var.X(-352975713);
                cg2.b(str, null, o76.c, r01.a, 0.75f, sk2Var, ((i3 >> 3) & 14) | 14156208, 3896);
                sk2Var.p(false);
            } else {
                sk2Var.X(-352731030);
                d50.a(dk7.h(o76.c, N(M(rg5Var))), sk2Var, 0);
                sk2Var.p(false);
            }
            d50.a(dk7.h(o76.c, sn1.o(l07.c0(new xq0(xq0.b(0.55f, xq0.b)), new xq0(C.b)), RecyclerView.A1, RecyclerView.A1, 14)), sk2Var, 0);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(rg5Var, str, zy3Var, i2, 16);
        }
    }

    public static final void d(ax2 ax2Var, ki2 ki2Var, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        ki2 ki2Var2;
        boolean z;
        wy3 wy3Var;
        int i4;
        int i5;
        int i6;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1857549676);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(ax2Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(null)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            ki2Var2 = ki2Var;
            if (sk2Var.h(ki2Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            ki2Var2 = ki2Var;
        }
        int i7 = i3 | 3072;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            jd7 C = mj2.C(sk2Var);
            wy3 wy3Var2 = wy3.a;
            zy3 t = a53.t(o76.h(wy3Var2, 38.0f), gr5.a);
            long b2 = xq0.b(0.28f, xq0.b);
            is2 is2Var = iq2.g;
            zy3 i8 = dk7.i(t, b2, is2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                i8 = dk7.i(i8, xq0.b(0.6f, C.j), is2Var);
            }
            zy3 r = a53.r(i8, l14Var, null, false, null, ki2Var2, 28);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ev2.a(ax2Var, null, o76.h(wy3Var2, 20.0f), xq0.d, sk2Var, (i7 & 14) | 3456 | (i7 & 112), 0);
            sk2Var.p(true);
            wy3Var = wy3Var2;
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new fl(ax2Var, ki2Var, wy3Var, i2, 15);
        }
    }

    public static final void e(final rg5 rg5Var, final String str, final float f2, final long j2, tu0 tu0Var, final int i2) {
        int i3;
        boolean z;
        wy3 wy3Var;
        int i4;
        y60 y60Var;
        boolean z2;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-732197874);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(rg5Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(str)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(null)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.c(f2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var.e(j2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        int i11 = i3;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i11 & 1, z)) {
            wy3 wy3Var2 = wy3.a;
            zy3 h2 = dk7.h(a53.t(jk2.Q(l07.p(o76.k(wy3Var2, f2), 1.117904f), 10.0f, gr5.b(12.0f), false, 0L, 28), gr5.b(12.0f)), N(M(rg5Var)));
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, h2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            y60 y60Var2 = y60.n0;
            if (str != null) {
                sk2Var.X(-1324080446);
                wy3Var = wy3Var2;
                i4 = 0;
                cg2.b(str, null, o76.c, r01.a, RecyclerView.A1, sk2Var, ((i11 >> 3) & 14) | 1573296, 4024);
                sk2Var = sk2Var;
                sk2Var.p(false);
                y60Var = y60Var2;
                i5 = i11;
                z2 = true;
                str2 = null;
            } else {
                wy3Var = wy3Var2;
                i4 = 0;
                sk2Var.X(-1323844598);
                y60Var = y60Var2;
                z2 = true;
                str2 = null;
                i5 = i11;
                ir6.b(P(M(rg5Var)), y60Var2.i(wy3Var, y60.Z), xq0.b(0.22f, xq0.d), j2, pe2.d0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, ((i11 >> 3) & 7168) | 1769856, 0, 130960);
                sk2Var.p(false);
            }
            n(RecyclerView.A1, i4, sk2Var, null);
            l(rg5Var, b53.X(y60Var.i(wy3Var, y60.d0), 5.0f), str2, 26.0f, sk2Var, (i5 & 14) | 3072 | (i5 & 896), 0);
            sk2Var.p(z2);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: rm5
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f34.e(rg5.this, str, f2, j2, (tu0) obj, ep2.I(i2 | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void f(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, mi2 mi2Var2, aj2 aj2Var, mi2 mi2Var3, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        mi2 mi2Var4;
        aj2 aj2Var2;
        y60 y60Var;
        wy3 wy3Var;
        int i9;
        boolean z2;
        boolean z3;
        sn1 sn1Var;
        k24 k24Var;
        int i10;
        k24 k24Var2;
        int i11;
        int i12;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1442409283);
        if (sk2Var.f(ih4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i2 | i3;
        if (sk2Var.h(list)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i14 = i13 | i4;
        if (sk2Var.h(mi2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (sk2Var.h(mi2Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (sk2Var.h(aj2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i17 = i16 | i7;
        if (sk2Var.h(mi2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if ((599187 & i18) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i18 & 1, z)) {
            Object[] objArr = new Object[0];
            ci3 ci3Var = bl0.a;
            Object L = sk2Var.L();
            sn1 sn1Var2 = su0.a;
            if (L == sn1Var2) {
                L = new d5(13);
                sk2Var.h0(L);
            }
            Object[] copyOf = Arrays.copyOf(objArr, 0);
            ci3Var.getClass();
            k24 k24Var3 = (k24) jk2.O(copyOf, new ci3(22, new z5(23, ci3Var), new n95(0, ci3Var)), (ki2) L, sk2Var, 3456, 0);
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            y60 y60Var2 = y60.n0;
            boolean isEmpty = list.isEmpty();
            wy3 wy3Var2 = wy3.a;
            if (isEmpty) {
                sk2Var.X(-649043771);
                i9 = 0;
                wy3Var = wy3Var2;
                y60Var = y60Var2;
                ir6.b(me2.X(sk2Var, R.string.folder_is_empty), y60Var2.i(b53.X(b53.W(wy3Var2, ih4Var), 24.0f), y60.Z), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130556);
                sk2Var = sk2Var;
                sk2Var.p(false);
                i10 = i18;
                k24Var2 = k24Var3;
                sn1Var = sn1Var2;
            } else {
                y60Var = y60Var2;
                wy3Var = wy3Var2;
                i9 = 0;
                sk2Var = sk2Var;
                sk2Var.X(-648731105);
                zy3 B = l07.B(zy3Var, ih4Var);
                ot otVar = new ot(8.0f, true, new i(1));
                ye6 ye6Var = ov0.n;
                mh4 mh4Var = new mh4(b53.B(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.d() + 12.0f, b53.A(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.c() + 16.0f + 56.0f + 16.0f);
                boolean h2 = sk2Var.h(list);
                if ((i18 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean f2 = h2 | z2 | sk2Var.f(k24Var3);
                if ((3670016 & i18) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = f2 | z3;
                Object L2 = sk2Var.L();
                sn1Var = sn1Var2;
                if (!z4 && L2 != sn1Var) {
                    k24Var = k24Var3;
                } else {
                    qm qmVar = new qm(list, (Object) k24Var3, mi2Var, (Object) mi2Var3, 1);
                    k24Var = k24Var3;
                    sk2Var.h0(qmVar);
                    L2 = qmVar;
                }
                i10 = i18;
                k24Var2 = k24Var;
                io2.b(B, null, mh4Var, otVar, null, null, false, null, (mi2) L2, sk2Var, 24576, 490);
                sk2Var.p(false);
            }
            zy3 b0 = b53.b0(y60Var.i(wy3Var, y60.f0), RecyclerView.A1, RecyclerView.A1, b53.A(ih4Var, (sd3) sk2Var.j(ov0.n)) + 16.0f, ih4Var.c() + 16.0f, 3);
            boolean f3 = sk2Var.f(k24Var2);
            Object L3 = sk2Var.L();
            if (f3 || L3 == sn1Var) {
                L3 = new f4(k24Var2, 11);
                sk2Var.h0(L3);
            }
            dk7.d((ki2) L3, b0, null, 0L, 0L, null, mh7.c, sk2Var, 12582912);
            sk2Var.p(true);
            bl0 bl0Var = (bl0) k24Var2.getValue();
            boolean f4 = sk2Var.f(k24Var2);
            Object L4 = sk2Var.L();
            if (f4 || L4 == sn1Var) {
                L4 = new f4(k24Var2, 12);
                sk2Var.h0(L4);
            }
            ki2 ki2Var = (ki2) L4;
            boolean f5 = sk2Var.f(k24Var2);
            if ((i10 & 57344) == 16384) {
                i11 = 1;
            } else {
                i11 = i9;
            }
            int i19 = f5 | i11;
            if ((i10 & 458752) == 131072) {
                i12 = 1;
            } else {
                i12 = i9;
            }
            int i20 = i19 | i12;
            Object L5 = sk2Var.L();
            if (i20 == 0 && L5 != sn1Var) {
                mi2Var4 = mi2Var2;
                aj2Var2 = aj2Var;
            } else {
                mi2Var4 = mi2Var2;
                aj2Var2 = aj2Var;
                L5 = new cz(mi2Var4, aj2Var2, k24Var2, 3);
                sk2Var.h0(L5);
            }
            b53.f(bl0Var, ki2Var, (mi2) L5, sk2Var, i9);
        } else {
            mi2Var4 = mi2Var2;
            aj2Var2 = aj2Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xl0(zy3Var, ih4Var, list, mi2Var, mi2Var4, aj2Var2, mi2Var3, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r29, defpackage.zy3 r30, long r31, defpackage.tu0 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.g(java.lang.String, zy3, long, tu0, int, int):void");
    }

    public static final void h(float f2, ki2 ki2Var, zy3 zy3Var, wc2 wc2Var, tu0 tu0Var, int i2) {
        int i3;
        ki2 ki2Var2;
        boolean z;
        float f3;
        int i4;
        int i5;
        int i6;
        int i7;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(129269547);
        if ((i2 & 6) == 0) {
            if (sk2Var.c(f2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ki2Var2 = ki2Var;
            if (sk2Var.h(ki2Var2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        } else {
            ki2Var2 = ki2Var;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.f(wc2Var)) {
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
        if (sk2Var.O(i3 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            fr5 b2 = gr5.b(13.0f);
            zy3 d2 = o76.d(zy3Var, f2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                f3 = 16.0f;
            } else {
                f3 = 8.0f;
            }
            zy3 i8 = dk7.i(a53.t(jk2.Q(d2, f3, b2, false, C.k, 12), b2), C.j, iq2.g);
            if (wc2Var != null) {
                i8 = b53.I(i8, wc2Var);
            }
            zy3 r = a53.r(i8, l14Var, null, false, null, ki2Var2, 28);
            sr5 a3 = rr5.a(rt.d, y60.h0, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a3);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ax2 I = io2.I();
            long j2 = xq0.d;
            wy3 wy3Var = wy3.a;
            ev2.a(I, null, o76.h(wy3Var, 19.0f), j2, sk2Var, 3504, 0);
            cg2.k(sk2Var, o76.k(wy3Var, 9.0f));
            String upperCase = me2.X(sk2Var, R.string.play).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            ir6.b(upperCase, null, j2, hi2.B(14), pe2.c0, td7.a, hi2.A(0.3d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355840, 0, 130834);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new qm5(f2, ki2Var, zy3Var, wc2Var, i2);
        }
    }

    public static final void i(gl5 gl5Var, mi2 mi2Var, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        wy3 wy3Var;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        long j2;
        long j3;
        mi2 mi2Var2 = mi2Var;
        is2 is2Var = iq2.g;
        h20 h20Var = y60.j0;
        gl5Var.getClass();
        mi2Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1118519960);
        if (sk2Var.d(gl5Var.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (sk2Var.h(mi2Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            wy3 wy3Var2 = wy3.a;
            zy3 i9 = dk7.i(o76.c(wy3Var2, 1.0f), C.b, is2Var);
            mt mtVar = rt.c;
            lr0 a2 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, i9);
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
            int i10 = i8;
            is2 is2Var2 = is2Var;
            ot otVar = new ot(20.0f, true, new i(1));
            zy3 Z = b53.Z(wy3Var2, 20.0f, RecyclerView.A1, 2);
            sr5 a3 = rr5.a(otVar, y60.g0, sk2Var, 6);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, Z);
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
            sk2Var.X(-1278722718);
            Iterator it = gl5.getEntries().iterator();
            while (it.hasNext()) {
                gl5 gl5Var2 = (gl5) it.next();
                int i11 = sm5.a[gl5Var2.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            i5 = 1417560235;
                            i6 = R.string.rom_details_offline_achievements_tab;
                            z2 = false;
                        } else {
                            throw ej6.d(sk2Var, 1417551759, false);
                        }
                    } else {
                        z2 = false;
                        i5 = 1417556829;
                        i6 = R.string.retro_achievements_tab;
                    }
                } else {
                    z2 = false;
                    i5 = 1417553284;
                    i6 = R.string.rom_details_configuration_tab;
                }
                String o = b31.o(sk2Var, i5, i6, sk2Var, z2);
                if (gl5Var2 == gl5Var) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object L = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (L == sn1Var) {
                    L = b31.f(sk2Var);
                }
                l14 l14Var = (l14) L;
                k24 a4 = bh7.a(l14Var, sk2Var, 6);
                zy3 f0 = n40.f0(wy3Var2, u43.Max);
                if ((i10 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean d2 = z4 | sk2Var.d(gl5Var2.ordinal());
                Object L2 = sk2Var.L();
                if (d2 || L2 == sn1Var) {
                    L2 = new jd2(22, mi2Var2, gl5Var2);
                    sk2Var.h0(L2);
                }
                zy3 r = a53.r(f0, l14Var, null, false, null, (ki2) L2, 28);
                lr0 a5 = jr0.a(mtVar, h20Var, sk2Var, 0);
                wy3 wy3Var3 = wy3Var2;
                int hashCode3 = Long.hashCode(sk2Var.T);
                sm4 l4 = sk2Var.l();
                zy3 e03 = l07.e0(sk2Var, r);
                nu0.i.getClass();
                mv0 mv0Var2 = mu0.b;
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var2);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, mu0.f, a5);
                oo2.S(sk2Var, mu0.e, l4);
                oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode3));
                oo2.P(sk2Var, mu0.h);
                oo2.S(sk2Var, mu0.d, e03);
                String upperCase = o.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (((Boolean) a4.getValue()).booleanValue()) {
                    j2 = C.j;
                } else if (z3) {
                    j2 = C.g;
                } else {
                    j2 = C.i;
                }
                long j4 = j2;
                mt mtVar2 = mtVar;
                int i12 = i10;
                sk2 sk2Var2 = sk2Var;
                jd7 jd7Var = C;
                h20 h20Var2 = h20Var;
                Iterator it2 = it;
                ir6.b(upperCase, b53.b0(wy3Var3, RecyclerView.A1, 12.0f, RecyclerView.A1, 10.0f, 5), j4, hi2.B(10), pe2.c0, td7.c, hi2.A(0.7d), null, 0L, 0, false, 1, 0, null, null, sk2Var2, 14355504, 3456, 118544);
                sk2Var = sk2Var2;
                zy3 d3 = o76.d(o76.c(wy3Var3, 1.0f), 2.0f);
                if (z3) {
                    j3 = jd7Var.l;
                } else {
                    j3 = xq0.g;
                }
                is2 is2Var3 = is2Var2;
                d50.a(dk7.i(d3, j3, is2Var3), sk2Var, 0);
                sk2Var.p(true);
                mi2Var2 = mi2Var;
                C = jd7Var;
                wy3Var2 = wy3Var3;
                is2Var2 = is2Var3;
                h20Var = h20Var2;
                mtVar = mtVar2;
                i10 = i12;
                it = it2;
            }
            wy3Var = wy3Var2;
            sk2Var.p(false);
            sk2Var.p(true);
            d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), C.f, is2Var2), sk2Var, 0);
            sk2Var.p(true);
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w3(gl5Var, mi2Var, wy3Var, i2, 25);
        }
    }

    public static final void j(rg5 rg5Var, String str, wc2 wc2Var, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, ki2 ki2Var4, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        rg5 rg5Var2;
        sk2 sk2Var;
        wy3 wy3Var;
        int i10;
        dn dnVar;
        long j2;
        float f2;
        wy3 wy3Var2;
        int i11;
        rg5Var.getClass();
        long j3 = rg5Var.j;
        wc2Var.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        ki2Var4.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(2084413518);
        if (sk2Var2.h(rg5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (sk2Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (sk2Var2.f(null)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i14 = i13 | i5;
        if (sk2Var2.h(ki2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (sk2Var2.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (sk2Var2.h(ki2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (sk2Var2.h(ki2Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9 | 100663296;
        if ((38347923 & i18) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i18 & 1, z)) {
            wy3 wy3Var3 = wy3.a;
            zy3 b2 = o76.b(o76.k(wy3Var3, 252.0f), 1.0f);
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, b2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar2 = mu0.f;
            oo2.S(sk2Var2, dnVar2, d2);
            dn dnVar3 = mu0.e;
            oo2.S(sk2Var2, dnVar3, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar4 = mu0.g;
            oo2.S(sk2Var2, dnVar4, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar5 = mu0.d;
            oo2.S(sk2Var2, dnVar5, e0);
            int i19 = i18 & 14;
            int i20 = i18 & 112;
            c(rg5Var, str, y60.n0.p(), sk2Var2, i18 & 126);
            zy3 X = b53.X(o76.c, 16.0f);
            h20 h20Var = y60.j0;
            lr0 a2 = jr0.a(rt.e, h20Var, sk2Var2, 6);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, X);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar2, a2);
            oo2.S(sk2Var2, dnVar3, l3);
            b31.x(hashCode2, sk2Var2, dnVar4, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar5, e02);
            int i21 = i18 >> 9;
            d(se.A(), ki2Var2, null, sk2Var2, (i21 & 896) | 48);
            lr0 a3 = jr0.a(rt.c, h20Var, sk2Var2, 0);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            zy3 e03 = l07.e0(sk2Var2, wy3Var3);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar2, a3);
            oo2.S(sk2Var2, dnVar3, l4);
            b31.x(hashCode3, sk2Var2, dnVar4, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar5, e03);
            i20 i20Var = y60.i0;
            lt ltVar = rt.a;
            sr5 a4 = rr5.a(ltVar, i20Var, sk2Var2, 48);
            int hashCode4 = Long.hashCode(sk2Var2.T);
            sm4 l5 = sk2Var2.l();
            zy3 e04 = l07.e0(sk2Var2, wy3Var3);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar2, a4);
            oo2.S(sk2Var2, dnVar3, l5);
            b31.x(hashCode4, sk2Var2, dnVar4, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar5, e04);
            e(rg5Var, str, 76.0f, hi2.B(20), sk2Var2, i19 | 27648 | i20 | (i18 & 896));
            cg2.k(sk2Var2, o76.k(wy3Var3, 10.0f));
            zy3 Y = b53.Y(dk7.i(a53.t(wy3Var3, gr5.b(5.0f)), xq0.b(0.3f, xq0.b), iq2.g), 8.0f, 3.0f);
            tv3 d3 = d50.d(j20Var, false);
            int hashCode5 = Long.hashCode(sk2Var2.T);
            sm4 l6 = sk2Var2.l();
            zy3 e05 = l07.e0(sk2Var2, Y);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar2, d3);
            oo2.S(sk2Var2, dnVar3, l6);
            b31.x(hashCode5, sk2Var2, dnVar4, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar5, e05);
            String Q = Q(rg5Var);
            long j4 = xq0.d;
            ml2 ml2Var = td7.c;
            ir6.b(Q, null, j4, hi2.B(9), pe2.c0, ml2Var, 0L, null, hi2.B(9), 0, false, 0, 0, null, null, sk2Var2, 1772928, 6, 129938);
            sk2Var2.p(true);
            sk2Var2.p(true);
            String M = M(rg5Var);
            sd2 sd2Var = td7.a;
            ir6.b(M, b53.b0(wy3Var3, RecyclerView.A1, 10.0f, RecyclerView.A1, RecyclerView.A1, 13), j4, hi2.B(17), pe2.d0, sd2Var, 0L, null, hi2.B(20), 2, false, 3, 0, null, null, sk2Var2, 1772976, 3126, 119696);
            rg5Var2 = rg5Var;
            sk2Var = sk2Var2;
            if (!zg6.B0(rg5Var2.b)) {
                sk2Var.X(-1439174899);
                dnVar = dnVar4;
                j2 = j4;
                i10 = i21;
                f2 = 0.75f;
                ir6.b(rg5Var2.b, b53.b0(wy3Var3, RecyclerView.A1, 3.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.75f, j2), hi2.B(12), null, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, 3504, 3120, 120816);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                i10 = i21;
                dnVar = dnVar4;
                j2 = j4;
                f2 = 0.75f;
                sk2Var.X(-1438825498);
                sk2Var.p(false);
            }
            if (!im1.d(j3, 0L)) {
                sk2Var.X(-1438735505);
                wy3Var2 = wy3Var3;
                sk2 sk2Var3 = sk2Var;
                ir6.b(me2.W(R.string.rom_total_play_time_format, new Object[]{B(j3)}, sk2Var), b53.b0(wy3Var3, RecyclerView.A1, 6.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(f2, j2), hi2.A(10.5d), null, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var3, 1576368, 0, 130992);
                sk2Var = sk2Var3;
                i11 = 0;
                sk2Var.p(false);
            } else {
                wy3Var2 = wy3Var3;
                i11 = 0;
                sk2Var.X(-1438357274);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            sr5 a5 = rr5.a(ltVar, y60.g0, sk2Var, i11);
            int hashCode6 = Long.hashCode(sk2Var.T);
            sm4 l7 = sk2Var.l();
            zy3 e06 = l07.e0(sk2Var, wy3Var2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar2, a5);
            oo2.S(sk2Var, dnVar3, l7);
            b31.x(hashCode6, sk2Var, dnVar, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar5, e06);
            sk2 sk2Var4 = sk2Var;
            h(42.0f, ki2Var, new xg3(1.0f, true), wc2Var, sk2Var4, (i10 & 112) | 3078);
            cg2.k(sk2Var, o76.k(wy3Var2, 9.0f));
            int i22 = i18 >> 15;
            m(42.0f, ki2Var3, ki2Var4, null, sk2Var4, (i22 & 112) | 6 | (i22 & 896));
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
            wy3Var = wy3Var2;
        } else {
            rg5Var2 = rg5Var;
            sk2Var = sk2Var2;
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new pm5(rg5Var2, str, wc2Var, ki2Var, ki2Var2, ki2Var3, ki2Var4, wy3Var, i2, 1);
        }
    }

    public static final void k(rg5 rg5Var, String str, wc2 wc2Var, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, ki2 ki2Var4, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        sk2 sk2Var;
        long j2;
        wy3 wy3Var;
        int i11;
        rg5Var.getClass();
        long j3 = rg5Var.j;
        wc2Var.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        ki2Var4.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-2076079537);
        if (sk2Var2.h(rg5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (sk2Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (sk2Var2.f(null)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i14 = i13 | i5;
        if (sk2Var2.h(ki2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (sk2Var2.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (sk2Var2.h(ki2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (sk2Var2.h(ki2Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (sk2Var2.f(zy3Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i19 & 1, z)) {
            zy3 c2 = o76.c(zy3Var, 1.0f);
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, c2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e0);
            int i20 = i19 & 14;
            int i21 = i19 & 112;
            c(rg5Var, str, y60.n0.p(), sk2Var2, i19 & 126);
            wy3 wy3Var2 = wy3.a;
            zy3 X = b53.X(wy3Var2, 16.0f);
            h20 h20Var = y60.j0;
            mt mtVar = rt.c;
            lr0 a2 = jr0.a(mtVar, h20Var, sk2Var2, 0);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, X);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a2);
            oo2.S(sk2Var2, dnVar2, l3);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e02);
            zy3 c3 = o76.c(wy3Var2, 1.0f);
            i20 i20Var = y60.g0;
            lt ltVar = rt.a;
            sr5 a3 = rr5.a(ltVar, i20Var, sk2Var2, 0);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            zy3 e03 = l07.e0(sk2Var2, c3);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a3);
            oo2.S(sk2Var2, dnVar2, l4);
            b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e03);
            int i22 = i19 >> 9;
            d(se.A(), ki2Var2, null, sk2Var2, (i22 & 896) | 48);
            ur5 ur5Var = ur5.a;
            cg2.k(sk2Var2, ur5Var.a(wy3Var2, 1.0f, true));
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.d(wy3Var2, 14.0f));
            sr5 a4 = rr5.a(ltVar, y60.i0, sk2Var2, 48);
            int hashCode4 = Long.hashCode(sk2Var2.T);
            sm4 l5 = sk2Var2.l();
            zy3 e04 = l07.e0(sk2Var2, wy3Var2);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a4);
            oo2.S(sk2Var2, dnVar2, l5);
            b31.x(hashCode4, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e04);
            e(rg5Var, str, 108.0f, hi2.B(30), sk2Var2, i20 | 27648 | i21 | (i19 & 896));
            cg2.k(sk2Var2, o76.k(wy3Var2, 12.0f));
            zy3 a5 = ur5Var.a(wy3Var2, 1.0f, true);
            lr0 a6 = jr0.a(mtVar, h20Var, sk2Var2, 0);
            int hashCode5 = Long.hashCode(sk2Var2.T);
            sm4 l6 = sk2Var2.l();
            zy3 e05 = l07.e0(sk2Var2, a5);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a6);
            oo2.S(sk2Var2, dnVar2, l6);
            b31.x(hashCode5, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e05);
            String M = M(rg5Var);
            int i23 = xq0.i;
            long j4 = xq0.d;
            ir6.b(M, null, j4, hi2.B(21), pe2.d0, td7.a, 0L, null, hi2.B(24), 2, false, 3, 0, null, null, sk2Var2, 1772928, 3126, 119698);
            sk2 sk2Var3 = sk2Var2;
            if (!zg6.B0(rg5Var.b)) {
                sk2Var3.X(-35205359);
                j2 = j4;
                ir6.b(rg5Var.b, b53.b0(wy3Var2, RecyclerView.A1, 4.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.75f, j2), hi2.B(12), null, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var3, 3504, 3120, 120816);
                sk2Var3 = sk2Var3;
                sk2Var3.p(false);
            } else {
                j2 = j4;
                sk2Var3.X(-34825082);
                sk2Var3.p(false);
            }
            i20 i20Var2 = y60.h0;
            zy3 b0 = b53.b0(wy3Var2, RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a7 = rr5.a(ltVar, i20Var2, sk2Var3, 48);
            int hashCode6 = Long.hashCode(sk2Var3.T);
            sm4 l7 = sk2Var3.l();
            zy3 e06 = l07.e0(sk2Var3, b0);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar, a7);
            oo2.S(sk2Var3, dnVar2, l7);
            b31.x(hashCode6, sk2Var3, dnVar3, sk2Var3, ydVar);
            oo2.S(sk2Var3, dnVar4, e06);
            zy3 Y = b53.Y(dk7.i(a53.t(wy3Var2, gr5.b(5.0f)), xq0.b(0.3f, xq0.b), iq2.g), 8.0f, 3.0f);
            tv3 d3 = d50.d(j20Var, false);
            int hashCode7 = Long.hashCode(sk2Var3.T);
            sm4 l8 = sk2Var3.l();
            zy3 e07 = l07.e0(sk2Var3, Y);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar, d3);
            oo2.S(sk2Var3, dnVar2, l8);
            b31.x(hashCode7, sk2Var3, dnVar3, sk2Var3, ydVar);
            oo2.S(sk2Var3, dnVar4, e07);
            sk2 sk2Var4 = sk2Var3;
            String Q = Q(rg5Var);
            ml2 ml2Var = td7.c;
            long j5 = j2;
            ir6.b(Q, null, j5, hi2.B(9), pe2.c0, ml2Var, hi2.A(0.5d), null, hi2.B(9), 0, false, 0, 0, null, null, sk2Var4, 14355840, 6, 129810);
            sk2Var = sk2Var4;
            sk2Var.p(true);
            hm1 hm1Var = im1.B;
            if (!im1.d(j3, 0L)) {
                sk2Var.X(-353831943);
                wy3Var = wy3Var2;
                ir6.b(me2.W(R.string.rom_total_play_time_format, new Object[]{B(j3)}, sk2Var), b53.b0(wy3Var2, 8.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), xq0.b(0.75f, j5), hi2.A(10.5d), null, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1576368, 0, 130992);
                sk2Var = sk2Var;
                i11 = 0;
                sk2Var.p(false);
            } else {
                wy3Var = wy3Var2;
                i11 = 0;
                sk2Var.X(-353397726);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
            cg2.k(sk2Var, o76.d(wy3Var, 14.0f));
            sr5 a8 = rr5.a(ltVar, i20Var, sk2Var, i11);
            int hashCode8 = Long.hashCode(sk2Var.T);
            sm4 l9 = sk2Var.l();
            zy3 e08 = l07.e0(sk2Var, wy3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a8);
            oo2.S(sk2Var, dnVar2, l9);
            b31.x(hashCode8, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e08);
            sk2 sk2Var5 = sk2Var;
            h(50.0f, ki2Var, ur5Var.a(wy3Var, 1.0f, true), wc2Var, sk2Var5, (i22 & 112) | 3078);
            cg2.k(sk2Var, o76.k(wy3Var, 9.0f));
            int i24 = i19 >> 15;
            m(50.0f, ki2Var3, ki2Var4, null, sk2Var5, (i24 & 112) | 6 | (i24 & 896));
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new pm5(rg5Var, str, wc2Var, ki2Var, ki2Var2, ki2Var3, ki2Var4, zy3Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.rg5 r16, final defpackage.zy3 r17, final java.lang.String r18, float r19, defpackage.tu0 r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.l(rg5, zy3, java.lang.String, float, tu0, int, int):void");
    }

    public static final void m(float f2, ki2 ki2Var, ki2 ki2Var2, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        ki2 ki2Var3;
        wy3 wy3Var;
        int i4;
        int i5;
        int i6;
        ki2Var.getClass();
        ki2Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-913331571);
        if ((i2 & 6) == 0) {
            if (sk2Var.c(f2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(ki2Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i7 = i3 | 3072;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.FALSE);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L2;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            jd7 C = mj2.C(sk2Var);
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            wy3 wy3Var2 = wy3.a;
            zy3 e0 = l07.e0(sk2Var, wy3Var2);
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
            zy3 t = a53.t(o76.h(wy3Var2, f2), gr5.b(13.0f));
            long b2 = xq0.b(0.3f, xq0.b);
            is2 is2Var = iq2.g;
            zy3 i8 = dk7.i(t, b2, is2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                i8 = dk7.i(i8, xq0.b(0.5f, C.j), is2Var);
            }
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new wg5(k24Var, 2);
                sk2Var.h0(L3);
            }
            zy3 r = a53.r(i8, l14Var, null, false, null, (ki2) L3, 28);
            tv3 d3 = d50.d(y60.Z, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, r);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ev2.a(mj2.z(), null, o76.h(wy3Var2, 20.0f), xq0.d, sk2Var, 3504, 0);
            sk2Var.p(true);
            boolean booleanValue = ((Boolean) k24Var.getValue()).booleanValue();
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = new wg5(k24Var, 3);
                sk2Var.h0(L4);
            }
            ki2Var3 = ki2Var;
            hi.a(booleanValue, (ki2) L4, null, 0L, null, null, ct3.H0(1640875462, new az(ki2Var3, ki2Var2, k24Var, 3), sk2Var), sk2Var, 1572912);
            sk2Var = sk2Var;
            sk2Var.p(true);
            wy3Var = wy3Var2;
        } else {
            ki2Var3 = ki2Var;
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new qm5(f2, ki2Var3, ki2Var2, wy3Var, i2);
        }
    }

    public static final void n(float f2, int i2, tu0 tu0Var, zy3 zy3Var) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1550193907);
        int i3 = i2 | 54;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            f2 = 0.045f;
            long b2 = xq0.b(0.045f, xq0.d);
            s72 s72Var = o76.c;
            boolean e2 = sk2Var.e(b2);
            Object L = sk2Var.L();
            if (e2 || L == su0.a) {
                L = new u4(17, b2);
                sk2Var.h0(L);
            }
            cg2.k(sk2Var, l07.F(s72Var, (mi2) L));
            zy3Var = wy3.a;
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new yl1(zy3Var, f2, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Type inference failed for: r4v12, types: [uw2, java.lang.Object, tf0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final defpackage.rg5 r37, final java.lang.String r38, final java.lang.String r39, final defpackage.zy3 r40, final long r41, defpackage.s01 r43, boolean r44, defpackage.mi2 r45, defpackage.tu0 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.o(rg5, java.lang.String, java.lang.String, zy3, long, s01, boolean, mi2, tu0, int, int):void");
    }

    public static float p(EdgeEffect edgeEffect, float f2, float f3, od1 od1Var) {
        float f4;
        float f5 = fn1.a;
        double b2 = fn1.a * od1Var.b() * 386.0878f * 160.0f * 0.84f;
        float exp = (float) (Math.exp((fn1.b / fn1.c) * Math.log((Math.abs(f2) * 0.35f) / b2)) * b2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f4 = ip.e(edgeEffect);
        } else {
            f4 = 0.0f;
        }
        if (exp > f4 * f3) {
            return RecyclerView.A1;
        }
        int X = jv3.X(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(X);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(X);
        }
        return f2;
    }

    public static final p31 q(b34 b34Var, nk6 nk6Var) {
        Object c0 = nk2.c0(e34.c0, b34Var, nk6Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        if (c0 != p31Var) {
            nk2.J(nk6Var).k(o27.a);
        }
        return p31Var;
    }

    public static final void r(int i2, int i3, List list) {
        int A = A(i2, list);
        if (A < 0) {
            A = -(A + 1);
        }
        while (A < list.size() && ((k53) list.get(A)).b < i3) {
            k53 k53Var = (k53) list.remove(A);
        }
    }

    public static final Bitmap s(nh nhVar) {
        if (nhVar instanceof nh) {
            return nhVar.a;
        }
        vd6.i("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final boolean t(Object obj) {
        if (obj instanceof ra6) {
            ra6 ra6Var = (ra6) obj;
            if (ra6Var.e() == k45.f0 || ra6Var.e() == k45.n0 || ra6Var.e() == sn1.q0) {
                Object value = ra6Var.getValue();
                if (value != null) {
                    return t(value);
                }
                return true;
            }
        } else if (!(obj instanceof wi2) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (h[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void u(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            i.i(wh1.f(i2, i3, "startIndex: ", " > endIndex: "));
            return;
        }
        c44.p(b31.s(i2, i3, "startIndex: ", ", endIndex: ", ", size: "), i4);
    }

    public static final void v(WorkDatabase workDatabase, ew0 ew0Var, ah7 ah7Var) {
        int i2;
        workDatabase.getClass();
        ew0Var.getClass();
        ArrayList f0 = l07.f0(ah7Var);
        int i3 = 0;
        while (!f0.isEmpty()) {
            List<id4> list = ((ah7) tq0.b1(f0)).d;
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (id4 id4Var : list) {
                    if (!id4Var.b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        l07.u0();
                        throw null;
                    }
                }
                continue;
            }
            i3 += i2;
        }
        if (i3 != 0) {
            int intValue = ((Number) mh7.X(workDatabase.w().a, true, false, new ci7(0))).intValue();
            int i4 = ew0Var.j;
            if (intValue + i3 <= i4) {
                return;
            }
            i.i(wh1.m(b31.s(i4, intValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }

    public static void w(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            i.i(wh1.f(i2, i3, "fromIndex: ", " > toIndex: "));
            return;
        }
        c44.p(b31.s(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "), i4);
    }

    public static final void x(v86 v86Var, ArrayList arrayList, int i2) {
        boolean l2 = v86Var.l(i2);
        int[] iArr = v86Var.b;
        if (l2) {
            arrayList.add(v86Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            x(v86Var, arrayList, i4);
        }
    }

    public static final int y(long j2, long j3) {
        boolean J = J(j2);
        if (J != J(j3)) {
            if (!J) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(G(j2) - G(j3));
        if (Math.min(G(j2), G(j3)) >= RecyclerView.A1 && I(j2) != I(j3)) {
            if (!I(j2)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nj7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [zd2, io1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zd2 z(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            v91 r0 = new v91
            r0.<init>()
            goto L11
        Lc:
            nj7 r0 = new nj7
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            defpackage.nl2.C(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r6 = r5
            goto L7c
        L4b:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.Signature[] r0 = r0.a(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
        L59:
            if (r3 >= r2) goto L67
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            xd2 r6 = new xd2     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r9 = "emojicompat-emoji-font"
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L7c
        L75:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7c:
            if (r6 != 0) goto L7f
            goto L89
        L7f:
            zd2 r5 = new zd2
            yd2 r0 = new yd2
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.z(android.content.Context):zd2");
    }
}
