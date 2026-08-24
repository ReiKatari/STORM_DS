package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph0  reason: default package */
/* loaded from: classes.dex */
public final class ph0 {
    public final dg0 a;
    public final tx b;

    public ph0(dg0 dg0Var, tx txVar) {
        dg0Var.getClass();
        this.a = dg0Var;
        this.b = txVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        if (this.a == ph0Var.a && nb3.k(this.b, ph0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        tx txVar = this.b;
        if (txVar == null) {
            hashCode = 0;
        } else {
            hashCode = txVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }
}
