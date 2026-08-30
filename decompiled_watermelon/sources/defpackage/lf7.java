package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf7  reason: default package */
/* loaded from: classes.dex */
public class lf7 extends kf7 {
    public lf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var, windowInsets);
    }

    @Override // defpackage.rf7
    public vf7 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return vf7.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.jf7, defpackage.rf7
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf7)) {
            return false;
        }
        lf7 lf7Var = (lf7) obj;
        if (Objects.equals(this.c, lf7Var.c) && Objects.equals(this.g, lf7Var.g) && jf7.L(this.h, lf7Var.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rf7
    public ug1 g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ug1(displayCutout);
    }

    @Override // defpackage.rf7
    public int hashCode() {
        return this.c.hashCode();
    }
}
