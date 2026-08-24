package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy  reason: default package */
/* loaded from: classes.dex */
public final class qy extends te4 {
    public final se4 a;
    public final re4 b;

    public qy(se4 se4Var, re4 re4Var) {
        this.a = se4Var;
        this.b = re4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof te4) {
            te4 te4Var = (te4) obj;
            se4 se4Var = this.a;
            if (se4Var != null ? se4Var.equals(((qy) te4Var).a) : ((qy) te4Var).a == null) {
                re4 re4Var = this.b;
                if (re4Var != null ? re4Var.equals(((qy) te4Var).b) : ((qy) te4Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        se4 se4Var = this.a;
        if (se4Var == null) {
            hashCode = 0;
        } else {
            hashCode = se4Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        re4 re4Var = this.b;
        if (re4Var != null) {
            i = re4Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
