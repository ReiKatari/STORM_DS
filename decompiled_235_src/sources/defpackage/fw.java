package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw  reason: default package */
/* loaded from: classes.dex */
public final class fw extends hw {
    public final sr4 a;

    public fw(sr4 sr4Var) {
        this.a = sr4Var;
    }

    @Override // defpackage.hw
    public final sr4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fw) && nb3.k(this.a, ((fw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        sr4 sr4Var = this.a;
        if (sr4Var == null) {
            return 0;
        }
        return sr4Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
