package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h31  reason: default package */
/* loaded from: classes.dex */
public final class h31 {
    public final int a;
    public final long b;
    public final i31 c;
    public final j97 d;

    public h31(int i, long j, i31 i31Var, j97 j97Var) {
        this.a = i;
        this.b = j;
        this.c = i31Var;
        this.d = j97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31Var = (h31) obj;
        if (this.a == h31Var.a && this.b == h31Var.b && this.c == h31Var.c && nb3.k(this.d, h31Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + i61.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        j97 j97Var = this.d;
        if (j97Var == null) {
            hashCode = 0;
        } else {
            hashCode = j97Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
