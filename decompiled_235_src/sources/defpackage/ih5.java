package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih5  reason: default package */
/* loaded from: classes.dex */
public final class ih5 extends kh5 {
    public final /* synthetic */ Method b;

    public ih5(Method method) {
        this.b = method;
    }

    @Override // defpackage.kh5
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            u34.p("Failed invoking canAccess", e);
            return false;
        }
    }
}
