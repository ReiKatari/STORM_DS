package me.magnum.melonds.ui.inputsetup;

import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class a extends nk6 implements bj2 {
    public /* synthetic */ yz2 X;
    public /* synthetic */ b.a Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [nk6, me.magnum.melonds.ui.inputsetup.a] */
    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        ?? nk6Var = new nk6(3, (j11) obj3);
        nk6Var.X = (yz2) obj;
        nk6Var.Y = (b.a) obj2;
        return nk6Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        yz2 yz2Var = this.X;
        b.a aVar = this.Y;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        if (yz2Var == null && aVar == null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
