package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s50  reason: default package */
/* loaded from: classes.dex */
public final class s50 extends yy3 implements k50, sc3 {
    public k01 j0;
    public boolean k0;

    public static final y55 R0(s50 s50Var, m74 m74Var, wd wdVar) {
        y55 y55Var;
        if (s50Var.i0 && s50Var.k0) {
            m74 O = l.O(s50Var);
            if (!m74Var.Y0().i0) {
                m74Var = null;
            }
            if (m74Var != null && (y55Var = (y55) wdVar.c()) != null) {
                return y55Var.i(O.L(m74Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.k50
    public final Object l0(m74 m74Var, wd wdVar, k11 k11Var) {
        Object k = iq2.k(new r50(this, m74Var, wdVar, new t6(this, m74Var, wdVar, 3), (j11) null, 0), k11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }

    @Override // defpackage.sc3
    public final void s(rd3 rd3Var) {
        this.k0 = true;
    }
}
