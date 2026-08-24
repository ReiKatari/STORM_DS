package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr6  reason: default package */
/* loaded from: classes.dex */
public abstract class yr6 {
    static {
        ya[] yaVarArr = {new ya(0)};
        HashMap hashMap = new HashMap();
        ya yaVar = yaVarArr[0];
        yaVar.getClass();
        if (!hashMap.containsKey(xr6.class)) {
            hashMap.put(xr6.class, yaVar);
            yaVarArr[0].getClass();
            Collections.unmodifiableMap(hashMap);
            ya[] yaVarArr2 = {new ya(1)};
            HashMap hashMap2 = new HashMap();
            ya yaVar2 = yaVarArr2[0];
            yaVar2.getClass();
            if (!hashMap2.containsKey(xr6.class)) {
                hashMap2.put(xr6.class, yaVar2);
                yaVarArr2[0].getClass();
                Collections.unmodifiableMap(hashMap2);
                int i = ci5.CONFIG_NAME_FIELD_NUMBER;
                try {
                    a();
                    return;
                } catch (GeneralSecurityException e) {
                    throw new ExceptionInInitializerError(e);
                }
            }
            e41.A(xr6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        e41.A(xr6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
    }

    public static void a() {
        ai5.d(new bb(ua.class, new ya[]{new ya(0)}, 0));
        ai5.d(new bb(jb.class, new ya[]{new ya(1)}, 1));
        Object obj = new Object();
        synchronized (ai5.class) {
            try {
                ConcurrentHashMap concurrentHashMap = ai5.e;
                if (concurrentHashMap.containsKey(xr6.class) && !ds6.class.equals(((ds6) concurrentHashMap.get(xr6.class)).getClass())) {
                    Logger logger = ai5.a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + xr6.class);
                    String name = xr6.class.getName();
                    String name2 = ds6.class.getName();
                    String name3 = ds6.class.getName();
                    throw new GeneralSecurityException("SetWrapper for primitive (" + name + ") is already registered to be " + name2 + ", cannot be re-registered with " + name3);
                }
                concurrentHashMap.put(xr6.class, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
