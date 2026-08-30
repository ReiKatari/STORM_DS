package w;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import j0.h2;
import j0.l2;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f13876a = new Object();

    public void a(l2 l2Var, d0.i1 i1Var) {
        j0.p0 p0Var = (j0.p0) l2Var.h(l2.D, null);
        j0.i1 i1Var2 = j0.i1.L;
        j0.g gVar = j0.p0.f7271h;
        HashSet hashSet = new HashSet();
        j0.g1 b10 = j0.g1.b();
        ArrayList arrayList = new ArrayList();
        j0.h1 a10 = j0.h1.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        j0.i1 a11 = j0.i1.a(b10);
        ArrayList arrayList3 = new ArrayList(arrayList);
        h2 h2Var = h2.f7211b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a10.f7212a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i2 = -1;
        new j0.p0(arrayList2, a11, -1, arrayList3, false, new h2(arrayMap), null);
        if (p0Var != null) {
            i2 = p0Var.f7276c;
            i1Var.d(p0Var.f7277d);
            i1Var2 = p0Var.f7275b;
        }
        i1Var.R = j0.g1.c(i1Var2);
        i1Var.A = ((Integer) l2Var.h(v.a.L, Integer.valueOf(i2))).intValue();
        i1Var.g(new l0((CameraCaptureSession.CaptureCallback) l2Var.h(v.a.Z, new CameraCaptureSession.CaptureCallback())));
        i1Var.i(c0.f.c(l2Var).b());
    }
}
