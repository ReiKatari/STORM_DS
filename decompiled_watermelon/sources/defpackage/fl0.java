package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fl0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pl0 B;

    public /* synthetic */ fl0(pl0 pl0Var, int i) {
        this.A = i;
        this.B = pl0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4 = this.A;
        o27 o27Var = o27.a;
        pl0 pl0Var = this.B;
        switch (i4) {
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
                    ol0 ol0Var = (ol0) pl0Var.f.getValue();
                    if (ol0Var == null) {
                        i = -1;
                    } else {
                        i = ml0.a[ol0Var.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            sk2Var.X(761692536);
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(761689740);
                            ir6.b(me2.X(sk2Var, R.string.error_code_invalid_format), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
                            sk2Var.p(false);
                        }
                    } else {
                        sk2Var.X(761685389);
                        ir6.b(me2.X(sk2Var, R.string.error_code_cannot_be_empty), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
                        sk2Var.p(false);
                    }
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(1 & intValue2, z2)) {
                    if (pl0Var.a) {
                        i2 = 2108218989;
                        i3 = R.string.new_cheat;
                    } else {
                        i2 = 2108220270;
                        i3 = R.string.edit_cheat;
                    }
                    ir6.b(b31.o(sk2Var2, i2, i3, sk2Var2, false), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 0, 0, 131070);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
