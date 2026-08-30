package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ny2  reason: default package */
/* loaded from: classes.dex */
public final class ny2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ny2) {
            if (this.a != ((ny2) obj).a) {
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
        return ej6.e("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ')');
    }
}
