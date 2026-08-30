package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh  reason: default package */
/* loaded from: classes.dex */
public final class hh implements m37, ac0 {
    public final /* synthetic */ int A = 0;
    public final Object B;
    public final m37 L;

    public hh(TotalCaptureResult totalCaptureResult, String str, gb5 gb5Var) {
        Map map;
        str.getClass();
        gb5Var.getClass();
        this.B = totalCaptureResult;
        this.L = new ih(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                map = dd.s(totalCaptureResult);
                map.getClass();
            } else if (i >= 28) {
                map = totalCaptureResult.getPhysicalCameraResults();
            } else {
                map = qp1.A;
            }
            if (map != null && !map.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    od0.a(str2);
                    arrayMap.put(new od0(str2), new ih((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ac0
    public im6 a() {
        return (im6) ((gb5) this.B).a(km6.a, im6.b);
    }

    @Override // defpackage.ac0
    public zb0 b() {
        ih h = ((hh) this.L).h();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        h.getClass();
        CaptureResult captureResult = h.A;
        Integer num = (Integer) captureResult.get(key);
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return zb0.READY;
            }
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num == null) {
                    return zb0.UNKNOWN;
                }
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) nh2.a(captureResult.getFrameNumber())) + '!');
                }
                return zb0.UNKNOWN;
            }
            return zb0.FIRED;
        }
        return zb0.NONE;
    }

    @Override // defpackage.ac0
    public long c() {
        ih h = ((hh) this.L).h();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        Object obj = -1L;
        h.getClass();
        Object obj2 = h.A.get(key);
        if (obj2 != null) {
            obj = obj2;
        }
        return ((Number) obj).longValue();
    }

    @Override // defpackage.ac0
    public wb0 e() {
        ih h = ((hh) this.L).h();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        h.getClass();
        CaptureResult captureResult = h.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return wb0.INACTIVE;
        }
        if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 5)) {
            if (num != null && num.intValue() == 4) {
                return wb0.FLASH_REQUIRED;
            }
            if (num != null && num.intValue() == 2) {
                return wb0.CONVERGED;
            }
            if (num != null && num.intValue() == 3) {
                return wb0.LOCKED;
            }
            if (num == null) {
                return wb0.UNKNOWN;
            }
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) nh2.a(captureResult.getFrameNumber())) + '!');
            }
            return wb0.UNKNOWN;
        }
        return wb0.SEARCHING;
    }

    @Override // defpackage.ac0
    public yb0 f() {
        ih h = ((hh) this.L).h();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        h.getClass();
        CaptureResult captureResult = h.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return yb0.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return yb0.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return yb0.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return yb0.LOCKED;
        }
        if (num == null) {
            return yb0.UNKNOWN;
        }
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) nh2.a(captureResult.getFrameNumber())) + '!');
        }
        return yb0.UNKNOWN;
    }

    @Override // defpackage.ac0
    public xb0 g() {
        ih h = ((hh) this.L).h();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        h.getClass();
        CaptureResult captureResult = h.A;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return xb0.INACTIVE;
        }
        if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 4) {
                return xb0.LOCKED_FOCUSED;
            }
            if (num != null && num.intValue() == 5) {
                return xb0.LOCKED_NOT_FOCUSED;
            }
            if (num != null && num.intValue() == 2) {
                return xb0.PASSIVE_FOCUSED;
            }
            if (num != null && num.intValue() == 6) {
                return xb0.PASSIVE_NOT_FOCUSED;
            }
            if (num == null) {
                return xb0.UNKNOWN;
            }
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) nh2.a(captureResult.getFrameNumber())) + '!');
            }
            return xb0.UNKNOWN;
        }
        return xb0.SCANNING;
    }

    public ih h() {
        return (ih) this.L;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        switch (this.A) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.B;
                if (!qo0Var.equals(q75.a(CaptureResult.class)) && !qo0Var.equals(q75.a(TotalCaptureResult.class))) {
                    return null;
                }
                return totalCaptureResult;
            default:
                boolean equals = qo0Var.equals(q75.a(hh.class));
                hh hhVar = (hh) this.L;
                if (!equals) {
                    return hhVar.p(qo0Var);
                }
                return hhVar;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
                ih ihVar = (ih) this.L;
                sb.append((Object) od0.b(ihVar.B));
                sb.append(", frameNumber: ");
                sb.append(ihVar.A.getFrameNumber());
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public hh(gb5 gb5Var, hh hhVar) {
        gb5Var.getClass();
        this.B = gb5Var;
        this.L = hhVar;
    }
}
