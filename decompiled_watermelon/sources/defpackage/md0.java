package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md0  reason: default package */
/* loaded from: classes.dex */
public final class md0 implements pc0, AutoCloseable {
    public final d34 A;
    public final an2 B;
    public final l11 L;
    public final kd0 R;
    public final ld0 X;
    public final int Y;

    public md0(d34 d34Var, an2 an2Var, l11 l11Var, kh2 kh2Var, kd0 kd0Var, ld0 ld0Var) {
        d34Var.getClass();
        an2Var.getClass();
        l11Var.getClass();
        kh2Var.getClass();
        kd0Var.getClass();
        ld0Var.getClass();
        this.A = d34Var;
        this.B = an2Var;
        this.L = l11Var;
        this.R = kd0Var;
        this.X = ld0Var;
        cw cwVar = nd0.a;
        cwVar.getClass();
        this.Y = cw.b.incrementAndGet(cwVar);
    }

    public static gs0 p(md0 md0Var, long j, int i) {
        Boolean bool;
        Boolean bool2;
        long j2;
        Boolean bool3;
        Object obj;
        Boolean bool4;
        Boolean bool5 = Boolean.TRUE;
        Boolean bool6 = null;
        if ((i & 1) != 0) {
            bool = null;
        } else {
            bool = bool5;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        } else {
            bool2 = bool5;
        }
        if ((i & 32) != 0) {
            j2 = 3000000000L;
        } else {
            j2 = j;
        }
        if (!md0Var.A.a()) {
            l11 l11Var = md0Var.L;
            Long l = new Long(j2);
            gs0 gs0Var = l11.g;
            an2 an2Var = l11Var.a;
            be0 be0Var = ce0.g;
            ce0 ce0Var = l11Var.b;
            be0Var.getClass();
            if (!be0.a(ce0Var)) {
                bool3 = null;
            } else {
                bool3 = bool5;
            }
            boolean z = false;
            if (!b53.x(bool, bool5) && !b53.x(bool3, bool5) && !b53.x(bool2, bool5)) {
                return a53.d(new lc5(0, null));
            }
            if (an2Var.b.p() == null) {
                return gs0Var;
            }
            if (b53.x(bool3, bool5)) {
                Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
                Map map = l11.f;
                map.getClass();
                zm2 zm2Var = an2Var.b;
                zm2Var.getClass();
                if (zm2Var.p() != null) {
                    z = zm2Var.Z.H(new tm2(map));
                } else {
                    i.n("Cannot submit parameters without an active repeating request!");
                }
                if (!z) {
                    Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                    return gs0Var;
                }
                in2.b(l11Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
            }
            boolean x = b53.x(bool, bool5);
            boolean x2 = b53.x(bool3, bool5);
            boolean x3 = b53.x(bool2, bool5);
            if (!x && !x2 && !x3) {
                obj = qp1.A;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (x) {
                    linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, l11.h);
                }
                if (x2) {
                    linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, l11.i);
                }
                if (x3) {
                    linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, l11.j);
                }
                obj = linkedHashMap;
            }
            mc5 mc5Var = new mc5(new n95(1, obj), 60, l);
            nq3 nq3Var = l11Var.d;
            nq3Var.getClass();
            nq3Var.A.add(mc5Var);
            if (b53.x(bool, bool5)) {
                bool4 = Boolean.FALSE;
            } else {
                bool4 = null;
            }
            if (b53.x(bool2, bool5)) {
                bool6 = Boolean.FALSE;
            }
            if (bool4 != null || bool6 != null) {
                Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool4 + ", awbLock=" + bool6);
                in2.b(l11Var.c, null, null, null, null, null, null, null, bool4, null, bool6, 383);
            }
            an2Var.e(l11Var.c.a());
            return mc5Var.R;
        }
        i.m(md0Var, " after close.", "Cannot call unlock3A on ");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.R.a) {
        }
        synchronized (this.X.a) {
        }
        this.A.b();
    }

    public final gs0 i() {
        ja jaVar = null;
        if (!this.A.a()) {
            l11 l11Var = this.L;
            ja jaVar2 = ((yd6) l11Var.c.a.a).a;
            List list = ja.b;
            if ((jaVar2 == null || jaVar2.a != 1) && (jaVar2 == null || jaVar2.a != 0)) {
                jaVar = new ja(1);
            }
            return l11.a(l11Var, jaVar, null, null, new x82(2), null, null, null, 118);
        }
        i.m(this, " after close.", "Cannot call setTorchOn on ");
        return null;
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.Y;
    }
}
