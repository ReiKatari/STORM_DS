package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb0  reason: default package */
/* loaded from: classes.dex */
public final class gb0 implements gb5 {
    public final dc0 A;
    public final CaptureRequest B;
    public final Map L;
    public final Map R;
    public final Map X;
    public final ArrayMap Y;
    public final boolean Z;
    public final sa5 c0;
    public final long d0;

    public gb0(dc0 dc0Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, sa5 sa5Var, long j) {
        dc0Var.getClass();
        captureRequest.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.A = dc0Var;
        this.B = captureRequest;
        this.L = map;
        this.R = map2;
        this.X = map3;
        this.Y = arrayMap;
        this.Z = z;
        this.c0 = sa5Var;
        this.d0 = j;
    }

    @Override // defpackage.gb5
    public final Map N() {
        return this.Y;
    }

    @Override // defpackage.gb5
    public final sa5 Q() {
        return this.c0;
    }

    @Override // defpackage.ux3
    public final Object a(tx3 tx3Var, im6 im6Var) {
        tx3Var.getClass();
        Object b = b(tx3Var);
        if (b == null) {
            return im6Var;
        }
        return b;
    }

    @Override // defpackage.ux3
    public final Object b(tx3 tx3Var) {
        Map map = this.c0.c;
        tx3Var.getClass();
        Map map2 = this.X;
        if (map2.containsKey(tx3Var)) {
            return map2.get(tx3Var);
        }
        if (map.containsKey(tx3Var)) {
            return map.get(tx3Var);
        }
        Map map3 = this.R;
        if (map3.containsKey(tx3Var)) {
            return map3.get(tx3Var);
        }
        return this.L.get(tx3Var);
    }

    @Override // defpackage.gb5
    public final boolean f0() {
        return this.Z;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.B;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean equals = qo0Var.equals(q75.a(CameraCaptureSession.class));
        dc0 dc0Var = this.A;
        if (equals) {
            Object p = dc0Var.p(q75.a(CameraCaptureSession.class));
            if (p != null) {
                return p;
            }
        } else if (qo0Var.equals(q75.a(dd.B()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object p2 = dc0Var.p(q75.a(dd.B()));
                if (p2 != null) {
                    return p2;
                }
            } else {
                i.n("Check failed.");
            }
        }
        return null;
    }

    @Override // defpackage.gb5
    public final long x() {
        return this.d0;
    }
}
