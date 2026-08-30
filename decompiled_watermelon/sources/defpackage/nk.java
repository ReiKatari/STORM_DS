package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nk  reason: default package */
/* loaded from: classes.dex */
public final class nk extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dl Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(dl dlVar, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = dlVar;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((nk) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((nk) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        dl dlVar = this.Z;
        switch (i) {
            case 0:
                nk nkVar = new nk(dlVar, j11Var, 0);
                nkVar.Y = obj;
                return nkVar;
            default:
                nk nkVar2 = new nk(dlVar, j11Var, 1);
                nkVar2.Y = obj;
                return nkVar2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        Object kc5Var2;
        int i = this.X;
        pp1 pp1Var = pp1.A;
        dl dlVar = this.Z;
        MelonEmulator melonEmulator = MelonEmulator.a;
        o31 o31Var = (o31) this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                try {
                    kc5Var = nu.F0(melonEmulator.getRuntimeAchievementBuckets());
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                Throwable a = nc5.a(kc5Var);
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = a.getClass().getSimpleName();
                    }
                    dlVar.u("runtime_buckets_unavailable", new ti4("error", message));
                }
                if (nc5.a(kc5Var) == null) {
                    return kc5Var;
                }
                return pp1Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                try {
                    kc5Var2 = nu.E0(melonEmulator.getRuntimeSubsetIds());
                } catch (Throwable th2) {
                    kc5Var2 = new kc5(th2);
                }
                Throwable a2 = nc5.a(kc5Var2);
                if (a2 != null) {
                    String message2 = a2.getMessage();
                    if (message2 == null) {
                        message2 = a2.getClass().getSimpleName();
                    }
                    dlVar.u("runtime_subset_ids_unavailable", new ti4("error", message2));
                }
                if (nc5.a(kc5Var2) == null) {
                    return kc5Var2;
                }
                return pp1Var;
        }
    }
}
