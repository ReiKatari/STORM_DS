package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yy3  reason: default package */
/* loaded from: classes.dex */
public abstract class yy3 implements vc1 {
    public g11 B;
    public int L;
    public yy3 X;
    public yy3 Y;
    public n94 Z;
    public m74 c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public wd h0;
    public boolean i0;
    public yy3 A = this;
    public int R = -1;

    public final o31 F0() {
        g11 g11Var = this.B;
        if (g11Var == null) {
            g11 c = iq2.c(((ee) l.Q(this)).getCoroutineContext().C(new e63((c63) ((ee) l.Q(this)).getCoroutineContext().I(k45.d0))));
            this.B = c;
            return c;
        }
        return g11Var;
    }

    public boolean G0() {
        return !(this instanceof mz);
    }

    public void H0() {
        if (this.i0) {
            mz2.c("node attached multiple times");
        }
        if (this.c0 == null) {
            mz2.c("attach invoked on a node without a coordinator");
        }
        this.i0 = true;
        this.f0 = true;
    }

    public void I0() {
        if (!this.i0) {
            mz2.c("Cannot detach a node that is not attached");
        }
        if (this.f0) {
            mz2.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.g0) {
            mz2.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.i0 = false;
        g11 g11Var = this.B;
        if (g11Var != null) {
            iq2.f(g11Var, new po4("The Modifier.Node was detached", 2));
            this.B = null;
        }
    }

    public void M0() {
        if (!this.i0) {
            mz2.c("reset() called on an unattached node");
        }
        L0();
    }

    public void N0() {
        if (!this.i0) {
            mz2.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f0) {
            mz2.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f0 = false;
        J0();
        this.g0 = true;
    }

    public void O0() {
        if (!this.i0) {
            mz2.c("node detached multiple times");
        }
        if (this.c0 == null) {
            mz2.c("detach invoked on a node without a coordinator");
        }
        if (!this.g0) {
            mz2.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.g0 = false;
        wd wdVar = this.h0;
        if (wdVar != null) {
            wdVar.c();
        }
        K0();
    }

    public void P0(yy3 yy3Var) {
        this.A = yy3Var;
    }

    public void Q0(m74 m74Var) {
        this.c0 = m74Var;
    }

    public void J0() {
    }

    public void K0() {
    }

    public void L0() {
    }
}
