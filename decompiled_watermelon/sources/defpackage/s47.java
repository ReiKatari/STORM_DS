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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s47  reason: default package */
/* loaded from: classes.dex */
public final class s47 extends nk6 implements mi2 {
    public int X;
    public final /* synthetic */ LinkedHashSet Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ t47 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s47(LinkedHashSet linkedHashSet, boolean z, t47 t47Var, j11 j11Var) {
        super(1, j11Var);
        this.Y = linkedHashSet;
        this.Z = z;
        this.c0 = t47Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z = this.Z;
        t47 t47Var = this.c0;
        return new s47(this.Y, z, t47Var, (j11) obj).v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        t47 t47Var = this.c0;
        LinkedHashMap linkedHashMap = t47Var.k;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        d16 d16Var = null;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return obj;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        f16 f16Var = new f16(this.Y, this.Z);
        if (((b16) f16Var.e.getValue()).c()) {
            d16Var = (d16) f16Var.f.getValue();
        }
        if (d16Var == null) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Using default SessionConfig");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            x14 f = x14.f();
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = m24.a().a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            ef4 b = ef4.b(f);
            ArrayList arrayList10 = new ArrayList(arrayList);
            im6 im6Var = im6.b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str : arrayMap.keySet()) {
                arrayMap2.put(str, arrayMap.get(str));
                arrayList6 = arrayList6;
            }
            d16Var = new d16(arrayList5, arrayList6, arrayList7, arrayList8, new wh0(arrayList9, b, 1, arrayList10, new im6(arrayMap2)), null, null, 0, null);
        }
        wh0 wh0Var = d16Var.g;
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        m47 m47Var = m47.SESSION_CONFIG;
        gs0 gs0Var = t47.l;
        dr6 dr6Var = t47Var.e.e;
        char c = 0;
        bb0 bb0Var = new bb0(0);
        if (!wh0Var.a().equals(jx.h)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            key.getClass();
            Range a = wh0Var.a();
            bb0Var.B.r(dt3.a0(key), a);
        }
        bb0Var.c(wh0Var.b);
        im6 im6Var2 = wh0Var.e;
        im6Var2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = im6Var2.a;
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
        dr6Var.getClass();
        List<sb0> list = wh0Var.d;
        list.getClass();
        rb0 rb0Var = new rb0();
        for (sb0 sb0Var : list) {
            sb0Var.getClass();
            dr6Var.getClass();
            if (!rb0Var.L.containsKey(sb0Var)) {
                synchronized (rb0Var.A) {
                    rb0Var.A.put(sb0Var, dr6Var);
                    rb0Var.L = zt3.r0(rb0Var.A);
                }
            } else {
                throw new IllegalStateException((sb0Var + " was already registered!").toString());
            }
        }
        ra5[] ra5VarArr = new ra5[1];
        ra5VarArr[c3] = rb0Var;
        linkedHashMap.put(m47Var, new p47(bb0Var, linkedHashMap3, hi2.J(ra5VarArr), new jb5(wh0Var.c)));
        g57 g57Var = t47Var.c;
        List unmodifiableList = Collections.unmodifiableList(wh0Var.a);
        unmodifiableList.getClass();
        LinkedHashSet b2 = g57Var.b(unmodifiableList);
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
        }
        p47 l = t47.l(linkedHashMap);
        this.X = 1;
        Object n = t47Var.n(l, b2, this);
        if (n == p31Var) {
            return p31Var;
        }
        return n;
    }
}
