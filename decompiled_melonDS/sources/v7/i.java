package v7;

import android.database.sqlite.SQLiteProgram;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i implements u7.d {
    public final SQLiteProgram A;

    public i(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.A = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // u7.d
    public final void e(int i2) {
        this.A.bindNull(i2);
    }

    @Override // u7.d
    public final void g(int i2, long j2) {
        this.A.bindLong(i2, j2);
    }

    @Override // u7.d
    public final void h() {
        this.A.clearBindings();
    }

    @Override // u7.d
    public final void j(int i2, byte[] bArr) {
        this.A.bindBlob(i2, bArr);
    }

    @Override // u7.d
    public final void r(int i2, String str) {
        str.getClass();
        this.A.bindString(i2, str);
    }

    @Override // u7.d
    public final void u(double d4, int i2) {
        this.A.bindDouble(i2, d4);
    }
}
