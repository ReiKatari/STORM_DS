package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d61 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ e61 B;

    public /* synthetic */ d61(e61 e61Var, gb6 gb6Var) {
        this.A = 3;
        this.B = e61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean isText;
        int i = this.A;
        CharSequence charSequence = null;
        boolean z = false;
        e61 e61Var = this.B;
        switch (i) {
            case 0:
                oh ohVar = (oh) obj;
                vs4 vs4Var = e61Var.o0.t;
                Boolean bool = Boolean.TRUE;
                vs4Var.setValue(bool);
                e61Var.o0.s.setValue(bool);
                jt3 jt3Var = e61Var.o0;
                isText = ohVar.a.isText();
                if (isText) {
                    charSequence = ohVar.a.getTextValue();
                }
                charSequence.getClass();
                e61.U0(jt3Var, (String) charSequence, e61Var.p0);
                return bool;
            case 1:
                List list = (List) obj;
                if (e61Var.o0.d() != null) {
                    b47 d = e61Var.o0.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                e61.U0(e61Var.o0, ((fp) obj).B, e61Var.p0);
                return Boolean.TRUE;
            default:
                fp fpVar = (fp) obj;
                if (e61Var.p0) {
                    t37 t37Var = e61Var.o0.e;
                    if (t37Var != null) {
                        List c0 = hf.c0(new Object(), new pu0(fpVar, 1));
                        jt3 jt3Var2 = e61Var.o0;
                        yc1 yc1Var = jt3Var2.d;
                        w51 w51Var = jt3Var2.v;
                        c37 n = yc1Var.n(c0);
                        t37Var.a(null, n);
                        w51Var.g(n);
                    } else {
                        c37 c37Var = e61Var.n0;
                        String str = c37Var.a.B;
                        long j = c37Var.b;
                        int i2 = k47.c;
                        String obj2 = qs6.G0(str, (int) (j >> 32), (int) (j & 4294967295L), fpVar).toString();
                        int length = fpVar.B.length() + ((int) (e61Var.n0.b >> 32));
                        e61Var.o0.v.g(new c37(obj2, 4, jx2.f(length, length)));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ d61(e61 e61Var, int i) {
        this.A = i;
        this.B = e61Var;
    }
}
