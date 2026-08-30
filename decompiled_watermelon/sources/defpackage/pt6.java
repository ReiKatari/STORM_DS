package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pt6  reason: default package */
/* loaded from: classes.dex */
public final class pt6 {
    public final long a;

    public static String a(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pt6) {
            if (this.a != ((pt6) obj).a) {
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
        return a(this.a);
    }
}
