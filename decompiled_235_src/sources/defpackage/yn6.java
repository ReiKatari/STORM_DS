package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn6  reason: default package */
/* loaded from: classes.dex */
public final class yn6 {
    public static ao6 a(View view) {
        view.getClass();
        if (view.getAlpha() == RecyclerView.B1 && view.getVisibility() == 0) {
            return ao6.INVISIBLE;
        }
        return b(view.getVisibility());
    }

    public static ao6 b(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return ao6.GONE;
                }
                i.h(lb1.g(i, "Unknown visibility "));
                return null;
            }
            return ao6.INVISIBLE;
        }
        return ao6.VISIBLE;
    }
}
