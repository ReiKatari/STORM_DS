package defpackage;

import android.database.sqlite.SQLiteProgram;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ci2  reason: default package */
/* loaded from: classes.dex */
public class ci2 implements wi6 {
    public final SQLiteProgram A;

    public ci2(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.A = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.wi6
    public final void e(int i) {
        this.A.bindNull(i);
    }

    @Override // defpackage.wi6
    public final void g(int i, long j) {
        this.A.bindLong(i, j);
    }

    @Override // defpackage.wi6
    public final void h() {
        this.A.clearBindings();
    }

    @Override // defpackage.wi6
    public final void j(int i, byte[] bArr) {
        this.A.bindBlob(i, bArr);
    }

    @Override // defpackage.wi6
    public final void t(int i, String str) {
        str.getClass();
        this.A.bindString(i, str);
    }

    @Override // defpackage.wi6
    public final void v(double d, int i) {
        this.A.bindDouble(i, d);
    }
}
