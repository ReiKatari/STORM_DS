package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o63  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o63 extends lj2 implements bj2 {
    public static final o63 c0 = new lj2(3, p63.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        Object S;
        o27 o27Var;
        p63 p63Var = (p63) obj;
        jy5 jy5Var = (jy5) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p63.A;
        do {
            S = p63Var.S();
            boolean z = S instanceof ay2;
            o27Var = o27.a;
            if (!z) {
                jy5Var.X = o27Var;
                return o27Var;
            }
        } while (p63Var.o0(S) < 0);
        jy5Var.L = ln2.E(p63Var, true, new l63(p63Var, jy5Var));
        return o27Var;
    }
}
