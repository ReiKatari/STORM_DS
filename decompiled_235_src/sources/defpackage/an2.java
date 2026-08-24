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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an2  reason: default package */
/* loaded from: classes.dex */
public final class an2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int d0 = 0;
    public final Context A;
    public final d51 B;
    public final zb L;
    public final boolean R;
    public boolean X;
    public final i35 Y;
    public boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an2(Context context, String str, final d51 d51Var, final zb zbVar, boolean z) {
        super(context, str, null, zbVar.B, new DatabaseErrorHandler() { // from class: wm2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = an2.d0;
                sQLiteDatabase.getClass();
                d51 d51Var2 = d51Var;
                vm2 vm2Var = (vm2) d51Var2.B;
                if (vm2Var == null || !vm2Var.A.equals(sQLiteDatabase)) {
                    vm2Var = new vm2(sQLiteDatabase);
                    d51Var2.B = vm2Var;
                }
                SQLiteDatabase sQLiteDatabase2 = vm2Var.A;
                zb.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + vm2Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        zb.m(path);
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
                                zb.m((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                zb.m(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    vm2Var.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        zbVar.getClass();
        this.A = context;
        this.B = d51Var;
        this.L = zbVar;
        this.R = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.Y = new i35(context.getCacheDir(), str2, false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        i35 i35Var = this.Y;
        try {
            i35Var.a(i35Var.a);
            super.close();
            this.B.B = null;
            this.Z = false;
        } finally {
            i35Var.b();
        }
    }

    public final vm2 e(boolean z) {
        boolean z2;
        i35 i35Var = this.Y;
        try {
            if (!this.Z && getDatabaseName() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            i35Var.a(z2);
            this.X = false;
            SQLiteDatabase k = k(z);
            if (this.X) {
                close();
                vm2 e = e(z);
                i35Var.b();
                return e;
            }
            vm2 h = h(k);
            i35Var.b();
            return h;
        } catch (Throwable th) {
            i35Var.b();
            throw th;
        }
    }

    public final vm2 h(SQLiteDatabase sQLiteDatabase) {
        d51 d51Var = this.B;
        d51Var.getClass();
        vm2 vm2Var = (vm2) d51Var.B;
        if (vm2Var != null && vm2Var.A.equals(sQLiteDatabase)) {
            return vm2Var;
        }
        vm2 vm2Var2 = new vm2(sQLiteDatabase);
        d51Var.B = vm2Var2;
        return vm2Var2;
    }

    public final SQLiteDatabase k(boolean z) {
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
                if (th instanceof xm2) {
                    xm2 xm2Var = (xm2) th;
                    int i = zm2.a[xm2Var.A.ordinal()];
                    th = xm2Var.B;
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        if (i == 5) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            i.d();
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
                    } catch (xm2 e) {
                        throw e.B;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.X;
        zb zbVar = this.L;
        if (!z && zbVar.B != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            h(sQLiteDatabase);
            zbVar.getClass();
        } catch (Throwable th) {
            throw new xm2(ym2.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((ai1) this.L.L).j(new mu6(h(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new xm2(ym2.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.p(h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xm2(ym2.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.X) {
            try {
                zb zbVar = this.L;
                vm2 h = h(sQLiteDatabase);
                ai1 ai1Var = (ai1) zbVar.L;
                ai1Var.l(new mu6(h));
                ai1Var.i = h;
            } catch (Throwable th) {
                throw new xm2(ym2.ON_OPEN, th);
            }
        }
        this.Z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.X = true;
        try {
            this.L.p(h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xm2(ym2.ON_UPGRADE, th);
        }
    }
}
