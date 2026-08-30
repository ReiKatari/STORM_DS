package d;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import android.util.Size;
import d0.b1;
import d0.i0;
import d0.k0;
import d0.t1;
import d0.v1;
import j0.i1;
import j0.y0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;

    public /* synthetic */ i(Object obj, int i2, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.L = i2;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.b bVar;
        d0.r rVar;
        int i2 = 0;
        switch (this.A) {
            case 0:
                j jVar = (j) this.B;
                int i10 = this.L;
                Serializable serializable = (Serializable) ((d2.t) this.R).B;
                String str = (String) jVar.f5825a.get(Integer.valueOf(i10));
                if (str != null) {
                    h.e eVar = (h.e) jVar.f5829e.get(str);
                    if (eVar != null) {
                        bVar = eVar.f5817a;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        jVar.f5831g.remove(str);
                        jVar.f5830f.put(str, serializable);
                        return;
                    }
                    h.b bVar2 = eVar.f5817a;
                    bVar2.getClass();
                    if (jVar.f5828d.remove(str)) {
                        bVar2.a(serializable);
                        return;
                    }
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((j) this.B).a(this.L, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.R));
                return;
            case 2:
                ((h7.d) ((b1) this.B).f3333c).m(this.L, this.R);
                return;
            case 3:
                lf.d dVar = (lf.d) this.R;
                int i11 = this.L;
                x0.f fVar = (x0.f) ((m0.b) this.B).get();
                c0.f fVar2 = new c0.f(2);
                fVar2.f2374b.o(j0.b1.f7161y, new u0.b(u0.a.f13268a, new u0.c(new Size(640, 480), 2)));
                fVar2.f2374b.o(y0.X, 1);
                fVar2.f2374b.o(y0.B, 0);
                y0 y0Var = new y0(i1.a(fVar2.f2374b));
                j0.b1.C(y0Var);
                i0 i0Var = new i0(y0Var);
                ExecutorService executorService = dVar.f9081g;
                ah.e eVar2 = new ah.e(9, dVar);
                synchronized (i0Var.f3396p) {
                    try {
                        k0 k0Var = i0Var.f3397q;
                        if (k0Var != null) {
                            ah.e eVar3 = new ah.e(6, eVar2);
                            synchronized (k0Var.f3426n0) {
                                k0Var.A = eVar3;
                                k0Var.Z = executorService;
                            }
                        }
                        if (i0Var.f3399s == null) {
                            i0Var.f3470c = t1.ACTIVE;
                            i0Var.p();
                        }
                        i0Var.f3398r = executorService;
                        i0Var.f3399s = eVar2;
                    } finally {
                    }
                }
                if (i11 != 0) {
                    if (i11 == 1) {
                        rVar = d0.r.f3442b;
                    } else {
                        m9.o.v(w.d.l(i11, "Unknown camera type "));
                        return;
                    }
                } else {
                    rVar = d0.r.f3443c;
                }
                rVar.getClass();
                fVar.f14320a.f();
                EmulatorActivity emulatorActivity = dVar.f9076b.f11646a;
                if (emulatorActivity != null) {
                    v1[] v1VarArr = {i0Var};
                    d5.f fVar3 = fVar.f14320a;
                    v1[] v1VarArr2 = (v1[]) Arrays.copyOf(v1VarArr, 1);
                    Trace.beginSection(aj.g.v0("CX:bindToLifecycle"));
                    try {
                        d0.w wVar = (d0.w) fVar3.f3843e;
                        if (wVar != null) {
                            w.j jVar2 = wVar.f3490g;
                            if (jVar2 != null) {
                                i2 = jVar2.f13975b.b();
                            } else {
                                throw new IllegalStateException("CameraX not initialized yet.");
                            }
                        }
                        if (i2 != 2) {
                            d5.f.b(fVar3, 1);
                            d5.f.c(fVar3, emulatorActivity, rVar, new b1(zb.k.v(v1VarArr2), zb.q.A));
                            Trace.endSection();
                            dVar.f9079e = fVar;
                            return;
                        }
                        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                a0.j.p("No current emulator lifecycle owner");
                return;
            case 4:
                ((j0.m) this.B).c(this.L, (na.f) this.R);
                return;
            case l1.c.f8511g /* 5 */:
                ((j0.m) this.B).b(this.L, (j0.u) this.R);
                return;
            case l1.c.f8509e /* 6 */:
                ((CameraCaptureSession.CaptureCallback) ((a0.k) this.B).f9b).onCaptureSequenceAborted((CameraCaptureSession) this.R, this.L);
                return;
            default:
                ((CameraDevice.StateCallback) ((w.p) this.B).f14008b).onError((CameraDevice) this.R, this.L);
                return;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, int i10) {
        this.A = i10;
        this.B = obj;
        this.R = obj2;
        this.L = i2;
    }
}
