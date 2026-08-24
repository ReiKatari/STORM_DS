package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii6  reason: default package */
/* loaded from: classes.dex */
public final class ii6 implements m55 {
    public static final Object c = new Object();
    public volatile m55 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v2, types: [ii6, java.lang.Object, m55] */
    public static m55 a(m55 m55Var) {
        if (!(m55Var instanceof ii6)) {
            if (m55Var instanceof em1) {
                return m55Var;
            }
            ?? obj = new Object();
            obj.b = c;
            obj.a = m55Var;
            return obj;
        }
        return m55Var;
    }

    @Override // defpackage.n55
    public final Object get() {
        Object obj = this.b;
        if (obj == c) {
            m55 m55Var = this.a;
            if (m55Var == null) {
                return this.b;
            }
            Object obj2 = m55Var.get();
            this.b = obj2;
            this.a = null;
            return obj2;
        }
        return obj;
    }
}
