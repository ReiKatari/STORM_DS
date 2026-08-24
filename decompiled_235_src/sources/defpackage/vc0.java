package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc0  reason: default package */
/* loaded from: classes.dex */
public final class vc0 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final d51 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final jr6 i;
    public final ks6 j;
    public final long k;
    public final tu0 l;
    public volatile Integer m;

    public vc0(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, d51 d51Var, ArrayMap arrayMap, ArrayMap arrayMap2, jr6 jr6Var, ks6 ks6Var) {
        str.getClass();
        list.getClass();
        d51Var.getClass();
        ks6Var.getClass();
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = d51Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = jr6Var;
        this.j = ks6Var;
        ww wwVar = yc0.b;
        wwVar.getClass();
        this.k = ww.b.incrementAndGet(wwVar);
        this.l = new tu0();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        i.m("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int intValue;
        if (this.m == null) {
            synchronized (this) {
                Integer num = this.m;
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
                }
            }
            return intValue;
        }
        Integer num2 = this.m;
        if (num2 != null) {
            return num2.intValue();
        }
        throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
    }

    public final void b(yk5 yk5Var, long j, wk5 wk5Var) {
        this.f.m(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((jk5) list.get(i)).F(yk5Var, j, wk5Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = yk5Var.c0().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((jk5) yk5Var.c0().d.get(i2)).F(yk5Var, j, wk5Var);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.m(this);
        Trace.endSection();
        yk5 i = i(captureRequest);
        th thVar = new th(totalCaptureResult, this.a, i);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jk5) list.get(i2)).x(i, j, thVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.c0().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((jk5) i.c0().d.get(i3)).x(i, j, thVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((jk5) list.get(i4)).J(i, j, thVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = i.c0().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((jk5) i.c0().d.get(i5)).J(i, j, thVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.b0(jg7.a);
        yk5 i = i(captureRequest);
        b(i, j, new h82(i, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        yk5 i2 = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((jk5) list.get(i3)).v(i2, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i2.c0().d.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((jk5) i2.c0().d.get(i4)).v(i2, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.b0(jg7.a);
        this.f.m(this);
        if (a() != i) {
            this.j.getClass();
            Log.w("CXCP", "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yk5 yk5Var = (yk5) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((jk5) list.get(i3)).r(yk5Var);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            yk5 yk5Var2 = (yk5) arrayList.get(i4);
            int size4 = yk5Var2.c0().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((jk5) yk5Var2.c0().d.get(i5)).r(yk5Var2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.b0(jg7.a);
        this.f.m(this);
        if (a() != i) {
            this.j.getClass();
            Log.w("CXCP", "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yk5 yk5Var = (yk5) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((jk5) list.get(i3)).n(yk5Var, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            yk5 yk5Var2 = (yk5) arrayList.get(i4);
            int size4 = yk5Var2.c0().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((jk5) yk5Var2.c0().d.get(i5)).n(yk5Var2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.b0(jg7.a);
        yk5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jk5) list.get(i2)).u(i, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.c0().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((jk5) i.c0().d.get(i3)).u(i, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final yk5 i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (yk5) this.d.get(i);
            }
        }
        fa6.f("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        ir6 ir6Var;
        Object obj;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        kr6 kr6Var = (kr6) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (kr6Var == null) {
            gp4 gp4Var = (gp4) arrayMap.get(surface);
            kr6 kr6Var2 = null;
            if (gp4Var != null) {
                int i = gp4Var.a;
                ArrayList arrayList = this.i.d0;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = arrayList.get(i2);
                        i2++;
                        if (((ir6) obj).a == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ir6Var = (ir6) obj;
            } else {
                ir6Var = null;
            }
            if (ir6Var != null) {
                ki0 ki0Var = ir6Var.j;
                if (ki0Var != null) {
                    kr6Var2 = new kr6(ki0Var.a);
                } else {
                    nb3.a0("stream");
                    throw null;
                }
            }
            kr6Var = kr6Var2;
        }
        gp4 gp4Var2 = (gp4) arrayMap.get(surface);
        if (kr6Var != null) {
            if (gp4Var2 != null) {
                yk5 i3 = i(captureRequest);
                Trace.beginSection("InvokeInternalListeners");
                List list = this.e;
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((jk5) list.get(i4)).getClass();
                    i3.getClass();
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = i3.c0().d.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((jk5) i3.c0().d.get(i5)).getClass();
                }
                Trace.endSection();
                Trace.beginSection("InvokeInternalListeners");
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    ((jk5) list.get(i6)).e(i3, j, kr6Var.a, gp4Var2.a);
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size5 = i3.c0().d.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    ((jk5) i3.c0().d.get(i7)).e(i3, j, kr6Var.a, gp4Var2.a);
                }
                Trace.endSection();
                Trace.endSection();
                return;
            }
            StringBuilder sb = new StringBuilder("Unable to find the outputId for ");
            sb.append(surface);
            i.k(sb, " on ", nm2.a(j));
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find the streamId for ");
        sb2.append(surface);
        i.k(sb2, " on ", nm2.a(j));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.b0(jg7.a);
        yk5 i = i(captureRequest);
        b(i, captureFailure.getFrameNumber(), new yd(i, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        uh uhVar = new uh(captureResult, this.a);
        yk5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jk5) list.get(i2)).D(i, frameNumber, uhVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.c0().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((jk5) i.c0().d.get(i3)).D(i, frameNumber, uhVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        h(captureRequest, j2, j);
    }

    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        yk5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jk5) list.get(i2)).h(i, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.c0().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((jk5) i.c0().d.get(i3)).h(i, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
