package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq4  reason: default package */
/* loaded from: classes.dex */
public final class gq4 implements yq0 {
    public final Class a;

    public gq4(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.yq0
    public final Class a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gq4) {
            if (this.a.equals(((gq4) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
