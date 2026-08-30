package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e8  reason: default package */
/* loaded from: classes.dex */
public final class e8 extends ar implements g8 {
    public final /* synthetic */ f8 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(f8 f8Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.R = f8Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        sn2.N(this, getContentDescription());
        setOnTouchListener(new a8(this, this));
    }

    @Override // defpackage.g8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.g8
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.R.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
