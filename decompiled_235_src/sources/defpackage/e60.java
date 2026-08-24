package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e60  reason: default package */
/* loaded from: classes.dex */
public final class e60 extends a76 {
    public final /* synthetic */ int a;

    @Override // defpackage.a76
    public final Drawable c(Context context) {
        switch (this.a) {
            case 0:
                return context.getDrawable(R.drawable.background_bottom_screen);
            default:
                return context.getDrawable(R.drawable.background_top_screen);
        }
    }
}
