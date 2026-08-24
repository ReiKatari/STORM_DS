package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc7  reason: default package */
/* loaded from: classes.dex */
public final class pc7 implements defpackage.gg3 {
    public final defpackage.gg3 a;
    public final defpackage.gg3 b;
    public final defpackage.gg3 c;
    public final defpackage.yb6 d;

    public pc7(defpackage.gg3 r7, defpackage.gg3 r8, defpackage.gg3 r9) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r6.<init>()
            r6.a = r7
            r6.b = r8
            r6.c = r9
            r7 = 0
            wb6[] r7 = new defpackage.wb6[r7]
            ro5 r8 = new ro5
            r9 = 24
            r8.<init>(r6, r9)
            java.lang.String r1 = "kotlin.Triple"
            boolean r9 = defpackage.qs6.v0(r1)
            if (r9 != 0) goto L3e
            br0 r5 = new br0
            r5.<init>(r1)
            r8.g(r5)
            yb6 r0 = new yb6
            bt6 r2 = defpackage.bt6.e
            java.util.ArrayList r8 = r5.c
            int r3 = r8.size()
            java.util.List r4 = defpackage.fv.T0(r7)
            r0.<init>(r1, r2, r3, r4, r5)
            goto L44
        L3e:
            java.lang.String r7 = "Blank serial names are prohibited"
            defpackage.i.h(r7)
            r0 = 0
        L44:
            r6.d = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r9) {
            r8 = this;
            yb6 r0 = r8.d
            ux0 r9 = r9.c(r0)
            r9.getClass()
            java.lang.Object r1 = defpackage.ge7.j
            r2 = r1
            r3 = r2
            r4 = r3
        Le:
            int r5 = r9.q(r0)
            r6 = -1
            if (r5 == r6) goto L46
            r6 = 0
            if (r5 == 0) goto L3c
            r7 = 1
            if (r5 == r7) goto L33
            r4 = 2
            if (r5 != r4) goto L27
            gg3 r5 = r8.c
            gg3 r5 = (defpackage.gg3) r5
            java.lang.Object r4 = r9.G(r0, r4, r5, r6)
            goto Le
        L27:
            fc6 r8 = new fc6
            java.lang.String r9 = "Unexpected index "
            java.lang.String r9 = defpackage.lb1.g(r5, r9)
            r8.<init>(r9)
            throw r8
        L33:
            gg3 r3 = r8.b
            gg3 r3 = (defpackage.gg3) r3
            java.lang.Object r3 = r9.G(r0, r7, r3, r6)
            goto Le
        L3c:
            gg3 r2 = r8.a
            gg3 r2 = (defpackage.gg3) r2
            r5 = 0
            java.lang.Object r2 = r9.G(r0, r5, r2, r6)
            goto Le
        L46:
            r9.a(r0)
            if (r2 == r1) goto L65
            if (r3 == r1) goto L5d
            if (r4 == r1) goto L55
            oc7 r8 = new oc7
            r8.<init>(r2, r3, r4)
            return r8
        L55:
            fc6 r8 = new fc6
            java.lang.String r9 = "Element 'third' is missing"
            r8.<init>(r9)
            throw r8
        L5d:
            fc6 r8 = new fc6
            java.lang.String r9 = "Element 'second' is missing"
            r8.<init>(r9)
            throw r8
        L65:
            fc6 r8 = new fc6
            java.lang.String r9 = "Element 'first' is missing"
            r8.<init>(r9)
            throw r8
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r5, java.lang.Object r6) {
            r4 = this;
            oc7 r6 = (defpackage.oc7) r6
            r6.getClass()
            yb6 r0 = r4.d
            vx0 r5 = r5.c(r0)
            gg3 r1 = r4.a
            gg3 r1 = (defpackage.gg3) r1
            java.lang.Object r2 = r6.A
            r3 = 0
            r5.w(r0, r3, r1, r2)
            gg3 r1 = r4.b
            gg3 r1 = (defpackage.gg3) r1
            java.lang.Object r2 = r6.B
            r3 = 1
            r5.w(r0, r3, r1, r2)
            gg3 r4 = r4.c
            gg3 r4 = (defpackage.gg3) r4
            java.lang.Object r6 = r6.L
            r1 = 2
            r5.w(r0, r1, r4, r6)
            r5.a(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            yb6 r0 = r0.d
            return r0
    }
}
