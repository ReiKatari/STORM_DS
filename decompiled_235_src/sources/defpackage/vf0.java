package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf0  reason: default package */
/* loaded from: classes.dex */
public final class vf0 implements ye0, AutoCloseable {
    public final jb4 A;
    public final gt2 B;
    public final t41 L;
    public final tf0 R;
    public final uf0 X;
    public final int Y;

    public vf0(jb4 jb4Var, gt2 gt2Var, t41 t41Var, km2 km2Var, tf0 tf0Var, uf0 uf0Var) {
        jb4Var.getClass();
        gt2Var.getClass();
        t41Var.getClass();
        km2Var.getClass();
        tf0Var.getClass();
        uf0Var.getClass();
        this.A = jb4Var;
        this.B = gt2Var;
        this.L = t41Var;
        this.R = tf0Var;
        this.X = uf0Var;
        uw uwVar = wf0.a;
        uwVar.getClass();
        this.Y = uw.b.incrementAndGet(uwVar);
    }

    public static tu0 k(vf0 vf0Var, long j, int i) {
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
        if (!vf0Var.A.a()) {
            t41 t41Var = vf0Var.L;
            Long l = new Long(j2);
            tu0 tu0Var = t41.o;
            gt2 gt2Var = t41Var.a;
            kg0 kg0Var = lg0.g;
            lg0 lg0Var = t41Var.b;
            kg0Var.getClass();
            if (!kg0.a(lg0Var)) {
                bool3 = null;
            } else {
                bool3 = bool5;
            }
            boolean z = false;
            if (!nb3.k(bool, bool5) && !nb3.k(bool3, bool5) && !nb3.k(bool2, bool5)) {
                return u24.b(new fm5(0, null));
            }
            if (gt2Var.b.k() == null) {
                return tu0Var;
            }
            if (nb3.k(bool3, bool5)) {
                Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
                Map map = t41.n;
                map.getClass();
                ft2 ft2Var = gt2Var.b;
                ft2Var.getClass();
                if (ft2Var.k() != null) {
                    z = ft2Var.Z.H(new zs2(map));
                } else {
                    i.m("Cannot submit parameters without an active repeating request!");
                }
                if (!z) {
                    Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                    return tu0Var;
                }
                ot2.b(t41Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
            }
            boolean k = nb3.k(bool, bool5);
            boolean k2 = nb3.k(bool3, bool5);
            boolean k3 = nb3.k(bool2, bool5);
            if (!k && !k2 && !k3) {
                obj = zt1.A;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (k) {
                    linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, t41.p);
                }
                if (k2) {
                    linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, t41.q);
                }
                if (k3) {
                    linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, t41.r);
                }
                obj = linkedHashMap;
            }
            gm5 gm5Var = new gm5(new bg2(obj, 29), 60, l);
            ox3 ox3Var = t41Var.d;
            ox3Var.getClass();
            ox3Var.A.add(gm5Var);
            if (nb3.k(bool, bool5)) {
                bool4 = Boolean.FALSE;
            } else {
                bool4 = null;
            }
            if (nb3.k(bool2, bool5)) {
                bool6 = Boolean.FALSE;
            }
            if (bool4 != null || bool6 != null) {
                Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool4 + ", awbLock=" + bool6);
                ot2.b(t41Var.c, null, null, null, null, null, null, null, bool4, null, bool6, 383);
            }
            gt2Var.e(t41Var.c.a());
            return gm5Var.R;
        }
        e41.g(vf0Var, " after close.", "Cannot call unlock3A on ");
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

    public final tu0 h() {
        oa oaVar = null;
        if (!this.A.a()) {
            t41 t41Var = this.L;
            oa oaVar2 = ((np6) t41Var.c.a.a).a;
            List list = oa.b;
            if ((oaVar2 == null || oaVar2.a != 1) && (oaVar2 == null || oaVar2.a != 0)) {
                oaVar = new oa(1);
            }
            return t41.a(t41Var, oaVar, null, null, new pd2(2), null, null, null, 118);
        }
        e41.g(this, " after close.", "Cannot call setTorchOn on ");
        return null;
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.Y;
    }
}
