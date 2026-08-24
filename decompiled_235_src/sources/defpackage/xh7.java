package defpackage;

import android.net.Uri;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh7  reason: default package */
/* loaded from: classes.dex */
public final class xh7 implements be3, if3 {
    @Override // defpackage.be3
    public final Object a(ee3 ee3Var, Type type, j97 j97Var) {
        ee3Var.getClass();
        String c = ee3Var.c();
        c.getClass();
        return Uri.parse(c);
    }

    @Override // defpackage.if3
    public final ee3 b(Object obj, Type type, j97 j97Var) {
        return new ef3(String.valueOf((Uri) obj));
    }
}
