package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg0  reason: default package */
/* loaded from: classes.dex */
public final class dg0 implements a43 {
    public final Context a;
    public final o71 b;
    public final Object c;
    public Map d;

    public dg0(Context context, o71 o71Var, Set set) {
        context.getClass();
        this.a = context;
        o71Var.getClass();
        this.b = o71Var;
        this.c = new Object();
        this.d = qp1.A;
        try {
            a(tq0.n1(set));
        } catch (hg0 e) {
            throw new Exception(e);
        }
    }

    @Override // defpackage.a43
    public final void a(List list) {
        Set n1;
        List<String> list2;
        e52 e52Var;
        synchronized (this.c) {
            Set keySet = this.d.keySet();
            keySet.getClass();
            if (keySet instanceof Collection) {
                n1 = keySet;
            } else {
                n1 = tq0.n1(keySet);
            }
            if (n1.isEmpty()) {
                list2 = tq0.n1(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!n1.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                list2 = arrayList;
            }
        }
        if (!list2.isEmpty() && ve2.D("CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + list2);
        }
        o71 o71Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!list2.isEmpty()) {
            try {
                for (String str : list2) {
                    tc0 a = o71Var.a();
                    od0.a(str);
                    ce0 b = tc0.b(a, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    af0 af0Var = new af0(b, new nf6((StreamConfigurationMap) ((ia0) b).c(key), new ig4(b)));
                    Context context = this.a;
                    oz1 oz1Var = new oz1(str, af0Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        ke0 ke0Var = (ke0) o71Var.a.R;
                        nk2.t(ke0Var);
                        e52Var = new os(b, ke0Var, af0Var, 17);
                    } else {
                        e52Var = e52.k;
                    }
                    linkedHashMap.put(str, new jj6(context, b, oz1Var, e52Var));
                }
            } catch (sh1 e) {
                throw new Exception("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new Exception("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.d.containsKey(str2)) {
                        Object obj2 = this.d.get(str2);
                        obj2.getClass();
                        linkedHashMap2.put(str2, obj2);
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.d = linkedHashMap2;
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
