package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly1  reason: default package */
/* loaded from: classes.dex */
public final class ly1 extends ny1 {
    public final lx5 a;

    public ly1(lx5 lx5Var) {
        this.a = lx5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ly1) || !this.a.equals(((ly1) obj).a)) {
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
        return "CheatsScreen(romInfo=" + this.a + ")";
    }
}
