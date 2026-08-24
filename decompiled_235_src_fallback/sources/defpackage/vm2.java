package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm2  reason: default package */
/* loaded from: classes.dex */
public final class vm2 implements java.io.Closeable {
    public static final java.lang.String[] B = null;
    public static final java.lang.String[] L = null;
    public static final defpackage.go3 R = null;
    public static final defpackage.go3 X = null;
    public final android.database.sqlite.SQLiteDatabase A;

    static {
            java.lang.String r4 = " OR IGNORE "
            java.lang.String r5 = " OR REPLACE "
            java.lang.String r0 = ""
            java.lang.String r1 = " OR ROLLBACK "
            java.lang.String r2 = " OR ABORT "
            java.lang.String r3 = " OR FAIL "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            defpackage.vm2.B = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.vm2.L = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            ns1 r1 = new ns1
            r2 = 1
            r1.<init>(r2)
            go3 r1 = defpackage.kj2.M(r0, r1)
            defpackage.vm2.R = r1
            ns1 r1 = new ns1
            r2 = 2
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.vm2.X = r0
            return
    }

    public vm2(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final android.database.Cursor A(java.lang.String r3) {
            r2 = this;
            gr1 r0 = new gr1
            r1 = 8
            r0.<init>(r3, r1)
            android.database.Cursor r2 = r2.x(r0)
            return r2
    }

    public final void D() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.setTransactionSuccessful()
            return
    }

    public final boolean Y() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.close()
            return
    }

    public final void e() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.beginTransaction()
            return
    }

    public final void h() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.beginTransactionNonExclusive()
            return
    }

    public final boolean isOpen() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            boolean r0 = r0.isOpen()
            return r0
    }

    public final defpackage.dn2 k(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            dn2 r0 = new dn2
            android.database.sqlite.SQLiteDatabase r1 = r1.A
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r2)
            r1.getClass()
            r0.<init>(r1)
            return r0
    }

    public final void n() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.endTransaction()
            return
    }

    public final void r(java.lang.String r1) {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.execSQL(r1)
            return
    }

    public final void u(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.A
            r0.execSQL(r1, r2)
            return
    }

    public final long v(java.lang.String r2, int r3, android.content.ContentValues r4) {
            r1 = this;
            r2.getClass()
            android.database.sqlite.SQLiteDatabase r1 = r1.A
            r0 = 0
            long r1 = r1.insertWithOnConflict(r2, r0, r4, r3)
            return r1
    }

    public final android.database.Cursor x(defpackage.ru6 r4) {
            r3 = this;
            fj r0 = new fj
            r1 = 1
            r0.<init>(r4, r1)
            um2 r1 = new um2
            r1.<init>(r0)
            java.lang.String r4 = r4.g()
            java.lang.String[] r0 = defpackage.vm2.L
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r3.A
            android.database.Cursor r3 = r3.rawQueryWithFactory(r1, r4, r0, r2)
            r3.getClass()
            return r3
    }
}
