package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr6  reason: default package */
/* loaded from: classes.dex */
public abstract class yr6 {
    static {
            ya r0 = new ya
            r1 = 0
            r0.<init>(r1)
            ya[] r0 = new defpackage.ya[]{r0}
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r0[r1]
            r3.getClass()
            java.lang.Class<xr6> r4 = defpackage.xr6.class
            boolean r5 = r2.containsKey(r4)
            java.lang.String r6 = "KeyTypeManager constructed with duplicate factories for primitive "
            if (r5 != 0) goto L63
            r2.put(r4, r3)
            r0 = r0[r1]
            r0.getClass()
            java.util.Collections.unmodifiableMap(r2)
            ya r0 = new ya
            r2 = 1
            r0.<init>(r2)
            ya[] r0 = new defpackage.ya[]{r0}
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r0[r1]
            r3.getClass()
            boolean r5 = r2.containsKey(r4)
            if (r5 != 0) goto L5b
            r2.put(r4, r3)
            r0 = r0[r1]
            r0.getClass()
            java.util.Collections.unmodifiableMap(r2)
            int r0 = defpackage.ci5.CONFIG_NAME_FIELD_NUMBER
            a()     // Catch: java.security.GeneralSecurityException -> L54
            return
        L54:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
        L5b:
            java.lang.String r0 = r4.getCanonicalName()
            defpackage.e41.A(r0, r6)
            return
        L63:
            java.lang.String r0 = r4.getCanonicalName()
            defpackage.e41.A(r0, r6)
            return
    }

    public static void a() {
            bb r0 = new bb
            java.lang.Class<ua> r1 = defpackage.ua.class
            ya r2 = new ya
            r3 = 0
            r2.<init>(r3)
            ya[] r2 = new defpackage.ya[]{r2}
            r0.<init>(r1, r2, r3)
            defpackage.ai5.d(r0)
            bb r0 = new bb
            java.lang.Class<jb> r1 = defpackage.jb.class
            ya r2 = new ya
            r3 = 1
            r2.<init>(r3)
            ya[] r2 = new defpackage.ya[]{r2}
            r0.<init>(r1, r2, r3)
            defpackage.ai5.d(r0)
            ds6 r0 = new ds6
            r0.<init>()
            java.lang.String r1 = "SetWrapper for primitive ("
            java.lang.String r2 = "Attempted overwrite of a registered SetWrapper for type "
            java.lang.Class<ai5> r3 = defpackage.ai5.class
            monitor-enter(r3)
            java.lang.Class<xr6> r4 = defpackage.xr6.class
            java.util.concurrent.ConcurrentHashMap r5 = defpackage.ai5.e     // Catch: java.lang.Throwable -> L94
            boolean r6 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L96
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L94
            ds6 r6 = (defpackage.ds6) r6     // Catch: java.lang.Throwable -> L94
            java.lang.Class<ds6> r7 = defpackage.ds6.class
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L94
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L51
            goto L96
        L51:
            java.util.logging.Logger r0 = defpackage.ai5.a     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L94
            r5.append(r4)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L94
            r0.warning(r2)     // Catch: java.lang.Throwable -> L94
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L94
            java.lang.Class<ds6> r4 = defpackage.ds6.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L94
            java.lang.Class<ds6> r5 = defpackage.ds6.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L94
            r6.append(r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = ") is already registered to be "
            r6.append(r1)     // Catch: java.lang.Throwable -> L94
            r6.append(r4)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = ", cannot be re-registered with "
            r6.append(r1)     // Catch: java.lang.Throwable -> L94
            r6.append(r5)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L94
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L94
            throw r0     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            goto L9b
        L96:
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r3)
            return
        L9b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            throw r0
    }
}
