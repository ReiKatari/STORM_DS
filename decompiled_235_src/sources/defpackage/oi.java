package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi implements sk0 {
    public final /* synthetic */ int a;
    public final jr6 b;
    public final kf0 c;

    public oi(t57 t57Var, jr6 jr6Var, kf0 kf0Var, int i) {
        this.a = i;
        t57Var.getClass();
        kf0Var.getClass();
        switch (i) {
            case 1:
                this.b = jr6Var;
                this.c = kf0Var;
                return;
            default:
                this.b = jr6Var;
                this.c = kf0Var;
                return;
        }
    }

    @Override // defpackage.sk0
    public final rk0 a(bf0 bf0Var, Map map, yk0 yk0Var) {
        boolean Z;
        int i = this.a;
        zt1 zt1Var = zt1.A;
        jr6 jr6Var = this.b;
        kf0 kf0Var = this.c;
        switch (i) {
            case 0:
                d90 d90Var = d90.q0;
                bf0Var.getClass();
                map.getClass();
                yk0Var.getClass();
                ArrayList arrayList = kf0Var.d;
                if (arrayList != null) {
                    pp4 pp4Var = (pp4) gt0.b1(((y73) gt0.b1(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(pp4Var.a.getWidth(), pp4Var.a.getHeight(), pp4Var.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList2.add((Surface) entry.getValue());
                    }
                    if (!bf0Var.j0(inputConfiguration, arrayList2, yk0Var)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + bf0Var + " for " + yk0Var + '!');
                        yk0Var.a();
                        return d90Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry2 : map.entrySet()) {
                        arrayList3.add((Surface) entry2.getValue());
                    }
                    if (!bf0Var.N(arrayList3, yk0Var)) {
                        Log.w("CXCP", "Failed to create captures session from " + bf0Var + " for " + yk0Var + '!');
                        yk0Var.a();
                        return d90Var;
                    }
                }
                return new qk0(zt1Var, l.g(map, jr6Var));
            default:
                d90 d90Var2 = d90.q0;
                bf0Var.getClass();
                map.getClass();
                yk0Var.getClass();
                cp4 k = l.k(kf0Var, jr6Var, map);
                ArrayList arrayList4 = k.a;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + kf0Var);
                    yk0Var.a();
                    return d90Var2;
                }
                ArrayList arrayList5 = kf0Var.d;
                if (arrayList5 == null) {
                    Z = bf0Var.U(arrayList4, yk0Var);
                } else {
                    pp4 pp4Var2 = (pp4) gt0.b1(((y73) gt0.b1(arrayList5)).a.a);
                    Z = bf0Var.Z(new j63(pp4Var2.a.getWidth(), pp4Var2.a.getHeight(), pp4Var2.b), arrayList4, yk0Var);
                }
                if (!Z) {
                    Log.w("CXCP", "Failed to create capture session from " + bf0Var + " for " + yk0Var + '!');
                    yk0Var.a();
                    return d90Var2;
                }
                return new qk0(zt1Var, k.d);
        }
    }
}
