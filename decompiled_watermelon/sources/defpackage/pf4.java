package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pf4  reason: default package */
/* loaded from: classes.dex */
public final class pf4 extends jk2 {
    public final ar5 d;
    public final vi e;

    public pf4(ar5 ar5Var) {
        vi viVar;
        this.d = ar5Var;
        if (!sn2.G(ar5Var)) {
            viVar = zi.a();
            vi.c(viVar, ar5Var);
        } else {
            viVar = null;
        }
        this.e = viVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pf4) {
                if (!this.d.equals(((pf4) obj).d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.jk2
    public final y55 v() {
        ar5 ar5Var = this.d;
        return new y55(ar5Var.a, ar5Var.b, ar5Var.c, ar5Var.d);
    }
}
