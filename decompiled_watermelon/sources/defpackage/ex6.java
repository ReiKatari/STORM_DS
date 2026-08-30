package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex6  reason: default package */
/* loaded from: classes.dex */
public interface ex6 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        if (b53.x(obj, a()) && b53.x(obj2, c())) {
            return true;
        }
        return false;
    }

    Object c();
}
