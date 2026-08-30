package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pr1  reason: default package */
/* loaded from: classes.dex */
public final class pr1 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(EmulatorActivity emulatorActivity, int i, int i2, j11 j11Var) {
        super(2, j11Var);
        this.d0 = emulatorActivity;
        this.Y = i;
        this.c0 = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((pr1) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((pr1) t((j11) obj2, (dw5) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        int i2 = this.c0;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                pr1 pr1Var = new pr1((EmulatorActivity) obj2, this.Y, i2, j11Var);
                pr1Var.Z = obj;
                return pr1Var;
            default:
                pr1 pr1Var2 = new pr1((pk3) obj2, i2, j11Var);
                pr1Var2.Z = obj;
                return pr1Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        oh2 oh2Var;
        int i = this.X;
        int i2 = this.c0;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                o31 o31Var = (o31) this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                int i3 = this.Y;
                try {
                    oh2Var = emulatorActivity.P0;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (oh2Var != null) {
                    kc5Var = new Long(oh2Var.c(i3, i2));
                    Long l = new Long(0L);
                    if (kc5Var instanceof kc5) {
                        return l;
                    }
                    return kc5Var;
                }
                b53.g0("frameRenderCoordinator");
                throw null;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    pk3 pk3Var = (pk3) obj2;
                    lk3 lk3Var = new lk3((dw5) this.Z, pk3Var, 0);
                    od1 od1Var = ((jk3) pk3Var.f.getValue()).i;
                    this.Y = 1;
                    if (nl2.t(lk3Var, i2, 100, od1Var, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(pk3 pk3Var, int i, j11 j11Var) {
        super(2, j11Var);
        this.d0 = pk3Var;
        this.c0 = i;
    }
}
