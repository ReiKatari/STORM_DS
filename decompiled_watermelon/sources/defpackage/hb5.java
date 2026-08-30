package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hb5  reason: default package */
/* loaded from: classes.dex */
public final class hb5 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof hb5) {
            if (this.a != ((hb5) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.a + ')';
    }
}
