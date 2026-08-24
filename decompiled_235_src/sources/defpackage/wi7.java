package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi7  reason: default package */
/* loaded from: classes.dex */
public final class wi7 {
    public final ej7 a;
    public final tz6 b;
    public final Object c;
    public tu0 d;
    public final uw e;
    public final pu f;
    public boolean g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public bl5 l;
    public oa m;
    public qb n;
    public xz o;
    public final si7 p;
    public final uw q;

    public wi7(ej7 ej7Var, tz6 tz6Var) {
        ej7Var.getClass();
        this.a = ej7Var;
        this.b = tz6Var;
        this.c = new Object();
        this.e = g04.t(0);
        this.f = new pu();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.p = new si7(this);
        this.q = g04.t(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        ui7 ui7Var;
        int i;
        dh5 dh5Var;
        tu0 tu0Var;
        kk5 kk5Var;
        tu0 tu0Var2;
        int incrementAndGet;
        if (s41Var instanceof ui7) {
            ui7Var = (ui7) s41Var;
            int i2 = ui7Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ui7Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ui7Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ui7Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        dh5Var = ui7Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (CancellationException e) {
                            e = e;
                            if (kj2.F("CXCP")) {
                            }
                            synchronized (this.c) {
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    try {
                        sf0 a = this.a.a();
                        ui7Var.R = obj2;
                        ui7Var.Z = 1;
                        obj = a.h(ui7Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                        dh5Var = obj2;
                    } catch (CancellationException e2) {
                        e = e2;
                        dh5Var = obj2;
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "Cannot acquire session at " + this, e);
                        }
                        synchronized (this.c) {
                            if (this.g) {
                                this.g = false;
                                dh5Var.A = this.d;
                                this.d = null;
                            }
                        }
                        tu0Var = (tu0) dh5Var.A;
                        if (tu0Var != null) {
                        }
                        return jg7.a;
                    }
                }
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                vf0 vf0Var = (vf0) autoCloseable;
                synchronized (this.c) {
                    if (this.j.isEmpty()) {
                        kk5Var = null;
                    } else {
                        bl5 bl5Var = this.l;
                        List k1 = gt0.k1(this.j);
                        LinkedHashMap o0 = c14.o0(this.b.b(this.l), c14.s0(this.h));
                        LinkedHashMap t0 = c14.t0(this.i);
                        k54 k54Var = uy6.b;
                        uw uwVar = this.e;
                        uwVar.getClass();
                        t0.put(k54Var, new Integer(uw.b.incrementAndGet(uwVar)));
                        ArrayList m1 = gt0.m1(this.k);
                        m1.add(this.p);
                        kk5Var = new kk5(k1, o0, t0, m1, bl5Var, 32);
                    }
                    tu0Var2 = this.d;
                    this.g = false;
                    this.d = null;
                }
                if (kk5Var == null) {
                    if (!vf0Var.A.a()) {
                        vf0Var.B.d(null);
                    } else {
                        e41.g(vf0Var, " after close.", "Cannot call stopRepeating on ");
                    }
                    dh5Var.A = tu0Var2;
                } else {
                    if (tu0Var2 != null) {
                        synchronized (this.c) {
                            this.f.addLast(new ti7(this.e.a, tu0Var2));
                            uw uwVar2 = this.q;
                            uwVar2.getClass();
                            incrementAndGet = uw.b.incrementAndGet(uwVar2);
                        }
                        vy7.P(incrementAndGet);
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Update RepeatingRequest: " + kk5Var);
                    }
                    vf0Var.getClass();
                    kk5Var.getClass();
                    if (!vf0Var.A.a()) {
                        vf0Var.B.d(kk5Var);
                    } else {
                        e41.g(vf0Var, " after close.", "Cannot call startRepeating on ");
                    }
                    b(vf0Var, kk5Var.b);
                }
                lb4.p(autoCloseable, null);
                tu0Var = (tu0) dh5Var.A;
                if (tu0Var != null) {
                    tu0Var.b0(jg7.a);
                }
                return jg7.a;
            }
        }
        ui7Var = new ui7(this, s41Var);
        Object obj3 = ui7Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ui7Var.Z;
        if (i == 0) {
        }
        AutoCloseable autoCloseable2 = (AutoCloseable) obj3;
        vf0 vf0Var2 = (vf0) autoCloseable2;
        synchronized (this.c) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(vf0 vf0Var, Map map) {
        Object obj;
        Integer num;
        oa oaVar;
        Object obj2;
        Integer num2;
        qb qbVar;
        Object obj3;
        Integer num3;
        boolean z;
        boolean z2;
        Object obj4;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        xz xzVar = null;
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
            List list = oa.b;
            oaVar = nc1.N(intValue);
        } else {
            oaVar = null;
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
            Iterator it = qb.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    if (((qb) obj4).a == intValue2) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            qbVar = (qb) obj4;
        } else {
            qbVar = null;
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
            Iterator it2 = xz.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((xz) next).a == intValue3) {
                    xzVar = next;
                    break;
                }
            }
            xzVar = xzVar;
        }
        xz xzVar2 = xzVar;
        boolean z3 = false;
        if (oaVar != null && !oaVar.equals(this.m)) {
            z = true;
        } else {
            z = false;
        }
        if (qbVar != null && !qbVar.equals(this.n)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xzVar2 != null && !xzVar2.equals(this.o)) {
            z3 = true;
        }
        if (z || z2 || z3) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + oaVar + ", changed=" + z + "), AF(" + qbVar + ", changed=" + z2 + "), AWB(" + xzVar2 + ", changed=" + z3 + ')');
            }
            ye0.e(vf0Var, oaVar, qbVar, xzVar2, null, null, null, 56);
            if (oaVar != null) {
                this.m = oaVar;
            }
            if (qbVar != null) {
                this.n = qbVar;
            }
            if (xzVar2 != null) {
                this.o = xzVar2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Type inference failed for: r13v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LinkedHashMap linkedHashMap, Map map, Set set, bl5 bl5Var, Set set2, s41 s41Var) {
        vi7 vi7Var;
        int i;
        dh5 dh5Var;
        if (s41Var instanceof vi7) {
            vi7Var = (vi7) s41Var;
            int i2 = vi7Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vi7Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = vi7Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = vi7Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        dh5Var = vi7Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj3 = new Object();
                    synchronized (this.c) {
                        try {
                            if (kj2.F("CXCP")) {
                                Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + bl5Var);
                            }
                            if (linkedHashMap != null) {
                                this.h.clear();
                                this.h.putAll(linkedHashMap);
                            }
                            if (map != null) {
                                this.i.clear();
                                this.i.putAll(map);
                            }
                            if (set != null) {
                                this.j.clear();
                                this.j.addAll(set);
                            }
                            if (bl5Var != null) {
                                this.l = bl5Var;
                            }
                            if (set2 != null) {
                                this.k.clear();
                                this.k.addAll(set2);
                            }
                            if (this.d == null) {
                                this.d = new tu0();
                            }
                            if (this.g) {
                                tu0 tu0Var = this.d;
                                tu0Var.getClass();
                                return tu0Var;
                            }
                            this.g = true;
                            tu0 tu0Var2 = this.d;
                            tu0Var2.getClass();
                            obj3.A = tu0Var2;
                            vi7Var.R = obj3;
                            vi7Var.Z = 1;
                            if (a(vi7Var) == obj2) {
                                return obj2;
                            }
                            dh5Var = obj3;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return dh5Var.A;
            }
        }
        vi7Var = new vi7(this, s41Var);
        Object obj4 = vi7Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = vi7Var.Z;
        if (i == 0) {
        }
        return dh5Var.A;
    }
}
