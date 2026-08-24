package defpackage;

import android.database.sqlite.SQLiteProgram;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn2  reason: default package */
/* loaded from: classes.dex */
public class cn2 implements qu6 {
    public final SQLiteProgram A;

    public cn2(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.A = sQLiteProgram;
    }

    @Override // defpackage.qu6
    public final void c(int i, long j) {
        this.A.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.qu6
    public final void d(byte[] bArr, int i) {
        this.A.bindBlob(i, bArr);
    }

    @Override // defpackage.qu6
    public final void f(int i) {
        this.A.bindNull(i);
    }

    @Override // defpackage.qu6
    public final void g() {
        this.A.clearBindings();
    }

    @Override // defpackage.qu6
    public final void m(int i, String str) {
        str.getClass();
        this.A.bindString(i, str);
    }

    @Override // defpackage.qu6
    public final void p(int i, double d) {
        this.A.bindDouble(i, d);
    }
}
