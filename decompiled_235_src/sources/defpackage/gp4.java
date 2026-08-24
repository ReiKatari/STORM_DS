package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp4  reason: default package */
/* loaded from: classes.dex */
public final class gp4 {
    public final int a;

    public /* synthetic */ gp4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gp4) {
            if (this.a != ((gp4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lb1.g(this.a, "Output-");
    }
}
