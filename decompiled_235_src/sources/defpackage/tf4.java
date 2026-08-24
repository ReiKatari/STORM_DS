package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tf4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ wf4 R;
    public final /* synthetic */ ApplicationInfo X;

    public /* synthetic */ tf4(boolean z, boolean z2, wf4 wf4Var, ApplicationInfo applicationInfo, int i) {
        this.A = i;
        this.B = z;
        this.L = z2;
        this.R = wf4Var;
        this.X = applicationInfo;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                List list = wf4.d0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(-131556235, new tf4(this.B, this.L, this.R, this.X, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                List list2 = wf4.d0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    final wf4 wf4Var = this.R;
                    boolean h = xq2Var2.h(wf4Var);
                    Object P = xq2Var2.P();
                    Object obj3 = ox0.a;
                    if (h || P == obj3) {
                        P = new er2(wf4Var, 10);
                        xq2Var2.l0(P);
                    }
                    on2 on2Var = (on2) P;
                    final boolean z3 = this.B;
                    boolean g = xq2Var2.g(z3);
                    final ApplicationInfo applicationInfo = this.X;
                    boolean h2 = g | xq2Var2.h(applicationInfo) | xq2Var2.h(wf4Var);
                    final boolean z4 = this.L;
                    boolean g2 = xq2Var2.g(z4) | h2;
                    Object P2 = xq2Var2.P();
                    if (g2 || P2 == obj3) {
                        P2 = new on2() { // from class: uf4
                            @Override // defpackage.on2
                            public final Object c() {
                                ApplicationInfo applicationInfo2;
                                List list3 = wf4.d0;
                                boolean z5 = z3;
                                wf4 wf4Var2 = wf4Var;
                                if (z5 && (applicationInfo2 = applicationInfo) != null) {
                                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.setData(Uri.fromParts("package", applicationInfo2.packageName, null));
                                    wf4Var2.startActivity(intent);
                                } else if (!z4) {
                                    wf4Var2.Z.a(null);
                                }
                                return jg7.a;
                            }
                        };
                        xq2Var2.l0(P2);
                    }
                    f04.j(z3, z4, on2Var, (on2) P2, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
