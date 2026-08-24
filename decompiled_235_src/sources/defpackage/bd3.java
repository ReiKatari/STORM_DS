package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bd3 extends po2 implements fo2 {
    public static final bd3 d0 = new po2(3, ed3.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        ed3 ed3Var = (ed3) obj;
        v96 v96Var = (v96) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed3.A;
        while (true) {
            Object Q = ed3Var.Q();
            if (!(Q instanceof e43)) {
                if (!(Q instanceof av0)) {
                    Q = fd3.a(Q);
                }
                v96Var.X = Q;
            } else if (ed3Var.o0(Q) >= 0) {
                v96Var.L = yh2.y(ed3Var, true, new zc3(ed3Var, v96Var));
                break;
            }
        }
        return jg7.a;
    }
}
