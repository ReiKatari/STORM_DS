package defpackage;

import android.view.View;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ug7  reason: default package */
/* loaded from: classes.dex */
public abstract class ug7 {
    public static final d24 a;

    static {
        long[] jArr = wu5.a;
        a = new d24();
    }

    public static final dv0 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof dv0) {
            return (dv0) tag;
        }
        return null;
    }
}
