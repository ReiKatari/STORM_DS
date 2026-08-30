package defpackage;

import android.net.Uri;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z37  reason: default package */
/* loaded from: classes.dex */
public final class z37 implements i73, p83 {
    @Override // defpackage.p83
    public final l73 a(Object obj, Type type, dz4 dz4Var) {
        return new l83(String.valueOf((Uri) obj));
    }

    @Override // defpackage.i73
    public final Object b(l73 l73Var, Type type, dz4 dz4Var) {
        l73Var.getClass();
        String d = l73Var.d();
        d.getClass();
        return Uri.parse(d);
    }
}
