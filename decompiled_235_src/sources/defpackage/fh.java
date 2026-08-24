package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh  reason: default package */
/* loaded from: classes.dex */
public final class fh extends hw6 implements eo2 {
    public final /* synthetic */ boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(boolean z, r41 r41Var) {
        super(2, r41Var);
        this.X = z;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((fh) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new fh(this.X, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        MelonEmulator.a.setRetroAchievementsSubmissionTransportSuspended(this.X);
        return jg7.a;
    }
}
