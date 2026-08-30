package n7;

import v7.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f10095a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10096b;

    public a(int i2, int i10) {
        this.f10095a = i2;
        this.f10096b = i10;
    }

    public void a(t7.a aVar) {
        aVar.getClass();
        if (aVar instanceof w7.a) {
            b(((w7.a) aVar).A);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    public void b(b bVar) {
        bVar.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
