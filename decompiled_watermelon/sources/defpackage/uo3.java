package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo3  reason: default package */
/* loaded from: classes.dex */
public final class uo3 extends io2 {
    public final qo0 j;
    public final Object k;
    public final io2 l;

    public uo3(qo0 qo0Var, Object obj, io2 io2Var) {
        obj.getClass();
        io2Var.getClass();
        this.j = qo0Var;
        this.k = obj;
        this.l = io2Var;
    }

    @Override // defpackage.io2
    public final io2 g0(qo0 qo0Var, Object obj) {
        qo0 qo0Var2 = this.j;
        boolean equals = qo0Var.equals(qo0Var2);
        io2 io2Var = this.l;
        if (!equals) {
            io2 g0 = io2Var.g0(qo0Var, null);
            if (g0 != io2Var) {
                this = new uo3(qo0Var2, this.k, g0);
            }
            io2Var = this;
        }
        if (obj != null) {
            return new uo3(qo0Var, obj, io2Var);
        }
        return io2Var;
    }

    public final String toString() {
        return tq0.S0(tq0.d1(d06.A0(d06.x0(this, new gi3(8)))), null, "{", "}", new gi3(9), 25);
    }

    @Override // defpackage.io2
    public final Object x(qo0 qo0Var) {
        if (qo0Var.equals(this.j)) {
            Class cls = qo0Var.a;
            cls.getClass();
            return cls.cast(this.k);
        }
        return this.l.x(qo0Var);
    }
}
