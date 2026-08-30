package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s75  reason: default package */
/* loaded from: classes.dex */
public final class s75 extends u75 {
    public final /* synthetic */ Method b;

    public s75(Method method) {
        this.b = method;
    }

    @Override // defpackage.u75
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            c44.o("Failed invoking canAccess", e);
            return false;
        }
    }
}
