package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn2  reason: default package */
/* loaded from: classes.dex */
public class cn2 implements defpackage.qu6 {
    public final android.database.sqlite.SQLiteProgram A;

    public cn2(android.database.sqlite.SQLiteProgram r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.qu6
    public final void c(int r1, long r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.bindLong(r1, r2)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.qu6
    public final void d(byte[] r1, int r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.bindBlob(r2, r1)
            return
    }

    @Override // defpackage.qu6
    public final void f(int r1) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.bindNull(r1)
            return
    }

    @Override // defpackage.qu6
    public final void g() {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.clearBindings()
            return
    }

    @Override // defpackage.qu6
    public final void m(int r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.bindString(r1, r2)
            return
    }

    @Override // defpackage.qu6
    public final void p(int r1, double r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.A
            r0.bindDouble(r1, r2)
            return
    }
}
