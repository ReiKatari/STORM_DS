package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx  reason: default package */
/* loaded from: classes.dex */
public final class wx extends rr0 {
    public final qr0 a;
    public final ox b;

    public wx(qr0 qr0Var, ox oxVar) {
        this.a = qr0Var;
        this.b = oxVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof rr0) {
                rr0 rr0Var = (rr0) obj;
                qr0 qr0Var = this.a;
                if (qr0Var == null) {
                    if (((wx) rr0Var).a != null) {
                        return false;
                    }
                } else if (!qr0Var.equals(((wx) rr0Var).a)) {
                    return false;
                }
                if (this.b.equals(((wx) rr0Var).b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        qr0 qr0Var = this.a;
        if (qr0Var == null) {
            hashCode = 0;
        } else {
            hashCode = qr0Var.hashCode();
        }
        return this.b.hashCode() ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
