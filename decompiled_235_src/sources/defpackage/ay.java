package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay  reason: default package */
/* loaded from: classes.dex */
public final class ay {
    public final ry a;
    public final ry b;

    public ay(ry ryVar, ry ryVar2) {
        this.a = ryVar;
        this.b = ryVar2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ay) {
                ay ayVar = (ay) obj;
                if (this.a.equals(ayVar.a) && this.b.equals(ayVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
