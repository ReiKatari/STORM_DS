package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx  reason: default package */
/* loaded from: classes.dex */
public final class cx {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof cx) {
            if (this.a != ((cx) obj).a) {
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
        return xg6.o("AudioRestrictionMode(value=", this.a, ')');
    }
}
