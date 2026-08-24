package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm2  reason: default package */
/* loaded from: classes.dex */
public final class vm2 implements Closeable {
    public static final String[] B = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] L = new String[0];
    public static final go3 R;
    public static final go3 X;
    public final SQLiteDatabase A;

    static {
        xr3 xr3Var = xr3.PUBLICATION;
        R = kj2.M(xr3Var, new ns1(1));
        X = kj2.M(xr3Var, new ns1(2));
    }

    public vm2(SQLiteDatabase sQLiteDatabase) {
        this.A = sQLiteDatabase;
    }

    public final Cursor A(String str) {
        return x(new gr1(str, 8));
    }

    public final void D() {
        this.A.setTransactionSuccessful();
    }

    public final boolean Y() {
        return this.A.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void e() {
        this.A.beginTransaction();
    }

    public final void h() {
        this.A.beginTransactionNonExclusive();
    }

    public final boolean isOpen() {
        return this.A.isOpen();
    }

    public final dn2 k(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.A.compileStatement(str);
        compileStatement.getClass();
        return new dn2(compileStatement);
    }

    public final void n() {
        this.A.endTransaction();
    }

    public final void r(String str) {
        this.A.execSQL(str);
    }

    public final void u(String str, Object[] objArr) {
        this.A.execSQL(str, objArr);
    }

    public final long v(String str, int i, ContentValues contentValues) {
        str.getClass();
        return this.A.insertWithOnConflict(str, null, contentValues, i);
    }

    public final Cursor x(ru6 ru6Var) {
        final fj fjVar = new fj(ru6Var, 1);
        Cursor rawQueryWithFactory = this.A.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: um2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) fj.this.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ru6Var.g(), L, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }
}
