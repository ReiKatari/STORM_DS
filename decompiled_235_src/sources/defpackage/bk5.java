package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk5  reason: default package */
/* loaded from: classes.dex */
public final class bk5 {
    public final String a;
    public final on2 b;

    public bk5(String str, on2 on2Var) {
        this.a = str;
        this.b = on2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bk5) {
                bk5 bk5Var = (bk5) obj;
                if (!this.a.equals(bk5Var.a) || !this.b.equals(bk5Var.b)) {
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
        return "RendererDebugMenuEntry(title=" + this.a + ", action=" + this.b + ")";
    }
}
