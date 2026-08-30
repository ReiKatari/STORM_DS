package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co4  reason: default package */
/* loaded from: classes.dex */
public final class co4 {
    public final long a;
    public final long b;

    public co4(long j, long j2) {
        this.a = j;
        this.b = j2;
        js6[] js6VarArr = is6.b;
        if ((j & 1095216660480L) == 0) {
            nz2.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            nz2.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof co4) {
            co4 co4Var = (co4) obj;
            if (is6.a(this.a, co4Var.a) && is6.a(this.b, co4Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        js6[] js6VarArr = is6.b;
        return Integer.hashCode(4) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) is6.d(this.a)) + ", height=" + ((Object) is6.d(this.b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
