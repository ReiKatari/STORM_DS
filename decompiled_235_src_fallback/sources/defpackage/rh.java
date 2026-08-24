package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh  reason: default package */
/* loaded from: classes.dex */
public final class rh implements defpackage.y23, defpackage.vs1 {
    public android.content.Context a;

    public /* synthetic */ rh(android.content.Context r1, byte r2) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public rh(android.content.Context r1, int r2) {
            r0 = this;
            switch(r2) {
                case 4: goto Ld;
                default: goto L3;
            }
        L3:
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.a = r1
            return
        Ld:
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.a = r1
            return
    }

    @Override // defpackage.vs1
    public void a(defpackage.hv r9) {
            r8 = this;
            ry0 r7 = new ry0
            java.lang.String r0 = "EmojiCompatInitializer"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            v r1 = new v
            r2 = 16
            r1.<init>(r8, r9, r0, r2)
            r0.execute(r1)
            return
    }

    @Override // defpackage.y23
    public void b() {
            r2 = this;
            android.content.Context r2 = r2.a
            r0 = 2131952127(0x7f1301ff, float:1.9540688E38)
            r1 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
            return
    }

    @Override // defpackage.y23
    public void c() {
            r0 = this;
            return
    }

    public defpackage.vb1 d() {
            r13 = this;
            android.content.Context r13 = r13.a
            if (r13 == 0) goto L75
            vb1 r0 = new vb1
            r0.<init>()
            c72 r1 = defpackage.f04.l
            n55 r1 = defpackage.fm1.a(r1)
            r0.A = r1
            g71 r1 = new g71
            r2 = 1
            r1.<init>(r13, r2)
            r0.B = r1
            g71 r13 = new g71
            r3 = 0
            r13.<init>(r1, r3)
            n54 r4 = new n54
            r4.<init>(r1, r13)
            n55 r13 = defpackage.fm1.a(r4)
            r0.L = r13
            g71 r13 = r0.B
            g71 r1 = new g71
            r4 = 3
            r1.<init>(r13, r4)
            g71 r13 = new g71
            r4 = 2
            r13.<init>(r1, r4)
            n55 r8 = defpackage.fm1.a(r13)
            r0.R = r8
            c72 r13 = new c72
            r13.<init>(r2)
            g71 r1 = r0.B
            i66 r9 = new i66
            r9.<init>(r1, r8, r13, r3)
            n55 r6 = r0.A
            n55 r7 = r0.L
            ze1 r5 = new ze1
            r10 = r8
            r12 = r9
            r9 = r8
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r13 = r9
            r9 = r8
            r8 = r13
            r13 = r5
            sh7 r5 = new sh7
            r11 = r8
            r10 = r6
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r6 = r10
            kw7 r1 = new kw7
            r1.<init>(r6, r8, r9, r8)
            i66 r3 = new i66
            r3.<init>(r13, r5, r1, r2)
            n55 r13 = defpackage.fm1.a(r3)
            r0.X = r13
            return r0
        L75:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " must be set"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
    }

    public android.graphics.Typeface e(defpackage.ll5 r13) {
            r12 = this;
            android.content.Context r12 = r12.a
            boolean r0 = r13 instanceof defpackage.ll5
            r1 = 0
            if (r0 == 0) goto L105
            int r0 = r13.a
            android.graphics.Typeface r0 = defpackage.sl5.a(r12, r0)
            r0.getClass()
            mj2 r13 = r13.c
            java.util.List r13 = r13.a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L26
            java.lang.ThreadLocal r3 = defpackage.me7.a
            if (r0 != 0) goto L20
            goto L105
        L20:
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L29
        L26:
            r1 = r0
            goto L105
        L29:
            java.lang.ThreadLocal r3 = defpackage.me7.a
            java.lang.Object r4 = r3.get()
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            if (r4 != 0) goto L3b
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.set(r4)
        L3b:
            defpackage.q66.t(r4)
            r4.setTypeface(r0)
            uh1 r0 = defpackage.ak7.s(r12)
            r3 = 31
            r5 = 0
            if (r2 < r3) goto L5b
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = defpackage.sd0.a(r2)
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r6) goto L5d
        L5b:
            r12 = r5
            goto L69
        L5d:
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = defpackage.sd0.a(r12)
        L69:
            if (r12 != 0) goto L76
            dv4 r12 = new dv4
            r12.<init>(r0)
            java.lang.String r12 = defpackage.ex3.a(r3, r12, r1, r13)
            goto Lfe
        L76:
            int r0 = r13.size()
            java.lang.String r1 = ""
            r2 = r5
        L7d:
            r3 = 1148846080(0x447a0000, float:1000.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r7 = ","
            if (r5 >= r0) goto Ld4
            java.lang.Object r8 = r13.get(r5)
            lj2 r8 = (defpackage.lj2) r8
            java.lang.String r9 = r8.a()
            java.lang.String r10 = "wght"
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto La3
            float r2 = r8.b()
            float r9 = (float) r12
            float r2 = r2 + r9
            float r2 = defpackage.gi2.p(r2, r6, r3)
            r3 = 1
            goto Laa
        La3:
            float r3 = r8.b()
            r11 = r3
            r3 = r2
            r2 = r11
        Laa:
            if (r5 == 0) goto Lb0
            java.lang.String r1 = r1.concat(r7)
        Lb0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r1 = 39
            r6.append(r1)
            java.lang.String r1 = r8.a()
            r6.append(r1)
            java.lang.String r1 = "' "
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = r6.toString()
            int r5 = r5 + 1
            r2 = r3
            goto L7d
        Ld4:
            if (r2 != 0) goto Lfd
            r0 = 1137180672(0x43c80000, float:400.0)
            float r12 = (float) r12
            float r12 = r12 + r0
            float r12 = defpackage.gi2.p(r12, r6, r3)
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Le8
            java.lang.String r1 = r1.concat(r7)
        Le8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r0 = "'wght' "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            goto Lfe
        Lfd:
            r12 = r1
        Lfe:
            defpackage.q66.u(r4, r12)
            android.graphics.Typeface r1 = r4.getTypeface()
        L105:
            return r1
    }
}
