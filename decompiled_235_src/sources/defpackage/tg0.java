package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg0  reason: default package */
/* loaded from: classes.dex */
public final class tg0 {
    public final nb1 a;
    public final int b;
    public final Object c;
    public boolean d;

    public tg0(nb1 nb1Var) {
        this.a = nb1Var;
        uw uwVar = vg0.a;
        uwVar.getClass();
        this.b = uw.b.incrementAndGet(uwVar);
        this.c = new Object();
    }

    public final oi0 a() {
        oi0 oi0Var;
        synchronized (this.c) {
            if (!this.d) {
                oi0Var = (oi0) ((m55) this.a.y).get();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return oi0Var;
    }

    public final cf0 b() {
        cf0 cf0Var;
        synchronized (this.c) {
            if (!this.d) {
                cf0Var = (cf0) ((m55) this.a.w).get();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return cf0Var;
    }

    public final sf0 c(kf0 kf0Var, qf0 qf0Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) xf0.b(kf0Var.a)));
            return (sf0) new kb1((nb1) this.a.c, new u63(kf0Var, qf0Var)).s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
