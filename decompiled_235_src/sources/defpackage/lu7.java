package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu7  reason: default package */
/* loaded from: classes.dex */
public class lu7 extends ku7 {
    public lu7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var, windowInsets);
    }

    @Override // defpackage.ru7
    public vu7 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return vu7.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.ju7, defpackage.ru7
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        if (Objects.equals(this.c, lu7Var.c) && Objects.equals(this.g, lu7Var.g) && ju7.L(this.h, lu7Var.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ru7
    public yk1 g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new yk1(displayCutout);
    }

    @Override // defpackage.ru7
    public int hashCode() {
        return this.c.hashCode();
    }
}
