package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw1  reason: default package */
/* loaded from: classes.dex */
public final class bw1 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(EmulatorActivity emulatorActivity, int i, int i2, r41 r41Var) {
        super(2, r41Var);
        this.e0 = emulatorActivity;
        this.Y = i;
        this.d0 = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((bw1) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((bw1) q((r41) obj2, (p76) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        int i2 = this.d0;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                bw1 bw1Var = new bw1((EmulatorActivity) obj2, this.Y, i2, r41Var);
                bw1Var.Z = obj;
                return bw1Var;
            default:
                bw1 bw1Var2 = new bw1((pr3) obj2, i2, r41Var);
                bw1Var2.Z = obj;
                return bw1Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        om2 om2Var;
        int i = this.X;
        int i2 = this.d0;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                w61 w61Var = (w61) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                int i3 = this.Y;
                try {
                    om2Var = emulatorActivity.S0;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (om2Var != null) {
                    em5Var = new Long(om2Var.b(i3, i2));
                    Long l = new Long(0L);
                    if (em5Var instanceof em5) {
                        return l;
                    }
                    return em5Var;
                }
                nb3.a0("frameRenderCoordinator");
                throw null;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pr3 pr3Var = (pr3) obj2;
                    lr3 lr3Var = new lr3((p76) this.Z, pr3Var, 0);
                    qh1 qh1Var = ((jr3) pr3Var.f.getValue()).i;
                    this.Y = 1;
                    if (mp2.i(lr3Var, i2, 100, qh1Var, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(pr3 pr3Var, int i, r41 r41Var) {
        super(2, r41Var);
        this.e0 = pr3Var;
        this.d0 = i;
    }
}
