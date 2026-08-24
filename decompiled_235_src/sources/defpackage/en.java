package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
public final class en extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en(Object obj, Object obj2, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                new en((gn) obj3, obj2, r41Var, 0).s(jg7Var);
                return jg7Var;
            case 1:
                new en((CameraDevice) obj3, (zg5) obj2, r41Var, 1).s(jg7Var);
                return jg7Var;
            case 2:
                new en((yk0) obj3, (tk0) obj2, r41Var, 2).s(jg7Var);
                return jg7Var;
            default:
                new en((yk0) obj3, (dk0) obj2, r41Var, 3).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                gn gnVar = (gn) obj3;
                gn.b(gnVar);
                Object a = gn.a(gnVar, obj2);
                gnVar.c.B.setValue(a);
                gnVar.e.setValue(a);
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
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
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(str, " - ")));
                    }
                }
                ((zg5) obj2).A = true;
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                StringBuilder sb = new StringBuilder();
                yk0 yk0Var = (yk0) obj3;
                sb.append(yk0Var);
                sb.append(" CameraCaptureSessionWrapper#close");
                tk0 tk0Var = (tk0) obj2;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + yk0Var);
                    i61.z(tk0Var.a);
                    return jg7Var;
                } finally {
                }
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                StringBuilder sb2 = new StringBuilder();
                yk0 yk0Var2 = (yk0) obj3;
                sb2.append(yk0Var2);
                sb2.append(" stopRepeating");
                dk0 dk0Var = (dk0) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    dk0Var.x();
                    Trace.endSection();
                    try {
                        Trace.beginSection(yk0Var2 + " abortCaptures");
                        dk0Var.a();
                        return jg7Var;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
