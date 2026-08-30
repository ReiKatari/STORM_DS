package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj implements pp4 {
    public final int b;

    public gj(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (gj.class.equals(cls)) {
                obj.getClass();
                if (this.b != ((gj) obj).b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return ej6.g(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
