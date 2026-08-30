package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x85  reason: default package */
/* loaded from: classes.dex */
public final class x85 extends nk6 implements mi2 {
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        nk6 nk6Var = new nk6(1, (j11) obj);
        o27 o27Var = o27.a;
        nk6Var.v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        u81 u81Var = u81.a;
        u81.e(false);
        MelonEmulator.a.resumeEmulation();
        return o27.a;
    }
}
