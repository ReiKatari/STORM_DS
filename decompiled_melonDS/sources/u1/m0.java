package u1;

import b4.r2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final r2 f13363a;

    /* renamed from: b  reason: collision with root package name */
    public n0 f13364b;

    /* renamed from: c  reason: collision with root package name */
    public g3.l f13365c;

    public m0(r2 r2Var) {
        this.f13363a = r2Var;
    }

    public final n0 a() {
        n0 n0Var = this.f13364b;
        if (n0Var != null) {
            return n0Var;
        }
        nc.k.f("keyboardActions");
        throw null;
    }

    public final boolean b(int i2) {
        mc.l lVar;
        r2 r2Var;
        if (i2 == 7) {
            lVar = a().f13369a;
        } else {
            if (i2 == 2) {
                a();
            } else if (i2 == 6) {
                a();
            } else if (i2 == 5) {
                a();
            } else if (i2 == 3) {
                a();
            } else if (i2 == 4) {
                a();
            } else if (i2 != 1 && i2 != 0) {
                a0.j.p("invalid ImeAction");
                return false;
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.k(this);
            return true;
        } else if (i2 == 6) {
            g3.l lVar2 = this.f13365c;
            if (lVar2 != null) {
                ((g3.p) lVar2).g(1, true);
                return true;
            }
            nc.k.f("focusManager");
            throw null;
        } else if (i2 == 5) {
            g3.l lVar3 = this.f13365c;
            if (lVar3 != null) {
                ((g3.p) lVar3).g(2, true);
                return true;
            }
            nc.k.f("focusManager");
            throw null;
        } else if (i2 == 7 && (r2Var = this.f13363a) != null) {
            ((b4.s1) r2Var).a();
            return true;
        } else {
            return false;
        }
    }
}
