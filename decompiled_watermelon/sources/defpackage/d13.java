package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d13  reason: default package */
/* loaded from: classes.dex */
public final class d13 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ InputSetupActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d13(InputSetupActivity inputSetupActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = inputSetupActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((d13) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((d13) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        InputSetupActivity inputSetupActivity = this.Z;
        switch (i) {
            case 0:
                return new d13(inputSetupActivity, j11Var, 0);
            default:
                return new d13(inputSetupActivity, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        InputSetupActivity inputSetupActivity = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i3 = InputSetupActivity.C0;
                q45 q45Var = inputSetupActivity.B().j;
                q45 q45Var2 = inputSetupActivity.B().l;
                nk6 nk6Var = new nk6(3, null);
                x6 x6Var = new x6(9, inputSetupActivity);
                this.Y = 1;
                Object G = n40.G(this, x6Var, ux.R, new dx1(nk6Var, (j11) null, 5), new u92[]{q45Var, q45Var2});
                if (G != p31Var) {
                    G = o27Var;
                }
                if (G == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var = inputSetupActivity.A;
                qm3 qm3Var = qm3.STARTED;
                d13 d13Var = new d13(inputSetupActivity, null, 0);
                this.Y = 1;
                if (nl2.Q(in3Var, qm3Var, d13Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
