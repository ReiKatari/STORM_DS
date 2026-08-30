package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class CheckableImageButton extends zq implements Checkable {
    public static final int[] e0 = {16842912};
    public boolean R;
    public boolean c0;
    public boolean d0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.c0 = true;
        this.d0 = true;
        aa7.n(this, new rn0(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.R) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), e0);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sn0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sn0 sn0Var = (sn0) parcelable;
        super.onRestoreInstanceState(sn0Var.A);
        setChecked(sn0Var.L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r, android.os.Parcelable, sn0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? rVar = new r(super.onSaveInstanceState());
        rVar.L = this.R;
        return rVar;
    }

    public void setCheckable(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.c0 && this.R != z) {
            this.R = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.d0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.d0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R);
    }
}
