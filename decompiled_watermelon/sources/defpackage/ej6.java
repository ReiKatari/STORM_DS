package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ej6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ej6 {
    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int c(int i, boolean z, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, hg] */
    public static hg d(sk2 sk2Var, int i, boolean z) {
        sk2Var.X(i);
        sk2Var.p(z);
        return new RuntimeException();
    }

    public static String e(String str, int i, char c) {
        return str + i + c;
    }

    public static String f(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String g(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String h(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ void i(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
        } else if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
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
        } else if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
        } else if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else {
            c44.r();
        }
    }

    public static /* synthetic */ void j(Object obj) {
        if (obj == null) {
            return;
        }
        c44.b();
    }

    public static void k(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }
}
