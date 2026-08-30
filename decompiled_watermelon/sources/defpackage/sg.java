package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sg  reason: default package */
/* loaded from: classes.dex */
public final class sg extends nk6 implements aj2 {
    public final /* synthetic */ boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(boolean z, j11 j11Var) {
        super(2, j11Var);
        this.X = z;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        o27 o27Var = o27.a;
        ((sg) t((j11) obj2, (o31) obj)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new sg(this.X, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        MelonEmulator.a.setRetroAchievementsSubmissionTransportSuspended(this.X);
        return o27.a;
    }
}
