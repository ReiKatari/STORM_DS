package kc;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import fj.j;
import j0.a2;
import j0.b2;
import j0.d2;
import j0.f2;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import l0.f;
import n2.r;
import nb.c;
import rd.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static a2 a(d2 d2Var, b2 b2Var, a2 a2Var, ArrayList arrayList, a2 a2Var2) {
        a2Var.a(f2.a(d2Var, b2Var));
        arrayList.add(a2Var2);
        return new a2();
    }

    public static a2 b(ArrayList arrayList, a2 a2Var) {
        arrayList.add(a2Var);
        return new a2();
    }

    public static String c(char c4, String str, String str2) {
        return str + str2 + c4;
    }

    public static String d(int i2, int i10, String str, String str2) {
        return str + i2 + str2 + i10;
    }

    public static String e(long j2, String str) {
        return str + j2;
    }

    public static String f(String str, Uri uri) {
        return str + uri;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(r rVar, int i2, int i10, r rVar2, boolean z10) {
        rVar.X(i2);
        String I = f.I(rVar2, i10);
        rVar.p(z10);
        return I;
    }

    public static StringBuilder i(String str, int i2, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i2);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder j(String str, int i2, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i2);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder k(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static c l(g gVar, int i2) {
        return nb.a.a(new rd.f(gVar, i2));
    }

    public static void m(int i2, int i10, int i11, int i12, int i13) {
        t3.c.a(i2);
        t3.c.a(i10);
        t3.c.a(i11);
        t3.c.a(i12);
        t3.c.a(i13);
    }

    public static void n(d2 d2Var, b2 b2Var, a2 a2Var, d2 d2Var2, b2 b2Var2) {
        a2Var.a(f2.a(d2Var, b2Var));
        a2Var.a(f2.a(d2Var2, b2Var2));
    }

    public static /* synthetic */ void o(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
        } else if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
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
        } else if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
        } else if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else {
            j.b();
        }
    }

    public static /* synthetic */ void p(t7.c cVar) {
        boolean isTerminated;
        if (cVar instanceof AutoCloseable) {
            cVar.close();
        } else if (cVar instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) cVar;
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
        } else if (cVar instanceof TypedArray) {
            ((TypedArray) cVar).recycle();
        } else if (cVar instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cVar).release();
        } else if (cVar instanceof MediaDrm) {
            ((MediaDrm) cVar).release();
        } else {
            j.b();
        }
    }
}
