package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mg0  reason: default package */
/* loaded from: classes.dex */
public class mg0 {
    public static final mg0 a = new Object();

    public void a(b57 b57Var, vh0 vh0Var) {
        b57Var.getClass();
        wh0 wh0Var = (wh0) b57Var.d(b57.G, null);
        ef4 ef4Var = ef4.L;
        ef4Var.getClass();
        uw uwVar = wh0.f;
        HashSet hashSet = new HashSet();
        x14 f = x14.f();
        ArrayList arrayList = new ArrayList();
        m24 a2 = m24.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        ef4 b = ef4.b(f);
        ArrayList arrayList3 = new ArrayList(arrayList);
        im6 im6Var = im6.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a2.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new wh0(arrayList2, b, -1, arrayList3, new im6(arrayMap));
        if (wh0Var != null) {
            i = wh0Var.c;
            vh0Var.b(wh0Var.d);
            ef4Var = wh0Var.b;
            ((m24) vh0Var.f).a.putAll((Map) wh0Var.e.a);
            List<hc1> unmodifiableList = Collections.unmodifiableList(wh0Var.a);
            unmodifiableList.getClass();
            for (hc1 hc1Var : unmodifiableList) {
                ((HashSet) vh0Var.d).add(hc1Var);
            }
        }
        vh0Var.e = x14.j(ef4Var);
        new bq0(b57Var);
        Object d = b57Var.d(cb0.Y, Integer.valueOf(i));
        d.getClass();
        vh0Var.c = ((Number) d).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) b57Var.d(cb0.d0, null);
        if (captureCallback != null) {
            vh0Var.c(new kg0(captureCallback));
        }
        bb0 bb0Var = new bb0(2);
        b57Var.k(new hi0(0, bb0Var, b57Var));
        vh0Var.d(new bq0(ef4.b(bb0Var.B)));
    }
}
