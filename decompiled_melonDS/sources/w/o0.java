package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends c1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14005a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14006b;

    public o0(int i2, List list) {
        Object g0Var;
        this.f14005a = i2;
        switch (i2) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f14006b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    g0Var = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    g0Var = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    g0Var = new g0(list);
                }
                this.f14006b = g0Var;
                return;
        }
    }

    @Override // w.c1
    public void a(g1 g1Var) {
        switch (this.f14005a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onActive((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).a(g1Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.c1
    public void b(g1 g1Var) {
        switch (this.f14005a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onCaptureQueueEmpty((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).b(g1Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.c1
    public void c(g1 g1Var) {
        switch (this.f14005a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onClosed((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).c(g1Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.c1
    public final void d(g1 g1Var) {
        switch (this.f14005a) {
            case 0:
                synchronized (((p0) this.f14006b).f14010a) {
                    try {
                        switch (((p0) this.f14006b).f14019j.ordinal()) {
                            case 0:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((p0) this.f14006b).f14019j);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                aj.g.o("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                            case 4:
                            case l1.c.f8511g /* 5 */:
                            case l1.c.f8509e /* 6 */:
                                ((p0) this.f14006b).e();
                                break;
                        }
                        aj.g.s("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((p0) this.f14006b).f14019j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onConfigureFailed((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).d(g1Var);
                }
                return;
        }
    }

    @Override // w.c1
    public final void e(g1 g1Var) {
        switch (this.f14005a) {
            case 0:
                synchronized (((p0) this.f14006b).f14010a) {
                    try {
                        switch (((p0) this.f14006b).f14019j.ordinal()) {
                            case 0:
                            case DSiCameraSource.FrontCamera /* 1 */:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((p0) this.f14006b).f14019j);
                            case 4:
                                g1Var.i();
                                break;
                            case l1.c.f8511g /* 5 */:
                                ((p0) this.f14006b).f14014e = g1Var;
                                break;
                            case l1.c.f8509e /* 6 */:
                                ((p0) this.f14006b).o(n0.OPENED);
                                ((p0) this.f14006b).f14014e = g1Var;
                                aj.g.o("CaptureSession", "Attempting to send capture request onConfigured");
                                p0 p0Var = (p0) this.f14006b;
                                p0Var.k(p0Var.f14015f);
                                p0 p0Var2 = (p0) this.f14006b;
                                p0Var2.f14024p.g().a(new r0.b(8, p0Var2), ij.a.D());
                                break;
                        }
                        aj.g.o("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + ((p0) this.f14006b).f14019j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onConfigured((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).e(g1Var);
                }
                return;
        }
    }

    @Override // w.c1
    public final void f(g1 g1Var) {
        switch (this.f14005a) {
            case 0:
                synchronized (((p0) this.f14006b).f14010a) {
                    try {
                        if (((p0) this.f14006b).f14019j.ordinal() != 0) {
                            aj.g.o("CaptureSession", "CameraCaptureSession.onReady() " + ((p0) this.f14006b).f14019j);
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((p0) this.f14006b).f14019j);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onReady((CameraCaptureSession) ((p1.a0) g1Var.q().B).B);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).f(g1Var);
                }
                return;
        }
    }

    @Override // w.c1
    public final void g(g1 g1Var) {
        switch (this.f14005a) {
            case 0:
                synchronized (((p0) this.f14006b).f14010a) {
                    try {
                        if (((p0) this.f14006b).f14019j != n0.UNINITIALIZED) {
                            aj.g.o("CaptureSession", "onSessionFinished()");
                            ((p0) this.f14006b).e();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((p0) this.f14006b).f14019j);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).g(g1Var);
                }
                return;
        }
    }

    @Override // w.c1
    public void h(g1 g1Var, Surface surface) {
        switch (this.f14005a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.StateCallback) this.f14006b).onSurfacePrepared((CameraCaptureSession) ((p1.a0) g1Var.q().B).B, surface);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f14006b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c1) obj).h(g1Var, surface);
                }
                return;
            default:
                return;
        }
    }

    private final void i(g1 g1Var) {
    }

    public o0(p0 p0Var) {
        this.f14005a = 0;
        this.f14006b = p0Var;
    }
}
