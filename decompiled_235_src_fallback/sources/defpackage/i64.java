package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i64  reason: default package */
/* loaded from: classes.dex */
public abstract class i64 {
    public final int a;
    public final int b;

    public i64(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public void a(defpackage.vm2 r1) {
            r0 = this;
            r1.getClass()
            tg4 r0 = new tg4
            java.lang.String r1 = "Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function."
            r0.<init>(r1)
            throw r0
    }

    public void b(defpackage.e36 r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.mu6
            if (r0 == 0) goto Lf
            mu6 r2 = (defpackage.mu6) r2
            vm2 r2 = r2.A
            r1.a(r2)
            return
        Lf:
            tg4 r1 = new tg4
            java.lang.String r2 = "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."
            r1.<init>(r2)
            throw r1
    }
}
