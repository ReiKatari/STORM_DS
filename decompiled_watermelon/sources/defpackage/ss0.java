package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.p;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ss0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ss0 implements wt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ss0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wt5
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        ti4[] ti4VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ws0 ws0Var = ((p) obj).d0;
                ws0Var.getClass();
                LinkedHashMap linkedHashMap = ws0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ws0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ws0Var.g));
                return bundle;
            case 1:
                Map d = ((mt5) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            case 2:
                xp xpVar = (xp) obj;
                do {
                } while (p.u(xpVar.t(), qm3.CREATED));
                xpVar.r0.f(pm3.ON_STOP);
                return new Bundle();
            case 3:
                return ((u) obj).W();
            default:
                r9 r9Var = (r9) obj;
                for (Map.Entry entry2 : zt3.r0((LinkedHashMap) r9Var.d).entrySet()) {
                    r9Var.G(((ee6) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : zt3.r0((LinkedHashMap) r9Var.b).entrySet()) {
                    r9Var.G(((wt5) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) r9Var.a;
                if (linkedHashMap2.isEmpty()) {
                    ti4VarArr = new ti4[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new ti4((String) entry4.getKey(), entry4.getValue()));
                    }
                    ti4VarArr = (ti4[]) arrayList2.toArray(new ti4[0]);
                }
                return dk7.k((ti4[]) Arrays.copyOf(ti4VarArr, ti4VarArr.length));
        }
    }
}
