package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rv0 implements o55 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rv0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o55
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (tv0.class.isAssignableFrom(cls)) {
                        return (tv0) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(lb1.A("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(lb1.A("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(i61.m("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(i61.m("Could not instantiate ", str), e4);
                }
            default:
                return (tv0) obj;
        }
    }
}
