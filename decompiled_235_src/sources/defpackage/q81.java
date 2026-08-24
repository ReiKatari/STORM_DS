package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q81  reason: default package */
/* loaded from: classes.dex */
public final class q81 {
    public final Class a;
    public final boolean b;

    public q81(Class cls, boolean z) {
        this.a = cls;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q81) {
            q81 q81Var = (q81) obj;
            if (q81Var.a.equals(this.a) && q81Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
