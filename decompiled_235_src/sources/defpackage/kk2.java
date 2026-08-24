package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk2  reason: default package */
/* loaded from: classes.dex */
public abstract class kk2 implements in6 {
    public final in6 A;

    public kk2(in6 in6Var) {
        in6Var.getClass();
        this.A = in6Var;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.A.b();
    }

    @Override // defpackage.in6
    public long b0(k80 k80Var, long j) {
        k80Var.getClass();
        return this.A.b0(k80Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
