package defpackage;

import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fg2  reason: default package */
/* loaded from: classes.dex */
public final class fg2 implements z8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;

    public /* synthetic */ fg2(u uVar, int i) {
        this.A = i;
        this.B = uVar;
    }

    @Override // defpackage.z8
    public final void b(Object obj) {
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
                jg2 jg2Var = (jg2) uVar.F.pollFirst();
                if (jg2Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = jg2Var.A;
                int i4 = jg2Var.B;
                o c = uVar.c.c(str);
                if (c == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                c.onRequestPermissionsResult(i4, strArr, iArr);
                return;
            case 1:
                y8 y8Var = (y8) obj;
                jg2 jg2Var2 = (jg2) uVar.F.pollLast();
                if (jg2Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = jg2Var2.A;
                int i5 = jg2Var2.B;
                o c2 = uVar.c.c(str2);
                if (c2 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                c2.onActivityResult(i5, y8Var.A, y8Var.B);
                return;
            default:
                y8 y8Var2 = (y8) obj;
                jg2 jg2Var3 = (jg2) uVar.F.pollFirst();
                if (jg2Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = jg2Var3.A;
                int i6 = jg2Var3.B;
                o c3 = uVar.c.c(str3);
                if (c3 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                c3.onActivityResult(i6, y8Var2.A, y8Var2.B);
                return;
        }
    }
}
