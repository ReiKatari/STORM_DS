package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac5  reason: default package */
/* loaded from: classes.dex */
public final class ac5 implements bc5 {
    public final yb5 a;
    public final String b;

    public ac5(yb5 yb5Var, String str) {
        yb5Var.getClass();
        this.a = yb5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac5)) {
            return false;
        }
        ac5 ac5Var = (ac5) obj;
        if (this.a == ac5Var.a && nb3.k(this.b, ac5Var.b)) {
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
        return "PreflightFailed(stage=" + this.a + ", errorType=" + this.b + ")";
    }
}
