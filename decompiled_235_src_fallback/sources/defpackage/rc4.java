package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc4  reason: default package */
/* loaded from: classes.dex */
public final class rc4 {
    public final android.content.Context a;
    public final defpackage.zb4 b;
    public final defpackage.rh c;
    public final android.app.Activity d;
    public boolean e;
    public final defpackage.d00 f;
    public final boolean g;

    public rc4(android.content.Context r5) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.a = r5
            zb4 r0 = new zb4
            n10 r1 = new n10
            r2 = 1
            r1.<init>(r4, r2)
            r0.<init>(r4, r1)
            r4.b = r0
            rh r0 = new rh
            r1 = 0
            r0.<init>(r5, r1)
            r4.c = r0
            x84 r0 = new x84
            r1 = 3
            r0.<init>(r1)
            qb6 r5 = defpackage.sb6.Z(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.next()
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L2b
            goto L3e
        L3d:
            r0 = 0
        L3e:
            android.app.Activity r0 = (android.app.Activity) r0
            r4.d = r0
            d00 r5 = new d00
            r5.<init>(r4, r1)
            r4.f = r5
            r4.g = r2
            zb4 r5 = r4.b
            rd4 r5 = r5.s
            qc4 r0 = new qc4
            r0.<init>(r5)
            r5.a(r0)
            zb4 r5 = r4.b
            rd4 r5 = r5.s
            v8 r0 = new v8
            android.content.Context r1 = r4.a
            r0.<init>(r1)
            r5.a(r0)
            n10 r5 = new n10
            r0 = 2
            r5.<init>(r4, r0)
            ex6 r4 = new ex6
            r4.<init>(r5)
            return
    }

    public static void b(defpackage.rc4 r6, java.lang.Object r7) {
            r6.getClass()
            r7.getClass()
            zb4 r6 = r6.b
            r6.getClass()
            r7.getClass()
            java.lang.Class r0 = r7.getClass()
            ar0 r0 = defpackage.gh5.a(r0)
            gg3 r0 = defpackage.jx2.K(r0)
            int r0 = defpackage.np2.O(r0)
            mc4 r1 = r6.g()
            r2 = 0
            r3 = 1
            ic4 r0 = defpackage.zb4.d(r0, r1, r2, r3)
            if (r0 == 0) goto L66
            java.util.Map r0 = r0.c()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r0.size()
            int r4 = defpackage.c14.k0(r4)
            r1.<init>(r4)
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            rb4 r4 = (defpackage.rb4) r4
            fd4 r4 = r4.a
            r1.put(r5, r4)
            goto L45
        L61:
            java.lang.String r7 = defpackage.np2.P(r7, r1)
            goto L7c
        L66:
            java.lang.Class r7 = r7.getClass()
            ar0 r7 = defpackage.gh5.a(r7)
            java.lang.String r7 = r7.c()
            java.lang.String r0 = " cannot be found in navigation graph "
            mc4 r1 = r6.c
            java.lang.String r4 = "Destination with route "
            defpackage.u34.y(r4, r7, r0, r1)
            r7 = r2
        L7c:
            mc4 r0 = r6.c
            if (r0 == 0) goto Ldd
            mc4 r0 = r6.i()
            hc4 r0 = r0.g(r7, r3, r0)
            if (r0 == 0) goto Lcf
            ic4 r7 = r0.A
            android.os.Bundle r0 = r0.B
            android.os.Bundle r0 = r7.a(r0)
            if (r0 != 0) goto La1
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r0 = (defpackage.vr4[]) r0
            android.os.Bundle r0 = defpackage.jw2.l(r0)
        La1:
            int r1 = defpackage.ic4.X
            z9 r1 = r7.B
            java.lang.Object r1 = r1.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb2
            java.lang.String r3 = "android-app://androidx.navigation/"
            java.lang.String r1 = r3.concat(r1)
            goto Lb4
        Lb2:
            java.lang.String r1 = ""
        Lb4:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r1.getClass()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.setDataAndType(r1, r2)
            r3.setAction(r2)
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r0.putParcelable(r1, r3)
            r6.k(r7, r0, r2)
            return
        Lcf:
            java.lang.String r0 = "Navigation destination that matches route "
            java.lang.String r1 = " cannot be found in the navigation graph "
            java.lang.StringBuilder r7 = defpackage.i61.t(r0, r7, r1)
            mc4 r6 = r6.c
            defpackage.i.j(r7, r6)
            return
        Ldd:
            java.lang.String r0 = ". Navigation graph has not been set for NavController "
            r1 = 46
            java.lang.String r2 = "Cannot navigate to "
            defpackage.e41.s(r2, r7, r0, r6, r1)
            return
    }

