package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y47  reason: default package */
/* loaded from: classes.dex */
public final class y47 {
    public final g57 a;
    public final in6 b;
    public final Object c;
    public gs0 d;
    public final cw e;
    public final xt f;
    public boolean g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public jb5 l;
    public ja m;
    public kb n;
    public gy o;
    public final u47 p;
    public final cw q;

    public y47(g57 g57Var, in6 in6Var) {
        g57Var.getClass();
        this.a = g57Var;
        this.b = in6Var;
        this.c = new Object();
        this.e = w81.f(0);
        this.f = new xt();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.p = new u47(this);
        this.q = w81.f(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k11 r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y47.a(k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(md0 md0Var, Map map) {
        Object obj;
        Integer num;
        ja jaVar;
        Object obj2;
        Integer num2;
        kb kbVar;
        Object obj3;
        Integer num3;
        boolean z;
        boolean z2;
        Object obj4;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        gy gyVar = null;
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            List list = ja.b;
            jaVar = dk7.u(intValue);
        } else {
            jaVar = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        if (map != null) {
            obj2 = map.get(key2);
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Integer) {
            num2 = (Integer) obj2;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            Iterator it = kb.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    if (((kb) obj4).a == intValue2) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            kbVar = (kb) obj4;
        } else {
            kbVar = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        if (map != null) {
            obj3 = map.get(key3);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof Integer) {
            num3 = (Integer) obj3;
        } else {
            num3 = null;
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            Iterator it2 = gy.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((gy) next).a == intValue3) {
                    gyVar = next;
                    break;
                }
            }
            gyVar = gyVar;
        }
        gy gyVar2 = gyVar;
        boolean z3 = false;
        if (jaVar != null && !jaVar.equals(this.m)) {
            z = true;
        } else {
            z = false;
        }
        if (kbVar != null && !kbVar.equals(this.n)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gyVar2 != null && !gyVar2.equals(this.o)) {
            z3 = true;
        }
        if (z || z2 || z3) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + jaVar + ", changed=" + z + "), AF(" + kbVar + ", changed=" + z2 + "), AWB(" + gyVar2 + ", changed=" + z3 + ')');
            }
            pc0.d(md0Var, jaVar, kbVar, gyVar2, null, null, null, 56);
            if (jaVar != null) {
                this.m = jaVar;
            }
            if (kbVar != null) {
                this.n = kbVar;
            }
            if (gyVar2 != null) {
                this.o = gyVar2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.LinkedHashMap r8, java.util.Map r9, java.util.Set r10, defpackage.jb5 r11, java.util.Set r12, defpackage.k11 r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y47.c(java.util.LinkedHashMap, java.util.Map, java.util.Set, jb5, java.util.Set, k11):java.lang.Object");
    }
}
