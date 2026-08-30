package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g40  reason: default package */
/* loaded from: classes.dex */
public final class g40 extends nv5 {
    public final /* synthetic */ int a;

    @Override // defpackage.nv5
    public final Drawable c(Context context) {
        switch (this.a) {
            case 0:
                return context.getDrawable(R.drawable.background_bottom_screen);
            default:
                return context.getDrawable(R.drawable.background_top_screen);
        }
    }
}
