package b4;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends zc.q {

    /* renamed from: g0  reason: collision with root package name */
    public static final yb.n f2007g0 = new yb.n(m0.f1879b0);

    /* renamed from: h0  reason: collision with root package name */
    public static final w0 f2008h0 = new w0(0);
    public final Choreographer L;
    public final Handler R;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2010c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2011d0;

    /* renamed from: f0  reason: collision with root package name */
    public final a1 f2013f0;
    public final Object X = new Object();
    public final zb.j Y = new zb.j();
    public ArrayList Z = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList f2009b0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public final x0 f2012e0 = new x0(this);

    public y0(Choreographer choreographer, Handler handler) {
        this.L = choreographer;
        this.R = handler;
        this.f2013f0 = new a1(choreographer, this);
    }

    public static final void b0(y0 y0Var) {
        Object removeFirst;
        Runnable runnable;
        boolean z10;
        Object removeFirst2;
        do {
            synchronized (y0Var.X) {
                zb.j jVar = y0Var.Y;
                if (jVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = jVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (y0Var.X) {
                    zb.j jVar2 = y0Var.Y;
                    if (jVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = jVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (y0Var.X) {
                if (y0Var.Y.isEmpty()) {
                    z10 = false;
                    y0Var.f2010c0 = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        synchronized (this.X) {
            this.Y.addLast(runnable);
            if (!this.f2010c0) {
                this.f2010c0 = true;
                this.R.post(this.f2012e0);
                if (!this.f2011d0) {
                    this.f2011d0 = true;
                    this.L.postFrameCallback(this.f2012e0);
                }
            }
        }
    }
}
