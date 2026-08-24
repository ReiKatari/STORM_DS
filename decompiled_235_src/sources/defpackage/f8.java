package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f8  reason: default package */
/* loaded from: classes.dex */
public final class f8 extends nr implements h8 {
    public final /* synthetic */ g8 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(g8 g8Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.R = g8Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        bl2.R(this, getContentDescription());
        setOnTouchListener(new b8(this, this));
    }

    @Override // defpackage.h8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.h8
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
