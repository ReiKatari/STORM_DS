package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok5  reason: default package */
/* loaded from: classes.dex */
public final class ok5 {
    public static final char[] l = null;
    public static final java.util.regex.Pattern m = null;
    public final java.lang.String a;
    public final defpackage.i03 b;
    public java.lang.String c;
    public defpackage.h03 d;
    public final defpackage.s9 e;
    public final defpackage.ww2 f;
    public defpackage.n34 g;
    public final boolean h;
    public final defpackage.m44 i;
    public final defpackage.yc1 j;
    public defpackage.mk5 k;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            defpackage.ok5.l = r0
            java.lang.String r0 = "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.ok5.m = r0
            return
    }

    public ok5(java.lang.String r1, defpackage.i03 r2, java.lang.String r3, defpackage.yw2 r4, defpackage.n34 r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            s9 r1 = new s9
            r2 = 13
            r1.<init>(r2)
            r0.e = r1
            r0.g = r5
            r0.h = r6
            r1 = 0
            if (r4 == 0) goto L20
            ww2 r2 = r4.c()
            r0.f = r2
            goto L27
        L20:
            ww2 r2 = new ww2
            r2.<init>(r1, r1)
            r0.f = r2
        L27:
            if (r7 == 0) goto L33
            yc1 r1 = new yc1
            r2 = 18
            r1.<init>(r2)
            r0.j = r1
            return
        L33:
            if (r8 == 0) goto L56
            m44 r2 = new m44
            r3 = 2
            r2.<init>(r3, r1)
            r0.i = r2
            n34 r0 = defpackage.l94.g
            r0.getClass()
            java.lang.String r1 = r0.b
            java.lang.String r3 = "multipart"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4f
            r2.L = r0
            return
        L4f:
            java.lang.String r1 = "multipart != "
            defpackage.u34.w(r0, r1)
            r0 = 0
            throw r0
        L56:
            return
    }

    public final void a(java.lang.String r10, java.lang.String r11, boolean r12) {
            r9 = this;
            yc1 r9 = r9.j
            if (r12 == 0) goto L2f
            r9.getClass()
            r10.getClass()
            java.lang.Object r12 = r9.A
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r7 = 0
            r8 = 83
            r1 = 0
            r2 = 0
            java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            r4 = 1
            r5 = 0
            r6 = 1
            r0 = r10
            java.lang.String r10 = defpackage.jw2.n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r12.add(r10)
            java.lang.Object r9 = r9.B
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            r0 = r11
            java.lang.String r10 = defpackage.jw2.n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.add(r10)
            return
        L2f:
            r0 = r10
            r10 = r11
            r9.getClass()
            r0.getClass()
            java.lang.Object r11 = r9.A
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r7 = 0
            r8 = 91
            r1 = 0
            r2 = 0
            java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r12 = defpackage.jw2.n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r11.add(r12)
            java.lang.Object r9 = r9.B
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            r0 = r10
            java.lang.String r10 = defpackage.jw2.n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.add(r10)
            return
    }

    public final void b(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L1e
            xh5 r2 = defpackage.n34.d     // Catch: java.lang.IllegalArgumentException -> L11
            n34 r2 = defpackage.xk2.k(r3)     // Catch: java.lang.IllegalArgumentException -> L11
            r1.g = r2     // Catch: java.lang.IllegalArgumentException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Malformed content type: "
            java.lang.String r3 = defpackage.i61.m(r4, r3)
            r2.<init>(r3, r1)
            throw r2
        L1e:
            ww2 r1 = r1.f
            if (r4 == 0) goto L26
            r1.e(r2, r3)
            return
        L26:
            r1.b(r2, r3)
            return
    }

    public final void c(defpackage.yw2 r2, defpackage.mk5 r3) {
            r1 = this;
            m44 r1 = r1.i
            r1.getClass()
            r3.getClass()
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.a(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r2.a(r0)
            if (r0 != 0) goto L25
            k94 r0 = new k94
            r0.<init>(r2, r3)
            java.lang.Object r1 = r1.R
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            return
        L25:
            java.lang.String r1 = "Unexpected header: Content-Length"
            defpackage.i.h(r1)
            return
        L2b:
            java.lang.String r1 = "Unexpected header: Content-Type"
            defpackage.i.h(r1)
            return
    }

    public final void d(java.lang.String r6, java.lang.String r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = r5.c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L2e
            i03 r3 = r5.b
            r3.getClass()
            h03 r4 = new h03     // Catch: java.lang.IllegalArgumentException -> L14
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L14
            r4.e(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L14
            goto L15
        L14:
            r4 = r2
        L15:
            r5.d = r4
            if (r4 == 0) goto L1c
            r5.c = r2
            goto L2e
        L1c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Malformed URL. Base: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r7 = ", Relative: "
            java.lang.String r5 = r5.c
            defpackage.fa6.g(r6, r7, r5)
            return
        L2e:
            h03 r5 = r5.d
            if (r8 == 0) goto L68
            r5.getClass()
            r6.getClass()
            java.lang.Object r8 = r5.i
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L45
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5.i = r8
        L45:
            java.lang.Object r8 = r5.i
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.getClass()
            java.lang.String r0 = " \"'<>#&="
            r3 = 83
            java.lang.String r6 = defpackage.jw2.m(r6, r1, r1, r0, r3)
            r8.add(r6)
            java.lang.Object r5 = r5.i
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.getClass()
            if (r7 == 0) goto L64
            java.lang.String r2 = defpackage.jw2.m(r7, r1, r1, r0, r3)
        L64:
            r5.add(r2)
            return
        L68:
            r5.getClass()
            r6.getClass()
            java.lang.Object r8 = r5.i
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L7b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5.i = r8
        L7b:
            java.lang.Object r8 = r5.i
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.getClass()
            java.lang.String r0 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r3 = 91
            java.lang.String r6 = defpackage.jw2.m(r6, r1, r1, r0, r3)
            r8.add(r6)
            java.lang.Object r5 = r5.i
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.getClass()
            if (r7 == 0) goto L9a
            java.lang.String r2 = defpackage.jw2.m(r7, r1, r1, r0, r3)
        L9a:
            r5.add(r2)
            return
    }
}
