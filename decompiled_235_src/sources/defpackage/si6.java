package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si6  reason: default package */
/* loaded from: classes.dex */
public final class si6 extends gx0 {
    public Object b;
    public Object c;
    public ka4 d;
    public ka4 e;
    public ob6 f;
    public final ro5 g;
    public final h61 h;

    public si6() {
        super(2);
        this.g = new ro5(this, 12);
        y36 y36Var = new y36(this, 5);
        bm6.e(bm6.a);
        synchronized (bm6.c) {
            bm6.h = gt0.U0(y36Var, bm6.h);
        }
        this.h = new h61(y36Var, 20);
    }

    @Override // defpackage.gx0
    public final void c(ob6 ob6Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.gx0
    public final void d() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        ka4 ka4Var = c66.a;
                        this.d = new ka4();
                    }
                    ka4 ka4Var2 = this.d;
                    this.d = this.e;
                    this.e = ka4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gx0
    public final void e() {
        this.h.d();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.gx0
    public final qn2 j(ob6 ob6Var) {
        ob6 ob6Var2 = this.f;
        if (ob6Var2 != null && !ob6Var2.equals(ob6Var)) {
            r05.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = ob6Var;
        return this.g;
    }

    @Override // defpackage.gx0
    public final void k(ul0 ul0Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        d();
    }
}
