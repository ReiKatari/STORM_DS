package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nq3  reason: default package */
/* loaded from: classes.dex */
public final class nq3 implements ra5, vm2 {
    public final CopyOnWriteArrayList A = new CopyOnWriteArrayList();

    @Override // defpackage.ra5
    public final void I(gb5 gb5Var, long j, ih ihVar) {
        gb5Var.getClass();
        e(gb5Var.x(), ihVar);
    }

    @Override // defpackage.vm2
    public final void a() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((mc5) it.next()).c();
        }
    }

    @Override // defpackage.vm2
    public final void b() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((mc5) it.next()).c();
        }
    }

    @Override // defpackage.vm2
    public final void c() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((mc5) it.next()).c();
        }
    }

    public final void e(long j, ih ihVar) {
        Integer num;
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            mc5 mc5Var = (mc5) it.next();
            mc5Var.getClass();
            ihVar.getClass();
            if (!mc5Var.R.a0() && !mc5Var.R.isCancelled()) {
                synchronized (mc5Var) {
                    hb5 hb5Var = mc5Var.Z;
                    if (hb5Var != null && j >= hb5Var.a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) ihVar.A.get(key);
                        long frameNumber = ihVar.A.getFrameNumber();
                        if (l != null && mc5Var.Y == null) {
                            mc5Var.Y = l;
                        }
                        Long l2 = mc5Var.Y;
                        if (mc5Var.L != null && l2 != null && l != null && l.longValue() - l2.longValue() > mc5Var.L.longValue()) {
                            mc5Var.R.c0(new lc5(2, ihVar));
                        } else {
                            if (mc5Var.X == null) {
                                mc5Var.X = new nh2(frameNumber);
                            }
                            nh2 nh2Var = mc5Var.X;
                            if (nh2Var != null && (num = mc5Var.B) != null && frameNumber - nh2Var.a > num.intValue()) {
                                mc5Var.R.c0(new lc5(1, ihVar));
                            } else if (((Boolean) mc5Var.A.n(ihVar)).booleanValue()) {
                                mc5Var.R.c0(new lc5(0, ihVar));
                            }
                        }
                    }
                }
            }
            this.A.remove(mc5Var);
        }
    }

    @Override // defpackage.ra5
    public final void i(gb5 gb5Var, long j, hh hhVar) {
        e(gb5Var.x(), (ih) hhVar.L);
    }

    @Override // defpackage.ra5
    public final void x(gb5 gb5Var) {
        gb5Var.getClass();
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            mc5 mc5Var = (mc5) it.next();
            long x = gb5Var.x();
            synchronized (mc5Var) {
                if (mc5Var.Z == null) {
                    mc5Var.Z = new hb5(x);
                }
            }
        }
    }
}
