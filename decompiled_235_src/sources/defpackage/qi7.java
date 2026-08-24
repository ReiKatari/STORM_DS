package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi7  reason: default package */
/* loaded from: classes.dex */
public final class qi7 extends hw6 implements qn2 {
    public int X;
    public final /* synthetic */ LinkedHashSet Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ri7 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi7(LinkedHashSet linkedHashSet, boolean z, ri7 ri7Var, r41 r41Var) {
        super(1, r41Var);
        this.Y = linkedHashSet;
        this.Z = z;
        this.d0 = ri7Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z = this.Z;
        ri7 ri7Var = this.d0;
        return new qi7(this.Y, z, ri7Var, (r41) obj).s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ri7 ri7Var = this.d0;
        LinkedHashMap linkedHashMap = ri7Var.k;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        rc6 rc6Var = null;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        tc6 tc6Var = new tc6(this.Y, this.Z);
        if (((pc6) tc6Var.e.getValue()).c()) {
            rc6Var = (rc6) tc6Var.f.getValue();
        }
        if (rc6Var == null) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Using default SessionConfig");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            da4 d = da4.d();
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = sa4.a().a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            go4 a = go4.a(d);
            ArrayList arrayList10 = new ArrayList(arrayList);
            sy6 sy6Var = sy6.b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str : arrayMap.keySet()) {
                arrayMap2.put(str, arrayMap.get(str));
                arrayList6 = arrayList6;
            }
            rc6Var = new rc6(arrayList5, arrayList6, arrayList7, arrayList8, new ek0(arrayList9, a, 1, arrayList10, new sy6(arrayMap2)), null, null, 0, null);
        }
        ek0 ek0Var = rc6Var.g;
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        ki7 ki7Var = ki7.SESSION_CONFIG;
        tu0 tu0Var = ri7.l;
        s37 s37Var = ri7Var.e.e;
        char c = 0;
        jd0 jd0Var = new jd0(0);
        if (!ek0Var.a().equals(yy.h)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            key.getClass();
            Range a2 = ek0Var.a();
            jd0Var.B.m(nw7.T(key), a2);
        }
        jd0Var.b(ek0Var.b);
        sy6 sy6Var2 = ek0Var.e;
        sy6Var2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = sy6Var2.a;
        Set<String> keySet = arrayMap3.keySet();
        keySet.getClass();
        for (String str2 : keySet) {
            char c2 = c;
            Object obj2 = arrayMap3.get(str2);
            obj2.getClass();
            linkedHashMap2.put(str2, obj2);
            c = c2;
        }
        char c3 = c;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        s37Var.getClass();
        List<be0> list = ek0Var.d;
        list.getClass();
        ae0 ae0Var = new ae0();
        for (be0 be0Var : list) {
            be0Var.getClass();
            s37Var.getClass();
            if (!ae0Var.L.containsKey(be0Var)) {
                synchronized (ae0Var.A) {
                    ae0Var.A.put(be0Var, s37Var);
                    ae0Var.L = c14.s0(ae0Var.A);
                }
            } else {
                throw new IllegalStateException((be0Var + " was already registered!").toString());
            }
        }
        jk5[] jk5VarArr = new jk5[1];
        jk5VarArr[c3] = ae0Var;
        linkedHashMap.put(ki7Var, new ni7(jd0Var, linkedHashMap3, ii2.G(jk5VarArr), new bl5(ek0Var.c)));
        ej7 ej7Var = ri7Var.c;
        List unmodifiableList = Collections.unmodifiableList(ek0Var.a);
        unmodifiableList.getClass();
        LinkedHashSet b = ej7Var.b(unmodifiableList);
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
        }
        ni7 l = ri7.l(linkedHashMap);
        this.X = 1;
        Object n = ri7Var.n(l, b, this);
        if (n == x61Var) {
            return x61Var;
        }
        return n;
    }
}
