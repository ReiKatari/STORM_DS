package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty  reason: default package */
/* loaded from: classes.dex */
public final class ty {
    public final long a;
    public final fz b;
    public final hy c;

    public ty(long j, fz fzVar, hy hyVar) {
        this.a = j;
        this.b = fzVar;
        this.c = hyVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ty) {
                ty tyVar = (ty) obj;
                if (this.a == tyVar.a && this.b.equals(tyVar.b) && this.c.equals(tyVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
