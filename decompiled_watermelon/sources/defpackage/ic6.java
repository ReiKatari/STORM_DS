package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ic6  reason: default package */
/* loaded from: classes.dex */
public final class ic6 {
    public static kc6 a(View view) {
        view.getClass();
        if (view.getAlpha() == RecyclerView.A1 && view.getVisibility() == 0) {
            return kc6.INVISIBLE;
        }
        return b(view.getVisibility());
    }

    public static kc6 b(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return kc6.GONE;
                }
                i.i(wh1.g(i, "Unknown visibility "));
                return null;
            }
            return kc6.INVISIBLE;
        }
        return kc6.VISIBLE;
    }
}
