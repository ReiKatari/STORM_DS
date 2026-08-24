package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Matrix;
import android.hardware.camera2.CameraAccessException;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateUtils;
import android.util.Log;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public abstract class hv {
    public static op5 g;
    public static e33 l;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static e33 o;
    public static final b40 a = new b40(-1.0f);
    public static final b40 b = new b40(1.0f);
    public static final zv0 c = new zv0(-1520532968, false, new fn0(19));
    public static final zv0 d = new zv0(-525934473, false, new fn0(20));
    public static final zv0 e = new zv0(-531717168, false, new iw0(22));
    public static final th1 f = new th1(1.0f, 1.0f);
    public static final Object h = new Object();
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final r76 j = new r76(21);
    public static final hd2 k = new hd2(0);

    public static final boolean A(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static boolean B(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursor.getCount() > 0) {
                    z = true;
                }
                k(cursor);
                return z;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                k(cursor);
                return false;
            }
        } catch (Throwable th) {
            k(cursor);
            throw th;
        }
    }

    public static int C(Exception exc) {
        String methodName;
        boolean z = false;
        if (exc instanceof CameraAccessException) {
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason != 2) {
                if (reason == 3) {
                    return 0;
                }
                if (reason == 4) {
                    return 1;
                }
                if (reason == 5) {
                    return 2;
                }
                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                return 11;
            }
            return 6;
        } else if (exc instanceof IllegalArgumentException) {
            return 7;
        } else {
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    stackTrace.getClass();
                    if (stackTrace.length == 0) {
                        methodName = null;
                    } else {
                        methodName = stackTrace[0].getMethodName();
                    }
                    z = nb3.k(methodName, "_enableShutterSound");
                }
                if (z) {
                    return 10;
                }
            }
            Log.w("CXCP", "Unexpected throwable: " + exc);
            return 11;
        }
    }

    public static final Object D(Context context, Class cls) {
        context.getClass();
        return q60.B(cls, vy7.k0(context.getApplicationContext()));
    }

    public static final e33 E() {
        e33 e33Var = l;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 13.0f);
        ww2Var.l(-6.0f);
        ww2Var.u(6.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(-6.0f);
        ww2Var.k(5.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(6.0f);
        ww2Var.t(5.0f);
        ww2Var.l(2.0f);
        ww2Var.u(6.0f);
        ww2Var.l(6.0f);
        ww2Var.u(2.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        l = b2;
        return b2;
    }

    public static final l61 F(m16 m16Var, boolean z, s41 s41Var) {
        l61 l61Var;
        b97 b97Var = (b97) s41Var.b().Z(b97.B);
        if (b97Var != null) {
            l61Var = b97Var.A;
        } else {
            l61Var = null;
        }
        if (m16Var.k()) {
            if (l61Var != null) {
                o41 o41Var = m16Var.a;
                if (o41Var != null) {
                    return o41Var.B.N(l61Var);
                }
                nb3.a0("coroutineScope");
                throw null;
            } else if (z) {
                l61 l61Var2 = m16Var.b;
                if (l61Var2 != null) {
                    return l61Var2;
                }
                nb3.a0("transactionContext");
                throw null;
            } else {
                o41 o41Var2 = m16Var.a;
                if (o41Var2 != null) {
                    return o41Var2.B;
                }
                nb3.a0("coroutineScope");
                throw null;
            }
        }
        o41 o41Var3 = m16Var.a;
        if (o41Var3 != null) {
            l61 l61Var3 = o41Var3.B;
            if (l61Var == null) {
                l61Var = vt1.A;
            }
            return l61Var3.N(l61Var);
        }
        nb3.a0("coroutineScope");
        throw null;
    }

    public static final a74 G(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new c50(qn2Var));
    }

    public static final a74 H(a74 a74Var, float f2, float f3, float f4, float f5, float f6, long j2, ke6 ke6Var, boolean z, long j3, long j4) {
        return a74Var.d(new vt2(f2, f3, f4, f5, f6, j2, ke6Var, z, j3, j4));
    }

    public static a74 I(a74 a74Var, float f2, float f3, float f4, float f5, float f6, ke6 ke6Var, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        jy2 jy2Var;
        boolean z;
        if ((i2 & 1) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f2;
        }
        if ((i2 & 2) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f3;
        }
        if ((i2 & 4) != 0) {
            f9 = 1.0f;
        } else {
            f9 = f4;
        }
        if ((i2 & 8) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f5;
        }
        if ((i2 & 16) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f6;
        }
        long j2 = i97.b;
        if ((i2 & 2048) != 0) {
            jy2Var = u24.m;
        } else {
            jy2Var = ke6Var;
        }
        if ((i2 & 4096) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        long j3 = yt2.a;
        return H(a74Var, f7, f8, f9, f10, f11, j2, jy2Var, z2, j3, j3);
    }

    public static void J(List list) {
        if (!list.isEmpty()) {
            int i2 = 0;
            do {
                try {
                    ((ig1) list.get(i2)).d();
                    i2++;
                } catch (hg1 e2) {
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        ((ig1) list.get(i3)).b();
                    }
                    throw e2;
                }
            } while (i2 < list.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ap6, java.lang.Object, r41] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final ap6 K(w61 w61Var, l61 l61Var, a71 a71Var, eo2 eo2Var) {
        ur3 ur3Var;
        l61 M = mb3.M(w61Var, l61Var);
        if (a71Var.isLazy()) {
            ur3Var = new ur3(M, eo2Var);
        } else {
            ur3Var = new q0(M, true);
        }
        a71Var.invoke(eo2Var, ur3Var, ur3Var);
        return ur3Var;
    }

    public static /* synthetic */ ap6 L(w61 w61Var, l61 l61Var, a71 a71Var, eo2 eo2Var, int i2) {
        if ((i2 & 1) != 0) {
            l61Var = vt1.A;
        }
        if ((i2 & 2) != 0) {
            a71Var = a71.DEFAULT;
        }
        return K(w61Var, l61Var, a71Var, eo2Var);
    }

    public static final long M(float f2, long j2, long j3) {
        yk4 yk4Var = qt0.x;
        long b2 = kt0.b(j2, yk4Var);
        long b3 = kt0.b(j3, yk4Var);
        float e2 = kt0.e(b2);
        float i2 = kt0.i(b2);
        float h2 = kt0.h(b2);
        float f3 = kt0.f(b2);
        float e3 = kt0.e(b3);
        float i3 = kt0.i(b3);
        float h3 = kt0.h(b3);
        float f4 = kt0.f(b3);
        if (f2 < RecyclerView.B1) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return kt0.b(h(oi2.L(i2, i3, f2), oi2.L(h2, h3, f2), oi2.L(f3, f4, f2), oi2.L(e2, e3, f2), yk4Var), kt0.g(j3));
    }

    public static final float N(long j2) {
        nt0 g2 = kt0.g(j2);
        if (!q60.A(g2.b, 12884901888L)) {
            o53.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) q60.a0(g2.b)));
        }
        yp5 yp5Var = ((cq5) g2).p;
        double c2 = yp5Var.c(kt0.i(j2));
        float c3 = (float) ((yp5Var.c(kt0.f(j2)) * 0.0722d) + (yp5Var.c(kt0.h(j2)) * 0.7152d) + (c2 * 0.2126d));
        if (c3 < RecyclerView.B1) {
            c3 = 0.0f;
        }
        if (c3 > 1.0f) {
            return 1.0f;
        }
        return c3;
    }

    public static final Object Q(m16 m16Var, boolean z, boolean z2, qn2 qn2Var) {
        b97 b97Var;
        m16Var.getClass();
        ThreadLocal threadLocal = m16Var.i;
        m16Var.a();
        if (m16Var.k() && !m16Var.l()) {
            l61 l61Var = (l61) threadLocal.get();
            if (l61Var != null) {
                b97Var = (b97) l61Var.Z(b97.B);
            } else {
                b97Var = null;
            }
            if (b97Var != null) {
                i.m("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        l61 l61Var2 = (l61) threadLocal.get();
        if (l61Var2 == null) {
            l61Var2 = vt1.A;
        }
        return hi2.L(new u81(l61Var2, m16Var, z2, z, qn2Var, null));
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
    */
    public static final Object R(m16 m16Var, qn2 qn2Var, s41 s41Var) {
        v81 v81Var;
        Object obj;
        int i2;
        m16 m16Var2;
        Object d0;
        if (s41Var instanceof v81) {
            v81 v81Var2 = (v81) s41Var;
            int i3 = v81Var2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v81Var2.Z = i3 - Integer.MIN_VALUE;
                v81Var = v81Var2;
                Object obj2 = v81Var.Y;
                obj = x61.COROUTINE_SUSPENDED;
                i2 = v81Var.Z;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    oi2.Y(obj2);
                                    return obj2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qn2Var = (qn2) v81Var.X;
                            m16 m16Var3 = v81Var.R;
                            oi2.Y(obj2);
                            m16Var2 = m16Var3;
                        } else {
                            oi2.Y(obj2);
                            return obj2;
                        }
                    } else {
                        oi2.Y(obj2);
                        return obj2;
                    }
                } else {
                    oi2.Y(obj2);
                    if (m16Var.k()) {
                        yc ycVar = new yc(m16Var, qn2Var, null, 3);
                        v81Var.Z = 1;
                        Object X = qo2.X(v81Var, ycVar, m16Var);
                        if (X != obj) {
                            return X;
                        }
                    } else if (m16Var.k() && m16Var.n() && m16Var.l()) {
                        x81 x81Var = new x81(m16Var, null, qn2Var, 1);
                        v81Var.Z = 2;
                        Object q = m16Var.q(false, x81Var, v81Var);
                        if (q != obj) {
                            return q;
                        }
                    } else {
                        v81Var.R = m16Var;
                        v81Var.X = (hw6) qn2Var;
                        v81Var.Z = 3;
                        obj2 = F(m16Var, true, v81Var);
                        m16Var2 = m16Var;
                    }
                    return obj;
                }
                z zVar = new z((r41) null, qn2Var, m16Var2);
                v81Var.R = null;
                v81Var.X = null;
                v81Var.Z = 4;
                d0 = d0((l61) obj2, zVar, v81Var);
                if (d0 != obj) {
                    return obj;
                }
                return d0;
            }
        }
        v81Var = new s41(s41Var);
        Object obj22 = v81Var.Y;
        obj = x61.COROUTINE_SUSPENDED;
        i2 = v81Var.Z;
        if (i2 == 0) {
        }
        z zVar2 = new z((r41) null, qn2Var, m16Var2);
        v81Var.R = null;
        v81Var.X = null;
        v81Var.Z = 4;
        d0 = d0((l61) obj22, zVar2, v81Var);
        if (d0 != obj) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(r41 r41Var, m16 m16Var, boolean z, boolean z2, qn2 qn2Var) {
        y81 y81Var;
        x61 x61Var;
        int i2;
        m16 m16Var2;
        boolean z3;
        boolean z4;
        qn2 qn2Var2;
        Object d0;
        if (r41Var instanceof y81) {
            y81 y81Var2 = (y81) r41Var;
            int i3 = y81Var2.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y81Var2.e0 = i3 - Integer.MIN_VALUE;
                y81Var = y81Var2;
                y81 y81Var3 = y81Var;
                Object obj = y81Var3.d0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i2 = y81Var3.e0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                oi2.Y(obj);
                                return obj;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = y81Var3.Z;
                        boolean z6 = y81Var3.Y;
                        qn2 qn2Var3 = y81Var3.X;
                        m16 m16Var3 = y81Var3.R;
                        oi2.Y(obj);
                        z4 = z5;
                        z3 = z6;
                        qn2Var2 = qn2Var3;
                        m16Var2 = m16Var3;
                    } else {
                        oi2.Y(obj);
                        return obj;
                    }
                } else {
                    oi2.Y(obj);
                    if (m16Var.k() && m16Var.n() && m16Var.l()) {
                        s81 s81Var = new s81(z2, z, m16Var, null, qn2Var, 1);
                        y81Var3.e0 = 1;
                        Object q = m16Var.q(z, s81Var, y81Var3);
                        if (q != x61Var) {
                            return q;
                        }
                    } else {
                        y81Var3.R = m16Var;
                        y81Var3.X = qn2Var;
                        y81Var3.Y = z;
                        y81Var3.Z = z2;
                        y81Var3.e0 = 2;
                        l61 F = F(m16Var, z2, y81Var3);
                        if (F != x61Var) {
                            m16Var2 = m16Var;
                            z3 = z;
                            obj = F;
                            z4 = z2;
                            qn2Var2 = qn2Var;
                        }
                    }
                    return x61Var;
                }
                t81 t81Var = new t81((r41) null, m16Var2, z3, z4, qn2Var2);
                y81Var3.R = null;
                y81Var3.X = null;
                y81Var3.e0 = 3;
                d0 = d0((l61) obj, t81Var, y81Var3);
                if (d0 != x61Var) {
                    return x61Var;
                }
                return d0;
            }
        }
        y81Var = new s41(r41Var);
        y81 y81Var32 = y81Var;
        Object obj2 = y81Var32.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i2 = y81Var32.e0;
        if (i2 == 0) {
        }
        t81 t81Var2 = new t81((r41) null, m16Var2, z3, z4, qn2Var2);
        y81Var32.R = null;
        y81Var32.X = null;
        y81Var32.e0 = 3;
        d0 = d0((l61) obj2, t81Var2, y81Var32);
        if (d0 != x61Var) {
        }
    }

    public static long T(Context context, Uri uri, String str, long j2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j3 = cursor.getLong(0);
                    k(cursor);
                    return j3;
                }
                k(cursor);
                return j2;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                k(cursor);
                return j2;
            }
        } catch (Throwable th) {
            k(cursor);
            throw th;
        }
    }

    public static String U(Context context, Uri uri, String str) {
        Cursor cursor;
        Throwable th;
        Exception exc;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        String string = cursor.getString(0);
                        k(cursor);
                        return string;
                    }
                    k(cursor);
                    return null;
                } catch (Exception e2) {
                    exc = e2;
                    Log.w("DocumentFile", "Failed query: " + exc);
                    k(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                k(cursor);
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            k(cursor);
            throw th;
        }
    }

    public static final Object V(l61 l61Var, eo2 eo2Var) {
        l62 l62Var;
        l61 A;
        long q0;
        av0 av0Var;
        Thread currentThread = Thread.currentThread();
        k61 k61Var = d90.r0;
        n61 n61Var = (n61) l61Var.Z(k61Var);
        vt1 vt1Var = vt1.A;
        if (n61Var == null) {
            l62Var = m57.a();
            A = mb3.A(vt1Var, l61Var.N(l62Var), true);
            xe1 xe1Var = xk1.a;
            if (A != xe1Var && A.Z(k61Var) == null) {
                A = A.N(xe1Var);
            }
        } else {
            l62Var = (l62) m57.a.get();
            A = mb3.A(vt1Var, l61Var, true);
            xe1 xe1Var2 = xk1.a;
            if (A != xe1Var2 && A.Z(k61Var) == null) {
                A = A.N(xe1Var2);
            }
        }
        k50 k50Var = new k50(A, currentThread, l62Var);
        a71.DEFAULT.invoke(eo2Var, k50Var, k50Var);
        l62 l62Var2 = k50Var.Z;
        if (l62Var2 != null) {
            int i2 = l62.Y;
            l62Var2.p0(false);
        }
        while (true) {
            if (l62Var2 != null) {
                try {
                    q0 = l62Var2.q0();
                } catch (Throwable th) {
                    if (l62Var2 != null) {
                        int i3 = l62.Y;
                        l62Var2.n0(false);
                    }
                    throw th;
                }
            } else {
                q0 = Long.MAX_VALUE;
            }
            if (k50Var.W()) {
                break;
            }
            LockSupport.parkNanos(k50Var, q0);
            if (Thread.interrupted()) {
                k50Var.s(new InterruptedException());
            }
        }
        if (l62Var2 != null) {
            int i4 = l62.Y;
            l62Var2.n0(false);
        }
        Object a2 = fd3.a(k50Var.Q());
        if (a2 instanceof av0) {
            av0Var = (av0) a2;
        } else {
            av0Var = null;
        }
        if (av0Var == null) {
            return a2;
        }
        throw av0Var.a;
    }

    public static final void X(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void Y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static void Z(u63 u63Var, float f2) {
        float f3;
        float f4;
        v16 v16Var = (v16) u63Var.B;
        CardView cardView = (CardView) u63Var.L;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != v16Var.e || v16Var.f != useCompatPadding || v16Var.g != preventCornerOverlap) {
            v16Var.e = f2;
            v16Var.f = useCompatPadding;
            v16Var.g = preventCornerOverlap;
            v16Var.b(null);
            v16Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            u63Var.G(0, 0, 0, 0);
            return;
        }
        v16 v16Var2 = (v16) u63Var.B;
        float f5 = v16Var2.e;
        float f6 = v16Var2.a;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - w16.a) * f6) + f5);
        } else {
            int i2 = w16.b;
            f3 = f5;
        }
        int ceil = (int) Math.ceil(f3);
        if (cardView.getPreventCornerOverlap()) {
            f4 = (float) (((1.0d - w16.a) * f6) + (f5 * 1.5f));
        } else {
            f4 = f5 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f4);
        u63Var.G(ceil, ceil2, ceil, ceil2);
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
    */
    public static final long a(float f2, float f3, float f4, float f5, nt0 nt0Var) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        float f6;
        float f7;
        float f8;
        boolean c2 = nt0Var.c();
        float f9 = 1.0f;
        float f10 = RecyclerView.B1;
        if (c2) {
            if (f5 < RecyclerView.B1) {
                f6 = 0.0f;
            } else {
                f6 = f5;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            if (f2 < RecyclerView.B1) {
                f7 = 0.0f;
            } else {
                f7 = f2;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            if (f3 < RecyclerView.B1) {
                f8 = 0.0f;
            } else {
                f8 = f3;
            }
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            if (f4 >= RecyclerView.B1) {
                f10 = f4;
            }
            if (f10 <= 1.0f) {
                f9 = f10;
            }
            long j2 = (i14 | ((int) ((f9 * 255.0f) + 0.5f))) << 32;
            int i15 = kt0.i;
            return j2;
        }
        if (((int) (nt0Var.b >> 32)) != 3) {
            o53.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = nt0Var.c;
        if (i16 == -1) {
            o53.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i17 = 0;
        float b4 = nt0Var.b(0);
        float a4 = nt0Var.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i18 = floatToRawIntBits >>> 31;
        int i19 = (floatToRawIntBits >>> 23) & 255;
        int i20 = floatToRawIntBits & 8388607;
        if (i19 == 255) {
            if (i20 != 0) {
                i3 = 512;
            } else {
                i3 = 0;
            }
            i2 = 31;
        } else {
            i2 = i19 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 <= 0) {
                if (i2 >= -10) {
                    int i21 = (i20 | 8388608) >> (1 - i2);
                    if ((i21 & 4096) != 0) {
                        i21 += 8192;
                    }
                    i3 = i21 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            } else {
                int i22 = i20 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i22) + 1) | (i18 << 15);
                    short s = (short) i4;
                    b2 = nt0Var.b(1);
                    a2 = nt0Var.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i23 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i24 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        if (i24 != 0) {
                            i7 = 512;
                        } else {
                            i7 = 0;
                        }
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 <= 0) {
                            if (i6 >= -10) {
                                int i25 = (i24 | 8388608) >> (1 - i6);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i7 = i25 >> 13;
                                i6 = 0;
                            } else {
                                i7 = 0;
                                i6 = 0;
                            }
                        } else {
                            int i26 = i24 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i26) + 1) | (i23 << 15);
                                short s2 = (short) i8;
                                b3 = nt0Var.b(2);
                                a3 = nt0Var.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i27 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i28 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    if (i28 != 0) {
                                        i17 = 512;
                                    }
                                    i10 = i17;
                                    i17 = 31;
                                } else {
                                    int i29 = i9 - 112;
                                    if (i29 >= 31) {
                                        i10 = 0;
                                        i17 = 49;
                                    } else if (i29 <= 0) {
                                        if (i29 >= -10) {
                                            int i30 = (i28 | 8388608) >> (1 - i29);
                                            if ((i30 & 4096) != 0) {
                                                i30 += 8192;
                                            }
                                            i10 = i30 >> 13;
                                        } else {
                                            i10 = 0;
                                        }
                                    } else {
                                        int i31 = i28 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i29 << 10) | i31) + 1) | (i27 << 15);
                                            short s3 = (short) i11;
                                            if (f5 >= RecyclerView.B1) {
                                                f10 = f5;
                                            }
                                            if (f10 <= 1.0f) {
                                                f9 = f10;
                                            }
                                            long j3 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s3) << 16) | ((((int) ((f9 * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i32 = kt0.i;
                                            return j3;
                                        }
                                        i10 = i31;
                                        i17 = i29;
                                    }
                                }
                                i11 = i10 | (i27 << 15) | (i17 << 10);
                                short s32 = (short) i11;
                                if (f5 >= RecyclerView.B1) {
                                }
                                if (f10 <= 1.0f) {
                                }
                                long j32 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s32) << 16) | ((((int) ((f9 * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i322 = kt0.i;
                                return j32;
                            }
                            i7 = i26;
                        }
                    }
                    i8 = i7 | (i23 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    b3 = nt0Var.b(2);
                    a3 = nt0Var.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i272 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i282 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i272 << 15) | (i17 << 10);
                    short s322 = (short) i11;
                    if (f5 >= RecyclerView.B1) {
                    }
                    if (f10 <= 1.0f) {
                    }
                    long j322 = (i16 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & s322) << 16) | ((((int) ((f9 * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3222 = kt0.i;
                    return j322;
                }
                i3 = i22;
            }
        }
        i4 = i3 | (i18 << 15) | (i2 << 10);
        short s4 = (short) i4;
        b2 = nt0Var.b(1);
        a2 = nt0Var.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i232 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i242 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i232 << 15) | (i6 << 10);
        short s222 = (short) i8;
        b3 = nt0Var.b(2);
        a3 = nt0Var.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2722 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2822 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2722 << 15) | (i17 << 10);
        short s3222 = (short) i11;
        if (f5 >= RecyclerView.B1) {
        }
        if (f10 <= 1.0f) {
        }
        long j3222 = (i16 & 63) | ((s4 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & s3222) << 16) | ((((int) ((f9 * 1023.0f) + 0.5f)) & 1023) << 6);
        int i32222 = kt0.i;
        return j3222;
    }

    public static final void a0(ar0 ar0Var, String str) {
        String sb;
        ar0Var.getClass();
        String str2 = "in the polymorphic scope of '" + ar0Var.c() + '\'';
        if (str == null) {
            sb = i61.k('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder u = i61.u("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            i61.B(u, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            u.append(ar0Var.c());
            u.append("' has to be sealed and '@Serializable'.");
            sb = u.toString();
        }
        throw new IllegalArgumentException(sb);
    }

    public static final long b(int i2) {
        long j2 = i2 << 32;
        int i3 = kt0.i;
        return j2;
    }

    public static final int b0(long j2) {
        float[] fArr = qt0.a;
        return (int) (kt0.b(j2, qt0.e) >>> 32);
    }

    public static final long c(long j2) {
        long j3 = j2 << 32;
        int i2 = kt0.i;
        return j3;
    }

    public static String c0(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + gi2.Q(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + gi2.Q(Float.intBitsToFloat(i2)) + ", " + gi2.Q(Float.intBitsToFloat(i3)) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(pq pqVar, eo2 eo2Var, px0 px0Var, int i2) {
        nk7 nk7Var;
        boolean z;
        cf5 t;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-149765515);
        r93 r93Var = xq2Var.x;
        xv4 l2 = xq2Var.l();
        xq2Var.Y(MlKitException.CODE_SCANNER_CANCELLED, tx0.b);
        Object P = xq2Var.P();
        if (nb3.k(P, ox0.a)) {
            nk7Var = null;
        } else {
            P.getClass();
            nk7Var = (nk7) P;
        }
        l55 l55Var = (l55) pqVar.f;
        nk7 c2 = l55Var.c(pqVar, nk7Var);
        boolean equals = c2.equals(nk7Var);
        if (!equals) {
            xq2Var.l0(c2);
        }
        boolean z2 = true;
        if (xq2Var.S) {
            if (pqVar.e || !l2.containsKey(l55Var)) {
                l2 = l2.d(l55Var, c2);
            }
            xq2Var.J = true;
        } else {
            lk6 lk6Var = xq2Var.G;
            Object b2 = lk6Var.b(lk6Var.b, lk6Var.g);
            b2.getClass();
            xv4 xv4Var = (xv4) b2;
            if ((xq2Var.E() && equals) || (!pqVar.e && l2.containsKey(l55Var))) {
                if ((equals && !xq2Var.w) || !xq2Var.w) {
                    l2 = xv4Var;
                }
            } else {
                l2 = l2.d(l55Var, c2);
            }
            if (xq2Var.y || xv4Var != l2) {
                z = true;
                if (z && !xq2Var.S) {
                    xq2Var.N(l2);
                }
                r93Var.c(xq2Var.w ? 1 : 0);
                xq2Var.w = z;
                xq2Var.K = l2;
                xq2Var.W(tx0.c, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 0, l2);
                eo2Var.o(xq2Var, Integer.valueOf((i2 >> 3) & 14));
                xq2Var.p(false);
                xq2Var.p(false);
                if (r93Var.b() == 0) {
                    z2 = false;
                }
                xq2Var.w = z2;
                xq2Var.K = null;
                t = xq2Var.t();
                if (t == null) {
                    t.d = new hp(pqVar, i2, 3, eo2Var);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            xq2Var.N(l2);
        }
        r93Var.c(xq2Var.w ? 1 : 0);
        xq2Var.w = z;
        xq2Var.K = l2;
        xq2Var.W(tx0.c, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 0, l2);
        eo2Var.o(xq2Var, Integer.valueOf((i2 >> 3) & 14));
        xq2Var.p(false);
        xq2Var.p(false);
        if (r93Var.b() == 0) {
        }
        xq2Var.w = z2;
        xq2Var.K = null;
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final Object d0(l61 l61Var, eo2 eo2Var, r41 r41Var) {
        l61 A;
        Object a2;
        l61 b2 = r41Var.b();
        if (!((Boolean) l61Var.x(new lw0(21, (byte) 0), Boolean.FALSE)).booleanValue()) {
            A = b2.N(l61Var);
        } else {
            A = mb3.A(b2, l61Var, false);
        }
        yh2.o(A);
        if (A == b2) {
            o66 o66Var = new o66(r41Var, A);
            a2 = mp2.Z(o66Var, true, o66Var, eo2Var);
        } else {
            d90 d90Var = d90.r0;
            if (nb3.k(A.Z(d90Var), b2.Z(d90Var))) {
                eg7 eg7Var = new eg7(r41Var, A);
                l61 l61Var2 = eg7Var.X;
                Object c2 = k57.c(l61Var2, null);
                try {
                    Object Z = mp2.Z(eg7Var, true, eg7Var, eo2Var);
                    k57.a(l61Var2, c2);
                    a2 = Z;
                } catch (Throwable th) {
                    k57.a(l61Var2, c2);
                    throw th;
                }
            } else {
                o66 o66Var2 = new o66(r41Var, A);
                try {
                    ok1.a(np2.V(np2.F(eo2Var, o66Var2, o66Var2)), jg7.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = pk1.Z;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(o66Var2);
                        if (i2 != 0) {
                            if (i2 == 2) {
                                a2 = fd3.a(o66Var2.Q());
                                if (a2 instanceof av0) {
                                    throw ((av0) a2).a;
                                }
                            } else {
                                i.m("Already suspended");
                                return null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(o66Var2, 0, 1)) {
                            a2 = x61.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof mk1) {
                        th = ((mk1) th).A;
                    }
                    o66Var2.i(oi2.p(th));
                    throw th;
                }
            }
        }
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [wv4, aw4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [wv4, aw4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(pq[] pqVarArr, eo2 eo2Var, px0 px0Var, int i2) {
        xv4 b2;
        boolean z;
        cf5 t;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(415205898);
        r93 r93Var = xq2Var.x;
        xv4 l2 = xq2Var.l();
        xq2Var.Y(MlKitException.CODE_SCANNER_CANCELLED, tx0.b);
        boolean z2 = xq2Var.S;
        km4 km4Var = tx0.d;
        boolean z3 = true;
        if (z2) {
            xv4 c0 = q60.c0(pqVarArr, l2, xv4.R);
            l2.getClass();
            ?? aw4Var = new aw4(l2);
            aw4Var.Z = l2;
            aw4Var.putAll(c0);
            b2 = aw4Var.b();
            xq2Var.Y(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, km4Var);
            xq2Var.H();
            xq2Var.m0(b2);
            xq2Var.H();
            xq2Var.m0(c0);
            xq2Var.p(false);
            xq2Var.J = true;
        } else {
            lk6 lk6Var = xq2Var.G;
            Object h2 = lk6Var.h(lk6Var.g, 0);
            h2.getClass();
            xv4 xv4Var = (xv4) h2;
            lk6 lk6Var2 = xq2Var.G;
            Object h3 = lk6Var2.h(lk6Var2.g, 1);
            h3.getClass();
            xv4 xv4Var2 = (xv4) h3;
            xv4 c02 = q60.c0(pqVarArr, l2, xv4Var2);
            if (xq2Var.E() && !xq2Var.y && xv4Var2.equals(c02)) {
                xq2Var.l = xq2Var.G.s() + xq2Var.l;
                b2 = xv4Var;
            } else {
                l2.getClass();
                ?? aw4Var2 = new aw4(l2);
                aw4Var2.Z = l2;
                aw4Var2.putAll(c02);
                b2 = aw4Var2.b();
                xq2Var.Y(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, km4Var);
                xq2Var.H();
                xq2Var.m0(b2);
                xq2Var.H();
                xq2Var.m0(c02);
                xq2Var.p(false);
                if (xq2Var.y || !nb3.k(b2, xv4Var)) {
                    z = true;
                    if (z && !xq2Var.S) {
                        xq2Var.N(b2);
                    }
                    r93Var.c(xq2Var.w ? 1 : 0);
                    xq2Var.w = z;
                    xq2Var.K = b2;
                    xq2Var.W(tx0.c, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 0, b2);
                    eo2Var.o(xq2Var, Integer.valueOf((i2 >> 3) & 14));
                    xq2Var.p(false);
                    xq2Var.p(false);
                    if (r93Var.b() == 0) {
                        z3 = false;
                    }
                    xq2Var.w = z3;
                    xq2Var.K = null;
                    t = xq2Var.t();
                    if (t == null) {
                        t.d = new hp(pqVarArr, i2, 4, eo2Var);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            xq2Var.N(b2);
        }
        r93Var.c(xq2Var.w ? 1 : 0);
        xq2Var.w = z;
        xq2Var.K = b2;
        xq2Var.W(tx0.c, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 0, b2);
        eo2Var.o(xq2Var, Integer.valueOf((i2 >> 3) & 14));
        xq2Var.p(false);
        xq2Var.p(false);
        if (r93Var.b() == 0) {
        }
        xq2Var.w = z3;
        xq2Var.K = null;
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void f(String str, String str2, on2 on2Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        a74 a74Var2;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1318050154);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (xq2Var.f(a74Var)) {
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
            es7 F = bl2.F(xq2Var);
            y16 b2 = z16.b(8.0f);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            a74 g2 = u24.g(ge7.P(dj6.c(a74Var, 1.0f), 12.0f, 1.0f), b2);
            boolean booleanValue = ((Boolean) a2.getValue()).booleanValue();
            x64 x64Var = x64.a;
            if (booleanValue) {
                a74Var2 = ak7.I(x64Var, 3.0f, F.j, b2);
            } else {
                a74Var2 = x64Var;
            }
            a74 P2 = ge7.P(mb3.t(g2.d(a74Var2), r94Var, null, false, null, on2Var, 28), 8.0f, 10.0f);
            l26 a3 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P2);
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
            a74 L = vy7.L(u24.g(dj6.i(x64Var, 46.0f), z16.b(6.0f)), F.m, u24.m);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, L);
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
            i13.a(hi2.A(), null, dj6.i(x64Var, 24.0f), F.l, xq2Var, 432, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 13.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(ju.d, d90.k0, xq2Var, 6);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            x37.b(str, null, F.g, hi2.E(14), oj2.d0, null, 0L, null, hi2.E(18), 2, false, 1, 0, null, null, xq2Var, (i10 & 14) | 199680, 3126, 119762);
            xq2Var = xq2Var;
            if (str2.length() > 0 && !str2.equals(str)) {
                xq2Var.b0(-1246224798);
                x37.b(str2, null, F.i, hi2.E(12), null, null, 0L, null, hi2.E(15), 2, false, 1, 0, null, null, xq2Var, ((i10 >> 3) & 14) | 3072, 3126, 119794);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1245949518);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new dx5(str, str2, on2Var, a74Var, i2, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void g(final pq5 pq5Var, final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final on2 on2Var, final on2 on2Var2, final on2 on2Var3, final a74 a74Var, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        xq2 xq2Var;
        float f2;
        Context context;
        a74 a74Var2;
        pn pnVar;
        pn pnVar2;
        ne neVar;
        pn pnVar3;
        pn pnVar4;
        iy0 iy0Var;
        boolean z5;
        ?? r11;
        boolean z6;
        pn pnVar5;
        pn pnVar6;
        pn pnVar7;
        ne neVar2;
        pn pnVar8;
        float f3;
        oj2 oj2Var;
        x64 x64Var;
        Context context2;
        jy2 jy2Var;
        ne neVar3;
        d40 d40Var;
        pn pnVar9;
        String str3;
        x64 x64Var2;
        pn pnVar10;
        pn pnVar11;
        pn pnVar12;
        pn pnVar13;
        es7 es7Var;
        jy2 jy2Var2;
        e40 e40Var;
        String str4;
        xq2 xq2Var2;
        iy0 iy0Var2;
        long j2 = pq5Var.j;
        on2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(1445968064);
        if (xq2Var3.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (xq2Var3.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (xq2Var3.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        if (xq2Var3.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (xq2Var3.g(z2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (xq2Var3.g(z3)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i18 = i17 | i8;
        if (xq2Var3.h(on2Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (xq2Var3.h(on2Var2)) {
            i10 = 8388608;
        } else {
            i10 = Compress.MAXWINSIZE;
        }
        int i20 = i19 | i10;
        if (xq2Var3.h(on2Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (xq2Var3.f(a74Var)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if ((i22 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var3.S(i22 & 1, z4)) {
            es7 F = bl2.F(xq2Var3);
            Context context3 = (Context) xq2Var3.j(kf.b);
            y16 b2 = z16.b(8.0f);
            Object P = xq2Var3.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var3);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var3, 6);
            if (((Boolean) gi2.u(r94Var, xq2Var3).getValue()).booleanValue()) {
                f2 = 0.96f;
            } else {
                f2 = 1.0f;
            }
            a74 g2 = u24.g(ge7.P(ln2.X(dj6.c(a74Var, 1.0f), ((Number) in.b(f2, ge7.U(1.0f, 4000.0f, null, 4), "press", xq2Var3, 3120, 20).getValue()).floatValue()), 10.0f, 2.5f), b2);
            long j3 = F.c;
            jy2 jy2Var3 = u24.m;
            a74 I = ak7.I(vy7.L(g2, j3, jy2Var3), 0.75f, F.f, b2);
            boolean booleanValue = ((Boolean) a2.getValue()).booleanValue();
            x64 x64Var3 = x64.a;
            if (booleanValue) {
                context = context3;
                a74Var2 = ak7.I(x64Var3, 2.5f, F.j, b2);
            } else {
                context = context3;
                a74Var2 = x64Var3;
            }
            a74 P2 = ge7.P(mb3.v(I.d(a74Var2), r94Var, false, on2Var2, on2Var, 444), 10.0f, 7.0f);
            d40 d40Var2 = d90.i0;
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var2, xq2Var3, 48);
            int hashCode = Long.hashCode(xq2Var3.T);
            xv4 l2 = xq2Var3.l();
            a74 E = l.E(xq2Var3, P2);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var3);
            } else {
                xq2Var3.o0();
            }
            pn pnVar14 = ix0.f;
            yh2.K(xq2Var3, pnVar14, a3);
            pn pnVar15 = ix0.e;
            yh2.K(xq2Var3, pnVar15, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar16 = ix0.g;
            yh2.K(xq2Var3, pnVar16, valueOf);
            ne neVar4 = ix0.h;
            yh2.F(xq2Var3, neVar4);
            pn pnVar17 = ix0.d;
            yh2.K(xq2Var3, pnVar17, E);
            a74 g3 = u24.g(ak7.H(dj6.l(x64Var3, 48.0f), 1.117904f), z16.b(6.0f));
            e40 e40Var2 = d90.L;
            Context context4 = context;
            e34 d2 = h70.d(e40Var2, false);
            int hashCode2 = Long.hashCode(xq2Var3.T);
            xv4 l3 = xq2Var3.l();
            a74 E2 = l.E(xq2Var3, g3);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var3);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar14, d2);
            yh2.K(xq2Var3, pnVar15, l3);
            i61.w(hashCode2, xq2Var3, pnVar16, xq2Var3, neVar4);
            yh2.K(xq2Var3, pnVar17, E2);
            vs0 vs0Var = vs0.Y;
            long j4 = j2;
            hf.u(pq5Var, str2, str, dj6.c, hi2.E(18), null, z, null, xq2Var3, (i22 & 14) | 27648 | ((i22 >> 3) & 112) | ((i22 << 3) & 896) | ((i22 << 9) & 3670016), 160);
            if (pq5Var.k) {
                xq2Var3.b0(-2075019145);
                a74 g4 = u24.g(ge7.O(vs0Var.n(x64Var3, d90.X), 2.0f), z16.a);
                int i23 = kt0.i;
                a74 O = ge7.O(vy7.L(g4, kt0.c(0.65f, kt0.b), jy2Var3), 2.0f);
                r11 = 0;
                e34 d3 = h70.d(e40Var2, false);
                int hashCode3 = Long.hashCode(xq2Var3.T);
                xv4 l4 = xq2Var3.l();
                a74 E3 = l.E(xq2Var3, O);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    iy0Var2 = iy0Var3;
                    xq2Var3.k(iy0Var2);
                } else {
                    iy0Var2 = iy0Var3;
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar14, d3);
                yh2.K(xq2Var3, pnVar15, l4);
                i61.w(hashCode3, xq2Var3, pnVar16, xq2Var3, neVar4);
                yh2.K(xq2Var3, pnVar17, E3);
                neVar = neVar4;
                iy0Var = iy0Var2;
                pnVar = pnVar17;
                pnVar2 = pnVar16;
                pnVar3 = pnVar15;
                pnVar4 = pnVar14;
                i13.a(kj2.D(), null, dj6.i(x64Var3, 10.0f), es7.q, xq2Var3, 3504, 0);
                z5 = true;
                xq2Var3.p(true);
                xq2Var3.p(false);
            } else {
                pnVar = pnVar17;
                pnVar2 = pnVar16;
                neVar = neVar4;
                pnVar3 = pnVar15;
                pnVar4 = pnVar14;
                iy0Var = iy0Var3;
                z5 = true;
                r11 = 0;
                xq2Var3.b0(-2074414676);
                xq2Var3.p(false);
            }
            if (z3) {
                xq2Var3.b0(-2074355001);
                a74 g5 = u24.g(ge7.O(vs0Var.n(x64Var3, d90.g0), 2.0f), z16.b(3.0f));
                int i24 = kt0.i;
                a74 P3 = ge7.P(vy7.L(g5, kt0.c(0.7f, kt0.b), jy2Var3), 2.5f, 1.0f);
                e34 d4 = h70.d(e40Var2, r11);
                int hashCode4 = Long.hashCode(xq2Var3.T);
                xv4 l5 = xq2Var3.l();
                a74 E4 = l.E(xq2Var3, P3);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                pn pnVar18 = pnVar4;
                yh2.K(xq2Var3, pnVar18, d4);
                pn pnVar19 = pnVar3;
                yh2.K(xq2Var3, pnVar19, l5);
                pn pnVar20 = pnVar2;
                neVar2 = neVar;
                i61.w(hashCode4, xq2Var3, pnVar20, xq2Var3, neVar2);
                yh2.K(xq2Var3, pnVar, E4);
                f3 = 2.5f;
                pnVar7 = pnVar20;
                pnVar6 = pnVar19;
                pnVar5 = pnVar18;
                pnVar8 = pnVar;
                z6 = true;
                i13.a(q60.F(), null, dj6.i(x64Var3, 9.5f), es7.p, xq2Var3, 3504, 0);
                xq2Var3.p(true);
                xq2Var3.p(r11);
            } else {
                z6 = z5;
                pnVar5 = pnVar4;
                pnVar6 = pnVar3;
                pnVar7 = pnVar2;
                neVar2 = neVar;
                pnVar8 = pnVar;
                f3 = 2.5f;
                xq2Var3.b0(-2073704404);
                xq2Var3.p(r11);
            }
            xq2Var3.p(z6);
            gi2.h(xq2Var3, dj6.l(x64Var3, 12.0f));
            vn3 vn3Var = new vn3(1.0f, z6);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var3, r11);
            int hashCode5 = Long.hashCode(xq2Var3.T);
            xv4 l6 = xq2Var3.l();
            a74 E5 = l.E(xq2Var3, vn3Var);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            pn pnVar21 = pnVar5;
            yh2.K(xq2Var3, pnVar21, a4);
            pn pnVar22 = pnVar6;
            yh2.K(xq2Var3, pnVar22, l6);
            pn pnVar23 = pnVar7;
            i61.w(hashCode5, xq2Var3, pnVar23, xq2Var3, neVar2);
            pn pnVar24 = pnVar8;
            yh2.K(xq2Var3, pnVar24, E5);
            String k0 = hf.k0(pq5Var);
            long j5 = F.g;
            pi2 pi2Var = qs7.a;
            long D = hi2.D(13.5d);
            long D2 = hi2.D(17.5d);
            oj2 oj2Var2 = oj2.e0;
            x37.b(k0, dj6.c(x64Var3, 1.0f), j5, D, oj2Var2, pi2Var, 0L, null, D2, 2, false, 3, 0, null, null, xq2Var3, 1772592, 3126, 119696);
            String str5 = pq5Var.b;
            if (!qs6.v0(str5)) {
                neVar3 = neVar2;
                d40Var = d40Var2;
                pnVar9 = pnVar24;
                jy2Var = jy2Var3;
                oj2Var = oj2Var2;
                x64Var = x64Var3;
            } else {
                ArrayList arrayList = new ArrayList();
                Date date = pq5Var.g;
                if (date != null) {
                    oj2Var = oj2Var2;
                    x64Var = x64Var3;
                    context2 = context4;
                    arrayList.add(context2.getString(R.string.rom_last_played_format, DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 60000L).toString()));
                } else {
                    oj2Var = oj2Var2;
                    x64Var = x64Var3;
                    context2 = context4;
                }
                jy2Var = jy2Var3;
                neVar3 = neVar2;
                d40Var = d40Var2;
                if (!oq1.d(j4, 0L)) {
                    if (oq1.d(j4, 0L)) {
                        str3 = "";
                        j4 = j4;
                        pnVar9 = pnVar24;
                    } else {
                        long k2 = oq1.k(j4, uq1.HOURS);
                        long k3 = oq1.k(j4, uq1.MINUTES);
                        j4 = j4;
                        long j6 = k3 % 60;
                        if (k2 >= 1) {
                            pnVar9 = pnVar24;
                            str3 = k2 + "h " + j6 + "m";
                        } else {
                            pnVar9 = pnVar24;
                            if (j6 >= 1) {
                                str3 = j6 + "m";
                            } else {
                                str3 = "<1m";
                            }
                        }
                    }
                    arrayList.add(context2.getString(R.string.rom_total_play_time_format, str3));
                } else {
                    j4 = j4;
                    pnVar9 = pnVar24;
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(pq5Var.c);
                }
                str5 = gt0.P0(arrayList, " • ", null, null, null, 62);
            }
            String str6 = str5;
            if (str6.length() > 0) {
                xq2Var3.b0(-1090204374);
                x64Var2 = x64Var;
                x37.b(str6, ge7.S(x64Var, RecyclerView.B1, f3, RecyclerView.B1, RecyclerView.B1, 13), F.i, hi2.D(11.5d), null, qs7.b, 0L, null, hi2.E(14), 2, false, 1, 0, null, null, xq2Var3, 1575984, 3126, 119728);
                xq2Var3.p(false);
            } else {
                x64Var2 = x64Var;
                xq2Var3.b0(-1089804164);
                xq2Var3.p(false);
            }
            xq2Var3.p(true);
            gi2.h(xq2Var3, dj6.l(x64Var2, 10.0f));
            vr4 j0 = hf.j0(pq5Var);
            yt0 a5 = wt0.a(euVar, d90.m0, xq2Var3, 48);
            int hashCode6 = Long.hashCode(xq2Var3.T);
            xv4 l7 = xq2Var3.l();
            a74 E6 = l.E(xq2Var3, x64Var2);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar21, a5);
            yh2.K(xq2Var3, pnVar22, l7);
            ne neVar5 = neVar3;
            i61.w(hashCode6, xq2Var3, pnVar23, xq2Var3, neVar5);
            pn pnVar25 = pnVar9;
            yh2.K(xq2Var3, pnVar25, E6);
            d40 d40Var3 = d40Var;
            l26 a6 = k26.a(duVar, d40Var3, xq2Var3, 48);
            int hashCode7 = Long.hashCode(xq2Var3.T);
            xv4 l8 = xq2Var3.l();
            a74 E7 = l.E(xq2Var3, x64Var2);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar21, a6);
            yh2.K(xq2Var3, pnVar22, l8);
            i61.w(hashCode7, xq2Var3, pnVar23, xq2Var3, neVar5);
            yh2.K(xq2Var3, pnVar25, E7);
            if (z3) {
                xq2Var3.b0(-488318828);
                a74 L = vy7.L(u24.g(ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, 5.0f, RecyclerView.B1, 11), z16.b(4.0f)), kt0.c(0.85f, c(4279179050L)), jy2Var);
                long j7 = es7.p;
                x64 x64Var4 = x64Var2;
                a74 P4 = ge7.P(ak7.I(L, 0.7f, kt0.c(0.7f, j7), z16.b(4.0f)), 4.0f, 2.0f);
                e40Var = e40Var2;
                e34 d5 = h70.d(e40Var, false);
                int hashCode8 = Long.hashCode(xq2Var3.T);
                xv4 l9 = xq2Var3.l();
                a74 E8 = l.E(xq2Var3, P4);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar21, d5);
                yh2.K(xq2Var3, pnVar22, l9);
                i61.w(hashCode8, xq2Var3, pnVar23, xq2Var3, neVar5);
                yh2.K(xq2Var3, pnVar25, E8);
                l26 a7 = k26.a(duVar, d40Var3, xq2Var3, 48);
                int hashCode9 = Long.hashCode(xq2Var3.T);
                xv4 l10 = xq2Var3.l();
                x64Var2 = x64Var4;
                a74 E9 = l.E(xq2Var3, x64Var2);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar21, a7);
                yh2.K(xq2Var3, pnVar22, l10);
                i61.w(hashCode9, xq2Var3, pnVar23, xq2Var3, neVar5);
                yh2.K(xq2Var3, pnVar25, E9);
                pnVar10 = pnVar25;
                pnVar11 = pnVar22;
                pnVar12 = pnVar23;
                es7Var = F;
                i13.a(q60.F(), "Achievements", dj6.i(x64Var2, 10.0f), j7, xq2Var3, 3504, 0);
                gi2.h(xq2Var3, dj6.l(x64Var2, 2.0f));
                s47 s47Var = new s47(j7, hi2.E(8), oj2.f0, 0L, 0L, 0, 0L, 16777208);
                jy2Var2 = jy2Var;
                pnVar13 = pnVar21;
                x37.b("RA", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var, xq2Var3, 6, 0, 65534);
                i61.y(xq2Var3, true, true, false);
            } else {
                pnVar10 = pnVar25;
                pnVar11 = pnVar22;
                pnVar12 = pnVar23;
                pnVar13 = pnVar21;
                es7Var = F;
                jy2Var2 = jy2Var;
                e40Var = e40Var2;
                xq2Var3.b0(-486962857);
                xq2Var3.p(false);
            }
            xq2Var3.b0(-486913753);
            pn pnVar26 = pnVar12;
            pn pnVar27 = pnVar11;
            pn pnVar28 = pnVar10;
            hf.k((String) j0.A, (String) j0.B, ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, 5.0f, RecyclerView.B1, 11), xq2Var3, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            xq2 xq2Var4 = xq2Var3;
            xq2Var4.p(false);
            a74 P5 = ge7.P(vy7.L(u24.g(x64Var2, z16.b(4.0f)), es7Var.d, jy2Var2), 5.5f, 2.0f);
            e34 d6 = h70.d(e40Var, false);
            int hashCode10 = Long.hashCode(xq2Var4.T);
            xv4 l11 = xq2Var4.l();
            a74 E10 = l.E(xq2Var4, P5);
            xq2Var4.f0();
            if (xq2Var4.S) {
                xq2Var4.k(iy0Var);
            } else {
                xq2Var4.o0();
            }
            yh2.K(xq2Var4, pnVar13, d6);
            yh2.K(xq2Var4, pnVar27, l11);
            i61.w(hashCode10, xq2Var4, pnVar26, xq2Var4, neVar5);
            yh2.K(xq2Var4, pnVar28, E10);
            if (pq5Var.h) {
                str4 = "DSi";
            } else {
                str4 = "DS";
            }
            String str7 = str4;
            long j8 = es7Var.h;
            sr2 sr2Var = qs7.c;
            x37.b(str7, null, j8, hi2.D(8.5d), oj2Var, sr2Var, hi2.D(0.5d), null, hi2.D(9.5d), 0, false, 0, 0, null, null, xq2Var4, 14355456, 6, 129810);
            xq2Var4.p(true);
            xq2Var4.p(true);
            String P6 = hf.P(j4);
            if (P6.length() > 0) {
                xq2Var4.b0(1573251828);
                x37.b(P6, ge7.S(x64Var2, RecyclerView.B1, 4.0f, RecyclerView.B1, RecyclerView.B1, 13), es7Var.i, hi2.E(10), null, sr2Var, 0L, null, hi2.E(12), 0, false, 0, 0, null, null, xq2Var4, 1575984, 6, 129968);
                xq2Var4.p(false);
            } else {
                xq2Var4.b0(1573541523);
                xq2Var4.p(false);
            }
            xq2Var4.p(true);
            if (z2) {
                xq2Var4.b0(2024801160);
                ej2.b(on2Var3, ge7.S(dj6.i(x64Var2, 34.0f), 2.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), false, n16.I(178170693, new d4(es7Var, 10), xq2Var4), xq2Var4, ((i22 >> 24) & 14) | 24624, 12);
                xq2 xq2Var5 = xq2Var4;
                xq2Var5.p(false);
                xq2Var2 = xq2Var5;
            } else {
                xq2Var4.b0(2025229766);
                xq2Var4.p(false);
                xq2Var2 = xq2Var4;
            }
            xq2Var2.p(true);
            xq2Var = xq2Var2;
        } else {
            xq2Var3.V();
            xq2Var = xq2Var3;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, str2, z, z2, z3, on2Var, on2Var2, on2Var3, a74Var, i2) { // from class: zy5
                public final /* synthetic */ String B;
                public final /* synthetic */ String L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ on2 Z;
                public final /* synthetic */ on2 d0;
                public final /* synthetic */ on2 e0;
                public final /* synthetic */ a74 f0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    hv.g(pq5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(float f2, float f3, float f4, float f5, nt0 nt0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (nt0Var.c()) {
            long j2 = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i11 = kt0.i;
            return j2;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = floatToRawIntBits & 8388607;
        int i15 = 49;
        int i16 = 512;
        int i17 = 0;
        if (i13 == 255) {
            if (i14 != 0) {
                i3 = 512;
            } else {
                i3 = 0;
            }
            i2 = 31;
        } else {
            i2 = i13 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 <= 0) {
                if (i2 >= -10) {
                    int i18 = (i14 | 8388608) >> (1 - i2);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i3 = i18 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            } else {
                int i19 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i19) + 1) | (i12 << 15);
                    short s = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        if (i21 != 0) {
                            i7 = 512;
                        } else {
                            i7 = 0;
                        }
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 <= 0) {
                            if (i6 >= -10) {
                                int i22 = (i21 | 8388608) >> (1 - i6);
                                if ((i22 & 4096) != 0) {
                                    i22 += 8192;
                                }
                                i7 = i22 >> 13;
                                i6 = 0;
                            } else {
                                i7 = 0;
                                i6 = 0;
                            }
                        } else {
                            int i23 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i20 << 15);
                                short s2 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    if (i25 == 0) {
                                        i16 = 0;
                                    }
                                    i17 = i16;
                                    i15 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 < 31) {
                                        if (i26 <= 0) {
                                            if (i26 >= -10) {
                                                int i27 = (i25 | 8388608) >> (1 - i26);
                                                if ((i27 & 4096) != 0) {
                                                    i27 += 8192;
                                                }
                                                i15 = 0;
                                                i17 = i27 >> 13;
                                            } else {
                                                i15 = 0;
                                            }
                                        } else {
                                            i17 = i25 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i26 << 10) | i17) + 1) | (i24 << 15);
                                                long max = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max((float) RecyclerView.B1, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (nt0Var.c & 63);
                                                int i28 = kt0.i;
                                                return max;
                                            }
                                            i15 = i26;
                                        }
                                    }
                                }
                                i10 = (i24 << 15) | (i15 << 10) | i17;
                                long max2 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max((float) RecyclerView.B1, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (nt0Var.c & 63);
                                int i282 = kt0.i;
                                return max2;
                            }
                            i7 = i23;
                        }
                    }
                    i8 = i7 | (i20 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i242 << 15) | (i15 << 10) | i17;
                    long max22 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max((float) RecyclerView.B1, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (nt0Var.c & 63);
                    int i2822 = kt0.i;
                    return max22;
                }
                i3 = i19;
            }
        }
        i4 = i3 | (i12 << 15) | (i2 << 10);
        short s3 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i202 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i202 << 15) | (i6 << 10);
        short s222 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2422 << 15) | (i15 << 10) | i17;
        long max222 = ((((short) i10) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max((float) RecyclerView.B1, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (nt0Var.c & 63);
        int i28222 = kt0.i;
        return max222;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kg1, java.lang.Object, r41] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static kg1 i(w61 w61Var, l61 l61Var, a71 a71Var, eo2 eo2Var, int i2) {
        jo3 jo3Var;
        if ((i2 & 1) != 0) {
            l61Var = vt1.A;
        }
        if ((i2 & 2) != 0) {
            a71Var = a71.DEFAULT;
        }
        l61 M = mb3.M(w61Var, l61Var);
        if (a71Var.isLazy()) {
            jo3Var = new jo3(M, eo2Var);
        } else {
            jo3Var = new q0(M, true);
        }
        a71Var.invoke(eo2Var, jo3Var, jo3Var);
        return jo3Var;
    }

    public static final a74 j(a74 a74Var, s70 s70Var) {
        return a74Var.d(new q70(s70Var));
    }

    public static void k(Cursor cursor) {
        if (cursor != null) {
            try {
                lb1.v(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static final long l(long j2, long j3) {
        float f2;
        float f3;
        long b2 = kt0.b(j2, kt0.g(j3));
        float e2 = kt0.e(j3);
        float e3 = kt0.e(b2);
        float f4 = 1.0f - e3;
        float f5 = (e2 * f4) + e3;
        float i2 = kt0.i(b2);
        float i3 = kt0.i(j3);
        float f6 = RecyclerView.B1;
        int i4 = (f5 > RecyclerView.B1 ? 1 : (f5 == RecyclerView.B1 ? 0 : -1));
        if (i4 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((i3 * e2) * f4) + (i2 * e3)) / f5;
        }
        float h2 = kt0.h(b2);
        float h3 = kt0.h(j3);
        if (i4 == 0) {
            f3 = 0.0f;
        } else {
            f3 = (((h3 * e2) * f4) + (h2 * e3)) / f5;
        }
        float f7 = kt0.f(b2);
        float f8 = kt0.f(j3);
        if (i4 != 0) {
            f6 = (((f8 * e2) * f4) + (f7 * e3)) / f5;
        }
        return h(f2, f3, f6, f5, kt0.g(j3));
    }

    public static int m(byte[] bArr, int i2, ou ouVar) {
        int w = w(bArr, i2, ouVar);
        int i3 = ouVar.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - w) {
                if (i3 == 0) {
                    ouVar.c = ea0.B;
                    return w;
                }
                ouVar.c = ea0.c(bArr, w, i3);
                return w + i3;
            }
            throw ub3.e();
        }
        throw ub3.c();
    }

    public static int n(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long o(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int p(j66 j66Var, byte[] bArr, int i2, int i3, int i4, ou ouVar) {
        i54 i54Var = (i54) j66Var;
        Object j2 = i54Var.j();
        int F = i54Var.F(j2, bArr, i2, i3, i4, ouVar);
        i54Var.a(j2);
        ouVar.c = j2;
        return F;
    }

    public static int q(j66 j66Var, byte[] bArr, int i2, int i3, ou ouVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = v(i5, bArr, i4, ouVar);
            i5 = ouVar.a;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            Object j2 = j66Var.j();
            int i7 = i6 + i5;
            j66Var.h(j2, bArr, i6, i7, ouVar);
            j66Var.a(j2);
            ouVar.c = j2;
            return i7;
        }
        throw ub3.e();
    }

    public static int r(j66 j66Var, int i2, byte[] bArr, int i3, int i4, z93 z93Var, ou ouVar) {
        int q = q(j66Var, bArr, i3, i4, ouVar);
        z93Var.add(ouVar.c);
        while (q < i4) {
            int w = w(bArr, q, ouVar);
            if (i2 != ouVar.a) {
                break;
            }
            q = q(j66Var, bArr, w, i4, ouVar);
            z93Var.add(ouVar.c);
        }
        return q;
    }

    public static int s(byte[] bArr, int i2, ou ouVar) {
        int w = w(bArr, i2, ouVar);
        int i3 = ouVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                ouVar.c = "";
                return w;
            }
            ouVar.c = new String(bArr, w, i3, aa3.a);
            return w + i3;
        }
        throw ub3.c();
    }

    public static int t(byte[] bArr, int i2, ou ouVar) {
        int w = w(bArr, i2, ouVar);
        int i3 = ouVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                ouVar.c = "";
                return w;
            }
            ouVar.c = xj7.a.m(bArr, w, i3);
            return w + i3;
        }
        throw ub3.c();
    }

    public static int u(int i2, byte[] bArr, int i3, int i4, mg7 mg7Var, ou ouVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                mg7Var.c(i2, Integer.valueOf(n(bArr, i3)));
                                return i3 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        mg7 b2 = mg7.b();
                        int i6 = (i2 & (-8)) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i3 >= i4) {
                                break;
                            }
                            int w = w(bArr, i3, ouVar);
                            int i8 = ouVar.a;
                            if (i8 == i6) {
                                i7 = i8;
                                i3 = w;
                                break;
                            }
                            i3 = u(i8, bArr, w, i4, b2, ouVar);
                            i7 = i8;
                        }
                        if (i3 <= i4 && i7 == i6) {
                            mg7Var.c(i2, b2);
                            return i3;
                        }
                        throw ub3.d();
                    }
                    int w2 = w(bArr, i3, ouVar);
                    int i9 = ouVar.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - w2) {
                            if (i9 == 0) {
                                mg7Var.c(i2, ea0.B);
                            } else {
                                mg7Var.c(i2, ea0.c(bArr, w2, i9));
                            }
                            return w2 + i9;
                        }
                        throw ub3.e();
                    }
                    throw ub3.c();
                }
                mg7Var.c(i2, Long.valueOf(o(bArr, i3)));
                return i3 + 8;
            }
            int y = y(bArr, i3, ouVar);
            mg7Var.c(i2, Long.valueOf(ouVar.b));
            return y;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int v(int i2, byte[] bArr, int i3, ou ouVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ouVar.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            ouVar.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            ouVar.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            ouVar.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                ouVar.a = i12;
                return i13;
            }
        }
    }

    public static int w(byte[] bArr, int i2, ou ouVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            ouVar.a = b2;
            return i3;
        }
        return v(b2, bArr, i3, ouVar);
    }

    public static int x(int i2, byte[] bArr, int i3, int i4, z93 z93Var, ou ouVar) {
        a93 a93Var = (a93) z93Var;
        int w = w(bArr, i3, ouVar);
        a93Var.b(ouVar.a);
        while (w < i4) {
            int w2 = w(bArr, w, ouVar);
            if (i2 != ouVar.a) {
                break;
            }
            w = w(bArr, w2, ouVar);
            a93Var.b(ouVar.a);
        }
        return w;
    }

    public static int y(byte[] bArr, int i2, ou ouVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            ouVar.b = j2;
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
        ouVar.b = j3;
        return i4;
    }

    public static final void z(e36 e36Var) {
        e36Var.getClass();
        kw3 I = hf.I();
        j36 i0 = e36Var.i0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (i0.f0()) {
            try {
                I.add(i0.R(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    lb4.p(i0, th);
                    throw th2;
                }
            }
        }
        lb4.p(i0, null);
        ListIterator listIterator = hf.A(I).listIterator(0);
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            if (xx2Var.hasNext()) {
                String str = (String) xx2Var.next();
                if (xs6.g0(str, "room_fts_content_sync_", false)) {
                    ii2.s(e36Var, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public abstract void O(Throwable th);

    public abstract void P(eb ebVar);
}
