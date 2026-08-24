package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an2  reason: default package */
/* loaded from: classes.dex */
public final class an2 extends android.database.sqlite.SQLiteOpenHelper {
    public static final /* synthetic */ int d0 = 0;
    public final android.content.Context A;
    public final defpackage.d51 B;
    public final defpackage.zb L;
    public final boolean R;
    public boolean X;
    public final defpackage.i35 Y;
    public boolean Z;

    public an2(android.content.Context r7, java.lang.String r8, defpackage.d51 r9, defpackage.zb r10, boolean r11) {
            r6 = this;
            r7.getClass()
            r10.getClass()
            int r4 = r10.B
            wm2 r5 = new wm2
            r5.<init>(r10, r9)
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.A = r1
            r0.B = r9
            r0.L = r10
            r0.R = r11
            i35 r6 = new i35
            if (r2 != 0) goto L2c
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r8 = r7.toString()
            r8.getClass()
            goto L2d
        L2c:
            r8 = r2
        L2d:
            java.io.File r7 = r1.getCacheDir()
            r9 = 0
            r6.<init>(r7, r8, r9)
            r0.Y = r6
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            i35 r0 = r3.Y
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L16
            r0.a(r1)     // Catch: java.lang.Throwable -> L16
            super.close()     // Catch: java.lang.Throwable -> L16
            d51 r1 = r3.B     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.B = r2     // Catch: java.lang.Throwable -> L16
            r1 = 0
            r3.Z = r1     // Catch: java.lang.Throwable -> L16
            r0.b()
            return
        L16:
            r3 = move-exception
            r0.b()
            throw r3
    }

