package defpackage;

import android.os.Bundle;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ts0 implements oc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ ts0(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // defpackage.oc4
    public final void a(ys0 ys0Var) {
        int i = this.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                ys0Var.getClass();
                Bundle a = pVar.R.b.a("android:support:activity-result");
                if (a != null) {
                    ws0 ws0Var = pVar.d0;
                    LinkedHashMap linkedHashMap = ws0Var.b;
                    LinkedHashMap linkedHashMap2 = ws0Var.a;
                    Bundle bundle = ws0Var.g;
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ws0Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    l07.o(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            ws0Var.b.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                wf2 wf2Var = (wf2) ((xp) pVar).q0.B;
                wf2Var.R.b(wf2Var, wf2Var, null);
                return;
        }
    }
}
