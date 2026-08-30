package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs6  reason: default package */
/* loaded from: classes.dex */
public abstract class vs6 {
    public static final ThreadLocal a = new ThreadLocal();

    public static u12 a() {
        ThreadLocal threadLocal = a;
        u12 u12Var = (u12) threadLocal.get();
        if (u12Var == null) {
            n30 n30Var = new n30(Thread.currentThread());
            threadLocal.set(n30Var);
            return n30Var;
        }
        return u12Var;
    }
}
