package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kw6  reason: default package */
/* loaded from: classes.dex */
public final class kw6 {
    public final long a;
    public final long b;
    public final boolean c;

    public kw6(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final kw6 a(kw6 kw6Var) {
        boolean z;
        long e = mb4.e(this.a, kw6Var.a);
        long max = Math.max(this.b, kw6Var.b);
        if (!this.c && !kw6Var.c) {
            z = false;
        } else {
            z = true;
        }
        return new kw6(e, max, z);
    }
}
