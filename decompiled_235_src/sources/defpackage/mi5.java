package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi5  reason: default package */
/* loaded from: classes.dex */
public final class mi5 extends hw6 implements qn2 {
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        hw6 hw6Var = new hw6(1, (r41) obj);
        jg7 jg7Var = jg7.a;
        hw6Var.s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        lc1 lc1Var = lc1.a;
        lc1.e(false);
        MelonEmulator.a.resumeEmulation();
        return jg7.a;
    }
}
