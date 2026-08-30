package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ys5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ys5 {
    public static final /* synthetic */ Unsafe a = a();

    public static /* synthetic */ Unsafe a() {
        Field field;
        Field field2;
        try {
            field2 = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    field = declaredFields[i];
                    if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                        break;
                    }
                    i++;
                } else {
                    field = null;
                    break;
                }
            }
            if (field == null) {
                field2 = field;
            } else {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        field2.setAccessible(true);
        try {
            return (Unsafe) field2.get(null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
