package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g62  reason: default package */
/* loaded from: classes.dex */
public final class g62 {
    public final kj7 a;
    public final ou0 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public tu0 f;
    public f62 g;

    public g62(sg0 sg0Var, kj7 kj7Var, ou0 ou0Var) {
        Integer num;
        boolean z;
        Rational rational;
        sg0Var.getClass();
        kj7Var.getClass();
        ou0Var.getClass();
        this.a = kj7Var;
        this.b = ou0Var;
        lg0 lg0Var = sg0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Range range = d62.a;
        qc0 qc0Var = (qc0) lg0Var;
        qc0Var.getClass();
        Object c = qc0Var.c(key);
        range = c != null ? c : range;
        range.getClass();
        Range range2 = range;
        this.c = range2;
        Integer num2 = (Integer) range2.getUpper();
        if ((num2 == null || num2.intValue() != 0) && ((num = (Integer) range2.getLower()) == null || num.intValue() != 0)) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if (!z) {
            rational = Rational.ZERO;
            rational.getClass();
        } else {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object c2 = qc0Var.c(key2);
            c2.getClass();
            rational = (Rational) c2;
        }
        this.e = rational;
    }
}
