package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb7  reason: default package */
/* loaded from: classes.dex */
public final class yb7 extends defpackage.ec6 {
    public final defpackage.if3 a;
    public final defpackage.be3 b;
    public final defpackage.su2 c;
    public final defpackage.ie7 d;
    public final defpackage.zc7 e;
    public final defpackage.j97 f;
    public final boolean g;
    public volatile defpackage.yc7 h;

    public yb7(defpackage.if3 r3, defpackage.be3 r4, defpackage.su2 r5, defpackage.ie7 r6, defpackage.zc7 r7, boolean r8) {
            r2 = this;
            r2.<init>()
            j97 r0 = new j97
            r1 = 1
            r0.<init>(r2, r1)
            r2.f = r0
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            r2.e = r7
            r2.g = r8
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            be3 r0 = r3.b
            if (r0 != 0) goto L19
            yc7 r0 = r3.h
            if (r0 != 0) goto L14
            su2 r0 = r3.c
            zc7 r1 = r3.e
            ie7 r2 = r3.d
            yc7 r0 = r0.e(r1, r2)
            r3.h = r0
        L14:
            java.lang.Object r3 = r0.b(r4)
            return r3
        L19:
            r4.n0()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.i04 -> L37 java.io.EOFException -> L3e
            r1 = 0
            ke3 r2 = defpackage.ke3.a     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.i04 -> L37
            r2.getClass()     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.i04 -> L37
            ee3 r4 = defpackage.ke3.d(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 defpackage.i04 -> L37
            goto L44
        L27:
            r4 = move-exception
            goto L40
        L29:
            r3 = move-exception
            ne3 r4 = new ne3
            r4.<init>(r3)
            throw r4
        L30:
            r3 = move-exception
            ne3 r4 = new ne3
            r4.<init>(r3)
            throw r4
        L37:
            r3 = move-exception
            ne3 r4 = new ne3
            r4.<init>(r3)
            throw r4
        L3e:
            r4 = move-exception
            r1 = 1
        L40:
            if (r1 == 0) goto L5c
            ve3 r4 = defpackage.ve3.A
        L44:
            boolean r1 = r3.g
            if (r1 == 0) goto L51
            r4.getClass()
            boolean r1 = r4 instanceof defpackage.ve3
            if (r1 == 0) goto L51
            r3 = 0
            return r3
        L51:
            ie7 r1 = r3.d
            java.lang.reflect.Type r1 = r1.b
            j97 r3 = r3.f
            java.lang.Object r3 = r0.a(r4, r1, r3)
            return r3
        L5c:
            ne3 r3 = new ne3
            r3.<init>(r4)
            throw r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            if3 r0 = r3.a
            if (r0 != 0) goto L18
            yc7 r0 = r3.h
            if (r0 != 0) goto L14
            su2 r0 = r3.c
            zc7 r1 = r3.e
            ie7 r2 = r3.d
            yc7 r0 = r0.e(r1, r2)
            r3.h = r0
        L14:
            r0.c(r4, r5)
            return
        L18:
            boolean r1 = r3.g
            if (r1 == 0) goto L22
            if (r5 != 0) goto L22
            r4.A()
            return
        L22:
            ie7 r1 = r3.d
            java.lang.reflect.Type r1 = r1.b
            j97 r3 = r3.f
            ee3 r3 = r0.b(r5, r1, r3)
            ke3 r5 = defpackage.ke3.a
            r5.getClass()
            defpackage.ke3.g(r4, r3)
            return
    }

    @Override // defpackage.ec6
    public final defpackage.yc7 d() {
            r3 = this;
            if3 r0 = r3.a
            if (r0 == 0) goto L5
            return r3
        L5:
            yc7 r0 = r3.h
            if (r0 != 0) goto L15
            su2 r0 = r3.c
            zc7 r1 = r3.e
            ie7 r2 = r3.d
            yc7 r0 = r0.e(r1, r2)
            r3.h = r0
        L15:
            return r0
    }
}
