package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m57  reason: default package */
/* loaded from: classes.dex */
public abstract class m57 {
    public static final ThreadLocal a = new ThreadLocal();

    public static l62 a() {
        ThreadLocal threadLocal = a;
        l62 l62Var = (l62) threadLocal.get();
        if (l62Var == null) {
            l50 l50Var = new l50(Thread.currentThread());
            threadLocal.set(l50Var);
            return l50Var;
        }
        return l62Var;
    }
}
