package fh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import og.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4962a;

    @Override // og.j
    public final View a(Context context) {
        Drawable drawable;
        View view = new View(context);
        switch (this.f4962a) {
            case 0:
                drawable = null;
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                drawable = context.getDrawable(R.drawable.background_bottom_screen);
                break;
            default:
                drawable = context.getDrawable(R.drawable.background_top_screen);
                break;
        }
        view.setBackground(drawable);
        return view;
    }

    @Override // og.j
    public final float b() {
        return 1.3333334f;
    }
}
