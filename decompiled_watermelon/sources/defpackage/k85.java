package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k85  reason: default package */
/* loaded from: classes.dex */
public abstract class k85 {
    public static final Logger a = Logger.getLogger(k85.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(Class cls, String str) {
        synchronized (k85.class) {
            try {
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(str)) {
                    return;
                }
                j85 j85Var = (j85) concurrentHashMap.get(str);
                if (j85Var.a.getClass().equals(cls)) {
                    if (((Boolean) d.get(str)).booleanValue()) {
                        return;
                    }
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                Logger logger = a;
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                String name = j85Var.a.getClass().getName();
                String name2 = cls.getName();
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + name + ", cannot be re-registered with " + name2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized j85 b(String str) {
        j85 j85Var;
        synchronized (k85.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                j85Var = (j85) concurrentHashMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return j85Var;
    }

    public static synchronized ca3 c(ua3 ua3Var) {
        ca3 o;
        synchronized (k85.class) {
            wa waVar = b(ua3Var.q()).a;
            t71 t71Var = new t71(waVar, waVar.c);
            if (((Boolean) d.get(ua3Var.q())).booleanValue()) {
                o = t71Var.o(ua3Var.r());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + ua3Var.q());
            }
        }
        return o;
    }

    public static synchronized void d(wa waVar) {
        synchronized (k85.class) {
            try {
                String a2 = waVar.a();
                a(waVar.getClass(), a2);
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(a2)) {
                    concurrentHashMap.put(a2, new j85(waVar));
                    c.put(a2, new vn1(20));
                }
                d.put(a2, Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
