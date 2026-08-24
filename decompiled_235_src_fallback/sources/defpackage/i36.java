package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i36  reason: default package */
/* loaded from: classes.dex */
public final class i36 implements java.io.Closeable {
    public static final defpackage.c42 X = null;
    public final defpackage.l66 A;
    public final defpackage.wr0 B;
    public final defpackage.wr0 L;
    public final defpackage.iy R;

    static {
            c42 r0 = new c42
            java.lang.String r1 = "proto"
            r0.<init>(r1)
            defpackage.i36.X = r0
            return
    }

    public i36(defpackage.wr0 r1, defpackage.wr0 r2, defpackage.iy r3, defpackage.l66 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            return
    }

    public static java.lang.Long h(android.database.sqlite.SQLiteDatabase r11, defpackage.fz r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "backend_name = ? and priority = ?"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = r12.a
            b35 r3 = r12.c
            int r3 = defpackage.d35.a(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            byte[] r12 = r12.b
            r2 = 0
            if (r12 == 0) goto L32
            java.lang.String r3 = " and extras = ?"
            r0.append(r3)
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r2)
            r1.add(r12)
            goto L37
        L32:
            java.lang.String r12 = " and extras is null"
            r0.append(r12)
        L37:
            java.lang.String r12 = "_id"
            java.lang.String[] r5 = new java.lang.String[]{r12}
            java.lang.String r6 = r0.toString()
            java.lang.String[] r12 = new java.lang.String[r2]
            java.lang.Object[] r12 = r1.toArray(r12)
            r7 = r12
            java.lang.String[] r7 = (java.lang.String[]) r7
            r9 = 0
            r10 = 0
            java.lang.String r4 = "transport_contexts"
            r8 = 0
            r3 = r11
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = r11.moveToNext()     // Catch: java.lang.Throwable -> L68
            if (r12 != 0) goto L5c
            r12 = 0
            goto L64
        L5c:
            long r0 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L68
        L64:
            r11.close()
            return r12
        L68:
            r0 = move-exception
            r12 = r0
            r11.close()
            throw r12
    }

    public static java.lang.String r(java.lang.Iterable r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            ty r1 = (defpackage.ty) r1
            long r1 = r1.a
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Lb
            r1 = 44
            r0.append(r1)
            goto Lb
        L28:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.Object u(android.database.Cursor r0, defpackage.g36 r1) {
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L8
            r0.close()
            return r1
        L8:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            l66 r0 = r0.A
            r0.close()
            return
    }

    public final android.database.sqlite.SQLiteDatabase e() {
            r9 = this;
            l66 r0 = r9.A
            r0.getClass()
            wr0 r1 = r9.L
            long r2 = r1.a()
        Lb:
            android.database.sqlite.SQLiteDatabase r9 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L10
            return r9
        L10:
            r4 = move-exception
            long r5 = r1.a()
            iy r7 = r9.R
            int r7 = r7.c
            long r7 = (long) r7
            long r7 = r7 + r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L25
            r4 = 50
            android.os.SystemClock.sleep(r4)
            goto Lb
        L25:
            cx6 r9 = new cx6
            java.lang.String r0 = "Timed out while trying to open db."
            r9.<init>(r0, r4)
            throw r9
    }

    public final java.lang.Object k(defpackage.g36 r1) {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.e()
            r0.beginTransaction()
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r1
        L12:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }

    public final java.lang.Object n(defpackage.dx6 r10) {
            r9 = this;
            android.database.sqlite.SQLiteDatabase r0 = r9.e()
            wr0 r1 = r9.L
            long r2 = r1.a()
        La:
            r0.beginTransaction()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1d
            java.lang.Object r9 = r10.n()     // Catch: java.lang.Throwable -> L18
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L18
            r0.endTransaction()
            return r9
        L18:
            r9 = move-exception
            r0.endTransaction()
            throw r9
        L1d:
            r4 = move-exception
            long r5 = r1.a()
            iy r7 = r9.R
            int r7 = r7.c
            long r7 = (long) r7
            long r7 = r7 + r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L32
            r4 = 50
            android.os.SystemClock.sleep(r4)
            goto La
        L32:
            cx6 r9 = new cx6
            java.lang.String r10 = "Timed out while trying to acquire the lock."
            r9.<init>(r10, r4)
            throw r9
    }
}
