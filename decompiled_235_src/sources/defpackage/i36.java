package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i36  reason: default package */
/* loaded from: classes.dex */
public final class i36 implements Closeable {
    public static final c42 X = new c42("proto");
    public final l66 A;
    public final wr0 B;
    public final wr0 L;
    public final iy R;

    public i36(wr0 wr0Var, wr0 wr0Var2, iy iyVar, l66 l66Var) {
        this.A = l66Var;
        this.B = wr0Var;
        this.L = wr0Var2;
        this.R = iyVar;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, fz fzVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(fzVar.a, String.valueOf(d35.a(fzVar.c))));
        byte[] bArr = fzVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String r(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((ty) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object u(Cursor cursor, g36 g36Var) {
        try {
            return g36Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final SQLiteDatabase e() {
        l66 l66Var = this.A;
        l66Var.getClass();
        wr0 wr0Var = this.L;
        long a = wr0Var.a();
        while (true) {
            try {
                return l66Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (wr0Var.a() < this.R.c + a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object k(g36 g36Var) {
        SQLiteDatabase e = e();
        e.beginTransaction();
        try {
            Object apply = g36Var.apply(e);
            e.setTransactionSuccessful();
            return apply;
        } finally {
            e.endTransaction();
        }
    }

    public final Object n(dx6 dx6Var) {
        SQLiteDatabase e = e();
        wr0 wr0Var = this.L;
        long a = wr0Var.a();
        while (true) {
            try {
                e.beginTransaction();
                try {
                    Object n = dx6Var.n();
                    e.setTransactionSuccessful();
                    return n;
                } finally {
                    e.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (wr0Var.a() < this.R.c + a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e2);
                }
            }
        }
    }
}
