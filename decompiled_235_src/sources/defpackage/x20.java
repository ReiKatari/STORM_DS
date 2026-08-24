package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x20  reason: default package */
/* loaded from: classes.dex */
public final class x20 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof x20) {
            if (Float.compare(this.a, ((x20) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
