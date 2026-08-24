package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb5  reason: default package */
/* loaded from: classes.dex */
public final class qb5 implements tb5 {
    public final int a;
    public final boolean b;

    public qb5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb5)) {
            return false;
        }
        qb5 qb5Var = (qb5) obj;
        if (this.a == qb5Var.a && this.b == qb5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReconciliationFinished(remainingTotal=" + this.a + ", networkAvailable=" + this.b + ")";
    }
}
