package a6;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class y1 extends x1 {
    public y1(i2 i2Var, WindowInsets windowInsets) {
        super(i2Var, windowInsets);
    }

    @Override // a6.d2
    public i2 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f527c.consumeDisplayCutout();
        return i2.g(null, consumeDisplayCutout);
    }

    @Override // a6.d2
    public n e() {
        DisplayCutout displayCutout;
        displayCutout = this.f527c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new n(displayCutout);
    }

    @Override // a6.w1, a6.d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (Objects.equals(this.f527c, y1Var.f527c) && Objects.equals(this.f531g, y1Var.f531g) && w1.B(this.f532h, y1Var.f532h)) {
            return true;
        }
        return false;
    }

    @Override // a6.d2
    public int hashCode() {
        return this.f527c.hashCode();
    }
}
