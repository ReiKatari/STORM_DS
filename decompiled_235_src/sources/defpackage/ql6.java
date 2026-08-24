package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql6  reason: default package */
/* loaded from: classes.dex */
public final class ql6 implements sd2 {
    public final ap3 a;
    public final oc1 b;
    public final io6 c;
    public final ak1 d = y76.c;

    public ql6(ap3 ap3Var, oc1 oc1Var, io6 io6Var) {
        this.a = ap3Var;
        this.b = oc1Var;
        this.c = io6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ql6 ql6Var, p76 p76Var, float f, float f2, nl6 nl6Var, s41 s41Var) {
        pl6 pl6Var;
        int i;
        ot s35Var;
        if (s41Var instanceof pl6) {
            pl6Var = (pl6) s41Var;
            int i2 = pl6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pl6Var.Y = i2 - Integer.MIN_VALUE;
                pl6 pl6Var2 = pl6Var;
                Object obj = pl6Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pl6Var2.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (Math.abs(f) == RecyclerView.B1 || Math.abs(f2) == RecyclerView.B1) {
                        return ak7.f(f, f2, 28);
                    }
                    pl6Var2.Y = 1;
                    oc1 oc1Var = ql6Var.b;
                    if (Math.abs(((wo) new eb(oc1Var.a, 26).E(new wo(RecyclerView.B1), new wo(f2))).a) >= Math.abs(f)) {
                        s35Var = new d51(oc1Var, 3);
                    } else {
                        s35Var = new s35(ql6Var.c);
                    }
                    obj = s35Var.n(p76Var, new Float(f), new Float(f2), nl6Var, pl6Var2);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((qo) obj).b;
            }
        }
        pl6Var = new pl6(ql6Var, s41Var);
        pl6 pl6Var22 = pl6Var;
        Object obj2 = pl6Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pl6Var22.Y;
        if (i == 0) {
        }
        return ((qo) obj2).b;
    }

    @Override // defpackage.sd2
    public Object a(i86 i86Var, float f, r41 r41Var) {
        return d(i86Var, f, hv.j, (s41) r41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(p76 p76Var, float f, qn2 qn2Var, s41 s41Var) {
        ml6 ml6Var;
        int i;
        qn2 qn2Var2;
        if (s41Var instanceof ml6) {
            ml6Var = (ml6) s41Var;
            int i2 = ml6Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml6Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ml6Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ml6Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        qn2Var2 = ml6Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    vd1 vd1Var = new vd1(this, f, qn2Var, p76Var, null);
                    ml6Var.R = qn2Var;
                    ml6Var.Z = 1;
                    obj = hv.d0(this.d, vd1Var, ml6Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    qn2Var2 = qn2Var;
                }
                qo qoVar = (qo) obj;
                qn2Var2.g(new Float((float) RecyclerView.B1));
                return qoVar;
            }
        }
        ml6Var = new ml6(this, s41Var);
        Object obj2 = ml6Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ml6Var.Z;
        if (i == 0) {
        }
        qo qoVar2 = (qo) obj2;
        qn2Var2.g(new Float((float) RecyclerView.B1));
        return qoVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(p76 p76Var, float f, qn2 qn2Var, s41 s41Var) {
        ol6 ol6Var;
        int i;
        float floatValue;
        if (s41Var instanceof ol6) {
            ol6Var = (ol6) s41Var;
            int i2 = ol6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ol6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ol6Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ol6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ol6Var.Y = 1;
                    obj = c(p76Var, f, qn2Var, ol6Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                qo qoVar = (qo) obj;
                floatValue = qoVar.a.floatValue();
                uo uoVar = qoVar.b;
                float f2 = RecyclerView.B1;
                if (floatValue != RecyclerView.B1) {
                    f2 = ((Number) uoVar.a()).floatValue();
                }
                return new Float(f2);
            }
        }
        ol6Var = new ol6(this, s41Var);
        Object obj3 = ol6Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ol6Var.Y;
        if (i == 0) {
        }
        qo qoVar2 = (qo) obj3;
        floatValue = qoVar2.a.floatValue();
        uo uoVar2 = qoVar2.b;
        float f22 = RecyclerView.B1;
        if (floatValue != RecyclerView.B1) {
        }
        return new Float(f22);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ql6) {
            ql6 ql6Var = (ql6) obj;
            if (!ql6Var.c.equals(this.c) || !nb3.k(ql6Var.b, this.b) || ql6Var.a != this.a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.a.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }
}
