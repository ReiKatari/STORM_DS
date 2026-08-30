package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hn4  reason: default package */
/* loaded from: classes.dex */
public final class hn4 implements qd0, m37 {
    public final je0 A;
    public final il6 B = new il6(new bz2(9, this));

    public hn4(je0 je0Var) {
        this.A = je0Var;
    }

    @Override // defpackage.qd0
    public final int b() {
        return g(0);
    }

    @Override // defpackage.qd0
    public final int c() {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object c = ((ia0) ce0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        i.i(wh1.j("The specified lens facing integer ", intValue, " can not be recognized."));
        return 0;
    }

    @Override // defpackage.qd0
    public final int g(int i) {
        ce0 ce0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object c = ((ia0) ce0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        int I = pu.I(i);
        boolean z = true;
        if (1 != c()) {
            z = false;
        }
        return pu.u(I, z, intValue);
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(ga0.class))) {
            ga0 ga0Var = (ga0) this.B.getValue();
            ga0Var.getClass();
            return ga0Var;
        }
        boolean equals = qo0Var.equals(q75.a(je0.class));
        je0 je0Var = this.A;
        if (equals) {
            return je0Var;
        }
        boolean equals2 = qo0Var.equals(q75.a(CameraMetadata.class));
        ce0 ce0Var = je0Var.b;
        if (equals2) {
            ce0Var.getClass();
            return ce0Var;
        }
        return ((ia0) ce0Var).p(qo0Var);
    }
}
