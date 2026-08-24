package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu5  reason: default package */
/* loaded from: classes.dex */
public final class qu5 extends tu5 {
    public final boolean a;

    public qu5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qu5) && this.a == ((qu5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "UseHgEngineFixUpdate(enabled=" + this.a + ")";
    }
}
