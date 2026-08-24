package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dy3  reason: default package */
/* loaded from: classes.dex */
public abstract class dy3 {
    public static final l55 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r1 instanceof defpackage.l55) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = (defpackage.l55) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        r1 = null;
     */
    static {
        Object em5Var;
        Object obj = null;
        try {
            ClassLoader classLoader = g56.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof di1) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        l55 l55Var = (l55) obj;
        if (l55Var == null) {
            l55Var = new l55(new pi3(11));
        }
        a = l55Var;
    }
}
