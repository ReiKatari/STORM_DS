package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: os5  reason: default package */
/* loaded from: classes.dex */
public final class os5 extends k11 implements w92 {
    public final w92 R;
    public final e31 X;
    public final int Y;
    public e31 Z;
    public j11 c0;

    public os5(w92 w92Var, e31 e31Var) {
        super(ms0.L, mp1.A);
        this.R = w92Var;
        this.X = e31Var;
        this.Y = ((Number) e31Var.N(new qt0(28), 0)).intValue();
    }

    @Override // defpackage.k11, defpackage.j11
    public final e31 a() {
        e31 e31Var = this.Z;
        if (e31Var == null) {
            return mp1.A;
        }
        return e31Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        try {
            Object x = x(j11Var, obj);
            if (x == p31.COROUTINE_SUSPENDED) {
                return x;
            }
            return o27.a;
        } catch (Throwable th) {
            this.Z = new ii1(j11Var.a(), th);
            throw th;
        }
    }

    @Override // defpackage.m00, defpackage.q31
    public final q31 g() {
        j11 j11Var = this.c0;
        if (j11Var instanceof q31) {
            return (q31) j11Var;
        }
        return null;
    }

    @Override // defpackage.m00
    public final StackTraceElement u() {
        return null;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Throwable a = nc5.a(obj);
        if (a != null) {
            this.Z = new ii1(a(), a);
        }
        j11 j11Var = this.c0;
        if (j11Var != null) {
            j11Var.k(obj);
        }
        return p31.COROUTINE_SUSPENDED;
    }

    public final Object x(j11 j11Var, Object obj) {
        e31 a = j11Var.a();
        ln2.B(a);
        e31 e31Var = this.Z;
        if (e31Var != a) {
            if (!(e31Var instanceof ii1)) {
                if (((Number) a.N(new z5(29, this), 0)).intValue() == this.Y) {
                    this.Z = a;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + a + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(ah6.Y("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ii1) e31Var).B + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.c0 = j11Var;
        bj2 bj2Var = qs5.a;
        w92 w92Var = this.R;
        w92Var.getClass();
        Object i = bj2Var.i(w92Var, obj, this);
        if (!b53.x(i, p31.COROUTINE_SUSPENDED)) {
            this.c0 = null;
        }
        return i;
    }
}
