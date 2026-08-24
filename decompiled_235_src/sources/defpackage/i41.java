package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i41  reason: default package */
/* loaded from: classes.dex */
public final class i41 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public i41(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i41)) {
            return false;
        }
        i41 i41Var = (i41) obj;
        if (kt0.d(this.a, i41Var.a) && kt0.d(this.b, i41Var.b) && kt0.d(this.c, i41Var.c) && kt0.d(this.d, i41Var.d) && kt0.d(this.e, i41Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.e) + i61.c(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) kt0.j(this.a)) + ", textColor=" + ((Object) kt0.j(this.b)) + ", iconColor=" + ((Object) kt0.j(this.c)) + ", disabledTextColor=" + ((Object) kt0.j(this.d)) + ", disabledIconColor=" + ((Object) kt0.j(this.e)) + ')';
    }
}
