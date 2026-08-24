package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by5  reason: default package */
/* loaded from: classes.dex */
public final class by5 extends cy5 {
    public final boolean a;

    public by5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof by5) && this.a == ((by5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "LaunchSuccessful(isGbaLoadSuccessful=" + this.a + ")";
    }
}
