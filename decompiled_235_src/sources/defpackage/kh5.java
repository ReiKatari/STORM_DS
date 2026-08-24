package defpackage;

import java.lang.reflect.AccessibleObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh5  reason: default package */
/* loaded from: classes.dex */
public abstract class kh5 {
    public static final kh5 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kh5] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r1;
        if (qc3.a >= 9) {
            try {
                r1 = new ih5(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (r1 == 0) {
                r1 = new Object();
            }
            a = r1;
        }
        r1 = 0;
        if (r1 == 0) {
        }
        a = r1;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
