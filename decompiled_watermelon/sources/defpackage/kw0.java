package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kw0  reason: default package */
/* loaded from: classes.dex */
public final class kw0 extends q60 {
    public final h60 m0;

    public kw0(int i, h60 h60Var, mi2 mi2Var) {
        super(i, mi2Var);
        this.m0 = h60Var;
        if (h60Var != h60.SUSPEND) {
            if (i >= 1) {
                return;
            }
            i.g(wh1.j("Buffered channel capacity must be at least 1, but ", i, " was specified"));
            throw null;
        }
        c44.t(q75.a(q60.class).c(), " instead", "This implementation does not support suspension for senders, use ");
        throw null;
    }

    @Override // defpackage.q60
    public final boolean H() {
        if (this.m0 == h60.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    public final Object X(boolean z, Object obj) {
        mi2 mi2Var;
        hg w;
        if (this.m0 == h60.DROP_LATEST) {
            Object c = super.c(obj);
            if ((c instanceof wj0) && !(c instanceof vj0)) {
                if (z && (mi2Var = this.B) != null && (w = oo2.w(mi2Var, obj, null)) != null) {
                    throw w;
                }
                return o27.a;
            }
            return c;
        }
        return T(obj);
    }

    @Override // defpackage.q60, defpackage.zz5
    public final Object b(j11 j11Var, Object obj) {
        hg w;
        if (X(true, obj) instanceof vj0) {
            mi2 mi2Var = this.B;
            if (mi2Var != null && (w = oo2.w(mi2Var, obj, null)) != null) {
                pu.k(w, y());
                throw w;
            }
            throw y();
        }
        return o27.a;
    }

    @Override // defpackage.q60, defpackage.zz5
    public final Object c(Object obj) {
        return X(false, obj);
    }
}
