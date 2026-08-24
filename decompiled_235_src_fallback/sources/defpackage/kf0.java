package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf0  reason: default package */
/* loaded from: classes.dex */
public final class kf0 {
    public final java.lang.String a;
    public final java.util.List b;
    public final java.util.List c;
    public final java.util.ArrayList d;
    public final defpackage.ji0 e;
    public final int f;
    public final java.util.Map g;
    public final int h;
    public final int i;
    public final java.util.Map j;
    public final java.util.List k;
    public final java.util.List l;
    public final java.util.Map m;
    public final defpackage.s54 n;
    public final defpackage.mf0 o;

    public kf0(java.lang.String r2, java.util.List r3, java.util.List r4, java.util.ArrayList r5, defpackage.ji0 r6, int r7, java.util.LinkedHashMap r8, int r9, defpackage.p04 r10, java.util.List r11, java.util.List r12, defpackage.mf0 r13) {
            r1 = this;
            s54 r0 = new s54
            r0.<init>()
            r2.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            r1.h = r9
            r2 = 1
            r1.i = r2
            r1.j = r10
            r1.k = r11
            r1.l = r12
            zt1 r2 = defpackage.zt1.A
            r1.m = r2
            r1.n = r0
            r1.o = r13
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto La6
        L4:
            boolean r0 = r3 instanceof defpackage.kf0
            if (r0 != 0) goto La
            goto La8
        La:
            kf0 r3 = (defpackage.kf0) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L18
            goto La8
        L18:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L24
            goto La8
        L24:
            java.util.List r0 = r2.c
            java.util.List r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L30
            goto La8
        L30:
            java.util.ArrayList r0 = r2.d
            java.util.ArrayList r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3c
            goto La8
        L3c:
            ji0 r0 = r2.e
            ji0 r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L47
            goto La8
        L47:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 != r1) goto La8
            java.util.Map r0 = r2.g
            java.util.Map r1 = r3.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L58
            goto La8
        L58:
            int r0 = r2.h
            int r1 = r3.h
            if (r0 != r1) goto La8
            int r0 = r2.i
            int r1 = r3.i
            if (r0 != r1) goto La8
            java.util.Map r0 = r2.j
            java.util.Map r1 = r3.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L6f
            goto La8
        L6f:
            java.util.List r0 = r2.k
            java.util.List r1 = r3.k
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L7a
            goto La8
        L7a:
            java.util.List r0 = r2.l
            java.util.List r1 = r3.l
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L85
            goto La8
        L85:
            java.util.Map r0 = r2.m
            java.util.Map r1 = r3.m
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L90
            goto La8
        L90:
            s54 r0 = r2.n
            s54 r1 = r3.n
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L9b
            goto La8
        L9b:
            mf0 r2 = r2.o
            mf0 r3 = r3.o
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto La6
            goto La8
        La6:
            r2 = 1
            return r2
        La8:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r2 = r4.c
            int r0 = defpackage.i61.b(r0, r2, r1)
            r2 = 0
            java.util.ArrayList r3 = r4.d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            ji0 r3 = r4.e
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r4.f
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.util.Map r2 = r4.g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.h
            int r0 = defpackage.lb1.a(r0, r2, r1)
            int r2 = r4.i
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.util.Map r2 = r4.j
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r4.k
            int r0 = defpackage.i61.b(r2, r0, r1)
            java.util.List r2 = r4.l
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.Map r2 = r4.m
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 29791
            s54 r0 = r4.n
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            mf0 r4 = r4.o
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            int r4 = r4 * r1
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Config(camera="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", streams="
            r0.append(r1)
            java.util.List r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", exclusiveStreamGroups="
            r0.append(r1)
            java.util.List r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", input="
            r0.append(r1)
            java.util.ArrayList r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", postviewStream="
            r0.append(r1)
            ji0 r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", sessionTemplate="
            r0.append(r1)
            int r1 = r3.f
            java.lang.String r1 = defpackage.bl5.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", sessionParameters="
            r0.append(r1)
            java.util.Map r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", sessionMode="
            r0.append(r1)
            int r1 = r3.h
            java.lang.String r1 = defpackage.q60.Z(r1)
            r0.append(r1)
            java.lang.String r1 = ", defaultTemplate="
            r0.append(r1)
            int r1 = r3.i
            java.lang.String r1 = defpackage.bl5.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", defaultParameters="
            r0.append(r1)
            java.util.Map r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", defaultListeners="
            r0.append(r1)
            java.util.List r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", graphStateListeners="
            r0.append(r1)
            java.util.List r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", requiredParameters="
            r0.append(r1)
            java.util.Map r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", cameraBackendId="
            r0.append(r1)
            java.lang.String r1 = "null"
            r0.append(r1)
            java.lang.String r2 = ", customCameraBackend=null, metadataTransform="
            r0.append(r2)
            s54 r2 = r3.n
            r0.append(r2)
            java.lang.String r2 = ", flags="
            r0.append(r2)
            mf0 r3 = r3.o
            r0.append(r3)
            java.lang.String r3 = ", sessionColorSpace="
            r0.append(r3)
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
