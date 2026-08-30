package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
public final class sm extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm(Object obj, Object obj2, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        j11 j11Var = (j11) obj;
        switch (i) {
            case 0:
                new sm((um) obj3, obj2, j11Var, 0).v(o27Var);
                return o27Var;
            case 1:
                new sm((CameraDevice) obj3, (j75) obj2, j11Var, 1).v(o27Var);
                return o27Var;
            case 2:
                new sm((qi0) obj3, (li0) obj2, j11Var, 2).v(o27Var);
                return o27Var;
            default:
                new sm((qi0) obj3, (vh0) obj2, j11Var, 3).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                um umVar = (um) obj3;
                um.b(umVar);
                Object a = um.a(umVar, obj2);
                umVar.c.B.setValue(a);
                umVar.e.setValue(a);
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                CameraDevice cameraDevice = (CameraDevice) obj3;
                if (cameraDevice != null) {
                    Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException e) {
                            Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                        }
                    } finally {
                        Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", b31.t(str, " - ")));
                    }
                }
                ((j75) obj2).A = true;
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                StringBuilder sb = new StringBuilder();
                qi0 qi0Var = (qi0) obj3;
                sb.append(qi0Var);
                sb.append(" CameraCaptureSessionWrapper#close");
                li0 li0Var = (li0) obj2;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + qi0Var);
                    b31.y(li0Var.a);
                    return o27Var;
                } finally {
                }
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                StringBuilder sb2 = new StringBuilder();
                qi0 qi0Var2 = (qi0) obj3;
                sb2.append(qi0Var2);
                sb2.append(" stopRepeating");
                vh0 vh0Var = (vh0) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    vh0Var.u();
                    Trace.endSection();
                    try {
                        Trace.beginSection(qi0Var2 + " abortCaptures");
                        vh0Var.a();
                        return o27Var;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
