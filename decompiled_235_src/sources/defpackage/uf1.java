package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf1  reason: default package */
/* loaded from: classes.dex */
public final class uf1 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ uf1(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        Icon icon;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.B;
        boolean z = false;
        switch (i2) {
            case 0:
                long j = ((kt0) obj).a;
                px0 px0Var = (px0) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).e(j)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    vf1.b(((s07) obj4).c, j, xq2Var, (intValue << 3) & 112);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                long j2 = ((kt0) obj).a;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    cs1.m0.a((Drawable) obj4, xq2Var2, 48);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                long j3 = ((kt0) obj).a;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z)) {
                    cs1 cs1Var = cs1.m0;
                    icon = ((RemoteAction) obj4).getIcon();
                    cs1Var.i(icon, xq2Var3, 48);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
