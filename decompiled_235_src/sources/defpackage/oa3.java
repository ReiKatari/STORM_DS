package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa3  reason: default package */
/* loaded from: classes.dex */
public final class oa3 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ne2 B;
    public final /* synthetic */ wa3 L;

    public /* synthetic */ oa3(ne2 ne2Var, wa3 wa3Var, int i) {
        this.A = i;
        this.B = ne2Var;
        this.L = wa3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        na3 na3Var;
        int i;
        sa3 sa3Var;
        int i2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        wa3 wa3Var = this.L;
        ne2 ne2Var = this.B;
        switch (i3) {
            case 0:
                if (r41Var instanceof na3) {
                    na3Var = (na3) r41Var;
                    int i4 = na3Var.X;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        na3Var.X = i4 - Integer.MIN_VALUE;
                        Object obj2 = na3Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = na3Var.X;
                        if (i == 0) {
                            if (i == 1) {
                                oi2.Y(obj2);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj2);
                        List list = (List) obj;
                        if (wa3Var.e) {
                            na3Var.X = 1;
                            if (ne2Var.a(obj, na3Var) == x61Var) {
                                return x61Var;
                            }
                            return jg7Var;
                        }
                        return jg7Var;
                    }
                }
                na3Var = new na3(this, r41Var);
                Object obj22 = na3Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = na3Var.X;
                if (i == 0) {
                }
            default:
                if (r41Var instanceof sa3) {
                    sa3Var = (sa3) r41Var;
                    int i5 = sa3Var.X;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sa3Var.X = i5 - Integer.MIN_VALUE;
                        Object obj3 = sa3Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i2 = sa3Var.X;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                oi2.Y(obj3);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj3);
                        List list2 = (List) obj;
                        if (wa3Var.e) {
                            sa3Var.X = 1;
                            if (ne2Var.a(obj, sa3Var) == x61Var3) {
                                return x61Var3;
                            }
                            return jg7Var;
                        }
                        return jg7Var;
                    }
                }
                sa3Var = new sa3(this, r41Var);
                Object obj32 = sa3Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i2 = sa3Var.X;
                if (i2 == 0) {
                }
        }
    }
}
