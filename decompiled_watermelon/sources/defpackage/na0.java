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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: na0  reason: default package */
/* loaded from: classes.dex */
public final class na0 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final t71 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final tf6 i;
    public final tg6 j;
    public final long k;
    public final gs0 l;
    public volatile Integer m;

    public na0(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, t71 t71Var, ArrayMap arrayMap, ArrayMap arrayMap2, tf6 tf6Var, tg6 tg6Var) {
        str.getClass();
        list.getClass();
        t71Var.getClass();
        tg6Var.getClass();
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = t71Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = tf6Var;
        this.j = tg6Var;
        ew ewVar = qa0.b;
        ewVar.getClass();
        this.k = ew.b.incrementAndGet(ewVar);
        this.l = new gs0();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        i.n("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
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

    public final void b(gb5 gb5Var, long j, eb5 eb5Var) {
        this.f.q(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra5) list.get(i)).J(gb5Var, j, eb5Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gb5Var.Q().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra5) gb5Var.Q().d.get(i2)).J(gb5Var, j, eb5Var);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.q(this);
        Trace.endSection();
        gb5 i = i(captureRequest);
        hh hhVar = new hh(totalCaptureResult, this.a, i);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra5) list.get(i2)).i(i, j, hhVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.Q().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra5) i.Q().d.get(i3)).i(i, j, hhVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((ra5) list.get(i4)).K(i, j, hhVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = i.Q().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((ra5) i.Q().d.get(i5)).K(i, j, hhVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.c0(o27.a);
        gb5 i = i(captureRequest);
        b(i, j, new p32(i, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        gb5 i2 = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ra5) list.get(i3)).d(i2, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i2.Q().d.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((ra5) i2.Q().d.get(i4)).d(i2, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.c0(o27.a);
        this.f.q(this);
        if (a() != i) {
            this.j.getClass();
            Log.w("CXCP", "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gb5 gb5Var = (gb5) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ra5) list.get(i3)).D(gb5Var);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            gb5 gb5Var2 = (gb5) arrayList.get(i4);
            int size4 = gb5Var2.Q().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ra5) gb5Var2.Q().d.get(i5)).D(gb5Var2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.c0(o27.a);
        this.f.q(this);
        if (a() != i) {
            this.j.getClass();
            Log.w("CXCP", "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gb5 gb5Var = (gb5) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ra5) list.get(i3)).B(gb5Var, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            gb5 gb5Var2 = (gb5) arrayList.get(i4);
            int size4 = gb5Var2.Q().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ra5) gb5Var2.Q().d.get(i5)).B(gb5Var2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.c0(o27.a);
        gb5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra5) list.get(i2)).F(i, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.Q().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra5) i.Q().d.get(i3)).F(i, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final gb5 i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (gb5) this.d.get(i);
            }
        }
        vd6.g("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        sf6 sf6Var;
        Object obj;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        uf6 uf6Var = (uf6) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (uf6Var == null) {
            dg4 dg4Var = (dg4) arrayMap.get(surface);
            uf6 uf6Var2 = null;
            if (dg4Var != null) {
                int i = dg4Var.a;
                ArrayList arrayList = this.i.c0;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = arrayList.get(i2);
                        i2++;
                        if (((sf6) obj).a == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                sf6Var = (sf6) obj;
            } else {
                sf6Var = null;
            }
            if (sf6Var != null) {
                bg0 bg0Var = sf6Var.j;
                if (bg0Var != null) {
                    uf6Var2 = new uf6(bg0Var.a);
                } else {
                    b53.g0("stream");
                    throw null;
                }
            }
            uf6Var = uf6Var2;
        }
        dg4 dg4Var2 = (dg4) arrayMap.get(surface);
        if (uf6Var != null) {
            if (dg4Var2 != null) {
                gb5 i3 = i(captureRequest);
                Trace.beginSection("InvokeInternalListeners");
                List list = this.e;
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((ra5) list.get(i4)).getClass();
                    i3.getClass();
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = i3.Q().d.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((ra5) i3.Q().d.get(i5)).getClass();
                }
                Trace.endSection();
                Trace.beginSection("InvokeInternalListeners");
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    ((ra5) list.get(i6)).p(i3, j, uf6Var.a, dg4Var2.a);
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size5 = i3.Q().d.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    ((ra5) i3.Q().d.get(i7)).p(i3, j, uf6Var.a, dg4Var2.a);
                }
                Trace.endSection();
                Trace.endSection();
                return;
            }
            StringBuilder sb = new StringBuilder("Unable to find the outputId for ");
            sb.append(surface);
            i.k(sb, " on ", nh2.a(j));
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find the streamId for ");
        sb2.append(surface);
        i.k(sb2, " on ", nh2.a(j));
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
        this.l.c0(o27.a);
        gb5 i = i(captureRequest);
        b(i, captureFailure.getFrameNumber(), new kd(i, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        ih ihVar = new ih(captureResult, this.a);
        gb5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra5) list.get(i2)).I(i, frameNumber, ihVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.Q().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra5) i.Q().d.get(i3)).I(i, frameNumber, ihVar);
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
        gb5 i = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra5) list.get(i2)).w(i, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i.Q().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra5) i.Q().d.get(i3)).w(i, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
