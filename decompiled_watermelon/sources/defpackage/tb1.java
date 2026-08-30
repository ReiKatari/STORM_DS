package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tb1  reason: default package */
/* loaded from: classes.dex */
public final class tb1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public tb1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tb1.class != obj.getClass()) {
            return false;
        }
        tb1 tb1Var = (tb1) obj;
        if (xq0.c(this.a, tb1Var.a) && xq0.c(this.b, tb1Var.b) && xq0.c(this.c, tb1Var.c) && xq0.c(this.d, tb1Var.d) && xq0.c(this.e, tb1Var.e) && xq0.c(this.f, tb1Var.f) && xq0.c(this.g, tb1Var.g) && xq0.c(this.h, tb1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.h) + b31.c(this.g, b31.c(this.f, b31.c(this.e, b31.c(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
