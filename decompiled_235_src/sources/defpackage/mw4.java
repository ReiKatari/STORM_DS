package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw4  reason: default package */
/* loaded from: classes.dex */
public final class mw4 implements zf0, hh7 {
    public final sg0 A;
    public final ex6 B = new ex6(new er2(this, 13));

    public mw4(sg0 sg0Var) {
        this.A = sg0Var;
    }

    @Override // defpackage.zf0
    public final int b() {
        return p(0);
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(oc0.class))) {
            oc0 oc0Var = (oc0) this.B.getValue();
            oc0Var.getClass();
            return oc0Var;
        }
        boolean equals = ar0Var.equals(gh5.a(sg0.class));
        sg0 sg0Var = this.A;
        if (equals) {
            return sg0Var;
        }
        boolean equals2 = ar0Var.equals(gh5.a(CameraMetadata.class));
        lg0 lg0Var = sg0Var.b;
        if (equals2) {
            lg0Var.getClass();
            return lg0Var;
        }
        return ((qc0) lg0Var).e(ar0Var);
    }

    @Override // defpackage.zf0
    public final int m() {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object c = ((qc0) lg0Var).c(key);
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
        i.h(lb1.k("The specified lens facing integer ", intValue, " can not be recognized."));
        return 0;
    }

    @Override // defpackage.zf0
    public final int p(int i) {
        lg0 lg0Var = this.A.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object c = ((qc0) lg0Var).c(key);
        c.getClass();
        int intValue = ((Number) c).intValue();
        int Z = nb3.Z(i);
        boolean z = true;
        if (1 != m()) {
            z = false;
        }
        return nb3.z(Z, z, intValue);
    }
}
