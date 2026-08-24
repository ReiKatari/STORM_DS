package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm0  reason: default package */
/* loaded from: classes.dex */
public final class wm0 {
    public final Long a;
    public final String b;

    public wm0(String str, Long l) {
        str.getClass();
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wm0) {
                wm0 wm0Var = (wm0) obj;
                if (!this.a.equals(wm0Var.a) || !nb3.k(this.b, wm0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheatDatabase(id=" + this.a + ", name=" + this.b + ")";
    }
}
