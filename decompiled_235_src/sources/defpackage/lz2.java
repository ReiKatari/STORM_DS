package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lz2 implements on2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ qz2 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ List R;

    public /* synthetic */ lz2(qz2 qz2Var, int i, List list) {
        this.B = qz2Var;
        this.L = i;
        this.R = list;
    }

    @Override // defpackage.on2
    public final Object c() {
        switch (this.A) {
            case 0:
                qz2 qz2Var = this.B;
                int i = this.L;
                qz2Var.g0.getClass();
                try {
                    qz2Var.s0.v(i, a62.CANCEL);
                    synchronized (qz2Var) {
                        qz2Var.u0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return jg7.a;
            default:
                qz2 qz2Var2 = this.B;
                int i2 = this.L;
                qz2Var2.g0.getClass();
                try {
                    qz2Var2.s0.v(i2, a62.CANCEL);
                    synchronized (qz2Var2) {
                        qz2Var2.u0.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return jg7.a;
        }
    }

    public /* synthetic */ lz2(qz2 qz2Var, int i, List list, boolean z) {
        this.B = qz2Var;
        this.L = i;
        this.R = list;
    }
}
