package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ai2  reason: default package */
/* loaded from: classes.dex */
public final class ai2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int c0 = 0;
    public final Context A;
    public final t71 B;
    public final sb L;
    public final boolean R;
    public boolean X;
    public final eu4 Y;
    public boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(Context context, String str, final t71 t71Var, final sb sbVar, boolean z) {
        super(context, str, null, sbVar.B, new DatabaseErrorHandler() { // from class: wh2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = ai2.c0;
                sQLiteDatabase.getClass();
                t71 t71Var2 = t71Var;
                vh2 vh2Var = (vh2) t71Var2.B;
                if (vh2Var == null || !vh2Var.A.equals(sQLiteDatabase)) {
                    vh2Var = new vh2(sQLiteDatabase);
                    t71Var2.B = vh2Var;
                }
                SQLiteDatabase sQLiteDatabase2 = vh2Var.A;
                sb.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + vh2Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        sb.m(path);
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
                                sb.m((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                sb.m(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    vh2Var.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        sbVar.getClass();
        this.A = context;
        this.B = t71Var;
        this.L = sbVar;
        this.R = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.Y = new eu4(context.getCacheDir(), str2, false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        eu4 eu4Var = this.Y;
        try {
            eu4Var.a(eu4Var.a);
            super.close();
            this.B.B = null;
            this.Z = false;
        } finally {
            eu4Var.b();
        }
    }

    public final vh2 d(boolean z) {
        boolean z2;
        eu4 eu4Var = this.Y;
        try {
            if (!this.Z && getDatabaseName() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            eu4Var.a(z2);
            this.X = false;
            SQLiteDatabase p = p(z);
            if (this.X) {
                close();
                vh2 d = d(z);
                eu4Var.b();
                return d;
            }
            vh2 i = i(p);
            eu4Var.b();
            return i;
        } catch (Throwable th) {
            eu4Var.b();
            throw th;
        }
    }

    public final vh2 i(SQLiteDatabase sQLiteDatabase) {
        t71 t71Var = this.B;
        t71Var.getClass();
        vh2 vh2Var = (vh2) t71Var.B;
        if (vh2Var != null && vh2Var.A.equals(sQLiteDatabase)) {
            return vh2Var;
        }
        vh2 vh2Var2 = new vh2(sQLiteDatabase);
        t71Var.B = vh2Var2;
        return vh2Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.X;
        sb sbVar = this.L;
        if (!z && sbVar.B != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            i(sQLiteDatabase);
            sbVar.getClass();
        } catch (Throwable th) {
            throw new xh2(yh2.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((wd1) this.L.L).j(new si6(i(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new xh2(yh2.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.p(i(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xh2(yh2.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.X) {
            try {
                sb sbVar = this.L;
                vh2 i = i(sQLiteDatabase);
                wd1 wd1Var = (wd1) sbVar.L;
                wd1Var.l(new si6(i));
                wd1Var.i = i;
            } catch (Throwable th) {
                throw new xh2(yh2.ON_OPEN, th);
            }
        }
        this.Z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.p(i(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xh2(yh2.ON_UPGRADE, th);
        }
    }

    public final SQLiteDatabase p(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.Z;
        Context context = this.A;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
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
                if (z) {
                    SQLiteDatabase writableDatabase2 = getWritableDatabase();
                    writableDatabase2.getClass();
                    return writableDatabase2;
                }
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                readableDatabase2.getClass();
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof xh2) {
                    xh2 xh2Var = (xh2) th;
                    int i = zh2.a[xh2Var.A.ordinal()];
                    th = xh2Var.B;
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        if (i == 5) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            i.c();
                            return null;
                        }
                    } else {
                        throw th;
                    }
                }
                if ((th instanceof SQLiteException) && databaseName != null && this.R) {
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            SQLiteDatabase writableDatabase3 = getWritableDatabase();
                            writableDatabase3.getClass();
                            return writableDatabase3;
                        }
                        SQLiteDatabase readableDatabase3 = getReadableDatabase();
                        readableDatabase3.getClass();
                        return readableDatabase3;
                    } catch (xh2 e) {
                        throw e.B;
                    }
                }
                throw th;
            }
        }
    }
}
