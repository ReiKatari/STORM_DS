package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb5  reason: default package */
/* loaded from: classes.dex */
public final class vb5 {
    public final yb5 a;
    public final String b;

    public vb5(yb5 yb5Var, String str) {
        yb5Var.getClass();
        this.a = yb5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb5)) {
            return false;
        }
        vb5 vb5Var = (vb5) obj;
        if (this.a == vb5Var.a && nb3.k(this.b, vb5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "RaInGameLogoutCommitFailure(stage=" + this.a + ", errorType=" + this.b + ")";
    }
}
