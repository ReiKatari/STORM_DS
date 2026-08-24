package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ox3  reason: default package */
/* loaded from: classes.dex */
public final class ox3 implements jk5, bt2 {
    public final CopyOnWriteArrayList A = new CopyOnWriteArrayList();

    @Override // defpackage.jk5
    public final void D(yk5 yk5Var, long j, uh uhVar) {
        yk5Var.getClass();
        d(yk5Var.X(), uhVar);
    }

    @Override // defpackage.bt2
    public final void a() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gm5) it.next()).c();
        }
    }

    @Override // defpackage.bt2
    public final void b() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gm5) it.next()).c();
        }
    }

    @Override // defpackage.bt2
    public final void c() {
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gm5) it.next()).c();
        }
    }

    public final void d(long j, uh uhVar) {
        Integer num;
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            gm5 gm5Var = (gm5) it.next();
            gm5Var.getClass();
            uhVar.getClass();
            if (!gm5Var.R.W() && !gm5Var.R.isCancelled()) {
                synchronized (gm5Var) {
                    zk5 zk5Var = gm5Var.Z;
                    if (zk5Var != null && j >= zk5Var.a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) uhVar.A.get(key);
                        long frameNumber = uhVar.A.getFrameNumber();
                        if (l != null && gm5Var.Y == null) {
                            gm5Var.Y = l;
                        }
                        Long l2 = gm5Var.Y;
                        if (gm5Var.L != null && l2 != null && l != null && l.longValue() - l2.longValue() > gm5Var.L.longValue()) {
                            gm5Var.R.b0(new fm5(2, uhVar));
                        } else {
                            if (gm5Var.X == null) {
                                gm5Var.X = new nm2(frameNumber);
                            }
                            nm2 nm2Var = gm5Var.X;
                            if (nm2Var != null && (num = gm5Var.B) != null && frameNumber - nm2Var.a > num.intValue()) {
                                gm5Var.R.b0(new fm5(1, uhVar));
                            } else if (((Boolean) gm5Var.A.g(uhVar)).booleanValue()) {
                                gm5Var.R.b0(new fm5(0, uhVar));
                            }
                        }
                    }
                }
            }
            this.A.remove(gm5Var);
        }
    }

    @Override // defpackage.jk5
    public final void k(yk5 yk5Var) {
        yk5Var.getClass();
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            gm5 gm5Var = (gm5) it.next();
            long X = yk5Var.X();
            synchronized (gm5Var) {
                if (gm5Var.Z == null) {
                    gm5Var.Z = new zk5(X);
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void x(yk5 yk5Var, long j, th thVar) {
        d(yk5Var.X(), (uh) thVar.L);
    }
}
