package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w21  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w21 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x21 B;

    public /* synthetic */ w21(x21 x21Var, rz5 rz5Var) {
        this.A = 3;
        this.B = x21Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean isText;
        int i = this.A;
        CharSequence charSequence = null;
        boolean z = false;
        x21 x21Var = this.B;
        switch (i) {
            case 0:
                ch chVar = (ch) obj;
                tj4 tj4Var = x21Var.n0.t;
                Boolean bool = Boolean.TRUE;
                tj4Var.setValue(bool);
                x21Var.n0.s.setValue(bool);
                hm3 hm3Var = x21Var.n0;
                isText = chVar.a.isText();
                if (isText) {
                    charSequence = chVar.a.getTextValue();
                }
                charSequence.getClass();
                x21.U0(hm3Var, (String) charSequence, x21Var.o0);
                return bool;
            case 1:
                List list = (List) obj;
                if (x21Var.n0.d() != null) {
                    mr6 d = x21Var.n0.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                x21.U0(x21Var.n0, ((to) obj).B, x21Var.o0);
                return Boolean.TRUE;
            default:
                to toVar = (to) obj;
                if (x21Var.o0) {
                    er6 er6Var = x21Var.n0.e;
                    if (er6Var != null) {
                        List c0 = l07.c0(new Object(), new cs0(toVar, 1));
                        hm3 hm3Var2 = x21Var.n0;
                        k91 k91Var = hm3Var2.d;
                        o21 o21Var = hm3Var2.v;
                        oq6 p = k91Var.p(c0);
                        er6Var.a(null, p);
                        o21Var.n(p);
                    } else {
                        oq6 oq6Var = x21Var.m0;
                        String str = oq6Var.a.B;
                        long j = oq6Var.b;
                        int i2 = vr6.c;
                        String obj2 = zg6.M0(str, (int) (j >> 32), (int) (j & 4294967295L), toVar).toString();
                        int length = toVar.B.length() + ((int) (x21Var.m0.b >> 32));
                        x21Var.n0.v.n(new oq6(obj2, 4, ve2.g(length, length)));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ w21(x21 x21Var, int i) {
        this.A = i;
        this.B = x21Var;
    }
}
