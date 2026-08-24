package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho3  reason: default package */
/* loaded from: classes.dex */
public final class ho3 implements o55 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile o55 b;

    public ho3(o55 o55Var) {
        this.b = o55Var;
    }

    @Override // defpackage.o55
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj3) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
