package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r52  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r52 implements on2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ r52(int i, String str, s52 s52Var) {
        this.B = i;
        this.L = str;
        this.R = s52Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        Object obj = this.R;
        int i2 = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                String str = (String) obj2;
                s52 s52Var = (s52) obj;
                wb6[] wb6VarArr = new wb6[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    wb6VarArr[i3] = mp2.m(str + '.' + s52Var.e[i3], bt6.h, new wb6[0]);
                }
                return wb6VarArr;
            default:
                qz2 qz2Var = (qz2) obj2;
                a62 a62Var = (a62) obj;
                try {
                    a62Var.getClass();
                    qz2Var.s0.v(i2, a62Var);
                } catch (IOException e) {
                    a62 a62Var2 = a62.PROTOCOL_ERROR;
                    qz2Var.e(a62Var2, a62Var2, e);
                }
                return jg7.a;
        }
    }

    public /* synthetic */ r52(qz2 qz2Var, int i, a62 a62Var) {
        this.L = qz2Var;
        this.B = i;
        this.R = a62Var;
    }
}
