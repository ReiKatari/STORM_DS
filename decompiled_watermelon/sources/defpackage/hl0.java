package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hl0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki2 B;
    public final /* synthetic */ ki2 L;

    public /* synthetic */ hl0(ki2 ki2Var, ki2 ki2Var2, int i) {
        this.A = i;
        this.B = ki2Var;
        this.L = ki2Var2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mh7.e(me2.X(sk2Var, R.string.cancel), false, this.B, sk2Var, 0, 2);
                    mh7.e(me2.X(sk2Var, R.string.save), false, this.L, sk2Var, 0, 2);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z)) {
                    mh7.e(me2.X(sk2Var2, R.string.cancel), false, this.B, sk2Var2, 0, 2);
                    mh7.e(me2.X(sk2Var2, R.string.ok), false, this.L, sk2Var2, 0, 2);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var;
                if (sk2Var3.O(intValue & 1, z)) {
                    mh7.e(me2.X(sk2Var3, R.string.cancel), false, this.B, sk2Var3, 0, 2);
                    mh7.e(me2.X(sk2Var3, R.string.exit), false, this.L, sk2Var3, 0, 2);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
        }
    }
}
