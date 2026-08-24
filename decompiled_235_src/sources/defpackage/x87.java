package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x87  reason: default package */
/* loaded from: classes.dex */
public final class x87 {
    public final long a;
    public final long b;
    public final boolean c;

    public x87(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final x87 a(x87 x87Var) {
        boolean z;
        long f = jk4.f(this.a, x87Var.a);
        long max = Math.max(this.b, x87Var.b);
        if (!this.c && !x87Var.c) {
            z = false;
        } else {
            z = true;
        }
        return new x87(f, max, z);
    }
}
