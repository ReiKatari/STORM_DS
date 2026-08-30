package nc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends o implements tc.b, tc.c {
    public m(String str, String str2) {
        super(b.A, i4.v.class, str, str2, 1);
    }

    @Override // nc.c
    public final tc.a a() {
        u.f10262a.getClass();
        return this;
    }

    public final void g() {
        if (!this.Z) {
            tc.a f8 = f();
            if (f8 != this) {
                ((m) ((tc.c) f8)).g();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        m9.o.v("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override // tc.b
    public final Object get(Object obj) {
        throw null;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        g();
        throw null;
    }
}
