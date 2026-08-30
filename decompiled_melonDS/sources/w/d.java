package w;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d implements b5.j {
    public static /* synthetic */ void A(Object obj) {
        if (obj == null) {
            return;
        }
        m9.o.b();
    }

    public static void B(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static boolean C(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static float a(float f8, float f10, float f11, float f12) {
        return ((f8 - f10) * f11) + f12;
    }

    public static int b(float f8, int i2, int i10) {
        return (Float.hashCode(f8) + i2) * i10;
    }

    public static int c(int i2, int i10, int i11) {
        return (Integer.hashCode(i2) + i10) * i11;
    }

    public static int d(int i2, int i10, String str) {
        return (str.hashCode() + i2) * i10;
    }

    public static int e(int i2, boolean z10, int i10) {
        return (Boolean.hashCode(z10) + i2) * i10;
    }

    public static int f(long j2, int i2, int i10) {
        return (Long.hashCode(j2) + i2) * i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.g0, java.lang.RuntimeException] */
    public static androidx.fragment.app.g0 g(String str) {
        x3.a.d(str);
        return new RuntimeException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.g0, java.lang.RuntimeException] */
    public static androidx.fragment.app.g0 i(n2.r rVar, int i2, boolean z10) {
        rVar.X(i2);
        rVar.p(z10);
        return new RuntimeException();
    }

    public static ClassCastException j(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException k(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String l(int i2, String str) {
        return str + i2;
    }

    public static String m(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String n(String str, androidx.fragment.app.j0 j0Var, String str2) {
        return str + j0Var + str2;
    }

    public static String o(StringBuilder sb2, float f8, char c4) {
        sb2.append(f8);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, int i2, char c4) {
        sb2.append(i2);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, int i2, String str) {
        sb2.append(i2);
        sb2.append(str);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, String str, char c4) {
        sb2.append(str);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static n2.w0 v(long j2, n2.r rVar, boolean z10) {
        n2.w0 A = n2.s.A(new i3.s(j2), rVar);
        rVar.p(z10);
        return A;
    }

    public static void w(int i2, n2.r rVar, int i10, a4.f fVar) {
        rVar.h0(Integer.valueOf(i2));
        rVar.b(Integer.valueOf(i10), fVar);
    }

    public static void x(int i2, n2.r rVar, a4.f fVar, n2.r rVar2, a4.e eVar) {
        n2.s.u(rVar, Integer.valueOf(i2), fVar);
        n2.s.y(rVar2, eVar);
    }

    public static void y(a4.n nVar, long j2) {
        nVar.p().m();
        nVar.J(j2);
    }

    public static /* synthetic */ void z(Cursor cursor) {
        boolean isTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
        } else if (cursor instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) cursor;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z10 = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z10) {
                            executorService.shutdownNow();
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
        } else if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
        } else if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else {
            fj.j.b();
        }
    }
}
