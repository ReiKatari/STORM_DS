package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o52  reason: default package */
/* loaded from: classes.dex */
public final class o52 {
    public static final defpackage.o52 b = null;
    public final defpackage.ha7 a;

    static {
            o52 r0 = new o52
            ha7 r1 = new ha7
            r6 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            defpackage.o52.b = r0
            return
    }

    public o52(defpackage.ha7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.o52 a(defpackage.o52 r9) {
            r8 = this;
            o52 r0 = new o52
            ha7 r1 = new ha7
            ha7 r9 = r9.a
            i92 r2 = r9.a
            ha7 r8 = r8.a
            if (r2 != 0) goto Le
            i92 r2 = r8.a
        Le:
            pj6 r3 = r9.b
            if (r3 != 0) goto L14
            pj6 r3 = r8.b
        L14:
            sl0 r4 = r9.c
            if (r4 != 0) goto L1a
            sl0 r4 = r8.c
        L1a:
            z56 r5 = r9.d
            if (r5 != 0) goto L20
            z56 r5 = r8.d
        L20:
            java.util.Map r8 = r8.f
            java.util.Map r9 = r9.f
            java.util.LinkedHashMap r6 = defpackage.c14.o0(r8, r9)
            r7 = 32
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.o52
            if (r0 == 0) goto L12
            o52 r2 = (defpackage.o52) r2
            ha7 r2 = r2.a
            ha7 r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ha7 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            o52 r0 = defpackage.o52.b
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r3 = "EnterTransition.None"
            return r3
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EnterTransition: \nFade - "
            r0.<init>(r1)
            ha7 r3 = r3.a
            i92 r1 = r3.a
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.toString()
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r0.append(r1)
            java.lang.String r1 = ",\nSlide - "
            r0.append(r1)
            pj6 r1 = r3.b
            if (r1 == 0) goto L30
            java.lang.String r1 = r1.toString()
            goto L31
        L30:
            r1 = r2
        L31:
            r0.append(r1)
            java.lang.String r1 = ",\nShrink - "
            r0.append(r1)
            sl0 r1 = r3.c
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.toString()
            goto L43
        L42:
            r1 = r2
        L43:
            r0.append(r1)
            java.lang.String r1 = ",\nScale - "
            r0.append(r1)
            z56 r3 = r3.d
            if (r3 == 0) goto L53
            java.lang.String r2 = r3.toString()
        L53:
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
