package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od0  reason: default package */
/* loaded from: classes.dex */
public final class od0 implements yk5 {
    public final me0 A;
    public final CaptureRequest B;
    public final Map L;
    public final Map R;
    public final Map X;
    public final ArrayMap Y;
    public final boolean Z;
    public final kk5 d0;
    public final long e0;

    public od0(me0 me0Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, kk5 kk5Var, long j) {
        me0Var.getClass();
        captureRequest.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.A = me0Var;
        this.B = captureRequest;
        this.L = map;
        this.R = map2;
        this.X = map3;
        this.Y = arrayMap;
        this.Z = z;
        this.d0 = kk5Var;
        this.e0 = j;
    }

    @Override // defpackage.yk5
    public final boolean J() {
        return this.Z;
    }

    @Override // defpackage.yk5
    public final long X() {
        return this.e0;
    }

    @Override // defpackage.l54
    public final Object a(k54 k54Var, sy6 sy6Var) {
        k54Var.getClass();
        Object b = b(k54Var);
        if (b == null) {
            return sy6Var;
        }
        return b;
    }

    @Override // defpackage.l54
    public final Object b(k54 k54Var) {
        Map map = this.d0.c;
        k54Var.getClass();
        Map map2 = this.X;
        if (map2.containsKey(k54Var)) {
            return map2.get(k54Var);
        }
        if (map.containsKey(k54Var)) {
            return map.get(k54Var);
        }
        Map map3 = this.R;
        if (map3.containsKey(k54Var)) {
            return map3.get(k54Var);
        }
        return this.L.get(k54Var);
    }

    @Override // defpackage.yk5
    public final kk5 c0() {
        return this.d0;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.B;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean equals = ar0Var.equals(gh5.a(CameraCaptureSession.class));
        me0 me0Var = this.A;
        if (equals) {
            Object e = me0Var.e(gh5.a(CameraCaptureSession.class));
            if (e != null) {
                return e;
            }
        } else if (ar0Var.equals(gh5.a(ma.B()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object e2 = me0Var.e(gh5.a(ma.B()));
                if (e2 != null) {
                    return e2;
                }
            } else {
                i.m("Check failed.");
            }
        }
        return null;
    }

    @Override // defpackage.yk5
    public final Map x() {
        return this.Y;
    }
}
