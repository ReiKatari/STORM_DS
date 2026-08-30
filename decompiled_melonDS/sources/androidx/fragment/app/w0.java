package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 implements h.b {
    public final /* synthetic */ int A;
    public final /* synthetic */ g1 B;

    public /* synthetic */ w0(g1 g1Var, int i2) {
        this.A = i2;
        this.B = g1Var;
    }

    @Override // h.b
    public final void a(Object obj) {
        int i2;
        switch (this.A) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Boolean) arrayList.get(i10)).booleanValue()) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    iArr[i10] = i2;
                }
                g1 g1Var = this.B;
                c1 c1Var = (c1) g1Var.F.pollFirst();
                if (c1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = c1Var.A;
                int i11 = c1Var.B;
                j0 c4 = g1Var.f1312c.c(str);
                if (c4 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                c4.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                h.a aVar = (h.a) obj;
                g1 g1Var2 = this.B;
                c1 c1Var2 = (c1) g1Var2.F.pollLast();
                if (c1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = c1Var2.A;
                int i12 = c1Var2.B;
                j0 c10 = g1Var2.f1312c.c(str2);
                if (c10 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                c10.onActivityResult(i12, aVar.A, aVar.B);
                return;
            default:
                h.a aVar2 = (h.a) obj;
                g1 g1Var3 = this.B;
                c1 c1Var3 = (c1) g1Var3.F.pollFirst();
                if (c1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = c1Var3.A;
                int i13 = c1Var3.B;
                j0 c11 = g1Var3.f1312c.c(str3);
                if (c11 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                c11.onActivityResult(i13, aVar2.A, aVar2.B);
                return;
        }
    }
}
