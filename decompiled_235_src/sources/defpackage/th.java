package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final class th implements hh7, je0 {
    public final /* synthetic */ int A = 0;
    public final Object B;
    public final hh7 L;

    public th(TotalCaptureResult totalCaptureResult, String str, yk5 yk5Var) {
        Map map;
        str.getClass();
        yk5Var.getClass();
        this.B = totalCaptureResult;
        this.L = new uh(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                map = ma.s(totalCaptureResult);
                map.getClass();
            } else if (i >= 28) {
                map = totalCaptureResult.getPhysicalCameraResults();
            } else {
                map = zt1.A;
            }
            if (map != null && !map.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    xf0.a(str2);
                    arrayMap.put(new xf0(str2), new uh((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.je0
    public sy6 a() {
        return (sy6) ((yk5) this.B).a(uy6.a, sy6.b);
    }

    @Override // defpackage.je0
    public ie0 b() {
        uh j = ((th) this.L).j();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        j.getClass();
        CaptureResult captureResult = j.A;
        Integer num = (Integer) captureResult.get(key);
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return ie0.READY;
            }
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num == null) {
                    return ie0.UNKNOWN;
                }
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) nm2.a(captureResult.getFrameNumber())) + '!');
                }
                return ie0.UNKNOWN;
            }
            return ie0.FIRED;
        }
        return ie0.NONE;
    }

    @Override // defpackage.je0
    public long c() {
        uh j = ((th) this.L).j();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        Object obj = -1L;
        j.getClass();
        Object obj2 = j.A.get(key);
        if (obj2 != null) {
            obj = obj2;
        }
        return ((Number) obj).longValue();
    }

    @Override // defpackage.je0
    public he0 d() {
        uh j = ((th) this.L).j();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        j.getClass();
        CaptureResult captureResult = j.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return he0.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return he0.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return he0.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return he0.LOCKED;
        }
        if (num == null) {
            return he0.UNKNOWN;
        }
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) nm2.a(captureResult.getFrameNumber())) + '!');
        }
        return he0.UNKNOWN;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        switch (this.A) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.B;
                if (!ar0Var.equals(gh5.a(CaptureResult.class)) && !ar0Var.equals(gh5.a(TotalCaptureResult.class))) {
                    return null;
                }
                return totalCaptureResult;
            default:
                boolean equals = ar0Var.equals(gh5.a(th.class));
                th thVar = (th) this.L;
                if (!equals) {
                    return thVar.e(ar0Var);
                }
                return thVar;
        }
    }

    @Override // defpackage.je0
    public fe0 f() {
        uh j = ((th) this.L).j();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        j.getClass();
        CaptureResult captureResult = j.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return fe0.INACTIVE;
        }
        if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 5)) {
            if (num != null && num.intValue() == 4) {
                return fe0.FLASH_REQUIRED;
            }
            if (num != null && num.intValue() == 2) {
                return fe0.CONVERGED;
            }
            if (num != null && num.intValue() == 3) {
                return fe0.LOCKED;
            }
            if (num == null) {
                return fe0.UNKNOWN;
            }
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) nm2.a(captureResult.getFrameNumber())) + '!');
            }
            return fe0.UNKNOWN;
        }
        return fe0.SEARCHING;
    }

    @Override // defpackage.je0
    public ge0 g() {
        uh j = ((th) this.L).j();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        j.getClass();
        CaptureResult captureResult = j.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return ge0.INACTIVE;
        }
        if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 4) {
                return ge0.LOCKED_FOCUSED;
            }
            if (num != null && num.intValue() == 5) {
                return ge0.LOCKED_NOT_FOCUSED;
            }
            if (num != null && num.intValue() == 2) {
                return ge0.PASSIVE_FOCUSED;
            }
            if (num != null && num.intValue() == 6) {
                return ge0.PASSIVE_NOT_FOCUSED;
            }
            if (num == null) {
                return ge0.UNKNOWN;
            }
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) nm2.a(captureResult.getFrameNumber())) + '!');
            }
            return ge0.UNKNOWN;
        }
        return ge0.SCANNING;
    }

    public uh j() {
        return (uh) this.L;
    }

    public String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
                uh uhVar = (uh) this.L;
                sb.append((Object) xf0.b(uhVar.B));
                sb.append(", frameNumber: ");
                sb.append(uhVar.A.getFrameNumber());
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public th(yk5 yk5Var, th thVar) {
        yk5Var.getClass();
        this.B = yk5Var;
        this.L = thVar;
    }
}
