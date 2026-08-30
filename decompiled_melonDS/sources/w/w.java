package w;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final l0.h f14058a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.d f14059b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.lifecycle.x0 f14060c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f14061d;

    /* renamed from: e  reason: collision with root package name */
    public final v f14062e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f14063f;

    public w(x xVar, l0.h hVar, l0.d dVar, long j2) {
        this.f14063f = xVar;
        this.f14058a = hVar;
        this.f14059b = dVar;
        this.f14062e = new v(this, j2);
    }

    public final boolean a() {
        if (this.f14061d == null) {
            return false;
        }
        this.f14063f.v("Cancelling scheduled re-open: " + this.f14060c, null);
        this.f14060c.B = true;
        this.f14060c = null;
        this.f14061d.cancel(false);
        this.f14061d = null;
        return true;
    }

    public final void b() {
        boolean z10;
        boolean z11 = true;
        if (this.f14060c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o(null, z10);
        if (this.f14061d != null) {
            z11 = false;
        }
        p7.m.o(null, z11);
        v vVar = this.f14062e;
        vVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (vVar.f14056b == -1) {
            vVar.f14056b = uptimeMillis;
        }
        int i2 = ((uptimeMillis - vVar.f14056b) > vVar.b() ? 1 : ((uptimeMillis - vVar.f14056b) == vVar.b() ? 0 : -1));
        x xVar = this.f14063f;
        if (i2 >= 0) {
            vVar.f14056b = -1L;
            aj.g.s("Camera2CameraImpl", "Camera reopening attempted for " + vVar.b() + "ms without success.");
            xVar.G(u.PENDING_OPEN, null, false);
            return;
        }
        this.f14060c = new androidx.lifecycle.x0(this, this.f14058a);
        xVar.v("Attempting camera re-open in " + vVar.a() + "ms: " + this.f14060c + " activeResuming = " + xVar.B0, null);
        this.f14061d = this.f14059b.schedule(this.f14060c, (long) vVar.a(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        x xVar = this.f14063f;
        if (xVar.B0) {
            int i2 = xVar.f14068f0;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        boolean z10;
        this.f14063f.v("CameraDevice.onClosed()", null);
        if (this.f14063f.f14067e0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o("Unexpected onClose callback on camera device: " + cameraDevice, z10);
        int ordinal = this.f14063f.X.ordinal();
        if (ordinal != 1 && ordinal != 5) {
            if (ordinal != 6 && ordinal != 7) {
                a0.j.g(this.f14063f.X, "Camera closed while in state: ");
                return;
            }
            x xVar = this.f14063f;
            int i2 = xVar.f14068f0;
            if (i2 != 0) {
                xVar.v("Camera closed due to error: ".concat(x.x(i2)), null);
                b();
                return;
            }
            xVar.K(false);
            return;
        }
        p7.m.o(null, this.f14063f.f14073k0.isEmpty());
        this.f14063f.t();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f14063f.v("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i2) {
        boolean z10;
        int i10;
        x xVar = this.f14063f;
        xVar.f14067e0 = cameraDevice;
        xVar.f14068f0 = i2;
        p1.a0 a0Var = xVar.F0;
        ((x) a0Var.L).v("Camera receive onErrorCallback", null);
        a0Var.r();
        int ordinal = this.f14063f.X.ordinal();
        if (ordinal != 1) {
            switch (ordinal) {
                case l1.c.f8511g /* 5 */:
                    break;
                case l1.c.f8509e /* 6 */:
                case 7:
                case 8:
                case l1.c.f8508d /* 9 */:
                case l1.c.f8510f /* 10 */:
                    String id2 = cameraDevice.getId();
                    String x9 = x.x(i2);
                    String name = this.f14063f.X.name();
                    StringBuilder k10 = kc.a.k("CameraDevice.onError(): ", id2, " failed with ", x9, " while in ");
                    k10.append(name);
                    k10.append(" state. Will attempt recovering from error.");
                    aj.g.o("Camera2CameraImpl", k10.toString());
                    boolean z11 = false;
                    if (this.f14063f.X != u.OPENING && this.f14063f.X != u.OPENED && this.f14063f.X != u.CONFIGURED && this.f14063f.X != u.REOPENING && this.f14063f.X != u.REOPENING_QUIRK) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    p7.m.o("Attempt to handle open error from non open state: " + this.f14063f.X, z10);
                    int i11 = 3;
                    if (i2 != 1 && i2 != 2 && i2 != 4) {
                        aj.g.s("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + x.x(i2) + " closing camera.");
                        if (i2 == 3) {
                            i10 = 5;
                        } else {
                            i10 = 6;
                        }
                        this.f14063f.G(u.CLOSING, new d0.f(i10, null), true);
                        this.f14063f.s();
                        return;
                    }
                    aj.g.o("Camera2CameraImpl", "Attempt to reopen camera[" + cameraDevice.getId() + "] after error[" + x.x(i2) + "]");
                    x xVar2 = this.f14063f;
                    if (xVar2.f14068f0 != 0) {
                        z11 = true;
                    }
                    p7.m.o("Can only reopen camera device after error if the camera device is actually in an error state.", z11);
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i11 = 1;
                        }
                    } else {
                        i11 = 2;
                    }
                    xVar2.G(u.REOPENING, new d0.f(i11, null), true);
                    xVar2.s();
                    return;
                default:
                    a0.j.g(this.f14063f.X, "onError() should not be possible from state: ");
                    return;
            }
        }
        String id3 = cameraDevice.getId();
        String x10 = x.x(i2);
        String name2 = this.f14063f.X.name();
        StringBuilder k11 = kc.a.k("CameraDevice.onError(): ", id3, " failed with ", x10, " while in ");
        k11.append(name2);
        k11.append(" state. Will finish closing camera.");
        aj.g.s("Camera2CameraImpl", k11.toString());
        this.f14063f.s();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f14063f.v("CameraDevice.onOpened()", null);
        x xVar = this.f14063f;
        xVar.f14067e0 = cameraDevice;
        xVar.f14068f0 = 0;
        this.f14062e.f14056b = -1L;
        int ordinal = xVar.X.ordinal();
        if (ordinal != 1 && ordinal != 5) {
            if (ordinal != 6 && ordinal != 7 && ordinal != 8) {
                a0.j.g(this.f14063f.X, "onOpened() should not be possible from state: ");
                return;
            }
            this.f14063f.F(u.OPENED);
            j0.l0 l0Var = this.f14063f.f14077o0;
            String id2 = cameraDevice.getId();
            x xVar2 = this.f14063f;
            if (l0Var.e(id2, xVar2.f14076n0.c(xVar2.f14067e0.getId()))) {
                this.f14063f.D();
                return;
            }
            return;
        }
        p7.m.o(null, this.f14063f.f14073k0.isEmpty());
        this.f14063f.f14067e0.close();
        this.f14063f.f14067e0 = null;
    }
}
