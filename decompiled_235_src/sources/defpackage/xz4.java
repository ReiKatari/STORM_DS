package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz4  reason: default package */
/* loaded from: classes.dex */
public final class xz4 extends zz4 {
    public final s95 a;

    public xz4(s95 s95Var) {
        s95Var.getClass();
        this.a = s95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xz4) && nb3.k(this.a, ((xz4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GameMasteredPopup(event=" + this.a + ")";
    }
}
