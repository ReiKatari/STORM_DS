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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gv0 implements c56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c56
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        vr4[] vr4VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                kv0 kv0Var = ((mv0) obj).e0;
                kv0Var.getClass();
                LinkedHashMap linkedHashMap = kv0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(kv0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(kv0Var.g));
                return bundle;
            case 1:
                Map d = ((r46) obj).d();
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
                jq jqVar = (jq) obj;
                do {
                } while (p.u(jqVar.t(), tt3.CREATED));
                jqVar.s0.f(st3.ON_STOP);
                return new Bundle();
            case 3:
                return ((u) obj).W();
            default:
                s9 s9Var = (s9) obj;
                for (Map.Entry entry2 : c14.s0((LinkedHashMap) s9Var.d).entrySet()) {
                    s9Var.G(((tp6) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : c14.s0((LinkedHashMap) s9Var.b).entrySet()) {
                    s9Var.G(((c56) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) s9Var.a;
                if (linkedHashMap2.isEmpty()) {
                    vr4VarArr = new vr4[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new vr4((String) entry4.getKey(), entry4.getValue()));
                    }
                    vr4VarArr = (vr4[]) arrayList2.toArray(new vr4[0]);
                }
                return jw2.l((vr4[]) Arrays.copyOf(vr4VarArr, vr4VarArr.length));
        }
    }
}
