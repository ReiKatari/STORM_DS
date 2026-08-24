package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d27  reason: default package */
/* loaded from: classes.dex */
public final class d27 implements PointerInputEventHandler {
    public final /* synthetic */ w61 a;
    public final /* synthetic */ qa4 b;
    public final /* synthetic */ r94 c;
    public final /* synthetic */ qa4 d;

    public d27(w61 w61Var, qa4 qa4Var, r94 r94Var, qa4 qa4Var2) {
        this.a = w61Var;
        this.b = qa4Var;
        this.c = r94Var;
        this.d = qa4Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        c27 c27Var = new c27(this.a, this.b, this.c, null);
        j4 j4Var = new j4(this.d, 26);
        do1 do1Var = hz6.a;
        Object C = g04.C(new ji(zy4Var, c27Var, j4Var, new j25(zy4Var), null, 15), r41Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (C != x61Var) {
            C = jg7Var;
        }
        if (C == x61Var) {
            return C;
        }
        return jg7Var;
    }
}
