package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nv  reason: default package */
/* loaded from: classes.dex */
public final class nv extends pv {
    public final qi4 a;

    public nv(qi4 qi4Var) {
        this.a = qi4Var;
    }

    @Override // defpackage.pv
    public final qi4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nv) && b53.x(this.a, ((nv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        qi4 qi4Var = this.a;
        if (qi4Var == null) {
            return 0;
        }
        return qi4Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
