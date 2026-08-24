package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu7  reason: default package */
/* loaded from: classes.dex */
public class nu7 extends mu7 {
    public static final vu7 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = vu7.g(null, windowInsets);
    }

    public nu7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var, windowInsets);
    }

    @Override // defpackage.ju7, defpackage.ru7
    public e83 h(int i) {
        Insets insets;
        insets = this.c.getInsets(tu7.a(i));
        return e83.d(insets);
    }

    @Override // defpackage.ju7, defpackage.ru7
    public e83 i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(tu7.a(i));
        return e83.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.ju7, defpackage.ru7
    public boolean t(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(tu7.a(i));
        return isVisible;
    }

    @Override // defpackage.ju7, defpackage.ru7
    public final void d(View view) {
    }
}
