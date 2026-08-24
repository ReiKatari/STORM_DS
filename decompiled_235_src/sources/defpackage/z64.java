package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z64  reason: default package */
/* loaded from: classes.dex */
public abstract class z64 implements xg1 {
    public o41 B;
    public int L;
    public z64 X;
    public z64 Y;
    public hi4 Z;
    public eg4 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public le i0;
    public boolean j0;
    public z64 A = this;
    public int R = -1;

    public final w61 F0() {
        o41 o41Var = this.B;
        if (o41Var == null) {
            o41 i = g04.i(((te) nc1.g0(this)).getCoroutineContext().N(new tc3((rc3) ((te) nc1.g0(this)).getCoroutineContext().Z(vs0.h0))));
            this.B = i;
            return i;
        }
        return o41Var;
    }

    public boolean G0() {
        return !(this instanceof d10);
    }

    public void H0() {
        if (this.j0) {
            p53.c("node attached multiple times");
        }
        if (this.d0 == null) {
            p53.c("attach invoked on a node without a coordinator");
        }
        this.j0 = true;
        this.g0 = true;
    }

    public void I0() {
        if (!this.j0) {
            p53.c("Cannot detach a node that is not attached");
        }
        if (this.g0) {
            p53.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.h0) {
            p53.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.j0 = false;
        o41 o41Var = this.B;
        if (o41Var != null) {
            g04.x(o41Var, new tx4("The Modifier.Node was detached", 2));
            this.B = null;
        }
    }

    public void M0() {
        if (!this.j0) {
            p53.c("reset() called on an unattached node");
        }
        L0();
    }

    public void N0() {
        if (!this.j0) {
            p53.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.g0) {
            p53.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.g0 = false;
        J0();
        this.h0 = true;
    }

    public void O0() {
        if (!this.j0) {
            p53.c("node detached multiple times");
        }
        if (this.d0 == null) {
            p53.c("detach invoked on a node without a coordinator");
        }
        if (!this.h0) {
            p53.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.h0 = false;
        le leVar = this.i0;
        if (leVar != null) {
            leVar.c();
        }
        K0();
    }

    public void P0(z64 z64Var) {
        this.A = z64Var;
    }

    public void Q0(eg4 eg4Var) {
        this.d0 = eg4Var;
    }

    public void J0() {
    }

    public void K0() {
    }

    public void L0() {
    }
}
