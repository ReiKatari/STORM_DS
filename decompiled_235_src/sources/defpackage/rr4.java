package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr4  reason: default package */
/* loaded from: classes.dex */
public final class rr4 implements sd2 {
    public final ql6 a;
    public final ue1 b;

    public rr4(ql6 ql6Var, ue1 ue1Var) {
        this.a = ql6Var;
        this.b = ue1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // defpackage.sd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i86 i86Var, float f, r41 r41Var) {
        qr4 qr4Var;
        int i;
        ue1 ue1Var;
        if (r41Var instanceof qr4) {
            qr4Var = (qr4) r41Var;
            int i2 = qr4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qr4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = qr4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = qr4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    bg2 bg2Var = new bg2(17, this, i86Var);
                    qr4Var.Y = 1;
                    obj = this.a.d(i86Var, f, bg2Var, qr4Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                float floatValue = ((Number) obj).floatValue();
                ue1Var = this.b;
                if (ue1Var.l() != RecyclerView.B1 && Math.abs(ue1Var.l()) < 0.001d) {
                    int k = ue1Var.k();
                    if (ue1Var.k.a()) {
                        hv.L(((cr4) ue1Var.m.getValue()).s, null, null, new yq4(ue1Var, null, 2), 3);
                    }
                    ue1Var.t(RecyclerView.B1, k, false);
                } else {
                    new Float(ue1Var.l());
                }
                return new Float(floatValue);
            }
        }
        qr4Var = new qr4(this, (s41) r41Var);
        Object obj2 = qr4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = qr4Var.Y;
        if (i == 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        ue1Var = this.b;
        if (ue1Var.l() != RecyclerView.B1) {
            int k2 = ue1Var.k();
            if (ue1Var.k.a()) {
            }
            ue1Var.t(RecyclerView.B1, k2, false);
            return new Float(floatValue2);
        }
        new Float(ue1Var.l());
        return new Float(floatValue2);
    }
}
