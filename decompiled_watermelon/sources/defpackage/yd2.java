package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd2  reason: default package */
/* loaded from: classes.dex */
public final class yd2 implements lo1 {
    public final Context A;
    public final xd2 B;
    public final vn1 L;
    public final Object R = new Object();
    public Handler X;
    public ThreadPoolExecutor Y;
    public ThreadPoolExecutor Z;
    public l07 c0;

    public yd2(Context context, xd2 xd2Var) {
        nl2.C(context, "Context cannot be null");
        this.A = context.getApplicationContext();
        this.B = xd2Var;
        this.L = zd2.d;
    }

    @Override // defpackage.lo1
    public final void a(l07 l07Var) {
        synchronized (this.R) {
            this.c0 = l07Var;
        }
        synchronized (this.R) {
            try {
                if (this.c0 == null) {
                    return;
                }
                if (this.Y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new vv0("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.Z = threadPoolExecutor;
                    this.Y = threadPoolExecutor;
                }
                this.Y.execute(new m0(26, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.R) {
            try {
                this.c0 = null;
                Handler handler = this.X;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.X = null;
                ThreadPoolExecutor threadPoolExecutor = this.Z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.Y = null;
                this.Z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final se2 c() {
        try {
            vn1 vn1Var = this.L;
            Context context = this.A;
            xd2 xd2Var = this.B;
            vn1Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{xd2Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            re2 a = wd2.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i == 0) {
                se2[] se2VarArr = (se2[]) a.b.get(0);
                if (se2VarArr != null && se2VarArr.length != 0) {
                    return se2VarArr[0];
                }
                f81.w("fetchFonts failed (empty result)");
                return null;
            }
            f81.w(wh1.j("fetchFonts failed (", i, ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            c44.o("provider not found", e);
            return null;
        }
    }
}
