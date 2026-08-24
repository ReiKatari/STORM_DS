package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy3  reason: default package */
/* loaded from: classes.dex */
public abstract class sy3 {
    public static volatile int a;
    public static final ci b = new ci();
    public static final w31 c = new w31(16);
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String str;
        boolean equalsIgnoreCase;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("true");
        }
        d = equalsIgnoreCase;
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSet;
        try {
            try {
                try {
                    if (!f()) {
                        linkedHashSet = b();
                        i(linkedHashSet);
                    } else {
                        linkedHashSet = null;
                    }
                    StaticLoggerBinder.getSingleton();
                    a = 3;
                    h(linkedHashSet);
                    g();
                } catch (NoClassDefFoundError e2) {
                    String message = e2.getMessage();
                    if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        a = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        e2.printStackTrace();
                        throw e2;
                    }
                    a = 4;
                    ak7.x0("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    ak7.x0("Defaulting to no-operation (NOP) logger implementation");
                    ak7.x0("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    g();
                }
            } catch (Exception e3) {
                a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e3.printStackTrace();
                throw new IllegalStateException("Unexpected initialization failure", e3);
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    a = 2;
                    ak7.x0("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    ak7.x0("Your binding is version 1.5.5 or earlier.");
                    ak7.x0("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = sy3.class.getClassLoader();
            String str = f;
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(str);
            } else {
                resources = classLoader.getResources(str);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e2) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            return linkedHashSet;
        }
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (sy3.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            j();
                        }
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return c;
                    }
                    i.m("Unreachable code");
                    return null;
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            i.m("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public static ry3 d(Class cls) {
        int i;
        zj7 zj7Var;
        ry3 e2 = e(cls.getName());
        if (d) {
            zj7 zj7Var2 = ak7.a;
            Class cls2 = null;
            zj7 zj7Var3 = zj7Var2;
            if (zj7Var2 == null) {
                if (ak7.b) {
                    zj7Var3 = null;
                } else {
                    try {
                        zj7Var = new SecurityManager();
                    } catch (SecurityException unused) {
                        zj7Var = null;
                    }
                    ak7.a = zj7Var;
                    ak7.b = true;
                    zj7Var3 = zj7Var;
                }
            }
            if (zj7Var3 != null) {
                Class[] classContext = zj7Var3.getClassContext();
                String name = ak7.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
                    cls2 = classContext[i];
                } else {
                    i.m("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                ak7.x0("Detected logger name mismatch. Given name: \"" + e2.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                ak7.x0("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return e2;
    }

    public static ry3 e(String str) {
        return c().g(str);
    }

    public static boolean f() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    public static void g() {
        ci ciVar = b;
        synchronized (ciVar) {
            try {
                ciVar.B = true;
                ArrayList arrayList = new ArrayList(((HashMap) ciVar.L).values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zt6 zt6Var = (zt6) obj;
                    zt6Var.B = e(zt6Var.A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) b.R;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                au6 au6Var = (au6) obj2;
                if (au6Var != null) {
                    zt6 zt6Var2 = au6Var.a;
                    String str = zt6Var2.A;
                    if (zt6Var2.B != null) {
                        if (!(zt6Var2.B instanceof mb4)) {
                            if (zt6Var2.f()) {
                                if (zt6Var2.f()) {
                                    try {
                                        zt6Var2.R.invoke(zt6Var2.B, au6Var);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                ak7.x0(str);
                            }
                        }
                    } else {
                        i.m("Delegate logger cannot be null at this state.");
                        return;
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (au6Var.a.f()) {
                        ak7.x0("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        ak7.x0("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        ak7.x0("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(au6Var.a.B instanceof mb4)) {
                        ak7.x0("The following set of substitute loggers may have been accessed");
                        ak7.x0("during the initialization phase. Logging calls during this");
                        ak7.x0("phase were not honored. However, subsequent logging calls to these");
                        ak7.x0("loggers will work as normally expected.");
                        ak7.x0("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        ci ciVar2 = b;
        ((HashMap) ciVar2.L).clear();
        ((LinkedBlockingQueue) ciVar2.R).clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null && linkedHashSet.size() > 1) {
            ak7.x0("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            ak7.x0("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ak7.x0("Found binding in [" + ((URL) it.next()) + "]");
            }
            ak7.x0("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                ak7.x0("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
                ak7.x0("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
