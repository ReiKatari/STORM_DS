package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i61  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i61 implements rb0 {
    public static void A(String str, tu0 tu0Var) {
        tu0Var.v0(new Exception(str));
    }

    public static void B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean C(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(int i, List list, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static int c(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static long d(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ug, java.lang.RuntimeException] */
    public static ug e(String str) {
        p53.d(str);
        return new RuntimeException();
    }

    public static r94 f(xq2 xq2Var) {
        r94 r94Var = new r94();
        xq2Var.l0(r94Var);
        return r94Var;
    }

    public static qa4 g(long j, xq2 xq2Var, boolean z) {
        qa4 b0 = np2.b0(new kt0(j), xq2Var);
        xq2Var.p(z);
        return b0;
    }

    public static m55 h(eb1 eb1Var, gb1 gb1Var, int i) {
        return em1.a(new fb1(eb1Var, i, 0, gb1Var));
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String l(xq2 xq2Var, int i, int i2, xq2 xq2Var2, boolean z) {
        xq2Var.b0(i);
        String O = yh2.O(xq2Var2, i2);
        xq2Var.p(z);
        return O;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String p(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static StringBuilder q(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void v(int i, xq2 xq2Var, int i2, pn pnVar) {
        xq2Var.l0(Integer.valueOf(i));
        xq2Var.b(pnVar, Integer.valueOf(i2));
    }

    public static void w(int i, xq2 xq2Var, pn pnVar, xq2 xq2Var2, ne neVar) {
        yh2.K(xq2Var, pnVar, Integer.valueOf(i));
        yh2.F(xq2Var2, neVar);
    }

    public static void x(xq2 xq2Var, Integer num, xq2 xq2Var2, xq2 xq2Var3, a74 a74Var) {
        yh2.K(xq2Var, ix0.g, num);
        yh2.F(xq2Var2, ix0.h);
        yh2.K(xq2Var3, ix0.d, a74Var);
    }

    public static void y(xq2 xq2Var, boolean z, boolean z2, boolean z3) {
        xq2Var.p(z);
        xq2Var.p(z2);
        xq2Var.p(z3);
    }

    public static /* synthetic */ void z(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
        } else if (obj instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) obj;
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
                }
            }
        } else if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
        } else if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
        } else if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else {
            u34.t();
        }
    }
}