    public final int a() {
            r2 = this;
            zb4 r2 = r2.b
            pu r2 = r2.f
            r0 = 0
            if (r2 == 0) goto Le
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            return r0
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            sb4 r1 = (defpackage.sb4) r1
            ic4 r1 = r1.B
            boolean r1 = r1 instanceof defpackage.mc4
            if (r1 != 0) goto L12
            int r0 = r0 + 1
            if (r0 < 0) goto L29
            goto L12
        L29:
            defpackage.hf.p0()
            r2 = 0
            throw r2
        L2e:
            return r0
    }

    public final boolean c() {
            r14 = this;
            int r0 = r14.a()
            r1 = 1
            if (r0 != r1) goto L1bb
            android.app.Activity r0 = r14.d
            r2 = 0
            if (r0 == 0) goto L17
            android.content.Intent r3 = r0.getIntent()
            if (r3 == 0) goto L17
            android.os.Bundle r3 = r3.getExtras()
            goto L18
        L17:
            r3 = r2
        L18:
            java.lang.String r4 = "android-support-nav:controller:deepLinkIds"
            if (r3 == 0) goto L21
            int[] r3 = r3.getIntArray(r4)
            goto L22
        L21:
            r3 = r2
        L22:
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            zb4 r7 = r14.b
            r8 = 0
            if (r3 == 0) goto L10c
            boolean r3 = r14.e
            if (r3 != 0) goto L31
            goto L1ba
        L31:
            r0.getClass()
            android.content.Intent r3 = r0.getIntent()
            android.os.Bundle r9 = r3.getExtras()
            r9.getClass()
            int[] r4 = r9.getIntArray(r4)
            r4.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4.length
            r10.<init>(r11)
            int r11 = r4.length
            r12 = r8
        L4e:
            if (r12 >= r11) goto L5c
            r13 = r4[r12]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.add(r13)
            int r12 = r12 + 1
            goto L4e
        L5c:
            java.lang.String r4 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r4 = r9.getParcelableArrayList(r4)
            int r11 = r10.size()
            r12 = 2
            if (r11 >= r12) goto L6b
            goto L1ba
        L6b:
            java.lang.Object r11 = defpackage.gt0.Y0(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r4 == 0) goto L7d
            java.lang.Object r12 = defpackage.gt0.Y0(r4)
            android.os.Bundle r12 = (android.os.Bundle) r12
        L7d:
            mc4 r12 = r7.g()
            ic4 r12 = defpackage.zb4.d(r11, r12, r2, r8)
            boolean r13 = r12 instanceof defpackage.mc4
            if (r13 == 0) goto L95
            int r11 = defpackage.mc4.Z
            mc4 r12 = (defpackage.mc4) r12
            ic4 r11 = defpackage.np2.M(r12)
            z9 r11 = r11.B
            int r11 = r11.a
        L95:
            ic4 r7 = r7.f()
            if (r7 == 0) goto L1ba
            z9 r7 = r7.B
            int r7 = r7.a
            if (r11 != r7) goto L1ba
            s9 r7 = new s9
            r7.<init>(r14)
            vr4[] r14 = new defpackage.vr4[r8]
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r8)
            vr4[] r14 = (defpackage.vr4[]) r14
            android.os.Bundle r14 = defpackage.jw2.l(r14)
            r14.putParcelable(r6, r3)
            android.os.Bundle r3 = r9.getBundle(r5)
            if (r3 == 0) goto Lbe
            r14.putAll(r3)
        Lbe:
            java.lang.Object r3 = r7.c
            android.content.Intent r3 = (android.content.Intent) r3
            r3.putExtra(r5, r14)
            int r14 = r10.size()
            r3 = r8
        Lca:
            if (r3 >= r14) goto L101
            java.lang.Object r5 = r10.get(r3)
            int r3 = r3 + 1
            int r6 = r8 + 1
            if (r8 < 0) goto Lfd
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r4 == 0) goto Le5
            java.lang.Object r8 = r4.get(r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            goto Le6
        Le5:
            r8 = r2
        Le6:
            java.lang.Object r9 = r7.e
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            gc4 r11 = new gc4
            r11.<init>(r5, r8)
            r9.add(r11)
            java.lang.Object r5 = r7.d
            mc4 r5 = (defpackage.mc4) r5
            if (r5 == 0) goto Lfb
            r7.J()
        Lfb:
            r8 = r6
            goto Lca
        Lfd:
            defpackage.hf.q0()
            throw r2
        L101:
            rz6 r14 = r7.s()
            r14.b()
            r0.finish()
            return r1
        L10c:
            ic4 r3 = r7.f()
            r3.getClass()
            z9 r4 = r3.B
            int r4 = r4.a
            mc4 r3 = r3.L
        L119:
            if (r3 == 0) goto L1ba
            z9 r9 = r3.B
            dk0 r10 = r3.Y
            int r10 = r10.L
            if (r10 == r4) goto L1b4
            vr4[] r3 = new defpackage.vr4[r8]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r8)
            vr4[] r3 = (defpackage.vr4[]) r3
            android.os.Bundle r3 = defpackage.jw2.l(r3)
            if (r0 == 0) goto L181
            android.content.Intent r4 = r0.getIntent()
            if (r4 == 0) goto L181
            android.content.Intent r4 = r0.getIntent()
            android.net.Uri r4 = r4.getData()
            if (r4 == 0) goto L181
            android.content.Intent r4 = r0.getIntent()
            r4.getClass()
            r3.putParcelable(r6, r4)
            mc4 r4 = r7.i()
            android.content.Intent r6 = r0.getIntent()
            r6.getClass()
            m44 r7 = new m44
            android.net.Uri r8 = r6.getData()
            java.lang.String r10 = r6.getAction()
            java.lang.String r6 = r6.getType()
            r11 = 3
            r7.<init>(r8, r10, r6, r11)
            hc4 r4 = r4.f(r7, r4)
            if (r4 == 0) goto L171
            android.os.Bundle r6 = r4.B
            goto L172
        L171:
            r6 = r2
        L172:
            if (r6 == 0) goto L181
            ic4 r6 = r4.A
            android.os.Bundle r4 = r4.B
            android.os.Bundle r4 = r6.a(r4)
            if (r4 == 0) goto L181
            r3.putAll(r4)
        L181:
            s9 r4 = new s9
            r4.<init>(r14)
            int r14 = r9.a
            java.lang.Object r6 = r4.e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.clear()
            gc4 r7 = new gc4
            r7.<init>(r14, r2)
            r6.add(r7)
            java.lang.Object r14 = r4.d
            mc4 r14 = (defpackage.mc4) r14
            if (r14 == 0) goto L1a0
            r4.J()
        L1a0:
            java.lang.Object r14 = r4.c
            android.content.Intent r14 = (android.content.Intent) r14
            r14.putExtra(r5, r3)
            rz6 r14 = r4.s()
            r14.b()
            if (r0 == 0) goto L1b3
            r0.finish()
        L1b3:
            return r1
        L1b4:
            int r4 = r9.a
            mc4 r3 = r3.L
            goto L119
        L1ba:
            return r8
        L1bb:
            boolean r14 = r14.d()
            return r14
    }

    public final boolean d() {
            r3 = this;
            zb4 r3 = r3.b
            pu r0 = r3.f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            goto L25
        Lc:
            ic4 r0 = r3.f()
            r0.getClass()
            z9 r0 = r0.B
            int r0 = r0.a
            r2 = 1
            boolean r0 = r3.l(r0, r2, r1)
            if (r0 == 0) goto L25
            boolean r3 = r3.b()
            if (r3 == 0) goto L25
            return r2
        L25:
            return r1
    }
}
