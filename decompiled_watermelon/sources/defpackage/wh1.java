package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wh1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wh1 {
    public static String A(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return zp0.i(i) + i2 + i3 + i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, hg] */
    public static hg c(String str) {
        pz2.b(str);
        return new RuntimeException();
    }

    public static kc5 d(e31 e31Var, e31 e31Var2, Throwable th) {
        e31Var.getClass();
        ln2.B(e31Var2);
        return new kc5(th);
    }

    public static kj6 e(ArrayList arrayList, kj6 kj6Var) {
        arrayList.add(kj6Var);
        return new kj6();
    }

    public static String f(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(Uri uri, String str) {
        return str + uri;
    }

    public static String j(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String k(String str, o oVar, String str2) {
        return str + oVar + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String n(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder s(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void t(int i, int i2, int i3, int i4, int i5) {
        jk2.f(i);
        jk2.f(i2);
        jk2.f(i3);
        jk2.f(i4);
        jk2.f(i5);
    }

    public static void u(os osVar, long j) {
        osVar.s().j();
        osVar.Q(j);
    }

    public static void v(kj6 kj6Var, pj6 pj6Var, nj6 nj6Var, lj6 lj6Var, cg6 cg6Var) {
        kj6Var.a(pj6Var);
        kj6Var.a(jo1.r(nj6Var, lj6Var, cg6Var));
    }

    public static void w(nj6 nj6Var, lj6 lj6Var, kj6 kj6Var, nj6 nj6Var2, lj6 lj6Var2) {
        cg6 cg6Var = pj6.e;
        kj6Var.a(jo1.r(nj6Var, lj6Var, cg6Var));
        kj6Var.a(jo1.r(nj6Var2, lj6Var2, cg6Var));
    }

    public static /* synthetic */ void x(Cursor cursor) {
        boolean isTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
        } else if (cursor instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) cursor;
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
        } else if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
        } else if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
        } else if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else {
            c44.r();
        }
    }

    public static void y(String str, String str2, String str3, String str4, String str5) {
        Log.w(str5, str + str2 + str3 + str4);
    }

    public static int z(int i, int i2, int i3) {
        return zp0.h(i) + i2 + i3;
    }
}
