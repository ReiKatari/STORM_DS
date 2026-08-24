package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lb1 {
    public static String A(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ms0.i(i) + i2 + i3 + i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ug, java.lang.RuntimeException] */
    public static ug c(String str) {
        s53.b(str);
        return new RuntimeException();
    }

    public static m55 d(nb1 nb1Var, int i) {
        return em1.a(new mb1(nb1Var, i, 0));
    }

    public static m55 e(sb1 sb1Var, int i) {
        return em1.a(new mb1(sb1Var, i, 1));
    }

    public static ev6 f(ArrayList arrayList, ev6 ev6Var) {
        arrayList.add(ev6Var);
        return new ev6();
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String j(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String k(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String l(String str, o oVar, String str2) {
        return str + oVar + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String o(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder s(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void t(int i, int i2, int i3, int i4, int i5) {
        qo2.e(i);
        qo2.e(i2);
        qo2.e(i3);
        qo2.e(i4);
        qo2.e(i5);
    }

    public static void u(ev6 ev6Var, jv6 jv6Var, hv6 hv6Var, fv6 fv6Var, tr6 tr6Var) {
        ev6Var.a(jv6Var);
        ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var));
    }

    public static /* synthetic */ void v(Cursor cursor) {
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
            u34.t();
        }
    }

    public static void w(String str, String str2, String str3, String str4, String str5) {
        Log.w(str5, str + str2 + str3 + str4);
    }

    public static void x(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static int y(int i, int i2, int i3) {
        return ms0.h(i) + i2 + i3;
    }

    public static String z(String str, String str2, String str3) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        String replaceAll = compile.matcher(str2).replaceAll(str3);
        replaceAll.getClass();
        return replaceAll;
    }
}
