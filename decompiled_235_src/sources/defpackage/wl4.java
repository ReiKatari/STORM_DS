package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wl4 extends po2 implements fo2 {
    public static final wl4 d0 = new po2(3, xl4.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        xl4 xl4Var = (xl4) obj;
        v96 v96Var = (v96) obj2;
        long j = xl4Var.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        jg7 jg7Var = jg7.a;
        if (i <= 0) {
            v96Var.X = jg7Var;
            return jg7Var;
        }
        q64 q64Var = new q64(2, v96Var, xl4Var);
        v96Var.getClass();
        l61 l61Var = v96Var.A;
        v96Var.L = q60.D(l61Var).A(j, q64Var, l61Var);
        return jg7Var;
    }
}
