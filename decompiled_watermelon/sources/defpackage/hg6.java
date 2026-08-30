package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg6  reason: default package */
/* loaded from: classes.dex */
public abstract class hg6 {
    static {
        ta[] taVarArr = {new ta(0)};
        HashMap hashMap = new HashMap();
        ta taVar = taVarArr[0];
        taVar.getClass();
        if (!hashMap.containsKey(gg6.class)) {
            hashMap.put(gg6.class, taVar);
            taVarArr[0].getClass();
            Collections.unmodifiableMap(hashMap);
            ta[] taVarArr2 = {new ta(1)};
            HashMap hashMap2 = new HashMap();
            ta taVar2 = taVarArr2[0];
            taVar2.getClass();
            if (!hashMap2.containsKey(gg6.class)) {
                hashMap2.put(gg6.class, taVar2);
                taVarArr2[0].getClass();
                Collections.unmodifiableMap(hashMap2);
                int i = m85.CONFIG_NAME_FIELD_NUMBER;
                try {
                    a();
                    return;
                } catch (GeneralSecurityException e) {
                    throw new ExceptionInInitializerError(e);
                }
            }
            f81.i(gg6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        f81.i(gg6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
    }

    public static void a() {
        k85.d(new wa(pa.class, new ta[]{new ta(0)}, 0));
        k85.d(new wa(db.class, new ta[]{new ta(1)}, 1));
        Object obj = new Object();
        synchronized (k85.class) {
            try {
                ConcurrentHashMap concurrentHashMap = k85.e;
                if (concurrentHashMap.containsKey(gg6.class) && !mg6.class.equals(((mg6) concurrentHashMap.get(gg6.class)).getClass())) {
                    Logger logger = k85.a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + gg6.class);
                    String name = gg6.class.getName();
                    String name2 = mg6.class.getName();
                    String name3 = mg6.class.getName();
                    throw new GeneralSecurityException("SetWrapper for primitive (" + name + ") is already registered to be " + name2 + ", cannot be re-registered with " + name3);
                }
                concurrentHashMap.put(gg6.class, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
