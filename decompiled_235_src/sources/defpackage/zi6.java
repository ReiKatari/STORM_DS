package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi6  reason: default package */
/* loaded from: classes.dex */
public final class zi6 {
    public final gn a;
    public long b;

    public zi6(gn gnVar, long j) {
        this.a = gnVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zi6) {
                zi6 zi6Var = (zi6) obj;
                if (this.a == zi6Var.a && q93.b(this.b, zi6Var.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) q93.c(this.b)) + ')';
    }
}
