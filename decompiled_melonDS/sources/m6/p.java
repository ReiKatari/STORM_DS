package m6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9293a;

    /* renamed from: b  reason: collision with root package name */
    public final v5.c f9294b;

    /* renamed from: c  reason: collision with root package name */
    public final k0.g f9295c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9296d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler f9297e;

    /* renamed from: f  reason: collision with root package name */
    public ThreadPoolExecutor f9298f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f9299g;

    /* renamed from: h  reason: collision with root package name */
    public k7.w f9300h;

    public p(Context context, v5.c cVar) {
        p7.m.l(context, "Context cannot be null");
        this.f9293a = context.getApplicationContext();
        this.f9294b = cVar;
        this.f9295c = q.f9301d;
    }

    public final void a() {
        synchronized (this.f9296d) {
            try {
                this.f9300h = null;
                Handler handler = this.f9297e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f9297e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f9299g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f9298f = null;
                this.f9299g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m6.h
    public final void b(k7.w wVar) {
        synchronized (this.f9296d) {
            this.f9300h = wVar;
        }
        synchronized (this.f9296d) {
            try {
                if (this.f9300h == null) {
                    return;
                }
                if (this.f9298f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f9299g = threadPoolExecutor;
                    this.f9298f = threadPoolExecutor;
                }
                this.f9298f.execute(new a8.f(23, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v5.g c() {
        try {
            k0.g gVar = this.f9295c;
            Context context = this.f9293a;
            v5.c cVar = this.f9294b;
            gVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            o1.r a10 = v5.b.a(context, Collections.unmodifiableList(arrayList));
            int i2 = a10.f10585a;
            if (i2 == 0) {
                v5.g[] gVarArr = (v5.g[]) a10.f10586b.get(0);
                if (gVarArr != null && gVarArr.length != 0) {
                    return gVarArr[0];
                }
                m9.o.r("fetchFonts failed (empty result)");
                return null;
            }
            m9.o.r(w.d.m("fetchFonts failed (", i2, ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            m9.o.m("provider not found", e6);
            return null;
        }
    }
}
