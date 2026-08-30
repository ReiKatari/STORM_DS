package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mh7  reason: default package */
/* loaded from: classes.dex */
public abstract class mh7 {
    public static final uv a = new Object();
    public static final et0 b = new et0(-1689893858, false, new ot0(21));
    public static final et0 c = new et0(851538357, false, new xk0(13));
    public static final et0 d;
    public static final et0 e;
    public static final et0 f;
    public static final et0 g;
    public static final et0 h;
    public static final et0 i;
    public static final et0 j;
    public static final int[] k;
    public static final int[] l;
    public static final h06[] m;
    public static final s67 n;
    public static final s67 o;
    public static final s67 p;
    public static final s67 q;
    public static final s67 r;
    public static final /* synthetic */ int s = 0;
    public static ax2 t;

    /* JADX WARN: Type inference failed for: r0v0, types: [uv, java.lang.Object] */
    static {
        new et0(866784315, false, new xk0(28));
        d = new et0(1714259275, false, new xk0(29));
        e = new et0(-1836397928, false, new pt0(13));
        f = new et0(-1406416085, false, new qt0(0));
        g = new et0(566090785, false, new qt0(1));
        h = new et0(-1624772335, false, new qt0(2));
        i = new et0(939725476, false, new pt0(14));
        j = new et0(-1341284559, false, new qt0(3));
        k = new int[]{16842752, R.attr.theme};
        l = new int[]{R.attr.materialThemeOverlay};
        m = new h06[0];
        n = new s67(19);
        o = new s67(20);
        p = new s67(21);
        q = new s67(22);
        r = new s67(23);
    }

