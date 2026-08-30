package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cb3  reason: default package */
/* loaded from: classes.dex */
public final class cb3 {
    public final ib6 a;
    public db3 b;
    public jc2 c;

    public cb3(ib6 ib6Var) {
        this.a = ib6Var;
    }

    public final db3 a() {
        db3 db3Var = this.b;
        if (db3Var != null) {
            return db3Var;
        }
        b53.g0("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        mi2 mi2Var;
        ib6 ib6Var;
        if (i == 7) {
            mi2Var = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                a();
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                a();
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                i.n("invalid ImeAction");
                return false;
            }
            mi2Var = null;
        }
        if (mi2Var != null) {
            mi2Var.n(this);
            return true;
        } else if (i == 6) {
            jc2 jc2Var = this.c;
            if (jc2Var != null) {
                ((nc2) jc2Var).g(1, true);
                return true;
            }
            b53.g0("focusManager");
            throw null;
        } else if (i == 5) {
            jc2 jc2Var2 = this.c;
            if (jc2Var2 != null) {
                ((nc2) jc2Var2).g(2, true);
                return true;
            }
            b53.g0("focusManager");
            throw null;
        } else if (i != 7 || (ib6Var = this.a) == null) {
            return false;
        } else {
            ((zc1) ib6Var).a();
            return true;
        }
    }
}
