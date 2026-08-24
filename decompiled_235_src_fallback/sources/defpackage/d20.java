package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d20  reason: default package */
/* loaded from: classes.dex */
public abstract class d20 implements defpackage.r41, defpackage.y61, java.io.Serializable {
    public final defpackage.r41 A;

    public d20(defpackage.r41 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.y61
    public defpackage.y61 f() {
            r1 = this;
            r41 r1 = r1.A
            boolean r0 = r1 instanceof defpackage.y61
            if (r0 == 0) goto L9
            y61 r1 = (defpackage.y61) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r3) {
            r2 = this;
        L0:
            d20 r2 = (defpackage.d20) r2
            r41 r0 = r2.A
            r0.getClass()
            java.lang.Object r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L10
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L10
            if (r3 != r1) goto L17
            return
        L10:
            r3 = move-exception
            em5 r1 = new em5
            r1.<init>(r3)
            r3 = r1
        L17:
            r2.u()
            boolean r2 = r0 instanceof defpackage.d20
            if (r2 == 0) goto L20
            r2 = r0
            goto L0
        L20:
            r0.i(r3)
            return
    }

    public defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            r1.getClass()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Any?;Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.StackTraceElement r() {
            r8 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<mc1> r1 = defpackage.mc1.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            mc1 r0 = (defpackage.mc1) r0
            r1 = 0
            if (r0 != 0) goto L10
            goto L17
        L10:
            int r2 = r0.v()
            r3 = 1
            if (r2 >= r3) goto L18
        L17:
            return r1
        L18:
            r2 = -1
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = "label"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L3c
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L3c
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L31
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L3c
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 == 0) goto L39
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3c
            goto L3a
        L39:
            r4 = 0
        L3a:
            int r4 = r4 - r3
            goto L3d
        L3c:
            r4 = r2
        L3d:
            if (r4 >= 0) goto L40
            goto L46
        L40:
            int[] r2 = r0.l()
            r2 = r2[r4]
        L46:
            f74 r3 = defpackage.jw2.v
            f74 r4 = defpackage.jw2.w
            if (r4 != 0) goto L88
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L85
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "getDescriptor"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r1)     // Catch: java.lang.Exception -> L85
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = "name"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r1)     // Catch: java.lang.Exception -> L85
            f74 r7 = new f74     // Catch: java.lang.Exception -> L85
            r7.<init>(r4, r5, r6)     // Catch: java.lang.Exception -> L85
            defpackage.jw2.w = r7     // Catch: java.lang.Exception -> L85
            r4 = r7
            goto L88
        L85:
            defpackage.jw2.w = r3
            r4 = r3
        L88:
            if (r4 != r3) goto L8b
            goto Lb6
        L8b:
            java.lang.reflect.Method r3 = r4.a
            if (r3 == 0) goto Lb6
            java.lang.Class r8 = r8.getClass()
            java.lang.Object r8 = r3.invoke(r8, r1)
            if (r8 != 0) goto L9a
            goto Lb6
        L9a:
            java.lang.reflect.Method r3 = r4.b
            if (r3 == 0) goto Lb6
            java.lang.Object r8 = r3.invoke(r8, r1)
            if (r8 != 0) goto La5
            goto Lb6
        La5:
            java.lang.reflect.Method r3 = r4.c
            if (r3 == 0) goto Lae
            java.lang.Object r8 = r3.invoke(r8, r1)
            goto Laf
        Lae:
            r8 = r1
        Laf:
            boolean r3 = r8 instanceof java.lang.String
            if (r3 == 0) goto Lb6
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
        Lb6:
            if (r1 != 0) goto Lbd
            java.lang.String r8 = r0.c()
            goto Ld5
        Lbd:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r1 = 47
            r8.append(r1)
            java.lang.String r1 = r0.c()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
        Ld5:
            java.lang.StackTraceElement r1 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r1.<init>(r8, r3, r0, r2)
            return r1
    }

    public abstract java.lang.Object s(java.lang.Object r1);

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.StackTraceElement r1 = r2.r()
            if (r1 != 0) goto L15
            java.lang.Class r2 = r2.getClass()
            java.lang.String r1 = r2.getName()
        L15:
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void u() {
            r0 = this;
            return
    }
}
