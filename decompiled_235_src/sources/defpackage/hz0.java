package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz0  reason: default package */
/* loaded from: classes.dex */
public final class hz0 extends v80 {
    public final m80 n0;

    public hz0(int i, m80 m80Var, qn2 qn2Var) {
        super(i, qn2Var);
        this.n0 = m80Var;
        if (m80Var != m80.SUSPEND) {
            if (i >= 1) {
                return;
            }
            i.f(lb1.k("Buffered channel capacity must be at least 1, but ", i, " was specified"));
            throw null;
        }
        u34.A(gh5.a(v80.class).c(), " instead", "This implementation does not support suspension for senders, use ");
        throw null;
    }

    @Override // defpackage.v80
    public final boolean H() {
        if (this.n0 == m80.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    public final Object X(boolean z, Object obj) {
        qn2 qn2Var;
        ug l;
        if (this.n0 == m80.DROP_LATEST) {
            Object c = super.c(obj);
            if ((c instanceof fm0) && !(c instanceof em0)) {
                if (z && (qn2Var = this.B) != null && (l = oi2.l(qn2Var, obj, null)) != null) {
                    throw l;
                }
                return jg7.a;
            }
            return c;
        }
        return T(obj);
    }

    @Override // defpackage.v80, defpackage.ob6
    public final Object a(r41 r41Var, Object obj) {
        ug l;
        if (X(true, obj) instanceof em0) {
            qn2 qn2Var = this.B;
            if (qn2Var != null && (l = oi2.l(qn2Var, obj, null)) != null) {
                mb3.q(l, y());
                throw l;
            }
            throw y();
        }
        return jg7.a;
    }

    @Override // defpackage.v80, defpackage.ob6
    public final Object c(Object obj) {
        return X(false, obj);
    }
}
