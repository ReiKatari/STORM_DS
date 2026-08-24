package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: az4  reason: default package */
/* loaded from: classes.dex */
public final class az4 {
    public final int a;

    public /* synthetic */ az4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof az4) {
            if (this.a != ((az4) obj).a) {
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
        return xg6.o("PointerKeyboardModifiers(packedValue=", this.a, ')');
    }
}
