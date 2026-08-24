package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni1  reason: default package */
/* loaded from: classes.dex */
public final class ni1 implements PointerInputEventHandler {
    public static final ni1 b = new ni1(0);
    public static final ni1 c = new ni1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ni1(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        int i = this.a;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                Object d = hz6.d(zy4Var, null, new vn0(22), r41Var, 7);
                if (d == x61.COROUTINE_SUSPENDED) {
                    return d;
                }
                return jg7Var;
            default:
                return jg7Var;
        }
    }
}
