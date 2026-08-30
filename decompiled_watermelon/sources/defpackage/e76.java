package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e76  reason: default package */
/* loaded from: classes.dex */
public final class e76 extends ku0 {
    public Object b;
    public Object c;
    public e24 d;
    public e24 e;
    public zz5 f;
    public final n95 g;
    public final a31 h;

    public e76() {
        super(2);
        this.g = new n95(14, this);
        bt5 bt5Var = new bt5(5, this);
        ma6.e(ma6.a);
        synchronized (ma6.c) {
            ma6.h = tq0.Y0(ma6.h, bt5Var);
        }
        this.h = new a31(21, bt5Var);
    }

    @Override // defpackage.ku0
    public final void c(zz5 zz5Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.ku0
    public final void d() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        e24 e24Var = xu5.a;
                        this.d = new e24();
                    }
                    e24 e24Var2 = this.d;
                    this.d = this.e;
                    this.e = e24Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ku0
    public final void e() {
        this.h.g();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.ku0
    public final mi2 j(zz5 zz5Var) {
        zz5 zz5Var2 = this.f;
        if (zz5Var2 != null && !zz5Var2.equals(zz5Var)) {
            or4.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = zz5Var;
        return this.g;
    }

    @Override // defpackage.ku0
    public final void k(lj0 lj0Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        d();
    }
}
