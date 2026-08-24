package me.magnum.melonds.ui.inputsetup;

import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends hw6 implements fo2 {
    public /* synthetic */ b63 X;
    public /* synthetic */ b.a Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [hw6, me.magnum.melonds.ui.inputsetup.a] */
    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        ?? hw6Var = new hw6(3, (r41) obj3);
        hw6Var.X = (b63) obj;
        hw6Var.Y = (b.a) obj2;
        return hw6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        b63 b63Var = this.X;
        b.a aVar = this.Y;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        if (b63Var == null && aVar == null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
