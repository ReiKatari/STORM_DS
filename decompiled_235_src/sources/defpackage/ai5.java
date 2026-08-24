package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai5  reason: default package */
/* loaded from: classes.dex */
public abstract class ai5 {
    public static final Logger a = Logger.getLogger(ai5.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(Class cls, String str) {
        synchronized (ai5.class) {
            try {
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(str)) {
                    return;
                }
                zh5 zh5Var = (zh5) concurrentHashMap.get(str);
                if (zh5Var.a.getClass().equals(cls)) {
                    if (((Boolean) d.get(str)).booleanValue()) {
                        return;
                    }
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                Logger logger = a;
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                String name = zh5Var.a.getClass().getName();
                String name2 = cls.getName();
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + name + ", cannot be re-registered with " + name2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized zh5 b(String str) {
        zh5 zh5Var;
        synchronized (ai5.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                zh5Var = (zh5) concurrentHashMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return zh5Var;
    }

    public static synchronized vg3 c(mh3 mh3Var) {
        vg3 t;
        synchronized (ai5.class) {
            bb bbVar = b(mh3Var.q()).a;
            s63 s63Var = new s63(bbVar, bbVar.c);
            if (((Boolean) d.get(mh3Var.q())).booleanValue()) {
                t = s63Var.t(mh3Var.r());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + mh3Var.q());
            }
        }
        return t;
    }

    public static synchronized void d(bb bbVar) {
        synchronized (ai5.class) {
            try {
                String a2 = bbVar.a();
                a(bbVar.getClass(), a2);
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(a2)) {
                    concurrentHashMap.put(a2, new zh5(bbVar));
                    c.put(a2, new x31(22));
                }
                d.put(a2, Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
