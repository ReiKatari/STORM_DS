package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d04  reason: default package */
/* loaded from: classes.dex */
public final class d04 {
    public final long a;
    public final long b;
    public final boolean c;

    public d04(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final d04 a(d04 d04Var) {
        return new d04(mb4.e(this.a, d04Var.a), Math.max(this.b, d04Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d04) {
                d04 d04Var = (d04) obj;
                if (!mb4.b(this.a, d04Var.a) || this.b != d04Var.b || this.c != d04Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) mb4.g(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return ej6.h(sb, this.c, ')');
    }
}
