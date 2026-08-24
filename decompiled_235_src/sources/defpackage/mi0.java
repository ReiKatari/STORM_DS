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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi0  reason: default package */
/* loaded from: classes.dex */
public final class mi0 implements ia3 {
    public final Context a;
    public final eb1 b;
    public final Object c;
    public Map d;

    public mi0(Context context, eb1 eb1Var, Set set) {
        context.getClass();
        this.a = context;
        eb1Var.getClass();
        this.b = eb1Var;
        this.c = new Object();
        this.d = zt1.A;
        try {
            a(gt0.k1(set));
        } catch (qi0 e) {
            throw new Exception(e);
        }
    }

    @Override // defpackage.ia3
    public final void a(List list) {
        Set k1;
        List<String> list2;
        x92 x92Var;
        synchronized (this.c) {
            Set keySet = this.d.keySet();
            keySet.getClass();
            if (keySet instanceof Collection) {
                k1 = keySet;
            } else {
                k1 = gt0.k1(keySet);
            }
            if (k1.isEmpty()) {
                list2 = gt0.k1(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!k1.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                list2 = arrayList;
            }
        }
        if (!list2.isEmpty() && kj2.F("CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + list2);
        }
        eb1 eb1Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!list2.isEmpty()) {
            try {
                for (String str : list2) {
                    cf0 a = eb1Var.a();
                    xf0.a(str);
                    lg0 b = cf0.b(a, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    jh0 jh0Var = new jh0(b, new dr6((StreamConfigurationMap) ((qc0) b).c(key), new lp4(b)));
                    Context context = this.a;
                    b42 b42Var = new b42(str, jh0Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        tg0 tg0Var = (tg0) eb1Var.a.R;
                        mp2.o(tg0Var);
                        x92Var = new bt(b, tg0Var, jh0Var, 23);
                    } else {
                        x92Var = x92.k;
                    }
                    linkedHashMap.put(str, new dv6(context, b, b42Var, x92Var));
                }
            } catch (xl1 e) {
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
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
