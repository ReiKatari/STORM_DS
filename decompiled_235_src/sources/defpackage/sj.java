package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sj  reason: default package */
/* loaded from: classes.dex */
public final class sj implements ty4 {
    public final int b;

    public sj(int i) {
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
            if (sj.class.equals(cls)) {
                obj.getClass();
                if (this.b != ((sj) obj).b) {
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
        return xg6.q(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
