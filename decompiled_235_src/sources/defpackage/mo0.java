package defpackage;

import me.magnum.melonds.ui.cheats.CheatsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo0  reason: default package */
/* loaded from: classes.dex */
public final class mo0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ CheatsActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo0(CheatsActivity cheatsActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = cheatsActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((mo0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((mo0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        CheatsActivity cheatsActivity = this.Z;
        switch (i) {
            case 0:
                return new mo0(cheatsActivity, r41Var, 0);
            default:
                return new mo0(cheatsActivity, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        CheatsActivity cheatsActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i3 = CheatsActivity.B0;
                vl0 vl0Var = ((aq0) cheatsActivity.A0.getValue()).w;
                lo0 lo0Var = new lo0(cheatsActivity, (r41) null, 0);
                this.Y = 1;
                if (f04.v(vl0Var, lo0Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var = cheatsActivity.A;
                tt3 tt3Var = tt3.STARTED;
                mo0 mo0Var = new mo0(cheatsActivity, null, 0);
                this.Y = 1;
                if (np2.c0(ku3Var, tt3Var, mo0Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
