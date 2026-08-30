package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ke0  reason: default package */
/* loaded from: classes.dex */
public final class ke0 {
    public final w71 a;
    public final int b;
    public final Object c;
    public boolean d;

    public ke0(w71 w71Var) {
        this.a = w71Var;
        cw cwVar = me0.a;
        cwVar.getClass();
        this.b = cw.b.incrementAndGet(cwVar);
        this.c = new Object();
    }

    public final fg0 a() {
        fg0 fg0Var;
        synchronized (this.c) {
            if (!this.d) {
                fg0Var = (fg0) this.a.z.get();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return fg0Var;
    }

    public final tc0 b() {
        tc0 tc0Var;
        synchronized (this.c) {
            if (!this.d) {
                tc0Var = (tc0) this.a.x.get();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return tc0Var;
    }

    public final jd0 c(bd0 bd0Var, hd0 hd0Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) od0.b(bd0Var.a)));
            return (jd0) new u71(this.a.c, new q03(bd0Var, hd0Var)).s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
