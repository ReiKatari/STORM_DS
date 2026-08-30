package defpackage;

import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ge3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ge3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ ge3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(1815524482, new ge3(bVar, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                b.j(bVar, (tu0) obj, ((Integer) obj2).intValue());
                return o27Var;
            default:
                b.k(bVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return o27Var;
        }
    }
}
