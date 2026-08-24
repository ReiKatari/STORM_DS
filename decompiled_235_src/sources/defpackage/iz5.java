package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz5  reason: default package */
/* loaded from: classes.dex */
public final class iz5 {
    public final String a;
    public final Long b;
    public final jw5 c;

    public iz5(String str, Long l, jw5 jw5Var) {
        jw5Var.getClass();
        this.a = str;
        this.b = l;
        this.c = jw5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iz5) {
                iz5 iz5Var = (iz5) obj;
                if (!this.a.equals(iz5Var.a) || !nb3.k(this.b, iz5Var.b) || this.c != iz5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "DirectoryCacheStatusUi(directoryName=" + this.a + ", lastScanTimestamp=" + this.b + ", result=" + this.c + ")";
    }
}
