package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar0  reason: default package */
/* loaded from: classes.dex */
public final class ar0 implements defpackage.yq0 {
    public static final java.util.Map b = null;
    public final java.lang.Class a;

    static {
            java.lang.Class<co2> r22 = defpackage.co2.class
            java.lang.Class<do2> r23 = defpackage.do2.class
            java.lang.Class<on2> r1 = defpackage.on2.class
            java.lang.Class<qn2> r2 = defpackage.qn2.class
            java.lang.Class<eo2> r3 = defpackage.eo2.class
            java.lang.Class<fo2> r4 = defpackage.fo2.class
            java.lang.Class<go2> r5 = defpackage.go2.class
            java.lang.Class<ho2> r6 = defpackage.ho2.class
            java.lang.Class<io2> r7 = defpackage.io2.class
            java.lang.Class<jo2> r8 = defpackage.jo2.class
            java.lang.Class<ko2> r9 = defpackage.ko2.class
            java.lang.Class<lo2> r10 = defpackage.lo2.class
            java.lang.Class<pn2> r11 = defpackage.pn2.class
            java.lang.Class<rn2> r12 = defpackage.rn2.class
            java.lang.Class<sn2> r13 = defpackage.sn2.class
            java.lang.Class<tn2> r14 = defpackage.tn2.class
            java.lang.Class<un2> r15 = defpackage.un2.class
            java.lang.Class<vn2> r16 = defpackage.vn2.class
            java.lang.Class<wn2> r17 = defpackage.wn2.class
            java.lang.Class<xn2> r18 = defpackage.xn2.class
            java.lang.Class<yn2> r19 = defpackage.yn2.class
            java.lang.Class<zn2> r20 = defpackage.zn2.class
            java.lang.Class<bo2> r21 = defpackage.bo2.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L46:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L64
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            vr4 r5 = new vr4
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L46
        L64:
            defpackage.hf.q0()
            r0 = 0
            throw r0
        L69:
            java.util.Map r0 = defpackage.c14.r0(r1)
            defpackage.ar0.b = r0
            return
    }

    public ar0(java.lang.Class r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yq0
    public final java.lang.Class a() {
            r0 = this;
            java.lang.Class r0 = r0.a
            return r0
    }

    public final java.lang.String b() {
            r2 = this;
            java.lang.Class r2 = r2.a
            r2.getClass()
            boolean r0 = r2.isAnonymousClass()
            r1 = 0
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            boolean r0 = r2.isLocalClass()
            if (r0 == 0) goto L14
        L13:
            return r1
        L14:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L3a
            java.lang.Class r2 = r2.getComponentType()
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L34
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = defpackage.f04.u(r2)
            if (r2 == 0) goto L34
            java.lang.String r0 = "Array"
            java.lang.String r1 = r2.concat(r0)
        L34:
            if (r1 != 0) goto L39
            java.lang.String r2 = "kotlin.Array"
            return r2
        L39:
            return r1
        L3a:
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = defpackage.f04.u(r0)
            if (r0 != 0) goto L49
            java.lang.String r2 = r2.getCanonicalName()
            return r2
        L49:
            return r0
    }

    public final java.lang.String c() {
            r3 = this;
            java.lang.Class r3 = r3.a
            r3.getClass()
            boolean r0 = r3.isAnonymousClass()
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r3.isLocalClass()
            if (r0 == 0) goto L5a
            java.lang.String r0 = r3.getSimpleName()
            java.lang.reflect.Method r1 = r3.getEnclosingMethod()
            r2 = 36
            if (r1 == 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = defpackage.qs6.N0(r0, r3, r0)
            return r3
        L37:
            java.lang.reflect.Constructor r3 = r3.getEnclosingConstructor()
            if (r3 == 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = defpackage.qs6.N0(r0, r3, r0)
            return r3
        L55:
            java.lang.String r3 = defpackage.qs6.M0(r2, r0, r0)
            return r3
        L5a:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L7e
            java.lang.Class r3 = r3.getComponentType()
            boolean r0 = r3.isPrimitive()
            java.lang.String r2 = "Array"
            if (r0 == 0) goto L7a
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = defpackage.f04.Q(r3)
            if (r3 == 0) goto L7a
            java.lang.String r1 = r3.concat(r2)
        L7a:
            if (r1 != 0) goto L7d
            return r2
        L7d:
            return r1
        L7e:
            java.lang.String r0 = r3.getName()
            java.lang.String r0 = defpackage.f04.Q(r0)
            if (r0 != 0) goto L8d
            java.lang.String r3 = r3.getSimpleName()
            return r3
        L8d:
            return r0
    }

    public final boolean d(java.lang.Object r2) {
            r1 = this;
            java.lang.Class r1 = r1.a
            r1.getClass()
            java.util.Map r0 = defpackage.ar0.b
            r0.getClass()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1b
            int r1 = r0.intValue()
            boolean r1 = defpackage.ge7.I(r1, r2)
            return r1
        L1b:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L29
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.Class r1 = defpackage.kj2.z(r1)
        L29:
            boolean r1 = r1.isInstance(r2)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ar0
            if (r0 == 0) goto L16
            java.lang.Class r1 = defpackage.kj2.z(r1)
            ar0 r2 = (defpackage.ar0) r2
            java.lang.Class r2 = defpackage.kj2.z(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = defpackage.kj2.z(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