    public final defpackage.vm2 e(boolean r4) {
            r3 = this;
            i35 r0 = r3.Y
            boolean r1 = r3.Z     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 != 0) goto L11
            java.lang.String r1 = r3.getDatabaseName()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        Lf:
            r3 = move-exception
            goto L32
        L11:
            r1 = r2
        L12:
            r0.a(r1)     // Catch: java.lang.Throwable -> Lf
            r3.X = r2     // Catch: java.lang.Throwable -> Lf
            android.database.sqlite.SQLiteDatabase r1 = r3.k(r4)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r3.X     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L2a
            r3.close()     // Catch: java.lang.Throwable -> Lf
            vm2 r3 = r3.e(r4)     // Catch: java.lang.Throwable -> Lf
            r0.b()
            return r3
        L2a:
            vm2 r3 = r3.h(r1)     // Catch: java.lang.Throwable -> Lf
            r0.b()
            return r3
        L32:
            r0.b()
            throw r3
    }

    public final defpackage.vm2 h(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            d51 r2 = r2.B
            r2.getClass()
            java.lang.Object r0 = r2.B
            vm2 r0 = (defpackage.vm2) r0
            if (r0 == 0) goto L15
            android.database.sqlite.SQLiteDatabase r1 = r0.A
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L14
            goto L15
        L14:
            return r0
        L15:
            vm2 r0 = new vm2
            r0.<init>(r3)
            r2.B = r0
            return r0
    }

    public final android.database.sqlite.SQLiteDatabase k(boolean r6) {
            r5 = this;
            java.lang.String r0 = r5.getDatabaseName()
            boolean r1 = r5.Z
            android.content.Context r2 = r5.A
            if (r0 == 0) goto L32
            if (r1 != 0) goto L32
            java.io.File r1 = r2.getDatabasePath(r0)
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L32
            r1.mkdirs()
            boolean r3 = r1.isDirectory()
            if (r3 != 0) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid database parent file, not a directory: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "SupportSQLite"
            android.util.Log.w(r3, r1)
        L32:
            if (r6 == 0) goto L3c
            android.database.sqlite.SQLiteDatabase r1 = r5.getWritableDatabase()     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            return r1
        L3c:
            android.database.sqlite.SQLiteDatabase r1 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            return r1
        L44:
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L49
        L49:
            if (r6 == 0) goto L55
            android.database.sqlite.SQLiteDatabase r1 = r5.getWritableDatabase()     // Catch: java.lang.Throwable -> L53
            r1.getClass()     // Catch: java.lang.Throwable -> L53
            goto L5c
        L53:
            r1 = move-exception
            goto L5d
        L55:
            android.database.sqlite.SQLiteDatabase r1 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L53
            r1.getClass()     // Catch: java.lang.Throwable -> L53
        L5c:
            return r1
        L5d:
            boolean r3 = r1 instanceof defpackage.xm2
            if (r3 == 0) goto L8a
            xm2 r1 = (defpackage.xm2) r1
            int[] r3 = defpackage.zm2.a
            ym2 r4 = r1.A
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            java.lang.Throwable r1 = r1.B
            if (r3 == r4) goto L89
            r4 = 2
            if (r3 == r4) goto L89
            r4 = 3
            if (r3 == r4) goto L89
            r4 = 4
            if (r3 == r4) goto L89
            r4 = 5
            if (r3 != r4) goto L84
            boolean r3 = r1 instanceof android.database.sqlite.SQLiteException
            if (r3 == 0) goto L83
            goto L8a
        L83:
            throw r1
        L84:
            defpackage.i.d()
            r5 = 0
            return r5
        L89:
            throw r1
        L8a:
            boolean r3 = r1 instanceof android.database.sqlite.SQLiteException
            if (r3 == 0) goto Lae
            if (r0 == 0) goto Lae
            boolean r3 = r5.R
            if (r3 == 0) goto Lae
            r2.deleteDatabase(r0)
            if (r6 == 0) goto La3
            android.database.sqlite.SQLiteDatabase r5 = r5.getWritableDatabase()     // Catch: defpackage.xm2 -> La1
            r5.getClass()     // Catch: defpackage.xm2 -> La1
            goto Laa
        La1:
            r5 = move-exception
            goto Lab
        La3:
            android.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch: defpackage.xm2 -> La1
            r5.getClass()     // Catch: defpackage.xm2 -> La1
        Laa:
            return r5
        Lab:
            java.lang.Throwable r5 = r5.B
            throw r5
        Lae:
            throw r1
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r3.X
            zb r1 = r3.L
            if (r0 != 0) goto L15
            int r0 = r1.B
            int r2 = r4.getVersion()
            if (r0 == r2) goto L15
            r0 = 1
            r4.setMaxSqlCacheSize(r0)
        L15:
            r3.h(r4)     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r3 = move-exception
            xm2 r4 = new xm2
            ym2 r0 = defpackage.ym2.ON_CONFIGURE
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            r2.getClass()
            zb r0 = r1.L     // Catch: java.lang.Throwable -> L16
            vm2 r1 = r1.h(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L16
            ai1 r2 = (defpackage.ai1) r2     // Catch: java.lang.Throwable -> L16
            mu6 r0 = new mu6     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r2.j(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            xm2 r2 = new xm2
            ym2 r0 = defpackage.ym2.ON_CREATE
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            r0 = 1
            r1.X = r0
            zb r0 = r1.L     // Catch: java.lang.Throwable -> L10
            vm2 r1 = r1.h(r2)     // Catch: java.lang.Throwable -> L10
            r0.p(r1, r3, r4)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            xm2 r2 = new xm2
            ym2 r3 = defpackage.ym2.ON_DOWNGRADE
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r2.X
            if (r0 != 0) goto L25
            zb r0 = r2.L     // Catch: java.lang.Throwable -> L1c
            vm2 r3 = r2.h(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L1c
            ai1 r0 = (defpackage.ai1) r0     // Catch: java.lang.Throwable -> L1c
            mu6 r1 = new mu6     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r0.l(r1)     // Catch: java.lang.Throwable -> L1c
            r0.i = r3     // Catch: java.lang.Throwable -> L1c
            goto L25
        L1c:
            r2 = move-exception
            xm2 r3 = new xm2
            ym2 r0 = defpackage.ym2.ON_OPEN
            r3.<init>(r0, r2)
            throw r3
        L25:
            r3 = 1
            r2.Z = r3
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            r0 = 1
            r1.X = r0
            zb r0 = r1.L     // Catch: java.lang.Throwable -> L10
            vm2 r1 = r1.h(r2)     // Catch: java.lang.Throwable -> L10
            r0.p(r1, r3, r4)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            xm2 r2 = new xm2
            ym2 r3 = defpackage.ym2.ON_UPGRADE
            r2.<init>(r3, r1)
            throw r2
    }
}
