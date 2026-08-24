package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym0  reason: default package */
/* loaded from: classes.dex */
public final class ym0 {
    public final Long a;
    public final String b;

    public ym0(String str, Long l) {
        str.getClass();
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym0)) {
            return false;
        }
        ym0 ym0Var = (ym0) obj;
        if (nb3.k(this.a, ym0Var.a) && nb3.k(this.b, ym0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CheatDatabaseEntity(id=" + this.a + ", name=" + this.b + ")";
    }
}
