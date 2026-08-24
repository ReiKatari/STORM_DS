package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur  reason: default package */
/* loaded from: classes.dex */
public final class ur extends u63 {
    public final tr Y;
    public Drawable Z;
    public ColorStateList d0;
    public PorterDuff.Mode e0;
    public boolean f0;
    public boolean g0;

    public ur(tr trVar) {
        super((AbsSeekBar) trVar);
        this.d0 = null;
        this.e0 = null;
        this.f0 = false;
        this.g0 = false;
        this.Y = trVar;
    }

    public final void J() {
        Drawable drawable = this.Z;
        if (drawable != null) {
            if (this.f0 || this.g0) {
                Drawable mutate = drawable.mutate();
                this.Z = mutate;
                if (this.f0) {
                    mutate.setTintList(this.d0);
                }
                if (this.g0) {
                    this.Z.setTintMode(this.e0);
                }
                if (this.Z.isStateful()) {
                    this.Z.setState(this.Y.getDrawableState());
                }
            }
        }
    }

    public final void K(Canvas canvas) {
        tr trVar;
        int i;
        if (this.Z != null) {
            int max = this.Y.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.Z.getIntrinsicWidth();
                int intrinsicHeight = this.Z.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.Z.setBounds(-i, -i2, i, i2);
                float width = ((trVar.getWidth() - trVar.getPaddingLeft()) - trVar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(trVar.getPaddingLeft(), trVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Z.draw(canvas);
                    canvas.translate(width, RecyclerView.B1);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.u63
    public final void r(AttributeSet attributeSet, int i) {
        super.r(attributeSet, R.attr.seekBarStyle);
        tr trVar = this.Y;
        Context context = trVar.getContext();
        int[] iArr = m75.g;
        m44 A = m44.A(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) A.L;
        ao7.m(trVar, trVar.getContext(), iArr, attributeSet, (TypedArray) A.L, R.attr.seekBarStyle);
        Drawable l = A.l(0);
        if (l != null) {
            trVar.setThumb(l);
        }
        Drawable k = A.k(1);
        Drawable drawable = this.Z;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.Z = k;
        if (k != null) {
            k.setCallback(trVar);
            k.setLayoutDirection(trVar.getLayoutDirection());
            if (k.isStateful()) {
                k.setState(trVar.getDrawableState());
            }
            J();
        }
        trVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.e0 = bp1.c(typedArray.getInt(3, -1), this.e0);
            this.g0 = true;
        }
        if (typedArray.hasValue(2)) {
            this.d0 = A.g(2);
            this.f0 = true;
        }
        A.D();
        J();
    }
}
