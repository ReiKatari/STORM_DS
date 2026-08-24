package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzbc;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg6 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xg6 {
    public static /* synthetic */ void A(Object obj) {
        if (obj == null) {
            return;
        }
        u34.a();
    }

    public static void B(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static na2 C(int i, yc1 yc1Var) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        yc1Var.L(zzctVar.zzb());
        return yc1Var.o();
    }

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return zbtk.zbD(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(int i, boolean z, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ug, java.lang.RuntimeException] */
    public static ug f(xq2 xq2Var, int i, boolean z) {
        xq2Var.b0(i);
        xq2Var.p(z);
        return new RuntimeException();
    }

    public static na2 g(int i, yc1 yc1Var) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        yc1Var.L(zzayVar.zzb());
        return yc1Var.o();
    }

    public static zzbc h(int i) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzbc i(zzbc zzbcVar, HashMap hashMap, zzbc zzbcVar2, HashMap hashMap2, int i) {
        hashMap.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzai j(int i) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        return zzaeVar.zzb();
    }

    public static zzcx k(int i) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        return zzctVar.zzb();
    }

    public static zzcx l(zzcx zzcxVar, HashMap hashMap, zzcx zzcxVar2, HashMap hashMap2, int i) {
        hashMap.put(zzcxVar.annotationType(), zzcxVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
        zzct zzctVar = new zzct();
        zzctVar.zza(i);
        return zzctVar.zzb();
    }

    public static String m(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String n(Uri uri, String str) {
        return str + uri;
    }

    public static String o(String str, int i, char c) {
        return str + i + c;
    }

    public static String p(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static Map u(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void v(bt btVar, long j) {
        btVar.G().p();
        btVar.Y(j);
    }

    public static void w(hv6 hv6Var, fv6 fv6Var, ev6 ev6Var, hv6 hv6Var2, fv6 fv6Var2) {
        tr6 tr6Var = jv6.e;
        ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var));
        ev6Var.a(w31.m(hv6Var2, fv6Var2, tr6Var));
    }

    public static void x(zzbc zzbcVar, HashMap hashMap, zzbc zzbcVar2, HashMap hashMap2) {
        hashMap.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
    }

    public static void y(zzcx zzcxVar, HashMap hashMap, zzcx zzcxVar2, HashMap hashMap2) {
        hashMap.put(zzcxVar.annotationType(), zzcxVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) {
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
            u34.t();
        }
    }
}
