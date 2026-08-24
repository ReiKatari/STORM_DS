package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz0  reason: default package */
/* loaded from: classes.dex */
public final class zz0 implements j36 {
    public final j36 A;

    public zz0(j36 j36Var) {
        this.A = j36Var;
    }

    @Override // defpackage.j36
    public final String R(int i) {
        return this.A.R(i);
    }

    @Override // defpackage.j36
    public final void c(int i, long j) {
        this.A.c(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        j36 j36Var = this.A;
        j36Var.reset();
        j36Var.g();
    }

    @Override // defpackage.j36
    public final void d(byte[] bArr, int i) {
        this.A.d(bArr, i);
    }

    @Override // defpackage.j36
    public final void f(int i) {
        this.A.f(i);
    }

    @Override // defpackage.j36
    public final boolean f0() {
        return this.A.f0();
    }

    @Override // defpackage.j36
    public final void g() {
        this.A.g();
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int i) {
        return this.A.getBlob(i);
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
        return this.A.getColumnCount();
    }

    @Override // defpackage.j36
    public final String getColumnName(int i) {
        return this.A.getColumnName(i);
    }

    @Override // defpackage.j36
    public final long getLong(int i) {
        return this.A.getLong(i);
    }

    @Override // defpackage.j36
    public final boolean isNull(int i) {
        return this.A.isNull(i);
    }

    @Override // defpackage.j36
    public final void reset() {
        this.A.reset();
    }

    @Override // defpackage.j36
    public final void w(int i, String str) {
        str.getClass();
        this.A.w(i, str);
    }

    @Override // defpackage.j36
    public final boolean z() {
        return this.A.z();
    }
}
