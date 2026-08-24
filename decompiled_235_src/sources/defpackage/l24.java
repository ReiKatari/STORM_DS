package defpackage;

import android.content.res.ColorStateList;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l24  reason: default package */
/* loaded from: classes.dex */
public final class l24 extends qr {
    public static final int[][] f0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList d0;
    public boolean e0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.d0 == null) {
            int B = mp2.B(this, R.attr.colorControlActivated);
            int B2 = mp2.B(this, R.attr.colorOnSurface);
            int B3 = mp2.B(this, R.attr.colorSurface);
            this.d0 = new ColorStateList(f0, new int[]{mp2.Q(1.0f, B3, B), mp2.Q(0.54f, B3, B2), mp2.Q(0.38f, B3, B2), mp2.Q(0.38f, B3, B2)});
        }
        return this.d0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.e0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
