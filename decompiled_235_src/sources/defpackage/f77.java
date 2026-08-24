package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f77  reason: default package */
/* loaded from: classes.dex */
public final class f77 extends x77 {
    public final int a;
    public final Long b;

    public f77(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f77)) {
            return false;
        }
        f77 f77Var = (f77) obj;
        if (this.a == f77Var.a && nb3.k(this.b, f77Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OfflineSoftcorePendingNotice(pendingSoftcoreCount=" + this.a + ", ledgerExpiresInMs=" + this.b + ")";
    }
}
