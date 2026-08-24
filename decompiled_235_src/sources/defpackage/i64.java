package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i64  reason: default package */
/* loaded from: classes.dex */
public abstract class i64 {
    public final int a;
    public final int b;

    public i64(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(vm2 vm2Var) {
        vm2Var.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(e36 e36Var) {
        e36Var.getClass();
        if (e36Var instanceof mu6) {
            a(((mu6) e36Var).A);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
