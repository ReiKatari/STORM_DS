package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh2  reason: default package */
/* loaded from: classes.dex */
public final class vh2 implements Closeable {
    public static final String[] B = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] L = new String[0];
    public static final gh3 R;
    public static final gh3 X;
    public final SQLiteDatabase A;

    static {
        wk3 wk3Var = wk3.PUBLICATION;
        R = yf2.H(wk3Var, new do1(1));
        X = yf2.H(wk3Var, new do1(2));
    }

    public vh2(SQLiteDatabase sQLiteDatabase) {
        this.A = sQLiteDatabase;
    }

    public final void B(String str, Object[] objArr) {
        this.A.execSQL(str, objArr);
    }

    public final long C(String str, int i, ContentValues contentValues) {
        str.getClass();
        return this.A.insertWithOnConflict(str, null, contentValues, i);
    }

    public final Cursor D(xi6 xi6Var) {
        final ti tiVar = new ti(1, xi6Var);
        Cursor rawQueryWithFactory = this.A.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: uh2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) ti.this.q(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, xi6Var.f(), L, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    public final Cursor F(String str) {
        return D(new an1(str, 8));
    }

    public final boolean G() {
        return this.A.inTransaction();
    }

    public final void I() {
        this.A.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final void d() {
        this.A.beginTransaction();
    }

    public final void i() {
        this.A.beginTransactionNonExclusive();
    }

    public final boolean isOpen() {
        return this.A.isOpen();
    }

    public final di2 p(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.A.compileStatement(str);
        compileStatement.getClass();
        return new di2(compileStatement);
    }

    public final void w() {
        this.A.endTransaction();
    }

    public final void x(String str) {
        this.A.execSQL(str);
    }
}
