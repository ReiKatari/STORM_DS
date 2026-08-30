package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r12  reason: default package */
/* loaded from: classes.dex */
public final class r12 {
    public final n57 a;
    public final bs0 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public gs0 f;
    public q12 g;

    public r12(je0 je0Var, n57 n57Var, bs0 bs0Var) {
        Integer num;
        boolean z;
        Rational rational;
        je0Var.getClass();
        n57Var.getClass();
        bs0Var.getClass();
        this.a = n57Var;
        this.b = bs0Var;
        ce0 ce0Var = je0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Range range = o12.a;
        ia0 ia0Var = (ia0) ce0Var;
        ia0Var.getClass();
        Object c = ia0Var.c(key);
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
            Object c2 = ia0Var.c(key2);
            c2.getClass();
            rational = (Rational) c2;
        }
        this.e = rational;
    }
}
