package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a61  reason: default package */
/* loaded from: classes.dex */
public final class a61 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a61(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                Object C = g04.C(new la(zy4Var, (g17) obj2, (p27) obj, null, 1), r41Var);
                if (C == x61.COROUTINE_SUSPENDED) {
                    return C;
                }
                return jg7Var;
            default:
                v80 v80Var = ((o97) obj2).q0;
                ow6 ow6Var = (ow6) zy4Var;
                Object R0 = ow6Var.R0(new kq3(r41Var.b(), (os0) obj, v80Var, null, 3), r41Var);
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                if (R0 != x61Var) {
                    R0 = jg7Var;
                }
                if (R0 == x61Var) {
                    return R0;
                }
                return jg7Var;
        }
    }
}
