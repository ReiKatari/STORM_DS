package ja;

import android.content.res.ColorStateList;
import l0.f;
import me.magnum.melonds.R;
import q.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends a0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[][] f7784d0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f7785b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7786c0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7785b0 == null) {
            int m = f.m(this, R.attr.colorControlActivated);
            int m10 = f.m(this, R.attr.colorOnSurface);
            int m11 = f.m(this, R.attr.colorSurface);
            this.f7785b0 = new ColorStateList(f7784d0, new int[]{f.u(1.0f, m11, m), f.u(0.54f, m11, m10), f.u(0.38f, m11, m10), f.u(0.38f, m11, m10)});
        }
        return this.f7785b0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7786c0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7786c0 = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
