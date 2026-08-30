package b4;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements q7.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1953b;

    public /* synthetic */ v1(int i2, Object obj) {
        this.f1952a = i2;
        this.f1953b = obj;
    }

    @Override // q7.c
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        yb.j[] jVarArr;
        switch (this.f1952a) {
            case 0:
                Map c4 = ((y2.g) this.f1953b).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c4.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                }
                return bundle;
            case DSiCameraSource.FrontCamera /* 1 */:
                Bundle bundle2 = new Bundle();
                d.j jVar = ((androidx.fragment.app.o0) this.f1953b).f3294c0;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f5826b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f5828d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f5831g));
                return bundle2;
            default:
                a7.v vVar = (a7.v) this.f1953b;
                for (Map.Entry entry2 : zb.v.I((LinkedHashMap) vVar.R).entrySet()) {
                    vVar.w(((cd.q1) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : zb.v.I((LinkedHashMap) vVar.B).entrySet()) {
                    vVar.w(((q7.c) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) vVar.A;
                if (linkedHashMap2.isEmpty()) {
                    jVarArr = new yb.j[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new yb.j((String) entry4.getKey(), entry4.getValue()));
                    }
                    jVarArr = (yb.j[]) arrayList2.toArray(new yb.j[0]);
                }
                return zb.k.b((yb.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        }
    }
}
