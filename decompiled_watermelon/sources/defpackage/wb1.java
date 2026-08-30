package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb1  reason: default package */
/* loaded from: classes.dex */
public final class wb1 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ wb1(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i;
        Icon icon;
        int i2 = this.A;
        o27 o27Var = o27.a;
        Object obj4 = this.B;
        boolean z = false;
        switch (i2) {
            case 0:
                long j = ((xq0) obj).a;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).e(j)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    xb1.b(((ho6) obj4).c, (intValue << 3) & 112, j, sk2Var);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                long j2 = ((xq0) obj).a;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    iq0.q0.l((Drawable) obj4, sk2Var2, 48);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                long j3 = ((xq0) obj).a;
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z)) {
                    iq0 iq0Var = iq0.q0;
                    icon = ((RemoteAction) obj4).getIcon();
                    iq0Var.m(icon, sk2Var3, 48);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
        }
    }
}
