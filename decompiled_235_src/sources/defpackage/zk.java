package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
public final class zk extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pl Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk(pl plVar, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = plVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((zk) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((zk) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        pl plVar = this.Z;
        switch (i) {
            case 0:
                zk zkVar = new zk(plVar, r41Var, 0);
                zkVar.Y = obj;
                return zkVar;
            default:
                zk zkVar2 = new zk(plVar, r41Var, 1);
                zkVar2.Y = obj;
                return zkVar2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        Object em5Var2;
        int i = this.X;
        yt1 yt1Var = yt1.A;
        pl plVar = this.Z;
        MelonEmulator melonEmulator = MelonEmulator.a;
        w61 w61Var = (w61) this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    em5Var = fv.T0(melonEmulator.getRuntimeAchievementBuckets());
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                Throwable a = hm5.a(em5Var);
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = a.getClass().getSimpleName();
                    }
                    plVar.u("runtime_buckets_unavailable", new vr4("error", message));
                }
                if (hm5.a(em5Var) == null) {
                    return em5Var;
                }
                return yt1Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    em5Var2 = fv.S0(melonEmulator.getRuntimeSubsetIds());
                } catch (Throwable th2) {
                    em5Var2 = new em5(th2);
                }
                Throwable a2 = hm5.a(em5Var2);
                if (a2 != null) {
                    String message2 = a2.getMessage();
                    if (message2 == null) {
                        message2 = a2.getClass().getSimpleName();
                    }
                    plVar.u("runtime_subset_ids_unavailable", new vr4("error", message2));
                }
                if (hm5.a(em5Var2) == null) {
                    return em5Var2;
                }
                return yt1Var;
        }
    }
}
