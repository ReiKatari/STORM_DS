package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sq6  reason: default package */
/* loaded from: classes.dex */
public final class sq6 {
    public static final sq6 c = new sq6(3, 0L);
    public final long a;
    public final long b;

    public /* synthetic */ sq6(int i, long j) {
        this((i & 1) != 0 ? hi2.B(0) : j, hi2.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq6)) {
            return false;
        }
        sq6 sq6Var = (sq6) obj;
        if (is6.a(this.a, sq6Var.a) && is6.a(this.b, sq6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        js6[] js6VarArr = is6.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) is6.d(this.a)) + ", restLine=" + ((Object) is6.d(this.b)) + ')';
    }

    public sq6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
