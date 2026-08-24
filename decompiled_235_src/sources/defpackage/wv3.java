package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv3  reason: default package */
/* loaded from: classes.dex */
public final class wv3 extends qo2 {
    public final ar0 b;
    public final Object c;
    public final qo2 d;

    public wv3(ar0 ar0Var, Object obj, qo2 qo2Var) {
        obj.getClass();
        qo2Var.getClass();
        this.b = ar0Var;
        this.c = obj;
        this.d = qo2Var;
    }

    @Override // defpackage.qo2
    public final Object A(ar0 ar0Var) {
        if (ar0Var.equals(this.b)) {
            Class cls = ar0Var.a;
            cls.getClass();
            return cls.cast(this.c);
        }
        return this.d.A(ar0Var);
    }

    @Override // defpackage.qo2
    public final qo2 F(ar0 ar0Var, Object obj) {
        ar0 ar0Var2 = this.b;
        boolean equals = ar0Var.equals(ar0Var2);
        qo2 qo2Var = this.d;
        if (!equals) {
            qo2 F = qo2Var.F(ar0Var, null);
            if (F != qo2Var) {
                this = new wv3(ar0Var2, this.c, F);
            }
            qo2Var = this;
        }
        if (obj != null) {
            return new wv3(ar0Var, obj, qo2Var);
        }
        return qo2Var;
    }

    public final String toString() {
        return gt0.P0(gt0.a1(sb6.c0(sb6.Z(this, new v83(20)))), null, "{", "}", new v83(21), 25);
    }
}
