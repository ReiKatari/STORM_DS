package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy3  reason: default package */
/* loaded from: classes.dex */
public abstract class sy3 {
    public static volatile int a;
    public static final defpackage.ci b = null;
    public static final defpackage.w31 c = null;
    public static final boolean d = false;
    public static final java.lang.String[] e = null;
    public static final java.lang.String f = null;

    static {
            ci r0 = new ci
            r0.<init>()
            defpackage.sy3.b = r0
            w31 r0 = new w31
            r1 = 16
            r0.<init>(r1)
            defpackage.sy3.c = r0
            java.lang.String r0 = "slf4j.detectLoggerNameMismatch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1c
            r0 = 0
            goto L22
        L1c:
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
        L22:
            defpackage.sy3.d = r0
            java.lang.String r0 = "1.6"
            java.lang.String r1 = "1.7"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            defpackage.sy3.e = r0
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            defpackage.sy3.f = r0
            return
    }

    public static final void a() {
            java.lang.String r0 = "Reported exception:"
            java.lang.String r1 = "Failed to instantiate SLF4J LoggerFactory"
            r2 = 2
            boolean r3 = f()     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            if (r3 != 0) goto L19
            java.util.LinkedHashSet r3 = b()     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            i(r3)     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            goto L1a
        L13:
            r3 = move-exception
            goto L27
        L15:
            r0 = move-exception
            goto L3e
        L17:
            r3 = move-exception
            goto L5e
        L19:
            r3 = 0
        L1a:
            org.slf4j.impl.StaticLoggerBinder.getSingleton()     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            r4 = 3
            defpackage.sy3.a = r4     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            h(r3)     // Catch: java.lang.Exception -> L13 java.lang.NoSuchMethodError -> L15 java.lang.NoClassDefFoundError -> L17 java.lang.Throwable -> L9b
            g()
            return
        L27:
            defpackage.sy3.a = r2     // Catch: java.lang.Throwable -> L9b
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L9b
            r2.println(r1)     // Catch: java.lang.Throwable -> L9b
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L9b
            r1.println(r0)     // Catch: java.lang.Throwable -> L9b
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L9b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "Unexpected initialization failure"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L3e:
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L5d
            java.lang.String r3 = "org.slf4j.impl.StaticLoggerBinder.getSingleton()"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L5d
            defpackage.sy3.a = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "slf4j-api 1.6.x (or later) is incompatible with this binding."
            defpackage.ak7.x0(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "Your binding is version 1.5.5 or earlier."
            defpackage.ak7.x0(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "Upgrade your binding to version 1.6.x."
            defpackage.ak7.x0(r1)     // Catch: java.lang.Throwable -> L9b
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L9b
        L5e:
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L8b
            java.lang.String r5 = "org/slf4j/impl/StaticLoggerBinder"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L6d
            goto L75
        L6d:
            java.lang.String r5 = "org.slf4j.impl.StaticLoggerBinder"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L8b
        L75:
            r0 = 4
            defpackage.sy3.a = r0     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."
            defpackage.ak7.x0(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            defpackage.ak7.x0(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."
            defpackage.ak7.x0(r0)     // Catch: java.lang.Throwable -> L9b
            g()
            return
        L8b:
            defpackage.sy3.a = r2     // Catch: java.lang.Throwable -> L9b
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L9b
            r2.println(r1)     // Catch: java.lang.Throwable -> L9b
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L9b
            r1.println(r0)     // Catch: java.lang.Throwable -> L9b
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L9b
            throw r3     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            g()
            throw r0
    }

    public static java.util.LinkedHashSet b() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Class<sy3> r1 = defpackage.sy3.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L14
            java.lang.String r2 = defpackage.sy3.f
            if (r1 != 0) goto L16
            java.util.Enumeration r1 = java.lang.ClassLoader.getSystemResources(r2)     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r1 = move-exception
            goto L2b
        L16:
            java.util.Enumeration r1 = r1.getResources(r2)     // Catch: java.io.IOException -> L14
        L1a:
            boolean r2 = r1.hasMoreElements()     // Catch: java.io.IOException -> L14
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.nextElement()     // Catch: java.io.IOException -> L14
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.io.IOException -> L14
            r0.add(r2)     // Catch: java.io.IOException -> L14
            goto L1a
        L2a:
            return r0
        L2b:
            java.lang.String r2 = "Error getting resources from path"
            java.io.PrintStream r3 = java.lang.System.err
            r3.println(r2)
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r3 = "Reported exception:"
            r2.println(r3)
            r1.printStackTrace()
            return r0
    }

    public static org.slf4j.ILoggerFactory c() {
            int r0 = defpackage.sy3.a
            r1 = 3
            r2 = 1
            if (r0 != 0) goto L20
            java.lang.Class<sy3> r0 = defpackage.sy3.class
            monitor-enter(r0)
            int r3 = defpackage.sy3.a     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            defpackage.sy3.a = r2     // Catch: java.lang.Throwable -> L1a
            a()     // Catch: java.lang.Throwable -> L1a
            int r3 = defpackage.sy3.a     // Catch: java.lang.Throwable -> L1a
            if (r3 != r1) goto L1c
            j()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        L20:
            int r0 = defpackage.sy3.a
            if (r0 == r2) goto L46
            r2 = 2
            if (r0 == r2) goto L3f
            if (r0 == r1) goto L36
            r1 = 4
            if (r0 != r1) goto L2f
            w31 r0 = defpackage.sy3.c
            return r0
        L2f:
            java.lang.String r0 = "Unreachable code"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L36:
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()
            org.slf4j.ILoggerFactory r0 = r0.getLoggerFactory()
            return r0
        L3f:
            java.lang.String r0 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L46:
            ci r0 = defpackage.sy3.b
            return r0
    }

    public static defpackage.ry3 d(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            ry3 r0 = e(r0)
            boolean r1 = defpackage.sy3.d
            if (r1 == 0) goto L89
            zj7 r1 = defpackage.ak7.a
            r2 = 0
            if (r1 == 0) goto L12
            goto L24
        L12:
            boolean r1 = defpackage.ak7.b
            if (r1 == 0) goto L18
            r1 = r2
            goto L24
        L18:
            zj7 r1 = new zj7     // Catch: java.lang.SecurityException -> L1e
            r1.<init>()     // Catch: java.lang.SecurityException -> L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            defpackage.ak7.a = r1
            r3 = 1
            defpackage.ak7.b = r3
        L24:
            if (r1 != 0) goto L27
            goto L4f
        L27:
            java.lang.Class[] r1 = r1.getClassContext()
            java.lang.Class<ak7> r3 = defpackage.ak7.class
            java.lang.String r3 = r3.getName()
            r4 = 0
        L32:
            int r5 = r1.length
            if (r4 >= r5) goto L45
            r5 = r1[r4]
            java.lang.String r5 = r5.getName()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L42
            goto L45
        L42:
            int r4 = r4 + 1
            goto L32
        L45:
            int r3 = r1.length
            if (r4 >= r3) goto L83
            int r4 = r4 + 2
            int r3 = r1.length
            if (r4 >= r3) goto L83
            r2 = r1[r4]
        L4f:
            if (r2 == 0) goto L89
            boolean r6 = r2.isAssignableFrom(r6)
            if (r6 != 0) goto L89
            java.lang.String r6 = r0.getName()
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Detected logger name mismatch. Given name: \""
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = "\"; computed name: \""
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = "\"."
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            defpackage.ak7.x0(r6)
            java.lang.String r6 = "See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            defpackage.ak7.x0(r6)
            goto L89
        L83:
            java.lang.String r6 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            defpackage.i.m(r6)
            return r2
        L89:
            return r0
    }

    public static defpackage.ry3 e(java.lang.String r1) {
            org.slf4j.ILoggerFactory r0 = c()
            ry3 r1 = r0.g(r1)
            return r1
    }

    public static boolean f() {
            java.lang.String r0 = "java.vendor.url"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static void g() {
            ci r0 = defpackage.sy3.b
            monitor-enter(r0)
            r1 = 1
            r0.B = r1     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L2c
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = r3
        L19:
            if (r4 >= r2) goto L2f
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 1
            zt6 r5 = (defpackage.zt6) r5     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r5.A     // Catch: java.lang.Throwable -> L2c
            ry3 r6 = e(r6)     // Catch: java.lang.Throwable -> L2c
            r5.B = r6     // Catch: java.lang.Throwable -> L2c
            goto L19
        L2c:
            r1 = move-exception
            goto Lf3
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            ci r0 = defpackage.sy3.b
            java.lang.Object r0 = r0.R
            r1 = r0
            java.util.concurrent.LinkedBlockingQueue r1 = (java.util.concurrent.LinkedBlockingQueue) r1
            int r2 = r1.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 128(0x80, float:1.8E-43)
            r4.<init>(r5)
            r0 = r3
        L43:
            int r6 = r1.drainTo(r4, r5)
            if (r6 != 0) goto L5a
            ci r0 = defpackage.sy3.b
            java.lang.Object r1 = r0.L
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
            java.lang.Object r0 = r0.R
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            r0.clear()
            return
        L5a:
            int r6 = r4.size()
            r7 = r3
        L5f:
            if (r7 >= r6) goto Lee
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            au6 r8 = (defpackage.au6) r8
            if (r8 != 0) goto L6c
            goto L96
        L6c:
            zt6 r9 = r8.a
            java.lang.String r10 = r9.A
            ry3 r11 = r9.B
            if (r11 == 0) goto Le8
            ry3 r11 = r9.B
            boolean r11 = r11 instanceof defpackage.mb4
            if (r11 == 0) goto L7b
            goto L96
        L7b:
            boolean r11 = r9.f()
            if (r11 == 0) goto L93
            boolean r10 = r9.f()
            if (r10 == 0) goto L96
            java.lang.reflect.Method r10 = r9.R     // Catch: java.lang.Throwable -> L96
            ry3 r9 = r9.B     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r11 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L96
            r10.invoke(r9, r11)     // Catch: java.lang.Throwable -> L96
            goto L96
        L93:
            defpackage.ak7.x0(r10)
        L96:
            int r9 = r0 + 1
            if (r0 != 0) goto Le5
            zt6 r0 = r8.a
            boolean r0 = r0.f()
            if (r0 == 0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "A number ("
            r0.<init>(r8)
            r0.append(r2)
            java.lang.String r8 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "See also http://www.slf4j.org/codes.html#replay"
            defpackage.ak7.x0(r0)
            goto Le5
        Lc3:
            zt6 r0 = r8.a
            ry3 r0 = r0.B
            boolean r0 = r0 instanceof defpackage.mb4
            if (r0 == 0) goto Lcc
            goto Le5
        Lcc:
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            defpackage.ak7.x0(r0)
            java.lang.String r0 = "See also http://www.slf4j.org/codes.html#substituteLogger"
            defpackage.ak7.x0(r0)
        Le5:
            r0 = r9
            goto L5f
        Le8:
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            defpackage.i.m(r0)
            return
        Lee:
            r4.clear()
            goto L43
        Lf3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }

    public static void h(java.util.LinkedHashSet r1) {
            if (r1 == 0) goto L27
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Actual binding is of type ["
            r1.<init>(r0)
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()
            java.lang.String r0 = r0.getLoggerFactoryClassStr()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            defpackage.ak7.x0(r1)
        L27:
            return
    }

    public static void i(java.util.LinkedHashSet r3) {
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L38
            java.lang.String r0 = "Class path contains multiple SLF4J bindings."
            defpackage.ak7.x0(r0)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found binding in ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.ak7.x0(r0)
            goto L10
        L33:
            java.lang.String r3 = "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            defpackage.ak7.x0(r3)
        L38:
            return
    }

    public static final void j() {
            java.lang.String r0 = org.slf4j.impl.StaticLoggerBinder.REQUESTED_API_VERSION     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String[] r1 = defpackage.sy3.e     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            int r2 = r1.length     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            r3 = 0
            r4 = r3
        L7:
            if (r3 >= r2) goto L15
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            if (r5 == 0) goto L12
            r4 = 1
        L12:
            int r3 = r3 + 1
            goto L7
        L15:
            if (r4 != 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String r2 = "The requested version "
            r1.append(r2)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String r0 = " by your slf4j binding is not compatible with "
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String[] r0 = defpackage.sy3.e     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            defpackage.ak7.x0(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#version_mismatch for further details."
            defpackage.ak7.x0(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L55
            return
        L43:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occured during version sanity check"
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r1)
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "Reported exception:"
            r1.println(r2)
            r0.printStackTrace()
        L55:
            return
    }
}
