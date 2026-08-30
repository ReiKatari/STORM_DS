package b3;

import a4.n0;
import a4.r1;
import a4.y1;
import ah.h0;
import zc.a1;
import zc.u;
import zc.x;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o implements a4.j {
    public h0 B;
    public int L;
    public o X;
    public o Y;
    public y1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public r1 f1771b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1772c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1773d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1774e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1775f0;

    /* renamed from: g0  reason: collision with root package name */
    public n0 f1776g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1777h0;
    public o A = this;
    public int R = -1;

    public final u C0() {
        h0 h0Var = this.B;
        if (h0Var == null) {
            h0 a10 = x.a(((b4.x) a4.l.u(this)).getCoroutineContext().H(new a1((y0) ((b4.x) a4.l.u(this)).getCoroutineContext().t(zc.r.B))));
            this.B = a10;
            return a10;
        }
        return h0Var;
    }

    public boolean D0() {
        return !(this instanceof f1.o);
    }

    public void E0() {
        if (this.f1777h0) {
            x3.a.c("node attached multiple times");
        }
        if (this.f1771b0 == null) {
            x3.a.c("attach invoked on a node without a coordinator");
        }
        this.f1777h0 = true;
        this.f1774e0 = true;
    }

    public void F0() {
        if (!this.f1777h0) {
            x3.a.c("Cannot detach a node that is not attached");
        }
        if (this.f1774e0) {
            x3.a.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f1775f0) {
            x3.a.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f1777h0 = false;
        h0 h0Var = this.B;
        if (h0Var != null) {
            x.f(h0Var, new k1.c("The Modifier.Node was detached", 2));
            this.B = null;
        }
    }

    public void J0() {
        if (!this.f1777h0) {
            x3.a.c("reset() called on an unattached node");
        }
        I0();
    }

    public void K0() {
        if (!this.f1777h0) {
            x3.a.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f1774e0) {
            x3.a.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f1774e0 = false;
        G0();
        this.f1775f0 = true;
    }

    public void L0() {
        if (!this.f1777h0) {
            x3.a.c("node detached multiple times");
        }
        if (this.f1771b0 == null) {
            x3.a.c("detach invoked on a node without a coordinator");
        }
        if (!this.f1775f0) {
            x3.a.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f1775f0 = false;
        n0 n0Var = this.f1776g0;
        if (n0Var != null) {
            n0Var.b();
        }
        H0();
    }

    public void M0(o oVar) {
        this.A = oVar;
    }

    public void N0(r1 r1Var) {
        this.f1771b0 = r1Var;
    }

    public void G0() {
    }

    public void H0() {
    }

    public void I0() {
    }
}
