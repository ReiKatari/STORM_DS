package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dh4  reason: default package */
/* loaded from: classes.dex */
public final class dh4 implements oo0 {
    public final Class a;

    public dh4(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.oo0
    public final Class a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dh4) {
            if (this.a.equals(((dh4) obj).a)) {
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
