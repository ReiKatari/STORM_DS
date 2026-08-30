package com.google.android.material.internal;

import a6.x0;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.preference.g0;
import ha.a;
import i6.b;
import me.magnum.melonds.R;
import q.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class CheckableImageButton extends v implements Checkable {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f3068d0 = {16842912};
    public boolean R;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3069b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f3070c0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f3069b0 = true;
        this.f3070c0 = true;
        x0.o(this, new g0(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        if (this.R) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f3068d0);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.A);
        setChecked(aVar.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.b, android.os.Parcelable, ha.a] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.L = this.R;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f3069b0 != z10) {
            this.f3069b0 = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f3069b0 && this.R != z10) {
            this.R = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f3070c0 = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f3070c0) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R);
    }
}
