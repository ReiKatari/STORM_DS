package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c31  reason: default package */
/* loaded from: classes.dex */
public final class c31 implements java.lang.reflect.InvocationHandler {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public c31(defpackage.ar0 r2, defpackage.n82 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    public c31(defpackage.pa r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.b = r2
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L94;
                default: goto L5;
            }
        L5:
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L13
            java.lang.Object r6 = r8.invoke(r6, r9)
            goto L91
        L13:
            if (r9 == 0) goto L17
        L15:
            r3 = r9
            goto L1c
        L17:
            java.lang.Object r9 = r6.b
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            goto L15
        L1c:
            jd1 r9 = defpackage.jx4.b
            boolean r0 = r9.h(r8)
            if (r0 == 0) goto L2a
            java.lang.Object r6 = r9.g(r8, r7, r3)
            goto L91
        L2a:
            java.lang.Object r6 = r6.c
            pa r6 = (defpackage.pa) r6
        L2e:
            java.lang.Object r9 = r6.B
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            java.lang.Object r9 = r9.get(r8)
            boolean r0 = r9 instanceof defpackage.c03
            if (r0 == 0) goto L3d
            c03 r9 = (defpackage.c03) r9
            goto L81
        L3d:
            if (r9 != 0) goto L6a
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            monitor-enter(r1)
            java.lang.Object r9 = r6.B     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r9 = r9.putIfAbsent(r8, r1)     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L69
            c03 r9 = defpackage.c03.b(r6, r8)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch: java.lang.Throwable -> L5c
            r6.put(r8, r9)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            goto L81
        L5c:
            r0 = move-exception
            r6 = r0
            goto L6c
        L5f:
            r0 = move-exception
            r7 = r0
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch: java.lang.Throwable -> L5c
            r6.remove(r8)     // Catch: java.lang.Throwable -> L5c
            throw r7     // Catch: java.lang.Throwable -> L5c
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
        L6a:
            r1 = r9
            goto L6e
        L6c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            throw r6
        L6e:
            monitor-enter(r1)
            java.lang.Object r9 = r6.B     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 != 0) goto L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            goto L2e
        L7b:
            r0 = move-exception
            r6 = r0
            goto L92
        L7e:
            c03 r9 = (defpackage.c03) r9     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
        L81:
            vk4 r0 = new vk4
            vk5 r1 = r9.a
            xk4 r4 = r9.b
            b51 r5 = r9.c
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = r9.a(r0, r3)
        L91:
            return r6
        L92:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            throw r6
        L94:
            r2 = r7
            java.lang.Object r7 = r6.c
            n82 r7 = (defpackage.n82) r7
            r2.getClass()
            r8.getClass()
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = "accept"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto Le0
            if (r9 == 0) goto Le0
            int r0 = r9.length
            if (r0 != r3) goto Le0
            java.lang.Object r6 = r6.b
            ar0 r6 = (defpackage.ar0) r6
            r8 = r9[r1]
            boolean r9 = r6.d(r8)
            if (r9 == 0) goto Lc8
            r8.getClass()
            r7.g(r8)
            jg7 r6 = defpackage.jg7.a
            goto L148
        Lc8:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            java.lang.String r8 = "Value cannot be cast to "
            java.lang.String r6 = r6.b()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r7.<init>(r6)
            throw r7
        Le0:
            java.lang.String r6 = r8.getName()
            java.lang.String r0 = "equals"
            boolean r6 = defpackage.nb3.k(r6, r0)
            if (r6 == 0) goto L107
            java.lang.Class r6 = r8.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L107
            if (r9 == 0) goto L107
            int r6 = r9.length
            if (r6 != r3) goto L107
            r6 = r9[r1]
            if (r2 != r6) goto L102
            r1 = r3
        L102:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            goto L148
        L107:
            java.lang.String r6 = r8.getName()
            java.lang.String r0 = "hashCode"
            boolean r6 = defpackage.nb3.k(r6, r0)
            if (r6 == 0) goto L12a
            java.lang.Class r6 = r8.getReturnType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L12a
            if (r9 != 0) goto L12a
            int r6 = r7.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L148
        L12a:
            java.lang.String r6 = r8.getName()
            java.lang.String r0 = "toString"
            boolean r6 = defpackage.nb3.k(r6, r0)
            if (r6 == 0) goto L149
            java.lang.Class r6 = r8.getReturnType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L149
            if (r9 != 0) goto L149
            java.lang.String r6 = r7.toString()
        L148:
            return r6
        L149:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected method call object:"
            r7.<init>(r0)
            r7.append(r2)
            java.lang.String r0 = ", method: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ", args: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }
}
