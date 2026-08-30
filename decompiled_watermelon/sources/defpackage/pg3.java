package defpackage;

import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pg3  reason: default package */
/* loaded from: classes.dex */
public final class pg3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ LayoutSelectorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg3(LayoutSelectorActivity layoutSelectorActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = layoutSelectorActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((pg3) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((pg3) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        LayoutSelectorActivity layoutSelectorActivity = this.Z;
        switch (i) {
            case 0:
                return new pg3(layoutSelectorActivity, j11Var, 0);
            default:
                return new pg3(layoutSelectorActivity, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        LayoutSelectorActivity layoutSelectorActivity = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    int i3 = LayoutSelectorActivity.A0;
                    q45 q45Var = ((sg3) layoutSelectorActivity.z0.getValue()).f;
                    x6 x6Var = new x6(11, layoutSelectorActivity);
                    this.Y = 1;
                    if (q45Var.A.a(x6Var, this) == p31Var) {
                        return p31Var;
                    }
                }
                f81.c();
                return null;
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
                    in3 in3Var = layoutSelectorActivity.A;
                    qm3 qm3Var = qm3.STARTED;
                    pg3 pg3Var = new pg3(layoutSelectorActivity, null, 0);
                    this.Y = 1;
                    if (nl2.Q(in3Var, qm3Var, pg3Var, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27.a;
        }
    }
}
