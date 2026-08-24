package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g26  reason: default package */
/* loaded from: classes.dex */
public final class g26 {
    public final h26 a;
    public final h26 b;
    public final Throwable c;

    public g26(h26 h26Var, jz0 jz0Var, Throwable th) {
        this.a = h26Var;
        this.b = jz0Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g26)) {
            return false;
        }
        g26 g26Var = (g26) obj;
        if (nb3.k(this.a, g26Var.a) && nb3.k(this.b, g26Var.b) && nb3.k(this.c, g26Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        h26 h26Var = this.b;
        if (h26Var == null) {
            hashCode = 0;
        } else {
            hashCode = h26Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ g26(h26 h26Var, Throwable th, int i) {
        this(h26Var, (jz0) null, (i & 4) != 0 ? null : th);
    }
}
