package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends w implements k {
    public final /* synthetic */ j R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.R = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        p7.t.E(this, getContentDescription());
        setOnTouchListener(new p.b(this, this));
    }

    @Override // q.k
    public final boolean a() {
        return false;
    }

    @Override // q.k
    public final boolean c() {
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
    public final boolean setFrame(int i2, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i2, i10, i11, i12);
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
