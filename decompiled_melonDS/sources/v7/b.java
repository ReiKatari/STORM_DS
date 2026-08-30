package v7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import od.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Closeable {
    public static final String[] B = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] L = new String[0];
    public static final Object R;
    public static final Object X;
    public final SQLiteDatabase A;

    static {
        yb.h hVar = yb.h.PUBLICATION;
        R = p7.a.s(hVar, new n(16));
        X = p7.a.s(hVar, new n(17));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.A = sQLiteDatabase;
    }

    public final Cursor B(u7.e eVar) {
        final n1.h hVar = new n1.h(6, eVar);
        Cursor rawQueryWithFactory = this.A.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v7.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) n1.h.this.r(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.h(), L, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    public final void F() {
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

    public final j m(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.A.compileStatement(str);
        compileStatement.getClass();
        return new j(compileStatement);
    }

    public final void t() {
        this.A.endTransaction();
    }

    public final void v(String str) {
        this.A.execSQL(str);
    }

    public final void w(String str, Object[] objArr) {
        this.A.execSQL(str, objArr);
    }

    public final boolean x() {
        return this.A.inTransaction();
    }

    public final long z(int i2, ContentValues contentValues) {
        return this.A.insertWithOnConflict("cheat_database", null, contentValues, i2);
    }
}
