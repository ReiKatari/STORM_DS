package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a21  reason: default package */
/* loaded from: classes.dex */
public abstract class a21 {
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public a21() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            return
    }

    public a21(android.content.Context r2, defpackage.ow7 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r3
            android.content.Context r2 = r2.getApplicationContext()
            r2.getClass()
            r1.c = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.d = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.f = r2
            return
    }

    public abstract void a(defpackage.eb r1);

    public void b(defpackage.a21 r2) {
            r1 = this;
            r2.j()
            r2.e(r1)
            java.lang.Object r0 = r1.d
            a21 r0 = (defpackage.a21) r0
            if (r0 == 0) goto L13
            r0.f = r2
            r2.e = r0
            r1.d = r2
            return
        L13:
            r1.c = r2
            r1.d = r2
            return
    }

    public defpackage.a21 c() {
            r0 = this;
            java.lang.Object r0 = r0.b
            a21 r0 = (defpackage.a21) r0
            return r0
    }

    public abstract java.lang.Object d();

    public void e(defpackage.a21 r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void f(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            java.lang.Object r1 = r4.e     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            monitor-exit(r0)
            return
        Lf:
            r4 = move-exception
            goto L2d
        L11:
            r4.e = r5     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> Lf
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch: java.lang.Throwable -> Lf
            java.util.List r5 = defpackage.gt0.k1(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> Lf
            ow7 r1 = (defpackage.ow7) r1     // Catch: java.lang.Throwable -> Lf
            ec3 r1 = r1.d     // Catch: java.lang.Throwable -> Lf
            mf r2 = new mf     // Catch: java.lang.Throwable -> Lf
            r3 = 13
            r2.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> Lf
            r1.execute(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        L2d:
            monitor-exit(r0)
            throw r4
    }

    public abstract void g();

    public abstract void h();

    public java.lang.String i() {
            r0 = this;
            java.lang.String r0 = ""
            return r0
    }

    public void j() {
            r3 = this;
            java.lang.Object r0 = r3.e
            a21 r0 = (defpackage.a21) r0
            if (r0 == 0) goto Ld
            java.lang.Object r1 = r3.f
            a21 r1 = (defpackage.a21) r1
            r0.f = r1
            goto L19
        Ld:
            java.lang.Object r1 = r3.b
            a21 r1 = (defpackage.a21) r1
            if (r1 == 0) goto L19
            java.lang.Object r2 = r3.f
            a21 r2 = (defpackage.a21) r2
            r1.c = r2
        L19:
            java.lang.Object r1 = r3.f
            a21 r1 = (defpackage.a21) r1
            if (r1 == 0) goto L22
            r1.e = r0
            goto L2a
        L22:
            java.lang.Object r1 = r3.b
            a21 r1 = (defpackage.a21) r1
            if (r1 == 0) goto L2a
            r1.d = r0
        L2a:
            r0 = 0
            r3.b = r0
            r3.f = r0
            r3.e = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r2 = r2.i()
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
