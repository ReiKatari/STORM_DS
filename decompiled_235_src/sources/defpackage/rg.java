package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg  reason: default package */
/* loaded from: classes.dex */
public final class rg implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        Object C;
        int i = this.a;
        Object obj = this.b;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                Object o = uj2.o(zy4Var, new qg((sg) obj, null, 0), r41Var);
                if (o == x61.COROUTINE_SUSPENDED) {
                    return o;
                }
                return jg7Var;
            case 1:
                Object d = hz6.d(zy4Var, null, new li1((oi1) obj, 2), r41Var, 7);
                if (d == x61.COROUTINE_SUSPENDED) {
                    return d;
                }
                return jg7Var;
            case 2:
                Object C2 = g04.C(new xd1(zy4Var, (ue1) obj, null, 24), r41Var);
                if (C2 == x61.COROUTINE_SUSPENDED) {
                    return C2;
                }
                return jg7Var;
            case 3:
                Object R0 = ((ow6) zy4Var).R0(new qg((w51) obj, null, 2), r41Var);
                if (R0 == x61.COROUTINE_SUSPENDED) {
                    return R0;
                }
                return jg7Var;
            case 4:
                Object o2 = uj2.o(zy4Var, new kq3((dt6) obj, null, 2), r41Var);
                if (o2 == x61.COROUTINE_SUSPENDED) {
                    return o2;
                }
                return jg7Var;
            case 5:
                Object o3 = uj2.o(zy4Var, new qg(new xj5(1, (q07) obj, q07.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 3), null, 1), r41Var);
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                if (o3 != x61Var) {
                    o3 = jg7Var;
                }
                if (o3 == x61Var) {
                    return o3;
                }
                return jg7Var;
            case 6:
                p27 p27Var = (p27) obj;
                ci ciVar = p27Var.A;
                n27 n27Var = p27Var.z;
                ow6 ow6Var = (ow6) zy4Var;
                ow6Var.getClass();
                Object o4 = uj2.o(zy4Var, new kq3(new ei(nc1.f0(ow6Var).w0), ciVar, n27Var, null, 1), r41Var);
                if (o4 != x61.COROUTINE_SUSPENDED) {
                    o4 = jg7Var;
                }
                if (o4 == x61.COROUTINE_SUSPENDED) {
                    return o4;
                }
                return jg7Var;
            case 7:
                Object C3 = g04.C(new ag(zy4Var, (g17) obj, null, 9), r41Var);
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                if (C3 != x61Var2) {
                    C3 = jg7Var;
                }
                if (C3 == x61Var2) {
                    return C3;
                }
                return jg7Var;
            default:
                o97 o97Var = (o97) obj;
                if (o97Var.o0 && (C = g04.C(new vy5(zy4Var, o97Var, (r41) null, 14), r41Var)) == x61.COROUTINE_SUSPENDED) {
                    return C;
                }
                return jg7Var;
        }
    }
}
