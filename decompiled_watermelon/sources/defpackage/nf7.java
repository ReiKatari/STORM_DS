package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nf7  reason: default package */
/* loaded from: classes.dex */
public class nf7 extends mf7 {
    public static final vf7 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = vf7.g(null, windowInsets);
    }

    public nf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var, windowInsets);
    }

    @Override // defpackage.jf7, defpackage.rf7
    public x13 h(int i) {
        Insets insets;
        insets = this.c.getInsets(tf7.a(i));
        return x13.d(insets);
    }

    @Override // defpackage.jf7, defpackage.rf7
    public x13 i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(tf7.a(i));
        return x13.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.jf7, defpackage.rf7
    public boolean t(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(tf7.a(i));
        return isVisible;
    }

    @Override // defpackage.jf7, defpackage.rf7
    public final void d(View view) {
    }
}
