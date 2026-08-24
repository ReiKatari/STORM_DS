package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg2  reason: default package */
/* loaded from: classes.dex */
public final class vg2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ r94 Z;
    public final /* synthetic */ qa4 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(r94 r94Var, qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = r94Var;
        this.d0 = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((vg2) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((vg2) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new vg2(this.Z, this.d0, r41Var, 0);
            default:
                return new vg2(this.Z, this.d0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.d0;
        r94 r94Var = this.Z;
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
                ArrayList arrayList = new ArrayList();
                of6 of6Var = r94Var.a;
                ug2 ug2Var = new ug2(arrayList, qa4Var, 0);
                this.Y = 1;
                of6Var.getClass();
                if (of6.m(of6Var, ug2Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ArrayList arrayList2 = new ArrayList();
                of6 of6Var2 = r94Var.a;
                ug2 ug2Var2 = new ug2(arrayList2, qa4Var, 1);
                this.Y = 1;
                of6Var2.getClass();
                if (of6.m(of6Var2, ug2Var2, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
