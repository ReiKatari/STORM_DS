package defpackage;

import android.content.res.ColorStateList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cv3  reason: default package */
/* loaded from: classes.dex */
public final class cv3 extends dr {
    public static final int[][] e0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList c0;
    public boolean d0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.c0 == null) {
            int x = jk2.x(this, R.attr.colorControlActivated);
            int x2 = jk2.x(this, R.attr.colorOnSurface);
            int x3 = jk2.x(this, R.attr.colorSurface);
            this.c0 = new ColorStateList(e0, new int[]{jk2.I(1.0f, x3, x), jk2.I(0.54f, x3, x2), jk2.I(0.38f, x3, x2), jk2.I(0.38f, x3, x2)});
        }
        return this.c0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.d0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
