package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yc4 extends lj2 implements bj2 {
    public static final yc4 c0 = new lj2(3, zc4.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        zc4 zc4Var = (zc4) obj;
        jy5 jy5Var = (jy5) obj2;
        long j = zc4Var.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        o27 o27Var = o27.a;
        if (i <= 0) {
            jy5Var.X = o27Var;
            return o27Var;
        }
        xc4 xc4Var = new xc4(0, jy5Var, zc4Var);
        jy5Var.getClass();
        e31 e31Var = jy5Var.A;
        jy5Var.L = dk7.x(e31Var).Q(j, xc4Var, e31Var);
        return o27Var;
    }
}
