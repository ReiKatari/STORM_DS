package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw1  reason: default package */
/* loaded from: classes.dex */
public final class jw1 extends lw1 {
    public final iw1 a;

    public jw1(iw1 iw1Var) {
        this.a = iw1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof jw1) || this.a != ((jw1) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stop(reason=" + this.a + ")";
    }
}
