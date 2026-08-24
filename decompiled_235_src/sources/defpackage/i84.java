package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i84  reason: default package */
/* loaded from: classes.dex */
public final class i84 {
    public final long a;
    public final long b;
    public final boolean c;

    public i84(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final i84 a(i84 i84Var) {
        return new i84(jk4.f(this.a, i84Var.a), Math.max(this.b, i84Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i84) {
                i84 i84Var = (i84) obj;
                if (!jk4.c(this.a, i84Var.a) || this.b != i84Var.b || this.c != i84Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) jk4.h(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return xg6.r(sb, this.c, ')');
    }
}
