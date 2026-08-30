package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: py3  reason: default package */
/* loaded from: classes.dex */
public abstract class py3 {
    public final int a;
    public final int b;

    public py3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(vh2 vh2Var) {
        vh2Var.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(ls5 ls5Var) {
        ls5Var.getClass();
        if (ls5Var instanceof si6) {
            a(((si6) ls5Var).A);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
