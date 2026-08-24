package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
public final class sm extends n61 {
    public static final ex6 i0 = new ex6(jf.h0);
    public static final qm j0 = new qm(0);
    public final Choreographer L;
    public final Handler R;
    public boolean e0;
    public boolean f0;
    public final um h0;
    public final Object X = new Object();
    public final pu Y = new pu();
    public ArrayList Z = new ArrayList();
    public ArrayList d0 = new ArrayList();
    public final rm g0 = new rm(this);

    public sm(Choreographer choreographer, Handler handler) {
        this.L = choreographer;
        this.R = handler;
        this.h0 = new um(choreographer, this);
    }

    public static final void n0(sm smVar) {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (smVar.X) {
                pu puVar = smVar.Y;
                if (puVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = puVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (smVar.X) {
                    pu puVar2 = smVar.Y;
                    if (puVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = puVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (smVar.X) {
                if (smVar.Y.isEmpty()) {
                    z = false;
                    smVar.e0 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        synchronized (this.X) {
            this.Y.addLast(runnable);
            if (!this.e0) {
                this.e0 = true;
                this.R.post(this.g0);
                if (!this.f0) {
                    this.f0 = true;
                    this.L.postFrameCallback(this.g0);
                }
            }
        }
    }
}
