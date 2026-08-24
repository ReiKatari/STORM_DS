package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CheckableImageButton extends mr implements Checkable {
    public static final int[] f0 = {16842912};
    public boolean R;
    public boolean d0;
    public boolean e0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.d0 = true;
        this.e0 = true;
        ao7.n(this, new l60(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.R) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f0);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cq0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cq0 cq0Var = (cq0) parcelable;
        super.onRestoreInstanceState(cq0Var.A);
        setChecked(cq0Var.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s, cq0, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? sVar = new s(super.onSaveInstanceState());
        sVar.L = this.R;
        return sVar;
    }

    public void setCheckable(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.d0 && this.R != z) {
            this.R = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.e0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.e0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R);
    }
}
