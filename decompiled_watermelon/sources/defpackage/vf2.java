package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vf2 implements wz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wz0
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Configuration configuration = (Configuration) obj;
                ((xp) obj2).q0.p();
                return;
            case 1:
                Intent intent = (Intent) obj;
                ((xp) obj2).q0.p();
                return;
            default:
                nx nxVar = (nx) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = nxVar.b - ((fx) entry.getKey()).f;
                    if (((fx) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = tw6.i(i2);
                    wj6 wj6Var = (wj6) entry.getValue();
                    wj6Var.getClass();
                    nk2.V(new tj6(wj6Var, i3, -1));
                }
                return;
        }
    }
}
