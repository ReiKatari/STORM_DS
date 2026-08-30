package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements t7.c {
    public final t7.c A;

    public f(t7.c cVar) {
        this.A = cVar;
    }

    @Override // t7.c
    public final void C(int i2, String str) {
        str.getClass();
        this.A.C(i2, str);
    }

    @Override // t7.c
    public final boolean E() {
        return this.A.E();
    }

    @Override // t7.c
    public final boolean N() {
        return this.A.N();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        t7.c cVar = this.A;
        cVar.reset();
        cVar.h();
    }

    @Override // t7.c
    public final void e(int i2) {
        this.A.e(i2);
    }

    @Override // t7.c
    public final void g(int i2, long j2) {
        this.A.g(i2, j2);
    }

    @Override // t7.c
    public final byte[] getBlob(int i2) {
        return this.A.getBlob(i2);
    }

    @Override // t7.c
    public final int getColumnCount() {
        return this.A.getColumnCount();
    }

    @Override // t7.c
    public final String getColumnName(int i2) {
        return this.A.getColumnName(i2);
    }

    @Override // t7.c
    public final long getLong(int i2) {
        return this.A.getLong(i2);
    }

    @Override // t7.c
    public final void h() {
        this.A.h();
    }

    @Override // t7.c
    public final boolean isNull(int i2) {
        return this.A.isNull(i2);
    }

    @Override // t7.c
    public final void j(int i2, byte[] bArr) {
        this.A.j(i2, bArr);
    }

    @Override // t7.c
    public final String n(int i2) {
        return this.A.n(i2);
    }

    @Override // t7.c
    public final void reset() {
        this.A.reset();
    }
}
