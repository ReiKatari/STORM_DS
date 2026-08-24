package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hv0 implements ml4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv0 b;

    public /* synthetic */ hv0(mv0 mv0Var, int i) {
        this.a = i;
        this.b = mv0Var;
    }

    @Override // defpackage.ml4
    public final void a(mv0 mv0Var) {
        int i = this.a;
        mv0 mv0Var2 = this.b;
        switch (i) {
            case 0:
                mv0Var.getClass();
                Bundle a = mv0Var2.R.b.a("android:support:activity-result");
                if (a != null) {
                    kv0 kv0Var = mv0Var2.e0;
                    LinkedHashMap linkedHashMap = kv0Var.b;
                    LinkedHashMap linkedHashMap2 = kv0Var.a;
                    Bundle bundle = kv0Var.g;
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            kv0Var.d.addAll(stringArrayList2);
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
                                    ge7.n(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            kv0Var.b.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vk2 vk2Var = (vk2) ((jq) mv0Var2).r0.B;
                vk2Var.R.b(vk2Var, vk2Var, null);
                return;
        }
    }
}
