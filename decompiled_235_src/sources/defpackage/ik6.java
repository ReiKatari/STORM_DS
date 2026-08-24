package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik6  reason: default package */
/* loaded from: classes.dex */
public final class ik6 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qa4 c;
    public final /* synthetic */ pp6 d;
    public final /* synthetic */ w61 e;
    public final /* synthetic */ go1 f;
    public final /* synthetic */ qa4 g;

    public ik6(boolean z, float f, qa4 qa4Var, pp6 pp6Var, w61 w61Var, go1 go1Var, qa4 qa4Var2) {
        this.a = z;
        this.b = f;
        this.c = qa4Var;
        this.d = pp6Var;
        this.e = w61Var;
        this.f = go1Var;
        this.g = qa4Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        Object d = hz6.d(zy4Var, new hk6(this.a, this.b, this.c, this.d, null), new t00(this.e, this.f, this.g, 25), r41Var, 3);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return jg7.a;
    }
}
