package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi0  reason: default package */
/* loaded from: classes.dex */
public class vi0 {
    public static final vi0 a = new Object();

    public void a(zi7 zi7Var, dk0 dk0Var) {
        zi7Var.getClass();
        ek0 ek0Var = (ek0) zi7Var.b(zi7.H, null);
        go4 go4Var = go4.L;
        go4Var.getClass();
        xx xxVar = ek0.f;
        HashSet hashSet = new HashSet();
        da4 d = da4.d();
        ArrayList arrayList = new ArrayList();
        sa4 a2 = sa4.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        go4 a3 = go4.a(d);
        ArrayList arrayList3 = new ArrayList(arrayList);
        sy6 sy6Var = sy6.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a2.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new ek0(arrayList2, a3, -1, arrayList3, new sy6(arrayMap));
        if (ek0Var != null) {
            i = ek0Var.c;
            dk0Var.c(ek0Var.d);
            go4Var = ek0Var.b;
            ((sa4) dk0Var.Y).a.putAll((Map) ek0Var.e.a);
            List<ig1> unmodifiableList = Collections.unmodifiableList(ek0Var.a);
            unmodifiableList.getClass();
            for (ig1 ig1Var : unmodifiableList) {
                ((HashSet) dk0Var.R).add(ig1Var);
            }
        }
        dk0Var.X = da4.k(go4Var);
        new os0(zi7Var);
        Object b = zi7Var.b(kd0.Y, Integer.valueOf(i));
        b.getClass();
        dk0Var.L = ((Number) b).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) zi7Var.b(kd0.e0, null);
        if (captureCallback != null) {
            dk0Var.d(new ti0(captureCallback));
        }
        jd0 jd0Var = new jd0(2);
        zi7Var.h(new pk0(0, jd0Var, zi7Var));
        dk0Var.e(new os0(go4.a(jd0Var.B)));
    }
}
