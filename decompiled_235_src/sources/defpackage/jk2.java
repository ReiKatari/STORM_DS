package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk2  reason: default package */
/* loaded from: classes.dex */
public abstract class jk2 implements ui6 {
    public final ui6 A;

    public jk2(ui6 ui6Var) {
        ui6Var.getClass();
        this.A = ui6Var;
    }

    @Override // defpackage.ui6
    public void O(k80 k80Var, long j) {
        this.A.O(k80Var, j);
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.A.b();
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
    }

    @Override // defpackage.ui6, java.io.Flushable
    public void flush() {
        this.A.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
