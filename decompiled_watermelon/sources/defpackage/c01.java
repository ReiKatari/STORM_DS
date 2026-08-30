package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c01  reason: default package */
/* loaded from: classes.dex */
public final class c01 {
    public final int a;
    public final long b;
    public final d01 c;
    public final u57 d;

    public c01(int i, long j, d01 d01Var, u57 u57Var) {
        this.a = i;
        this.b = j;
        this.c = d01Var;
        this.d = u57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c01)) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.a == c01Var.a && this.b == c01Var.b && this.c == c01Var.c && b53.x(this.d, c01Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + b31.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        u57 u57Var = this.d;
        if (u57Var == null) {
            hashCode = 0;
        } else {
            hashCode = u57Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
