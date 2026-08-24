package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh4  reason: default package */
/* loaded from: classes.dex */
public final class zh4 extends u28 implements d13 {
    public final Object d;

    public zh4(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o28, d13] */
    public static d13 c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof d13) {
            return (d13) queryLocalInterface;
        }
        return new o28(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object d(d13 d13Var) {
        if (d13Var instanceof zh4) {
            return ((zh4) d13Var).d;
        }
        IBinder asBinder = d13Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            i.h("IObjectWrapper declared field not private!");
            return null;
        }
        i.h(lb1.g(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        return null;
    }
}