    public static int A(byte[] bArr, int i2, wt wtVar) {
        int E = E(bArr, i2, wtVar);
        int i3 = wtVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                wtVar.c = "";
                return E;
            }
            wtVar.c = new String(bArr, E, i3, s33.a);
            return E + i3;
        }
        throw i53.c();
    }

    public static int B(byte[] bArr, int i2, wt wtVar) {
        int E = E(bArr, i2, wtVar);
        int i3 = wtVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                wtVar.c = "";
                return E;
            }
            wtVar.c = c67.a.j(bArr, E, i3);
            return E + i3;
        }
        throw i53.c();
    }

    public static int C(int i2, byte[] bArr, int i3, int i4, r27 r27Var, wt wtVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                r27Var.c(i2, Integer.valueOf(v(i3, bArr)));
                                return i3 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        r27 b2 = r27.b();
                        int i6 = (i2 & (-8)) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i3 >= i4) {
                                break;
                            }
                            int E = E(bArr, i3, wtVar);
                            int i8 = wtVar.a;
                            if (i8 == i6) {
                                i7 = i8;
                                i3 = E;
                                break;
                            }
                            i3 = C(i8, bArr, E, i4, b2, wtVar);
                            i7 = i8;
                        }
                        if (i3 <= i4 && i7 == i6) {
                            r27Var.c(i2, b2);
                            return i3;
                        }
                        throw i53.d();
                    }
                    int E2 = E(bArr, i3, wtVar);
                    int i9 = wtVar.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - E2) {
                            if (i9 == 0) {
                                r27Var.c(i2, x70.B);
                            } else {
                                r27Var.c(i2, x70.d(bArr, E2, i9));
                            }
                            return E2 + i9;
                        }
                        throw i53.e();
                    }
                    throw i53.c();
                }
                r27Var.c(i2, Long.valueOf(w(i3, bArr)));
                return i3 + 8;
            }
            int G = G(bArr, i3, wtVar);
            r27Var.c(i2, Long.valueOf(wtVar.b));
            return G;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int D(int i2, byte[] bArr, int i3, wt wtVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            wtVar.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            wtVar.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            wtVar.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            wtVar.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                wtVar.a = i12;
                return i13;
            }
        }
    }

    public static int E(byte[] bArr, int i2, wt wtVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            wtVar.a = b2;
            return i3;
        }
        return D(b2, bArr, i3, wtVar);
    }

    public static int F(int i2, byte[] bArr, int i3, int i4, r33 r33Var, wt wtVar) {
        s23 s23Var = (s23) r33Var;
        int E = E(bArr, i3, wtVar);
        s23Var.c(wtVar.a);
        while (E < i4) {
            int E2 = E(bArr, E, wtVar);
            if (i2 != wtVar.a) {
                break;
            }
            E = E(bArr, E2, wtVar);
            s23Var.c(wtVar.a);
        }
        return E;
    }

    public static int G(byte[] bArr, int i2, wt wtVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            wtVar.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b3 = bArr[i3];
        long j3 = (j2 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b2 & Byte.MAX_VALUE) << i5;
            b3 = bArr[i4];
            i4 = i6;
        }
        wtVar.b = j3;
        return i4;
    }

    public static final void H(q04 q04Var, oh0 oh0Var, b60 b60Var, float f2, u26 u26Var, qo6 qo6Var, ik1 ik1Var) {
        ArrayList arrayList = q04Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wi4 wi4Var = (wi4) arrayList.get(i2);
            wi4Var.a.g(oh0Var, b60Var, f2, u26Var, qo6Var, ik1Var);
            oh0Var.g(RecyclerView.A1, wi4Var.a.b());
        }
    }

    public static final void I(ls5 ls5Var) {
        ls5Var.getClass();
        ip3 C = l07.C();
        ns5 i0 = ls5Var.i0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (i0.a0()) {
            try {
                C.add(i0.q(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq2.h(i0, th);
                    throw th2;
                }
            }
        }
        iq2.h(i0, null);
        ListIterator listIterator = l07.t(C).listIterator(0);
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            if (wr2Var.hasNext()) {
                String str = (String) wr2Var.next();
                if (gh6.n0(str, "room_fts_content_sync_", false)) {
                    yf2.o(ls5Var, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final boolean J(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static boolean K(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursor.getCount() > 0) {
                    z = true;
                }
                p(cursor);
                return z;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                p(cursor);
                return false;
            }
        } catch (Throwable th) {
            p(cursor);
            throw th;
        }
    }

    public static final Object L(Context context, Class cls) {
        context.getClass();
        return dk7.v(cls, f34.F(context.getApplicationContext()));
    }

    public static final e31 M(sq5 sq5Var, boolean z, k11 k11Var) {
        e31 e31Var;
        ow6 ow6Var = (ow6) k11Var.a().I(ow6.B);
        if (ow6Var != null) {
            e31Var = ow6Var.A;
        } else {
            e31Var = null;
        }
        if (sq5Var.k()) {
            if (e31Var != null) {
                g11 g11Var = sq5Var.a;
                if (g11Var != null) {
                    return g11Var.B.C(e31Var);
                }
                b53.g0("coroutineScope");
                throw null;
            } else if (z) {
                e31 e31Var2 = sq5Var.b;
                if (e31Var2 != null) {
                    return e31Var2;
                }
                b53.g0("transactionContext");
                throw null;
            } else {
                g11 g11Var2 = sq5Var.a;
                if (g11Var2 != null) {
                    return g11Var2.B;
                }
                b53.g0("coroutineScope");
                throw null;
            }
        }
        g11 g11Var3 = sq5Var.a;
        if (g11Var3 != null) {
            e31 e31Var3 = g11Var3.B;
            if (e31Var == null) {
                e31Var = mp1.A;
            }
            return e31Var3.C(e31Var);
        }
        b53.g0("coroutineScope");
        throw null;
    }

    public static final ax2 N() {
        ax2 ax2Var = t;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.EmojiEvents", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.0f, 5.0f);
        vq2Var.l(-2.0f);
        vq2Var.t(3.0f);
        vq2Var.k(7.0f);
        vq2Var.u(2.0f);
        vq2Var.k(5.0f);
        vq2Var.h(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        vq2Var.u(1.0f);
        vq2Var.i(RecyclerView.A1, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        vq2Var.i(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        vq2Var.t(19.0f);
        vq2Var.k(7.0f);
        vq2Var.u(2.0f);
        vq2Var.l(10.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(-4.0f);
        vq2Var.u(-3.1f);
        vq2Var.i(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        vq2Var.h(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        vq2Var.t(7.0f);
        vq2Var.h(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        vq2Var.g();
        vq2Var.o(5.0f, 8.0f);
        vq2Var.t(7.0f);
        vq2Var.l(2.0f);
        vq2Var.u(3.82f);
        vq2Var.h(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        vq2Var.g();
        vq2Var.o(19.0f, 8.0f);
        vq2Var.i(RecyclerView.A1, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        vq2Var.t(7.0f);
        vq2Var.l(2.0f);
        vq2Var.t(8.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        t = b2;
        return b2;
    }

    public static Object O(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p2.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static zy3 Q(zy3 zy3Var, l14 l14Var) {
        return zy3Var.f(new ps2(l14Var));
    }

    public static void R(List list) {
        if (!list.isEmpty()) {
            int i2 = 0;
            do {
                try {
                    ((hc1) list.get(i2)).d();
                    i2++;
                } catch (gc1 e2) {
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        ((hc1) list.get(i3)).b();
                    }
                    throw e2;
                }
            } while (i2 < list.size());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (defpackage.zg6.B0(r1) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kc5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S(android.content.Context r6) {
        /*
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131034114(0x7f050002, float:1.7678736E38)
            boolean r6 = r6.getBoolean(r0)
            r0 = 0
            if (r6 == 0) goto La1
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r6 < r1) goto La1
            java.lang.String[] r6 = android.os.Build.SUPPORTED_64_BIT_ABIS
            r6.getClass()
            int r1 = r6.length
            r2 = r0
        L1b:
            if (r2 >= r1) goto La1
            r3 = r6[r2]
            java.lang.String r4 = "arm64-v8a"
            r5 = 1
            boolean r3 = defpackage.gh6.g0(r3, r4, r5)
            if (r3 == 0) goto L9d
            java.lang.String r6 = "/sys/class/kgsl/kgsl-3d0/gpu_model_name"
            java.lang.String r1 = "/proc/gpuinfo"
            java.lang.String r2 = "/sys/class/kgsl/kgsl-3d0/gpu_model"
            java.lang.String[] r6 = new java.lang.String[]{r2, r6, r1}
            java.util.List r6 = defpackage.l07.c0(r6)
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L63
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L63
            boolean r1 = r3.isFile()     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L53
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 == 0) goto L61
            java.lang.String r1 = defpackage.q72.L(r3)     // Catch: java.lang.Throwable -> L63
            boolean r3 = defpackage.zg6.B0(r1)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L61
            goto L6a
        L61:
            r1 = r2
            goto L6a
        L63:
            r1 = move-exception
            kc5 r3 = new kc5
            r3.<init>(r1)
            r1 = r3
        L6a:
            boolean r3 = r1 instanceof defpackage.kc5
            if (r3 == 0) goto L70
            goto L71
        L70:
            r2 = r1
        L71:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3a
        L75:
            if (r2 != 0) goto L79
            java.lang.String r2 = ""
        L79:
            java.lang.String r6 = "adreno"
            boolean r6 = defpackage.zg6.q0(r2, r6, r5)
            if (r6 == 0) goto L83
        L81:
            r6 = r5
            goto L99
        L83:
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "/sys/class/kgsl/kgsl-3d0"
            r6.<init>(r1)
            boolean r6 = r6.exists()
            if (r6 == 0) goto L91
            goto L81
        L91:
            java.lang.String r6 = android.os.Build.HARDWARE
            java.lang.String r1 = "qcom"
            boolean r6 = defpackage.gh6.g0(r6, r1, r5)
        L99:
            if (r6 == 0) goto La1
            r0 = r5
            goto La1
        L9d:
            int r2 = r2 + 1
            goto L1b
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.S(android.content.Context):boolean");
    }

    public static final qo0 T(n93 n93Var) {
        qo0 c2 = n93Var.c();
        if (c2 instanceof qo0) {
            return c2;
        }
        f81.x(c2, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final long U(long j2, long j3, float f2) {
        ac4 ac4Var = dr0.x;
        long a2 = xq0.a(j2, ac4Var);
        long a3 = xq0.a(j3, ac4Var);
        float d2 = xq0.d(a2);
        float h2 = xq0.h(a2);
        float g2 = xq0.g(a2);
        float e2 = xq0.e(a2);
        float d3 = xq0.d(a3);
        float h3 = xq0.h(a3);
        float g3 = xq0.g(a3);
        float e3 = xq0.e(a3);
        if (f2 < RecyclerView.A1) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return xq0.a(n(ep2.y(h2, h3, f2), ep2.y(g2, g3, f2), ep2.y(e2, e3, f2), ep2.y(d2, d3, f2), ac4Var), xq0.f(j3));
    }

    public static final float V(long j2) {
        ar0 f2 = xq0.f(j2);
        if (!dk7.s(f2.b, 12884901888L)) {
            lz2.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) dk7.K(f2.b)));
        }
        ag5 ag5Var = ((eg5) f2).p;
        double a2 = ag5Var.a(xq0.h(j2));
        float a3 = (float) ((ag5Var.a(xq0.e(j2)) * 0.0722d) + (ag5Var.a(xq0.g(j2)) * 0.7152d) + (a2 * 0.2126d));
        if (a3 < RecyclerView.A1) {
            a3 = 0.0f;
        }
        if (a3 > 1.0f) {
            return 1.0f;
        }
        return a3;
    }

    public static final String W(qo0 qo0Var) {
        qo0Var.getClass();
        String c2 = qo0Var.c();
        if (c2 == null) {
            c2 = "<local class name not available>";
        }
        return wh1.A("Serializer for class '", c2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final Object X(sq5 sq5Var, boolean z, boolean z2, mi2 mi2Var) {
        ow6 ow6Var;
        sq5Var.getClass();
        ThreadLocal threadLocal = sq5Var.i;
        sq5Var.a();
        if (sq5Var.k() && !sq5Var.l()) {
            e31 e31Var = (e31) threadLocal.get();
            if (e31Var != null) {
                ow6Var = (ow6) e31Var.I(ow6.B);
            } else {
                ow6Var = null;
            }
            if (ow6Var != null) {
                i.n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        e31 e31Var2 = (e31) threadLocal.get();
        if (e31Var2 == null) {
            e31Var2 = mp1.A;
        }
        return ve2.Q(new g51(e31Var2, sq5Var, z2, z, mi2Var, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r10 == r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(defpackage.sq5 r8, defpackage.mi2 r9, defpackage.k11 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.h51
            if (r0 == 0) goto L13
            r0 = r10
            h51 r0 = (defpackage.h51) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h51 r0 = new h51
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.me2.a0(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r7
        L37:
            nk6 r8 = r0.X
            r9 = r8
            mi2 r9 = (defpackage.mi2) r9
            sq5 r8 = r0.R
            defpackage.me2.a0(r10)
            goto L94
        L42:
            defpackage.me2.a0(r10)
            return r10
        L46:
            defpackage.me2.a0(r10)
            return r10
        L4a:
            defpackage.me2.a0(r10)
            boolean r10 = r8.k()
            if (r10 == 0) goto L62
            kc r10 = new kc
            r10.<init>(r8, r9, r7, r4)
            r0.Z = r6
            java.lang.Object r8 = defpackage.ln2.X(r0, r10, r8)
            if (r8 != r1) goto L61
            goto La7
        L61:
            return r8
        L62:
            boolean r10 = r8.k()
            if (r10 == 0) goto L84
            boolean r10 = r8.n()
            if (r10 == 0) goto L84
            boolean r10 = r8.l()
            if (r10 == 0) goto L84
            j51 r10 = new j51
            r10.<init>(r8, r7, r9, r6)
            r0.Z = r5
            r9 = 0
            java.lang.Object r8 = r8.q(r9, r10, r0)
            if (r8 != r1) goto L83
            goto La7
        L83:
            return r8
        L84:
            r0.R = r8
            r10 = r9
            nk6 r10 = (defpackage.nk6) r10
            r0.X = r10
            r0.Z = r4
            e31 r10 = M(r8, r6, r0)
            if (r10 != r1) goto L94
            goto La7
        L94:
            e31 r10 = (defpackage.e31) r10
            y r2 = new y
            r2.<init>(r7, r9, r8)
            r0.R = r7
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = defpackage.tq5.G(r10, r2, r0)
            if (r8 != r1) goto La8
        La7:
            return r1
        La8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.Y(sq5, mi2, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(defpackage.j11 r14, defpackage.sq5 r15, boolean r16, boolean r17, defpackage.mi2 r18) {
        /*
            boolean r0 = r14 instanceof defpackage.k51
            if (r0 == 0) goto L14
            r0 = r14
            k51 r0 = (defpackage.k51) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d0 = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            k51 r0 = new k51
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.c0
            p31 r7 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r14.d0
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            if (r1 == 0) goto L4a
            if (r1 == r8) goto L46
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.me2.a0(r0)
            return r0
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r14)
            return r2
        L36:
            boolean r1 = r14.Z
            boolean r4 = r14.Y
            mi2 r5 = r14.X
            sq5 r6 = r14.R
            defpackage.me2.a0(r0)
            r12 = r1
            r11 = r4
            r13 = r5
            r10 = r6
            goto L95
        L46:
            defpackage.me2.a0(r0)
            return r0
        L4a:
            defpackage.me2.a0(r0)
            boolean r0 = r15.k()
            if (r0 == 0) goto L79
            boolean r0 = r15.n()
            if (r0 == 0) goto L79
            boolean r0 = r15.l()
            if (r0 == 0) goto L79
            e51 r0 = new e51
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.d0 = r8
            java.lang.Object r14 = r15.q(r1, r2, r14)
            if (r14 != r7) goto L78
            goto La9
        L78:
            return r14
        L79:
            r1 = r16
            r5 = r17
            r14.R = r15
            r6 = r18
            r14.X = r6
            r14.Y = r1
            r14.Z = r5
            r14.d0 = r4
            e31 r4 = M(r15, r5, r14)
            if (r4 != r7) goto L90
            goto La9
        L90:
            r10 = r15
            r11 = r1
            r0 = r4
            r12 = r5
            r13 = r6
        L95:
            e31 r0 = (defpackage.e31) r0
            f51 r8 = new f51
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.R = r2
            r14.X = r2
            r14.d0 = r3
            java.lang.Object r14 = defpackage.tq5.G(r0, r8, r14)
            if (r14 != r7) goto Laa
        La9:
            return r7
        Laa:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.Z(j11, sq5, boolean, boolean, mi2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r13, final defpackage.ki2 r14, final defpackage.et0 r15, final defpackage.aj2 r16, boolean r17, defpackage.tu0 r18, final int r19, final int r20) {
        /*
            r6 = r19
            r13.getClass()
            r14.getClass()
            r0 = r18
            sk2 r0 = (defpackage.sk2) r0
            r1 = 730854861(0x2b8ff5cd, float:1.0228985E-12)
            r0.Z(r1)
            r1 = r6 & 6
            if (r1 != 0) goto L21
            boolean r1 = r0.f(r13)
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = 2
        L1f:
            r1 = r1 | r6
            goto L22
        L21:
            r1 = r6
        L22:
            r2 = r6 & 48
            if (r2 != 0) goto L32
            boolean r2 = r0.h(r14)
            if (r2 == 0) goto L2f
            r2 = 32
            goto L31
        L2f:
            r2 = 16
        L31:
            r1 = r1 | r2
        L32:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L42
            boolean r2 = r0.h(r15)
            if (r2 == 0) goto L3f
            r2 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r2 = 128(0x80, float:1.8E-43)
        L41:
            r1 = r1 | r2
        L42:
            r2 = r6 & 3072(0xc00, float:4.305E-42)
            r11 = r16
            if (r2 != 0) goto L54
            boolean r2 = r0.h(r11)
            if (r2 == 0) goto L51
            r2 = 2048(0x800, float:2.87E-42)
            goto L53
        L51:
            r2 = 1024(0x400, float:1.435E-42)
        L53:
            r1 = r1 | r2
        L54:
            r2 = r20 & 16
            if (r2 == 0) goto L5d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L5a:
            r3 = r17
            goto L6f
        L5d:
            r3 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L5a
            r3 = r17
            boolean r4 = r0.g(r3)
            if (r4 == 0) goto L6c
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L6e
        L6c:
            r4 = 8192(0x2000, float:1.148E-41)
        L6e:
            r1 = r1 | r4
        L6f:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            r7 = 1
            if (r4 == r5) goto L78
            r4 = r7
            goto L79
        L78:
            r4 = 0
        L79:
            r5 = r1 & 1
            boolean r4 = r0.O(r5, r4)
            if (r4 == 0) goto La1
            if (r2 == 0) goto L85
            r8 = r7
            goto L86
        L85:
            r8 = r3
        L86:
            o00 r7 = new o00
            r12 = 0
            r9 = r13
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r2 = 2011387140(0x77e35504, float:9.221685E33)
            et0 r2 = defpackage.ct3.H0(r2, r7, r0)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r3 = 0
            defpackage.iq2.d(r14, r3, r2, r0, r1)
            r5 = r8
            goto La5
        La1:
            r0.R()
            r5 = r3
        La5:
            m55 r8 = r0.r()
            if (r8 == 0) goto Lb9
            p00 r0 = new p00
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r7 = r20
            r0.<init>()
            r8.d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.a(java.lang.String, ki2, et0, aj2, boolean, tu0, int, int):void");
    }

    public static long a0(Context context, Uri uri, String str, long j2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j3 = cursor.getLong(0);
                    p(cursor);
                    return j3;
                }
                p(cursor);
                return j2;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                p(cursor);
                return j2;
            }
        } catch (Throwable th) {
            p(cursor);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, defpackage.ar0 r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.b(float, float, float, float, ar0):long");
    }

    public static String b0(Context context, Uri uri, String str) {
        Cursor cursor;
        Throwable th;
        Exception exc;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        String string = cursor.getString(0);
                        p(cursor);
                        return string;
                    }
                    p(cursor);
                    return null;
                } catch (Exception e2) {
                    exc = e2;
                    Log.w("DocumentFile", "Failed query: " + exc);
                    p(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                p(cursor);
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            p(cursor);
            throw th;
        }
    }

    public static final long c(int i2) {
        long j2 = i2 << 32;
        int i3 = xq0.i;
        return j2;
    }

    public static final tv c0(Object obj, c55 c55Var, mi2 mi2Var, mi2 mi2Var2, s01 s01Var, int i2, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Y(1645646697);
        sk2Var.Y(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            vw2 a2 = g67.a(obj, sk2Var);
            l0(a2);
            sk2Var.Y(1094691773);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = new tv(a2, c55Var);
                sk2Var.h0(L);
            }
            tv tvVar = (tv) L;
            sk2Var.p(false);
            tvVar.g0 = mi2Var;
            tvVar.h0 = mi2Var2;
            tvVar.i0 = s01Var;
            tvVar.j0 = i2;
            tvVar.k0 = ((Boolean) sk2Var.j(j23.a)).booleanValue();
            tvVar.n0.setValue(c55Var);
            tvVar.m0.setValue(a2);
            tvVar.a();
            sk2Var.p(false);
            Trace.endSection();
            sk2Var.p(false);
            return tvVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = xq0.i;
        return j3;
    }

    public static void d0(q03 q03Var, float f2) {
        float f3;
        float f4;
        br5 br5Var = (br5) q03Var.B;
        CardView cardView = (CardView) q03Var.L;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != br5Var.e || br5Var.f != useCompatPadding || br5Var.g != preventCornerOverlap) {
            br5Var.e = f2;
            br5Var.f = useCompatPadding;
            br5Var.g = preventCornerOverlap;
            br5Var.b(null);
            br5Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            q03Var.B(0, 0, 0, 0);
            return;
        }
        br5 br5Var2 = (br5) q03Var.B;
        float f5 = br5Var2.e;
        float f6 = br5Var2.a;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - cr5.a) * f6) + f5);
        } else {
            int i2 = cr5.b;
            f3 = f5;
        }
        int ceil = (int) Math.ceil(f3);
        if (cardView.getPreventCornerOverlap()) {
            f4 = (float) (((1.0d - cr5.a) * f6) + (f5 * 1.5f));
        } else {
            f4 = f5 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f4);
        q03Var.B(ceil, ceil2, ceil, ceil2);
    }

    public static final void e(String str, boolean z, ki2 ki2Var, tu0 tu0Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        ki2 ki2Var2;
        boolean z3;
        boolean z4;
        str.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(883884621);
        if (sk2Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i2;
        int i9 = i3 & 2;
        if (i9 != 0) {
            i6 = i8 | 48;
        } else {
            if (sk2Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i8 | i5;
        }
        if (sk2Var.h(ki2Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i10 & 1, z2)) {
            if (i9 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            l.k(ki2Var, null, z4, pu.x(sk2Var), ct3.H0(-106743248, new n00(str, 0), sk2Var), sk2Var, ((i10 >> 6) & 14) | 805306368 | ((i10 << 3) & 896), 378);
            ki2Var2 = ki2Var;
            z3 = z4;
        } else {
            ki2Var2 = ki2Var;
            sk2Var.R();
            z3 = z;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new ml(str, z3, ki2Var2, i2, i3);
        }
    }

    public static final void f(am1 am1Var, final boolean z, final String str, zy3 zy3Var, String str2, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        zy3 zy3Var2;
        boolean z3;
        boolean z4;
        um umVar;
        aj2 x30Var;
        final k24 k24Var;
        um umVar2;
        Boolean bool;
        Boolean bool2;
        float f2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        float f3;
        float f4;
        am1Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1047753199);
        if (sk2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i2 | i3;
        if (sk2Var.f(str)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4 | 3072;
        if (sk2Var.f(str2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if (sk2Var.h(ki2Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i10 = i9 | i6;
        if ((74899 & i10) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i10 & 1, z2)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = a53.c(RecyclerView.A1);
                sk2Var.h0(L);
            }
            um umVar3 = (um) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = a53.c(RecyclerView.A1);
                sk2Var.h0(L2);
            }
            um umVar4 = (um) L2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = me2.G(Boolean.FALSE);
                sk2Var.h0(L3);
            }
            k24 k24Var2 = (k24) L3;
            boolean h2 = sk2Var.h(umVar3);
            Object L4 = sk2Var.L();
            if (h2 || L4 == sn1Var) {
                L4 = new zl1(umVar3, k24Var2, null, 0);
                sk2Var.h0(L4);
            }
            l.g(sk2Var, (aj2) L4, o27.a);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool3 = (Boolean) k24Var2.getValue();
            bool3.getClass();
            if ((i10 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h3 = z3 | sk2Var.h(umVar4);
            if ((i10 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z4 | h3;
            Object L5 = sk2Var.L();
            if (z8 || L5 == sn1Var) {
                umVar = umVar3;
                k24Var = k24Var2;
                umVar2 = umVar4;
                bool = valueOf;
                bool2 = bool3;
                f2 = RecyclerView.A1;
                x30Var = new x30(z, umVar2, ki2Var, k24Var, null, 1);
                sk2Var.h0(x30Var);
            } else {
                umVar = umVar3;
                k24Var = k24Var2;
                bool2 = bool3;
                umVar2 = umVar4;
                f2 = RecyclerView.A1;
                x30Var = L5;
                bool = valueOf;
            }
            l.h(bool, bool2, x30Var, sk2Var);
            float floatValue = ((Number) umVar.d()).floatValue();
            float g0 = 1.0f - g0(((Number) umVar2.d()).floatValue());
            am1 am1Var2 = am1.BOTH;
            if (am1Var != am1Var2 && am1Var != am1.TOP) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (am1Var != am1Var2 && am1Var != am1.BOTTOM) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (am1Var == am1Var2) {
                z7 = true;
            } else {
                z7 = false;
            }
            final float g02 = g0((floatValue - 0.04f) / 0.42f);
            final float g03 = g0(io2.l((floatValue - 0.42f) / 0.34f, f2, 1.0f));
            final float l2 = io2.l((floatValue - 0.58f) / 0.32f, f2, 1.0f);
            final float l3 = io2.l((floatValue - 0.16f) / 0.2f, f2, 1.0f);
            if (z7) {
                f3 = 0.36f;
            } else {
                f3 = 0.48f;
            }
            final float f5 = f3;
            zy3 i11 = dk7.i(l.r(o76.c, g0), jd7.r, iq2.g);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, i11);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l4);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            y60 y60Var = y60.n0;
            if (z7) {
                f4 = 0.78f;
            } else {
                f4 = 0.64f;
            }
            zy3Var2 = wy3.a;
            ct3.r(b53.Y(b53.z(1.0f, xq0.b(0.05f, xq0.d), dk7.h(a53.t(o76.b(zy3Var2, f4), gr5.b(20.0f)), sn1.o(l07.c0(new xq0(d(4279835168L)), new xq0(d(4279045650L))), RecyclerView.A1, RecyclerView.A1, 14)), gr5.b(20.0f)), 18.0f, 16.0f), null, ct3.H0(-920238867, new bj2() { // from class: ql1
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z9;
                    zy3 zy3Var3;
                    int i12;
                    h50 h50Var = (h50) obj;
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    h50Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((sk2) tu0Var2).f(h50Var)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & 19) != 18) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.O(intValue & 1, z9)) {
                        float a2 = h50Var.a() * f5;
                        h20 h20Var = y60.k0;
                        wy3 wy3Var = wy3.a;
                        zy3 b2 = o76.b(wy3Var, 1.0f);
                        lr0 a3 = jr0.a(rt.d, h20Var, sk2Var2, 54);
                        int hashCode2 = Long.hashCode(sk2Var2.T);
                        sm4 l5 = sk2Var2.l();
                        zy3 e02 = l07.e0(sk2Var2, b2);
                        nu0.i.getClass();
                        mv0 mv0Var2 = mu0.b;
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var2);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, mu0.f, a3);
                        oo2.S(sk2Var2, mu0.e, l5);
                        oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode2));
                        oo2.P(sk2Var2, mu0.h);
                        oo2.S(sk2Var2, mu0.d, e02);
                        boolean z10 = z5;
                        float f6 = g03;
                        boolean z11 = z7;
                        float f7 = g02;
                        float f8 = l2;
                        if (z10) {
                            sk2Var2.X(1214458387);
                            zy3 p2 = l07.p(o76.d(wy3Var, a2), 1.3333334f);
                            if (z11) {
                                sk2Var2.X(1214748020);
                                boolean c2 = sk2Var2.c(f7);
                                Object L6 = sk2Var2.L();
                                if (c2 || L6 == su0.a) {
                                    L6 = new tl1(0, f7);
                                    sk2Var2.h0(L6);
                                }
                                zy3Var3 = tq5.q(wy3Var, (mi2) L6);
                                sk2Var2.p(false);
                            } else {
                                sk2Var2.X(1215043791);
                                sk2Var2.p(false);
                                zy3Var3 = wy3Var;
                            }
                            mh7.h(f6, p2.f(zy3Var3), ct3.H0(2725160, new ul1(f8), sk2Var2), sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                            sk2Var2.p(false);
                        } else {
                            sk2Var2.X(1215269471);
                            sk2Var2.p(false);
                        }
                        if (z11) {
                            sk2Var2.X(1215316436);
                            d50.a(dk7.i(a53.t(o76.d(o76.k(b53.Z(wy3Var, RecyclerView.A1, 5.0f, 1), 52.0f), 2.0f), gr5.a), xq0.b((f7 * 0.45f) + 0.2f, mj2.C(sk2Var2).j), iq2.g), sk2Var2, 0);
                            sk2Var2.p(false);
                        } else {
                            sk2Var2.X(1215696031);
                            sk2Var2.p(false);
                        }
                        if (z6) {
                            sk2Var2.X(1215745538);
                            mh7.h(f6, l07.p(o76.d(wy3Var, a2), 1.3333334f), ct3.H0(-2105757344, new vl1(str, z, f8, k24Var), sk2Var2), sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                            sk2Var2.p(false);
                        } else {
                            sk2Var2.X(1216234687);
                            sk2Var2.p(false);
                        }
                        sk2Var2.p(true);
                        mh7.k(l3, 0, sk2Var2, b53.b0(y60.n0.i(wy3Var, y60.d0), 2.0f, RecyclerView.A1, RecyclerView.A1, 2.0f, 6));
                    } else {
                        sk2Var2.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, 3072);
            if (str2 != null && !zg6.B0(str2)) {
                sk2Var.X(2039473322);
                String upperCase = str2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                long d3 = d(4288324272L);
                ml2 ml2Var = td7.c;
                ir6.b(upperCase, l.r(b53.b0(o76.c(y60Var.i(zy3Var2, y60.e0), 1.0f), 32.0f, RecyclerView.A1, 32.0f, 22.0f, 2), l2), d3, hi2.B(11), null, ml2Var, hi2.A(1.2d), new kn6(3), hi2.B(15), 0, false, 0, 0, null, null, sk2Var, 14159232, 6, 129328);
                sk2Var.p(false);
            } else {
                sk2Var.X(2040006987);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
            zy3Var2 = zy3Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new sl1(am1Var, z, str, zy3Var2, str2, ki2Var, i2);
        }
    }

    public static final zy3 f0(vp6 vp6Var) {
        return new co6(vp6Var);
    }

    public static final void g(final String str, final boolean z, final float f2, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        String str2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1957019050);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (sk2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.c(f2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i8 & 1, z2)) {
            h20 h20Var = y60.k0;
            wy3 wy3Var = wy3.a;
            zy3 Z = b53.Z(l.r(wy3Var, f2), 10.0f, RecyclerView.A1, 2);
            lr0 a2 = jr0.a(rt.c, h20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Z);
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
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                str2.getClass();
            } else {
                str2 = "NINTENDO DS";
            }
            long d2 = d(4289969095L);
            ml2 ml2Var = td7.c;
            String str3 = str2;
            ir6.b(str3, null, d2, hi2.B(11), pe2.c0, ml2Var, hi2.B(1), new kn6(3), hi2.B(14), 2, false, 2, 0, null, null, sk2Var, 14355840, 3126, 119058);
            sk2Var = sk2Var;
            if (z) {
                sk2Var.X(1182857542);
                cg2.k(sk2Var, o76.d(wy3Var, 7.0f));
                j(d(4286350482L), sk2Var, 6);
                sk2Var.p(false);
            } else {
                sk2Var.X(1182957486);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2(str, z, f2, i2) { // from class: wl1
                public final /* synthetic */ String A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ float L;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    mh7.g(this.A, this.B, this.L, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final float g0(float f2) {
        float l2 = io2.l(f2, RecyclerView.A1, 1.0f);
        return (3.0f - (l2 * 2.0f)) * l2 * l2;
    }

    public static final void h(final float f2, final zy3 zy3Var, final et0 et0Var, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1778930922);
        if (sk2Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.f(zy3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            long j2 = mj2.C(sk2Var).j;
            zy3 t2 = a53.t(zy3Var, gr5.b(9.0f));
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            if (z2 || L == su0.a) {
                L = new tl1(1, f2);
                sk2Var.h0(L);
            }
            zy3 z3 = b53.z(1.0f, xq0.b(0.3f * f2, j2), l07.E(t2, (mi2) L), gr5.b(9.0f));
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, z3);
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
            et0Var.j(sk2Var, 6);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2(f2, zy3Var, et0Var, i2) { // from class: xl1
                public final /* synthetic */ float A;
                public final /* synthetic */ zy3 B;
                public final /* synthetic */ et0 L;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(385);
                    mh7.h(this.A, this.B, this.L, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final int h0(long j2) {
        float[] fArr = dr0.a;
        return (int) (xq0.a(j2, dr0.e) >>> 32);
    }

    public static final void i(float f2, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1634967559);
        if (sk2Var.c(f2)) {
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
        if (sk2Var.O(i4 & 1, z)) {
            i20 i20Var = y60.h0;
            zy3 r2 = l.r(wy3.a, f2);
            sr5 a2 = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r2);
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
            long d2 = d(4291350748L);
            sd2 sd2Var = td7.a;
            pe2 pe2Var = pe2.d0;
            ir6.b("Watermelon", null, d2, hi2.B(20), pe2Var, sd2Var, 0L, null, hi2.B(20), 0, false, 0, 0, null, null, sk2Var, 1772934, 6, 129938);
            ir6.b("DS", null, mj2.C(sk2Var).l, hi2.B(20), pe2Var, sd2Var, 0L, null, hi2.B(20), 0, false, 0, 0, null, null, sk2Var, 1772550, 6, 129938);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new ul1(i2, f2);
        }
    }

    public static String i0(int i2) {
        return ej6.e("OperatingMode(mode=", i2, ')');
    }

    public static final void j(long j2, tu0 tu0Var, int i2) {
        boolean z;
        boolean z2;
        float f2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-577745276);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            az2 s2 = nl2.s(nl2.P("dsBootDots", sk2Var, 0), RecyclerView.A1, 3.0f, ct3.t0(ct3.V0(1050, 0, cn1.c, 2), null, 6), "dsBootDotsPhase", sk2Var, 29112, 0);
            sr5 a2 = rr5.a(rt.a, y60.g0, sk2Var, 0);
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
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            sk2Var.X(-1459646081);
            for (int i3 = 0; i3 < 3; i3++) {
                if (((int) ((Number) s2.R.getValue()).floatValue()) % 3 == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zy3 t2 = a53.t(o76.h(b53.Z(wy3Var, 2.0f, RecyclerView.A1, 2), 4.0f), gr5.a);
                if (z2) {
                    f2 = 0.95f;
                } else {
                    f2 = 0.3f;
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
            r2.d = new rl1(j2, i2, 0);
        }
    }

    public static String j0(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + nl2.b0(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + nl2.b0(Float.intBitsToFloat(i2)) + ", " + nl2.b0(Float.intBitsToFloat(i3)) + ')';
    }

    public static final void k(float f2, int i2, tu0 tu0Var, zy3 zy3Var) {
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-713067316);
        if (sk2Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.f(zy3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            az2 s2 = nl2.s(nl2.P("dsBootLed", sk2Var, 0), 0.75f, 1.0f, ct3.t0(ct3.V0(1300, 0, cn1.c, 2), ka5.Reverse, 4), "dsBootLedBreathe", sk2Var, 29112, 0);
            long j2 = mj2.C(sk2Var).l;
            float floatValue = ((Number) s2.R.getValue()).floatValue() * f2;
            zy3 h2 = o76.h(zy3Var, 14.0f);
            tv3 d2 = d50.d(y60.Z, false);
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
            wy3 wy3Var = wy3.a;
            zy3 h3 = o76.h(wy3Var, 14.0f);
            fr5 fr5Var = gr5.a;
            zy3 t2 = a53.t(h3, fr5Var);
            long b2 = xq0.b(0.3f * floatValue, j2);
            is2 is2Var = iq2.g;
            d50.a(dk7.i(t2, b2, is2Var), sk2Var, 0);
            d50.a(dk7.i(a53.t(o76.h(wy3Var, 6.0f), fr5Var), xq0.b((floatValue * 0.55f) + 0.45f, j2), is2Var), sk2Var, 0);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new yl1(f2, i2, zy3Var);
        }
    }

    public static void k0(String str) {
        String A = wh1.A("If you wish to display this ", str, ", use androidx.compose.foundation.Image.");
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + A);
    }

    public static final void l(ft5 ft5Var, boolean z, wc2 wc2Var, ki2 ki2Var, ki2 ki2Var2, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        Uri uri;
        boolean z3;
        boolean z4;
        float f2;
        ki2 ki2Var3;
        long j2;
        dn dnVar;
        dn dnVar2;
        dn dnVar3;
        dn dnVar4;
        Context context;
        yd ydVar;
        float f3;
        boolean z5;
        j20 j20Var;
        j20 j20Var2;
        long b2;
        String W;
        boolean z6;
        jd7 jd7Var;
        String o2;
        ft5 ft5Var2 = ft5Var;
        j20 j20Var3 = y60.Z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-958904355);
        if (sk2Var.h(ft5Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (sk2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (sk2Var.f(wc2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (sk2Var.h(ki2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (sk2Var.h(ki2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i12 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            Context context2 = (Context) sk2Var.j(ue.b);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            boolean z7 = ft5Var2.b;
            Uri uri2 = ft5Var2.d;
            int i13 = ft5Var2.a;
            if (!z7 && !z) {
                uri = uri2;
                z3 = false;
            } else {
                uri = uri2;
                z3 = true;
            }
            if (i13 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            fr5 b3 = gr5.b(11.0f);
            if (z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.45f;
            }
            wy3 wy3Var = wy3.a;
            zy3 r2 = l.r(wy3Var, f2);
            if (wc2Var != null) {
                r2 = b53.I(r2, wc2Var);
            }
            zy3 zy3Var = r2;
            if (z7) {
                ki2Var3 = ki2Var2;
            } else {
                ki2Var3 = null;
            }
            Uri uri3 = uri;
            zy3 v = a53.v(zy3Var, l14Var, z3, ki2Var3, ki2Var, 440);
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, v);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar5 = mu0.f;
            oo2.S(sk2Var, dnVar5, a3);
            dn dnVar6 = mu0.e;
            oo2.S(sk2Var, dnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar7 = mu0.g;
            oo2.S(sk2Var, dnVar7, valueOf);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var, ydVar2);
            dn dnVar8 = mu0.d;
            oo2.S(sk2Var, dnVar8, e0);
            zy3 t2 = a53.t(l07.p(o76.c(wy3Var, 1.0f), 1.3333334f), b3);
            long j3 = C.d;
            long j4 = C.j;
            is2 is2Var = iq2.g;
            zy3 i14 = dk7.i(t2, j3, is2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                j2 = j4;
            } else if (z4 && z7) {
                j2 = j4;
                j4 = xq0.b(0.8f, j4);
            } else {
                j2 = j4;
                j4 = C.f;
            }
            zy3 z8 = b53.z(2.0f, j4, i14, b3);
            j20 j20Var4 = y60.L;
            tv3 d2 = d50.d(j20Var4, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, z8);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar5, d2);
            oo2.S(sk2Var, dnVar6, l3);
            b31.x(hashCode2, sk2Var, dnVar7, sk2Var, ydVar2);
            oo2.S(sk2Var, dnVar8, e02);
            y60 y60Var = y60.n0;
            if (z7 && uri3 != null) {
                sk2Var.X(1314718767);
                tw2 tw2Var = new tw2(context2);
                tw2Var.c = uri3;
                dnVar = dnVar8;
                dnVar2 = dnVar7;
                ydVar = ydVar2;
                j20Var = j20Var4;
                dnVar3 = dnVar6;
                dnVar4 = dnVar5;
                f3 = 2.0f;
                z5 = false;
                context = context2;
                cg2.b(tw2Var.a(), null, o76.c, r01.a, RecyclerView.A1, sk2Var, 1573296, 4024);
                sk2Var.p(false);
                j20Var2 = j20Var3;
            } else {
                dnVar = dnVar8;
                dnVar2 = dnVar7;
                dnVar3 = dnVar6;
                dnVar4 = dnVar5;
                context = context2;
                ydVar = ydVar2;
                f3 = 2.0f;
                z5 = false;
                j20Var = j20Var4;
                if (!z7) {
                    sk2Var.X(1315046375);
                    j20Var2 = j20Var3;
                    ev2.a(l07.L(), me2.X(sk2Var, R.string.save_state_empty_slot), y60Var.i(o76.h(wy3Var, 26.0f), j20Var3), C.i, sk2Var, 0, 0);
                    sk2Var.p(false);
                } else {
                    j20Var2 = j20Var3;
                    sk2Var.X(1315331265);
                    sk2Var.p(false);
                }
            }
            zy3 t3 = a53.t(b53.b0(y60Var.i(wy3Var, j20Var), 8.0f, 7.0f, RecyclerView.A1, RecyclerView.A1, 12), gr5.b(4.0f));
            if (z4) {
                b2 = j2;
            } else {
                b2 = xq0.b(0.45f, xq0.b);
            }
            zy3 Y = b53.Y(dk7.i(t3, b2, is2Var), 7.0f, f3);
            tv3 d3 = d50.d(j20Var, z5);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, Y);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar9 = dnVar4;
            oo2.S(sk2Var, dnVar9, d3);
            dn dnVar10 = dnVar3;
            oo2.S(sk2Var, dnVar10, l4);
            yd ydVar3 = ydVar;
            dn dnVar11 = dnVar2;
            b31.x(hashCode3, sk2Var, dnVar11, sk2Var, ydVar3);
            dn dnVar12 = dnVar;
            oo2.S(sk2Var, dnVar12, e03);
            if (z4) {
                W = b31.o(sk2Var, -259469719, R.string.save_state_slot_quick, sk2Var, z5);
            } else {
                sk2Var.X(-259370147);
                W = me2.W(R.string.save_state_slot_number, new Object[]{Integer.valueOf(i13)}, sk2Var);
                sk2Var.p(z5);
            }
            long j5 = xq0.d;
            ml2 ml2Var = td7.c;
            ir6.b(W, null, j5, hi2.A(8.5d), pe2.c0, ml2Var, 0L, null, hi2.B(10), 0, false, 0, 0, null, null, sk2Var, 1772928, 6, 129938);
            sk2Var.p(true);
            if (z7) {
                sk2Var.X(1316284794);
                zy3 t4 = a53.t(o76.h(b53.X(y60Var.i(wy3Var, y60.X), 6.0f), 24.0f), gr5.a);
                long j6 = xq0.b;
                zy3 s2 = a53.s(dk7.i(t4, xq0.b(0.45f, j6), is2Var), z5, null, ki2Var2, 15);
                tv3 d4 = d50.d(j20Var2, z5);
                jd7Var = C;
                int hashCode4 = Long.hashCode(sk2Var.T);
                sm4 l5 = sk2Var.l();
                zy3 e04 = l07.e0(sk2Var, s2);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar9, d4);
                oo2.S(sk2Var, dnVar10, l5);
                b31.x(hashCode4, sk2Var, dnVar11, sk2Var, ydVar3);
                oo2.S(sk2Var, dnVar12, e04);
                ax2 ax2Var = n40.v;
                if (ax2Var == null) {
                    zw2 zw2Var = new zw2("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i15 = f77.a;
                    mb6 mb6Var = new mb6(j6);
                    vq2 vq2Var = new vq2(1, (byte) 0);
                    vq2Var.o(6.0f, 19.0f);
                    vq2Var.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    vq2Var.l(8.0f);
                    vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
                    vq2Var.t(7.0f);
                    vq2Var.k(6.0f);
                    vq2Var.u(12.0f);
                    vq2Var.g();
                    vq2Var.o(19.0f, 4.0f);
                    vq2Var.l(-3.5f);
                    vq2Var.n(-1.0f, -1.0f);
                    vq2Var.l(-5.0f);
                    vq2Var.n(-1.0f, 1.0f);
                    vq2Var.k(5.0f);
                    vq2Var.u(2.0f);
                    vq2Var.l(14.0f);
                    vq2Var.t(4.0f);
                    vq2Var.g();
                    zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                    ax2Var = zw2Var.b();
                    n40.v = ax2Var;
                }
                ev2.a(ax2Var, null, o76.h(wy3Var, 14.0f), xq0.b(0.85f, j5), sk2Var, 3504, 0);
                sk2Var.p(true);
                z6 = false;
                sk2Var.p(false);
            } else {
                z6 = z5;
                jd7Var = C;
                sk2Var.X(1316998817);
                sk2Var.p(z6);
            }
            sk2Var.p(true);
            ft5Var2 = ft5Var;
            Date date = ft5Var2.c;
            if (z7 && date != null) {
                sk2Var.X(-1920267162);
                sk2Var.p(z6);
                o2 = wh1.l(DateFormat.getMediumDateFormat(context).format(date), " · ", DateFormat.getTimeFormat(context).format(date));
            } else {
                o2 = b31.o(sk2Var, -1920115603, R.string.save_state_empty_slot, sk2Var, z6);
            }
            ir6.b(o2, b53.b0(wy3Var, 2.0f, 6.0f, RecyclerView.A1, RecyclerView.A1, 12), jd7Var.i, hi2.A(9.5d), null, ml2Var, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, 1575984, 3120, 120752);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new gi(ft5Var2, z, wc2Var, ki2Var, ki2Var2, i2);
        }
    }

    public static final void l0(vw2 vw2Var) {
        Object obj = vw2Var.b;
        if (!(obj instanceof tw2)) {
            if (!(obj instanceof nh)) {
                if (!(obj instanceof ax2)) {
                    if (!(obj instanceof qi4)) {
                        if (vw2Var.c == null) {
                            return;
                        }
                        i.i("request.target must be null.");
                        return;
                    }
                    k0("Painter");
                    throw null;
                }
                k0("ImageVector");
                throw null;
            }
            k0("ImageBitmap");
            throw null;
        }
        i.i("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }

    public static final void m(List list, boolean z, String str, mi2 mi2Var, mi2 mi2Var2, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        int i9;
        is2 is2Var;
        jd7 jd7Var;
        wy3 wy3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        wc2 wc2Var;
        int i10;
        String str2;
        int i11;
        list.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1313320755);
        if (sk2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (sk2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (sk2Var.f(str)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i14 = i13 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i15 = i14 | i6;
        if (sk2Var.h(mi2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i16 = i15 | i7;
        if (sk2Var.h(ki2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i17 = i16 | i8;
        if ((74899 & i17) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i17 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new wc2();
                sk2Var.h0(L);
            }
            wc2 wc2Var2 = (wc2) L;
            int i18 = 458752 & i17;
            if (i18 == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L2 = sk2Var.L();
            if (z3 || L2 == sn1Var) {
                L2 = new w7(18, ki2Var);
                sk2Var.h0(L2);
            }
            b53.d(false, (ki2) L2, sk2Var, 0, 1);
            s72 s72Var = o76.c;
            long j2 = C.b;
            is2 is2Var2 = iq2.g;
            zy3 m0 = m0(dk7.i(s72Var, j2, is2Var2), o);
            if (i18 == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L3 = sk2Var.L();
            if (z4 || L3 == sn1Var) {
                L3 = new ox0(4, ki2Var);
                sk2Var.h0(L3);
            }
            zy3 B = w81.B(m0, (mi2) L3);
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, B);
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
            i20 i20Var = y60.h0;
            wy3 wy3Var2 = wy3.a;
            zy3 a0 = b53.a0(o76.c(wy3Var2, 1.0f), 8.0f, 7.0f, 16.0f, 7.0f);
            sr5 a3 = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a0);
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
            zy3 s2 = a53.s(a53.t(o76.h(wy3Var2, 38.0f), gr5.a), false, null, ki2Var, 15);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, s2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            ev2.a(se.A(), me2.X(sk2Var, R.string.cancel), o76.h(wy3Var2, 20.0f), C.g, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var2, 8.0f));
            if (z) {
                i9 = R.string.save_state;
            } else {
                i9 = R.string.load_state;
            }
            ir6.b(me2.X(sk2Var, i9), null, C.g, hi2.B(15), pe2.c0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772544, 0, 130962);
            sk2 sk2Var2 = sk2Var;
            if (str != null) {
                sk2Var2.X(-51054938);
                is2Var = is2Var2;
                jd7Var = C;
                wy3Var = wy3Var2;
                ir6.b(str, b53.b0(wy3Var2, 8.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14).f(new xg3(1.0f, false)), C.i, hi2.A(9.5d), null, td7.c, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var2, ((i17 >> 6) & 14) | 1575936, 3120, 120752);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            } else {
                is2Var = is2Var2;
                jd7Var = C;
                wy3Var = wy3Var2;
                sk2Var2.X(-50688363);
                sk2Var2.p(false);
            }
            sk2Var2.p(true);
            d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), jd7Var.f, is2Var), sk2Var2, 0);
            co2 co2Var = new co2(150.0f);
            ot otVar = new ot(12.0f, true, new i(1));
            ot otVar2 = new ot(12.0f, true, new i(1));
            zy3 Z = b53.Z(o76.l(760.0f, 1, mr0.a()).f(new bs2(y60.k0)), 16.0f, RecyclerView.A1, 2);
            mh4 r2 = b53.r(RecyclerView.A1, 14.0f, 18.0f, 5);
            boolean h2 = sk2Var2.h(list);
            if ((i17 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = h2 | z5;
            if ((i17 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z8 | z6;
            if ((i17 & 57344) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z10 = z9 | z7;
            Object L4 = sk2Var2.L();
            if (!z10 && L4 != sn1Var) {
                wc2Var = wc2Var2;
                i10 = R.string.cancel;
                str2 = null;
            } else {
                wc2Var = wc2Var2;
                i10 = R.string.cancel;
                str2 = null;
                q34 q34Var = new q34(list, z, wc2Var, mi2Var, mi2Var2);
                sk2Var2.h0(q34Var);
                L4 = q34Var;
            }
            wc2 wc2Var3 = wc2Var;
            sk2 sk2Var3 = sk2Var2;
            oo2.g(co2Var, Z, null, r2, otVar2, otVar, null, false, null, (mi2) L4, sk2Var3, 1772544, 916);
            sk2Var = sk2Var3;
            lk2 lk2Var = new lk2(str2, me2.X(sk2Var, R.string.pause_hint_navigate));
            if (z) {
                i11 = R.string.save_state;
            } else {
                i11 = R.string.load_state;
            }
            oo2.b(l07.c0(lk2Var, new lk2("A", me2.X(sk2Var, i11)), new lk2("B", me2.X(sk2Var, i10))), null, false, sk2Var, 0, 6);
            sk2Var.p(true);
            oo2.k(wc2Var3, sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new sl1(list, z, str, mi2Var, mi2Var2, ki2Var, i2);
        }
    }

    public static final zy3 m0(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new ul6(mi2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long n(float r17, float r18, float r19, float r20, defpackage.ar0 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh7.n(float, float, float, float, ar0):long");
    }

    public static Context n0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return o0(context, attributeSet, i2, i3, new int[0]);
    }

    public static final Set o(h06 h06Var) {
        h06Var.getClass();
        if (h06Var instanceof q80) {
            return ((q80) h06Var).g();
        }
        HashSet hashSet = new HashSet(h06Var.d());
        int d2 = h06Var.d();
        for (int i2 = 0; i2 < d2; i2++) {
            hashSet.add(h06Var.e(i2));
        }
        return hashSet;
    }

    public static Context o0(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        if ((context instanceof h11) && ((h11) context).A == i4) {
            z = true;
        } else {
            z = false;
        }
        if (i4 != 0 && !z) {
            h11 h11Var = new h11(context, i4);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr3[i6];
                if (i7 != 0) {
                    h11Var.getTheme().applyStyle(i7, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, k);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                h11Var.getTheme().applyStyle(resourceId, true);
            }
            return h11Var;
        }
        return context;
    }

    public static void p(Cursor cursor) {
        if (cursor != null) {
            try {
                wh1.x(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static final h06[] q(List list) {
        h06[] h06VarArr;
        list = (list == null || list.isEmpty()) ? null : null;
        if (list != null && (h06VarArr = (h06[]) list.toArray(new h06[0])) != null) {
            return h06VarArr;
        }
        return m;
    }

    public static final long r(long j2, long j3) {
        float f2;
        float f3;
        long a2 = xq0.a(j2, xq0.f(j3));
        float d2 = xq0.d(j3);
        float d3 = xq0.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = xq0.h(a2);
        float h3 = xq0.h(j3);
        float f6 = RecyclerView.A1;
        int i2 = (f5 > RecyclerView.A1 ? 1 : (f5 == RecyclerView.A1 ? 0 : -1));
        if (i2 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = xq0.g(a2);
        float g3 = xq0.g(j3);
        if (i2 == 0) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = xq0.e(a2);
        float e3 = xq0.e(j3);
        if (i2 != 0) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return n(f2, f3, f6, f5, xq0.f(j3));
    }

    public static final kh7 s(Context context, ew0 ew0Var) {
        pq5 I;
        context.getClass();
        nh7 nh7Var = new nh7(ew0Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        k06 k06Var = nh7Var.a;
        k06Var.getClass();
        hm1 hm1Var = ew0Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        hm1Var.getClass();
        if (z) {
            I = new pq5(applicationContext, WorkDatabase.class, null);
            I.i = true;
        } else {
            I = nl2.I(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            I.h = new a31(24, applicationContext);
        }
        I.f = k06Var;
        I.d.add(new wo0(hm1Var));
        I.a(qy3.h);
        I.a(new kb5(applicationContext, 2, 3));
        I.a(qy3.i);
        I.a(qy3.j);
        I.a(new kb5(applicationContext, 5, 6));
        I.a(qy3.k);
        I.a(qy3.l);
        I.a(qy3.m);
        I.a(new kb5(applicationContext));
        I.a(new kb5(applicationContext, 10, 11));
        I.a(qy3.d);
        I.a(qy3.e);
        I.a(qy3.f);
        I.a(qy3.g);
        I.a(new kb5(applicationContext, 21, 22));
        I.p = false;
        I.q = true;
        I.r = true;
        WorkDatabase workDatabase = (WorkDatabase) I.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        jw6 jw6Var = new jw6(applicationContext2, nh7Var);
        ku4 ku4Var = new ku4(context.getApplicationContext(), ew0Var, nh7Var, workDatabase);
        return new kh7(context.getApplicationContext(), ew0Var, nh7Var, workDatabase, (List) lh7.c0.h(context, ew0Var, nh7Var, workDatabase, jw6Var, ku4Var), ku4Var, jw6Var);
    }

    public static final Object t(jv0 jv0Var, ew4 ew4Var) {
        if (!((yy3) jv0Var).A.i0) {
            mz2.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        sm4 sm4Var = (sm4) l.P(jv0Var).w0;
        sm4Var.getClass();
        return l.L(sm4Var, ew4Var);
    }

    public static int u(byte[] bArr, int i2, wt wtVar) {
        int E = E(bArr, i2, wtVar);
        int i3 = wtVar.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - E) {
                if (i3 == 0) {
                    wtVar.c = x70.B;
                    return E;
                }
                wtVar.c = x70.d(bArr, E, i3);
                return E + i3;
            }
            throw i53.e();
        }
        throw i53.c();
    }

    public static int v(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long w(int i2, byte[] bArr) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int x(cv5 cv5Var, byte[] bArr, int i2, int i3, int i4, wt wtVar) {
        rx3 rx3Var = (rx3) cv5Var;
        Object j2 = rx3Var.j();
        int F = rx3Var.F(j2, bArr, i2, i3, i4, wtVar);
        rx3Var.d(j2);
        wtVar.c = j2;
        return F;
    }

    public static int y(cv5 cv5Var, byte[] bArr, int i2, int i3, wt wtVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = D(i5, bArr, i4, wtVar);
            i5 = wtVar.a;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            Object j2 = cv5Var.j();
            int i7 = i6 + i5;
            cv5Var.f(j2, bArr, i6, i7, wtVar);
            cv5Var.d(j2);
            wtVar.c = j2;
            return i7;
        }
        throw i53.e();
    }

    public static int z(cv5 cv5Var, int i2, byte[] bArr, int i3, int i4, r33 r33Var, wt wtVar) {
        int y = y(cv5Var, bArr, i3, i4, wtVar);
        r33Var.add(wtVar.c);
        while (y < i4) {
            int E = E(bArr, y, wtVar);
            if (i2 != wtVar.a) {
                break;
            }
            y = y(cv5Var, bArr, E, i4, wtVar);
            r33Var.add(wtVar.c);
        }
        return y;
    }

    public abstract float P(l36 l36Var);

    public abstract void e0(l36 l36Var, float f2);
}
