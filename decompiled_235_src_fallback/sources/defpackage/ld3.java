package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld3  reason: default package */
/* loaded from: classes.dex */
public final class ld3 implements defpackage.zc7 {
    public static final defpackage.kd3 L = null;
    public static final defpackage.kd3 R = null;
    public final defpackage.ci A;
    public final java.util.concurrent.ConcurrentHashMap B;

    static {
            kd3 r0 = new kd3
            r1 = 0
            r0.<init>(r1)
            defpackage.ld3.L = r0
            kd3 r0 = new kd3
            r0.<init>(r1)
            defpackage.ld3.R = r0
            return
    }

    public ld3(defpackage.ci r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r8, defpackage.ie7 r9) {
            r7 = this;
            java.lang.Class r0 = r9.a
            java.lang.Class<jd3> r1 = defpackage.jd3.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            r5 = r0
            jd3 r5 = (defpackage.jd3) r5
            if (r5 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            ci r2 = r7.A
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            yc7 r7 = r1.b(r2, r3, r4, r5, r6)
            return r7
    }

    public final defpackage.yc7 b(defpackage.ci r8, defpackage.su2 r9, defpackage.ie7 r10, defpackage.jd3 r11, boolean r12) {
            r7 = this;
            java.lang.Class r0 = r11.value()
            ie7 r1 = new ie7
            r1.<init>(r0)
            r0 = 1
            ph4 r8 = r8.l(r1, r0)
            java.lang.Object r8 = r8.e()
            boolean r6 = r11.nullSafe()
            boolean r11 = r8 instanceof defpackage.yc7
            if (r11 == 0) goto L1e
            yc7 r8 = (defpackage.yc7) r8
            goto L93
        L1e:
            boolean r11 = r8 instanceof defpackage.zc7
            if (r11 == 0) goto L38
            zc7 r8 = (defpackage.zc7) r8
            if (r12 == 0) goto L33
            java.lang.Class r11 = r10.a
            java.util.concurrent.ConcurrentHashMap r7 = r7.B
            java.lang.Object r7 = r7.putIfAbsent(r11, r8)
            zc7 r7 = (defpackage.zc7) r7
            if (r7 == 0) goto L33
            r8 = r7
        L33:
            yc7 r8 = r8.a(r9, r10)
            goto L93
        L38:
            boolean r7 = r8 instanceof defpackage.if3
            if (r7 != 0) goto L70
            boolean r11 = r8 instanceof defpackage.be3
            if (r11 == 0) goto L41
            goto L70
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.reflect.Type r9 = r10.b
            java.lang.String r9 = defpackage.q60.b0(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Invalid attempt to bind an instance of "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L70:
            r11 = 0
            if (r7 == 0) goto L78
            r7 = r8
            if3 r7 = (defpackage.if3) r7
            r1 = r7
            goto L79
        L78:
            r1 = r11
        L79:
            boolean r7 = r8 instanceof defpackage.be3
            if (r7 == 0) goto L80
            r11 = r8
            be3 r11 = (defpackage.be3) r11
        L80:
            r2 = r11
            if (r12 == 0) goto L87
            kd3 r7 = defpackage.ld3.L
        L85:
            r5 = r7
            goto L8a
        L87:
            kd3 r7 = defpackage.ld3.R
            goto L85
        L8a:
            yb7 r0 = new yb7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = 0
            r8 = r0
        L93:
            if (r8 == 0) goto L9c
            if (r6 == 0) goto L9c
            xc7 r7 = r8.a()
            return r7
        L9c:
            return r8
    }
}
