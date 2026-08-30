package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg5  reason: default package */
/* loaded from: classes.dex */
public final class hg5 {
    public final long a = xq0.h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hg5) {
                if (!xq0.c(this.a, ((hg5) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) xq0.i(this.a)) + ", rippleAlpha=null)";
    }
}
