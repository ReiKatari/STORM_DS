package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d2  reason: default package */
/* loaded from: classes.dex */
public abstract class d2 {
    public java.lang.Object a;
    public java.lang.Object b;

    public d2(int r1) {
            r0 = this;
            switch(r1) {
                case 4: goto Lc;
                default: goto L3;
            }
        L3:
            r0.<init>()
            r1 = 2
            int[] r1 = new int[r1]
            r0.b = r1
            return
        Lc:
            r0.<init>()
            r1 = 1
            uw r1 = defpackage.g04.t(r1)
            r0.a = r1
            tu0 r1 = new tu0
            r1.<init>()
            r0.b = r1
            return
    }

    public d2(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public d2(defpackage.fr r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public d2(defpackage.kj2 r3) {
            r2 = this;
            r2.<init>()
            d00 r0 = new d00
            r1 = 0
            r0.<init>(r2, r1)
            r2.a = r0
            c00 r0 = new c00
            r0.<init>(r2, r3)
            r2.b = r0
            return
    }

    public void d() {
            r2 = this;
            java.lang.Object r0 = r2.a
            cr r0 = (defpackage.cr) r0
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.b     // Catch: java.lang.IllegalArgumentException -> Lf
            fr r1 = (defpackage.fr) r1     // Catch: java.lang.IllegalArgumentException -> Lf
            android.content.Context r1 = r1.g0     // Catch: java.lang.IllegalArgumentException -> Lf
            r1.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
        Lf:
            r0 = 0
            r2.a = r0
        L12:
            return
    }

    public abstract android.content.IntentFilter e();

    public abstract int[] f(int r1);

    public abstract int g();

    public android.view.MenuItem h(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.lu6
            if (r0 == 0) goto L31
            lu6 r3 = (defpackage.lu6) r3
            java.lang.Object r0 = r2.b
            ci6 r0 = (defpackage.ci6) r0
            if (r0 != 0) goto L14
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
        L14:
            java.lang.Object r0 = r2.b
            ci6 r0 = (defpackage.ci6) r0
            java.lang.Object r0 = r0.get(r3)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L30
            s44 r0 = new s44
            java.lang.Object r1 = r2.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r3)
            java.lang.Object r2 = r2.b
            ci6 r2 = (defpackage.ci6) r2
            r2.put(r3, r0)
        L30:
            return r0
        L31:
            return r3
    }

    public int[] i(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L12
            if (r3 < 0) goto L12
            if (r2 != r3) goto L7
            goto L12
        L7:
            java.lang.Object r1 = r1.b
            int[] r1 = (int[]) r1
            r0 = 0
            r1[r0] = r2
            r2 = 1
            r1[r2] = r3
            return r1
        L12:
            r1 = 0
            return r1
    }

    public java.lang.String j() {
            r0 = this;
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "text"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public boolean k() {
            r1 = this;
            java.lang.Object r0 = r1.a
            d00 r0 = (defpackage.d00) r0
            boolean r0 = r0.b
            if (r0 == 0) goto L12
            java.lang.Object r1 = r1.b
            c00 r1 = (defpackage.c00) r1
            boolean r1 = r1.b
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public void l() {
            r0 = this;
            return
    }

    public abstract void m();

    public void n(defpackage.b00 r1) {
            r0 = this;
            return
    }

    public void o() {
            r0 = this;
            return
    }

    public abstract void p();

    public abstract int[] q(int r1);

    public void r() {
            r3 = this;
            r3.d()
            android.content.IntentFilter r0 = r3.e()
            int r1 = r0.countActions()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.Object r1 = r3.a
            cr r1 = (defpackage.cr) r1
            if (r1 != 0) goto L1c
            cr r1 = new cr
            r2 = 0
            r1.<init>(r3, r2)
            r3.a = r1
        L1c:
            java.lang.Object r1 = r3.b
            fr r1 = (defpackage.fr) r1
            android.content.Context r1 = r1.g0
            java.lang.Object r3 = r3.a
            cr r3 = (defpackage.cr) r3
            r1.registerReceiver(r3, r0)
            return
    }
}
