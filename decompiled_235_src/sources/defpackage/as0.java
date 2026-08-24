package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as0  reason: default package */
/* loaded from: classes.dex */
public final class as0 implements AutoCloseable, w61 {
    public final l61 A;

    public as0(l61 l61Var) {
        l61Var.getClass();
        this.A = l61Var;
    }

    @Override // defpackage.w61
    public final l61 A() {
        return this.A;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yh2.m(this.A, null);
    }
}
