package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import me.magnum.melonds.R;
import p1.a0;
import y0.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: c0 */
    public static final int[] f1069c0 = {16842801};
    public boolean A;
    public boolean B;
    public final Rect L;
    public final Rect R;

    /* renamed from: b0 */
    public final a0 f1070b0;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.L = rect;
        this.R = new Rect();
        a0 a0Var = new a0(this);
        this.f1070b0 = a0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f14657a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1069c0);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A = obtainStyledAttributes.getBoolean(7, false);
        this.B = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        z0.a aVar = new z0.a(valueOf, dimension);
        a0Var.B = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        p7.a.z(a0Var, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i2, int i10, int i11, int i12) {
        super.setPadding(i2, i10, i11, i12);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((z0.a) this.f1070b0.B).f14856h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1070b0.L).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.L.bottom;
    }

    public int getContentPaddingLeft() {
        return this.L.left;
    }

    public int getContentPaddingRight() {
        return this.L.right;
    }

    public int getContentPaddingTop() {
        return this.L.top;
    }

    public float getMaxCardElevation() {
        return ((z0.a) this.f1070b0.B).f14853e;
    }

    public boolean getPreventCornerOverlap() {
        return this.B;
    }

    public float getRadius() {
        return ((z0.a) this.f1070b0.B).f14849a;
    }

    public boolean getUseCompatPadding() {
        return this.A;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        z0.a aVar = (z0.a) this.f1070b0.B;
        if (valueOf == null) {
            aVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        aVar.f14856h = valueOf;
        aVar.f14850b.setColor(valueOf.getColorForState(aVar.getState(), aVar.f14856h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f8) {
        ((CardView) this.f1070b0.L).setElevation(f8);
    }

    public void setMaxCardElevation(float f8) {
        p7.a.z(this.f1070b0, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            a0 a0Var = this.f1070b0;
            p7.a.z(a0Var, ((z0.a) a0Var.B).f14853e);
        }
    }

    public void setRadius(float f8) {
        z0.a aVar = (z0.a) this.f1070b0.B;
        if (f8 == aVar.f14849a) {
            return;
        }
        aVar.f14849a = f8;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            a0 a0Var = this.f1070b0;
            p7.a.z(a0Var, ((z0.a) a0Var.B).f14853e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        z0.a aVar = (z0.a) this.f1070b0.B;
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f14856h = colorStateList;
        aVar.f14850b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f14856h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i10, int i11, int i12) {
    }
}
