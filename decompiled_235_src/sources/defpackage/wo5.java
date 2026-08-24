package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo5  reason: default package */
/* loaded from: classes.dex */
public final class wo5 {
    public final long a;
    public final String b;

    public wo5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo5)) {
            return false;
        }
        wo5 wo5Var = (wo5) obj;
        if (this.a == wo5Var.a && nb3.k(this.b, wo5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "RemoteShaderPackage(contentLength=" + this.a + ", lastModified=" + this.b + ")";
    }
}
