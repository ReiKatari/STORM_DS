package v7;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m9.o;
import rd.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f13756b0 = 0;
    public final Context A;
    public final k B;
    public final bk.a L;
    public final boolean R;
    public boolean X;
    public final x7.a Y;
    public boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final k kVar, final bk.a aVar, boolean z10) {
        super(context, str, null, aVar.B, new DatabaseErrorHandler() { // from class: v7.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i2 = g.f13756b0;
                sQLiteDatabase.getClass();
                k kVar2 = kVar;
                b bVar = (b) kVar2.B;
                if (bVar == null || !bVar.A.equals(sQLiteDatabase)) {
                    bVar = new b(sQLiteDatabase);
                    kVar2.B = bVar;
                }
                SQLiteDatabase sQLiteDatabase2 = bVar.A;
                bk.a.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        bk.a.j(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                bk.a.j((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                bk.a.j(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        aVar.getClass();
        this.A = context;
        this.B = kVar;
        this.L = aVar;
        this.R = z10;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.Y = new x7.a(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        x7.a aVar = this.Y;
        try {
            aVar.a(aVar.f14374a);
            super.close();
            this.B.B = null;
            this.Z = false;
        } finally {
            aVar.b();
        }
    }

    public final b d(boolean z10) {
        boolean z11;
        x7.a aVar = this.Y;
        try {
            if (!this.Z && getDatabaseName() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11);
            this.X = false;
            SQLiteDatabase m = m(z10);
            if (this.X) {
                close();
                b d4 = d(z10);
                aVar.b();
                return d4;
            }
            b i2 = i(m);
            aVar.b();
            return i2;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    public final b i(SQLiteDatabase sQLiteDatabase) {
        k kVar = this.B;
        kVar.getClass();
        b bVar = (b) kVar.B;
        if (bVar != null && bVar.A.equals(sQLiteDatabase)) {
            return bVar;
        }
        b bVar2 = new b(sQLiteDatabase);
        kVar.B = bVar2;
        return bVar2;
    }

    public final SQLiteDatabase m(boolean z10) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.Z;
        Context context = this.A;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            readableDatabase.getClass();
            return readableDatabase;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    SQLiteDatabase writableDatabase2 = getWritableDatabase();
                    writableDatabase2.getClass();
                    return writableDatabase2;
                }
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                readableDatabase2.getClass();
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int i2 = f.f13755a[dVar.A.ordinal()];
                    th = dVar.B;
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        if (i2 == 5) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            o.o();
                            return null;
                        }
                    } else {
                        throw th;
                    }
                }
                if ((th instanceof SQLiteException) && databaseName != null && this.R) {
                    context.deleteDatabase(databaseName);
                    try {
                        if (z10) {
                            SQLiteDatabase writableDatabase3 = getWritableDatabase();
                            writableDatabase3.getClass();
                            return writableDatabase3;
                        }
                        SQLiteDatabase readableDatabase3 = getReadableDatabase();
                        readableDatabase3.getClass();
                        return readableDatabase3;
                    } catch (d e6) {
                        throw e6.B;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z10 = this.X;
        bk.a aVar = this.L;
        if (!z10 && aVar.B != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            i(sQLiteDatabase);
            aVar.getClass();
        } catch (Throwable th2) {
            throw new d(e.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((f5.e) this.L.L).j(new w7.a(i(sQLiteDatabase)));
        } catch (Throwable th2) {
            throw new d(e.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i10) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.m(i(sQLiteDatabase), i2, i10);
        } catch (Throwable th2) {
            throw new d(e.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.X) {
            try {
                bk.a aVar = this.L;
                b i2 = i(sQLiteDatabase);
                f5.e eVar = (f5.e) aVar.L;
                eVar.l(new w7.a(i2));
                eVar.f4862i = i2;
            } catch (Throwable th2) {
                throw new d(e.ON_OPEN, th2);
            }
        }
        this.Z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i10) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.m(i(sQLiteDatabase), i2, i10);
        } catch (Throwable th2) {
            throw new d(e.ON_UPGRADE, th2);
        }
    }
}
