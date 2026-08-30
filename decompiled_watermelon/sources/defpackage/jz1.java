package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jz1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jz1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ mi2 L;

    public /* synthetic */ jz1(List list, mi2 mi2Var, int i) {
        this.A = i;
        this.B = list;
        this.L = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        mi2 mi2Var = this.L;
        List list = this.B;
        ek3 ek3Var = (ek3) obj;
        switch (i) {
            case 0:
                ek3Var.getClass();
                ek3Var.b0(list.size(), new s5(10, new qu1(3), list), new k5(7, list), new et0(802480018, true, new lz1(list, mi2Var, 0)));
                return o27Var;
            case 1:
                ek3Var.getClass();
                ek3Var.b0(list.size(), null, new k5(8, list), new et0(802480018, true, new lz1(list, mi2Var, 1)));
                return o27Var;
            default:
                ek3Var.getClass();
                ek3Var.b0(list.size(), null, new k5(9, list), new et0(802480018, true, new lz1(list, mi2Var, 2)));
                return o27Var;
        }
    }
}
