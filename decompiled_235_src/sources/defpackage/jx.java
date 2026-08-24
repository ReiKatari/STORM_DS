package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public final class jx {
    public final int a;

    public /* synthetic */ jx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jx) {
            if (this.a != ((jx) obj).a) {
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
        return xg6.o("AutoClearFocusBehavior(value=", this.a, ')');
    }
}
