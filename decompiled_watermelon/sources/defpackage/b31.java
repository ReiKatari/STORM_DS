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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b31  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b31 implements j90 {
    public static void A(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
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

    public static int b(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int c(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static long d(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, hg] */
    public static hg e(String str) {
        mz2.d(str);
        return new RuntimeException();
    }

    public static l14 f(sk2 sk2Var) {
        l14 l14Var = new l14();
        sk2Var.h0(l14Var);
        return l14Var;
    }

    public static k24 g(long j, sk2 sk2Var, boolean z) {
        k24 L = me2.L(new xq0(j), sk2Var);
        sk2Var.p(z);
        return L;
    }

    public static gw4 h(o71 o71Var, q71 q71Var, int i) {
        return ai1.a(new p71(i, 0, o71Var, q71Var));
    }

    public static gw4 j(w71 w71Var, int i) {
        return ai1.a(new v71(i, 0, w71Var));
    }

    public static gw4 k(b81 b81Var, int i) {
        return ai1.a(new v71(i, 1, b81Var));
    }

    public static ClassCastException l(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException m(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String n(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String o(sk2 sk2Var, int i, int i2, sk2 sk2Var2, boolean z) {
        sk2Var.X(i);
        String X = me2.X(sk2Var2, i2);
        sk2Var.p(z);
        return X;
    }

    public static String p(String str, String str2) {
        return str + str2;
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String r(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static StringBuilder s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void w(int i, sk2 sk2Var, int i2, dn dnVar) {
        sk2Var.h0(Integer.valueOf(i));
        sk2Var.b(dnVar, Integer.valueOf(i2));
    }

    public static void x(int i, sk2 sk2Var, dn dnVar, sk2 sk2Var2, yd ydVar) {
        oo2.S(sk2Var, dnVar, Integer.valueOf(i));
        oo2.P(sk2Var2, ydVar);
    }

    public static /* synthetic */ void y(Object obj) {
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
            c44.r();
        }
    }

    public static void z(String str, gs0 gs0Var) {
        gs0Var.v0(new Exception(str));
    }
}
