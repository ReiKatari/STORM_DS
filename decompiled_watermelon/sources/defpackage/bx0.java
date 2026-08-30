package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bx0  reason: default package */
/* loaded from: classes.dex */
public final class bx0 implements ns5 {
    public final ns5 A;

    public bx0(ns5 ns5Var) {
        this.A = ns5Var;
    }

    @Override // defpackage.ns5
    public final void M(int i, String str) {
        str.getClass();
        this.A.M(i, str);
    }

    @Override // defpackage.ns5
    public final boolean P() {
        return this.A.P();
    }

    @Override // defpackage.ns5
    public final boolean a0() {
        return this.A.a0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ns5 ns5Var = this.A;
        ns5Var.reset();
        ns5Var.h();
    }

    @Override // defpackage.ns5
    public final void e(int i) {
        this.A.e(i);
    }

    @Override // defpackage.ns5
    public final void g(int i, long j) {
        this.A.g(i, j);
    }

    @Override // defpackage.ns5
    public final byte[] getBlob(int i) {
        return this.A.getBlob(i);
    }

    @Override // defpackage.ns5
    public final int getColumnCount() {
        return this.A.getColumnCount();
    }

    @Override // defpackage.ns5
    public final String getColumnName(int i) {
        return this.A.getColumnName(i);
    }

    @Override // defpackage.ns5
    public final long getLong(int i) {
        return this.A.getLong(i);
    }

    @Override // defpackage.ns5
    public final void h() {
        this.A.h();
    }

    @Override // defpackage.ns5
    public final boolean isNull(int i) {
        return this.A.isNull(i);
    }

    @Override // defpackage.ns5
    public final void j(int i, byte[] bArr) {
        this.A.j(i, bArr);
    }

    @Override // defpackage.ns5
    public final String q(int i) {
        return this.A.q(i);
    }

    @Override // defpackage.ns5
    public final void reset() {
        this.A.reset();
    }
}
