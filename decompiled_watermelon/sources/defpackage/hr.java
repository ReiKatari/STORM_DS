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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hr  reason: default package */
/* loaded from: classes.dex */
public final class hr extends q03 {
    public final gr Y;
    public Drawable Z;
    public ColorStateList c0;
    public PorterDuff.Mode d0;
    public boolean e0;
    public boolean f0;

    public hr(gr grVar) {
        super((AbsSeekBar) grVar);
        this.c0 = null;
        this.d0 = null;
        this.e0 = false;
        this.f0 = false;
        this.Y = grVar;
    }

    public final void E() {
        Drawable drawable = this.Z;
        if (drawable != null) {
            if (this.e0 || this.f0) {
                Drawable mutate = drawable.mutate();
                this.Z = mutate;
                if (this.e0) {
                    mutate.setTintList(this.c0);
                }
                if (this.f0) {
                    this.Z.setTintMode(this.d0);
                }
                if (this.Z.isStateful()) {
                    this.Z.setState(this.Y.getDrawableState());
                }
            }
        }
    }

    public final void F(Canvas canvas) {
        gr grVar;
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
                float width = ((grVar.getWidth() - grVar.getPaddingLeft()) - grVar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(grVar.getPaddingLeft(), grVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Z.draw(canvas);
                    canvas.translate(width, RecyclerView.A1);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.q03
    public final void o(AttributeSet attributeSet, int i) {
        super.o(attributeSet, R.attr.seekBarStyle);
        gr grVar = this.Y;
        Context context = grVar.getContext();
        int[] iArr = by4.g;
        n85 q = n85.q(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) q.L;
        aa7.m(grVar, grVar.getContext(), iArr, attributeSet, (TypedArray) q.L, R.attr.seekBarStyle);
        Drawable g = q.g(0);
        if (g != null) {
            grVar.setThumb(g);
        }
        Drawable f = q.f(1);
        Drawable drawable = this.Z;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.Z = f;
        if (f != null) {
            f.setCallback(grVar);
            f.setLayoutDirection(grVar.getLayoutDirection());
            if (f.isStateful()) {
                f.setState(grVar.getDrawableState());
            }
            E();
        }
        grVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.d0 = vk1.c(typedArray.getInt(3, -1), this.d0);
            this.f0 = true;
        }
        if (typedArray.hasValue(2)) {
            this.c0 = q.e(2);
            this.e0 = true;
        }
        q.t();
        E();
    }
}
