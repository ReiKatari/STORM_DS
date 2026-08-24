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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi2  reason: default package */
/* loaded from: classes.dex */
public final class vi2 implements vs1 {
    public final Context a;
    public final ui2 b;
    public final w31 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public hv h;

    public vi2(Context context, ui2 ui2Var) {
        np2.x(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = ui2Var;
        this.c = wi2.d;
    }

    @Override // defpackage.vs1
    public final void a(hv hvVar) {
        synchronized (this.d) {
            this.h = hvVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ry0("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new n0(this, 26));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final rj2 c() {
        try {
            w31 w31Var = this.c;
            Context context = this.a;
            ui2 ui2Var = this.b;
            w31Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{ui2Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            qj2 a = ti2.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i == 0) {
                rj2[] rj2VarArr = (rj2[]) a.b.get(0);
                if (rj2VarArr != null && rj2VarArr.length != 0) {
                    return rj2VarArr[0];
                }
                u34.j("fetchFonts failed (empty result)");
                return null;
            }
            u34.j(lb1.k("fetchFonts failed (", i, ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            u34.p("provider not found", e);
            return null;
        }
    }
}
