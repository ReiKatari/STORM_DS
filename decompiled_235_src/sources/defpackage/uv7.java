package defpackage;

import android.view.View;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv7  reason: default package */
/* loaded from: classes.dex */
public abstract class uv7 {
    public static final ja4 a;

    static {
        long[] jArr = b66.a;
        a = new ja4();
    }

    public static final zx0 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof zx0) {
            return (zx0) tag;
        }
        return null;
    }
}
