package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ap  reason: default package */
/* loaded from: classes.dex */
public final class ap {
    public final Context a;
    public final Map b;

    public ap(Context context, w37 w37Var, o54 o54Var) {
        this.a = context;
        p54 p54Var = new p54(context, w37Var);
        this.b = zt3.l0(new ti4("nds", p54Var), new ti4("dsi", p54Var), new ti4("ids", p54Var), new ti4("zip", new rv0(context, w37Var, o54Var)), new ti4("7z", new j26(context, w37Var, o54Var)));
    }

    public final am5 a(uh1 uh1Var) {
        int D0;
        String i = uh1Var.i();
        if (i == null || (D0 = zg6.D0('.', 0, 6, i)) < 0) {
            return null;
        }
        String lowerCase = i.substring(D0 + 1).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (am5) this.b.get(lowerCase);
    }
}
