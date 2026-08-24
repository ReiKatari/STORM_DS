package defpackage;

import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el2  reason: default package */
/* loaded from: classes.dex */
public final class el2 implements a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;

    public /* synthetic */ el2(u uVar, int i) {
        this.A = i;
        this.B = uVar;
    }

    @Override // defpackage.a9
    public final void a(Object obj) {
        int i;
        int i2 = this.A;
        u uVar = this.B;
        switch (i2) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((Boolean) arrayList.get(i3)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i3] = i;
                }
                il2 il2Var = (il2) uVar.F.pollFirst();
                if (il2Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = il2Var.A;
                int i4 = il2Var.B;
                o c = uVar.c.c(str);
                if (c == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                c.onRequestPermissionsResult(i4, strArr, iArr);
                return;
            case 1:
                z8 z8Var = (z8) obj;
                il2 il2Var2 = (il2) uVar.F.pollLast();
                if (il2Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = il2Var2.A;
                int i5 = il2Var2.B;
                o c2 = uVar.c.c(str2);
                if (c2 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                c2.onActivityResult(i5, z8Var.A, z8Var.B);
                return;
            default:
                z8 z8Var2 = (z8) obj;
                il2 il2Var3 = (il2) uVar.F.pollFirst();
                if (il2Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = il2Var3.A;
                int i6 = il2Var3.B;
                o c3 = uVar.c.c(str3);
                if (c3 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                c3.onActivityResult(i6, z8Var2.A, z8Var2.B);
                return;
        }
    }
}
