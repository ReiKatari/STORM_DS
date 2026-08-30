package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gm  reason: default package */
/* loaded from: classes.dex */
public final class gm extends g31 {
    public static final il6 h0 = new il6(te.g0);
    public static final em i0 = new em(0);
    public final Choreographer L;
    public final Handler R;
    public boolean d0;
    public boolean e0;
    public final im g0;
    public final Object X = new Object();
    public final xt Y = new xt();
    public ArrayList Z = new ArrayList();
    public ArrayList c0 = new ArrayList();
    public final fm f0 = new fm(this);

    public gm(Choreographer choreographer, Handler handler) {
        this.L = choreographer;
        this.R = handler;
        this.g0 = new im(choreographer, this);
    }

    public static final void n0(gm gmVar) {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (gmVar.X) {
                xt xtVar = gmVar.Y;
                if (xtVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = xtVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (gmVar.X) {
                    xt xtVar2 = gmVar.Y;
                    if (xtVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = xtVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (gmVar.X) {
                if (gmVar.Y.isEmpty()) {
                    z = false;
                    gmVar.d0 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        synchronized (this.X) {
            this.Y.addLast(runnable);
            if (!this.d0) {
                this.d0 = true;
                this.R.post(this.f0);
                if (!this.e0) {
                    this.e0 = true;
                    this.L.postFrameCallback(this.f0);
                }
            }
        }
    }
}
