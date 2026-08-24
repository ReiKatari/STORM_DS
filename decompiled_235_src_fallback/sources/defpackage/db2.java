package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db2  reason: default package */
/* loaded from: classes.dex */
public abstract class db2 implements java.io.Closeable {
    public static final defpackage.xf3 A = null;

    static {
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            pf4 r0 = new pf4     // Catch: java.lang.ClassNotFoundException -> Lb
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> Lb
            goto L10
        Lb:
            xf3 r0 = new xf3
            r0.<init>()
        L10:
            defpackage.db2.A = r0
            java.lang.String r0 = defpackage.lt4.B
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r0.getClass()
            defpackage.w31.p(r0)
            kl5 r0 = new kl5
            java.lang.Class<kl5> r1 = defpackage.kl5.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public final defpackage.ai1 A(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            ai1 r0 = r0.D(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.String r0 = "no such file: "
            defpackage.e41.u(r1, r0)
            r0 = 0
            return r0
    }

    public abstract defpackage.ai1 D(defpackage.lt4 r1);

    public abstract defpackage.wf3 F(defpackage.lt4 r1);

    public abstract defpackage.ui6 J(defpackage.lt4 r1);

    public abstract defpackage.in6 N(defpackage.lt4 r1);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public abstract defpackage.ui6 e(defpackage.lt4 r1);

    public abstract void h(defpackage.lt4 r1, defpackage.lt4 r2);

    public final void k(defpackage.lt4 r3) {
            r2 = this;
            pu r0 = new pu
            r0.<init>()
        L5:
            if (r3 == 0) goto L15
            boolean r1 = r2.v(r3)
            if (r1 != 0) goto L15
            r0.addFirst(r3)
            lt4 r3 = r3.b()
            goto L5
        L15:
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            lt4 r0 = (defpackage.lt4) r0
            r2.n(r0)
            goto L19
        L29:
            return
    }

    public abstract void n(defpackage.lt4 r1);

    public abstract void r(defpackage.lt4 r1);

    public final void u(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            r0.r(r1)
            return
    }

    public final boolean v(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            ai1 r0 = r0.D(r1)
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public abstract java.util.List x(defpackage.lt4 r1);
}
