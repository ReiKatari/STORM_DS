package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k36  reason: default package */
/* loaded from: classes.dex */
public final class k36 extends s41 implements ne2 {
    public final ne2 R;
    public final l61 X;
    public final int Y;
    public l61 Z;
    public r41 d0;

    public k36(ne2 ne2Var, l61 l61Var) {
        super(zu0.L, vt1.A);
        this.R = ne2Var;
        this.X = l61Var;
        this.Y = ((Number) l61Var.x(new ep3(13, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        try {
            Object v = v(r41Var, obj);
            if (v == x61.COROUTINE_SUSPENDED) {
                return v;
            }
            return jg7.a;
        } catch (Throwable th) {
            this.Z = new nm1(r41Var.b(), th);
            throw th;
        }
    }

    @Override // defpackage.s41, defpackage.r41
    public final l61 b() {
        l61 l61Var = this.Z;
        if (l61Var == null) {
            return vt1.A;
        }
        return l61Var;
    }

    @Override // defpackage.d20, defpackage.y61
    public final y61 f() {
        r41 r41Var = this.d0;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    @Override // defpackage.d20
    public final StackTraceElement r() {
        return null;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Throwable a = hm5.a(obj);
        if (a != null) {
            this.Z = new nm1(b(), a);
        }
        r41 r41Var = this.d0;
        if (r41Var != null) {
            r41Var.i(obj);
        }
        return x61.COROUTINE_SUSPENDED;
    }

    public final Object v(r41 r41Var, Object obj) {
        l61 b = r41Var.b();
        yh2.o(b);
        l61 l61Var = this.Z;
        if (l61Var != b) {
            if (!(l61Var instanceof nm1)) {
                if (((Number) b.x(new z5(this, 29), 0)).intValue() == this.Y) {
                    this.Z = b;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + b + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(rs6.R("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((nm1) l61Var).B + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.d0 = r41Var;
        fo2 fo2Var = m36.a;
        ne2 ne2Var = this.R;
        ne2Var.getClass();
        Object e = fo2Var.e(ne2Var, obj, this);
        if (!nb3.k(e, x61.COROUTINE_SUSPENDED)) {
            this.d0 = null;
        }
        return e;
    }
}
