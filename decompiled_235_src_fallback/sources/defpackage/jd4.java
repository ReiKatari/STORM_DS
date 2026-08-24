package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd4  reason: default package */
/* loaded from: classes.dex */
public abstract class jd4 {
    public defpackage.kj2 a;
    public boolean b;
    public defpackage.eb c;

    public abstract void a();

    public abstract void b();

    public abstract void c(defpackage.hd4 r1);

    public abstract void d(defpackage.hd4 r1);

    public final void e() {
            r4 = this;
            eb r0 = r4.c
            if (r0 == 0) goto L3d
            java.lang.Object r1 = r0.R
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            boolean r1 = r1.remove(r4)
            if (r1 == 0) goto L3d
            java.lang.Object r0 = r0.L
            md4 r0 = (defpackage.md4) r0
            r0.getClass()
            jd4 r1 = r0.f
            boolean r1 = r4.equals(r1)
            r2 = 0
            if (r1 == 0) goto L2e
            int r1 = r0.g
            r3 = -1
            if (r1 == r3) goto L24
            goto L27
        L24:
            r4.a()
        L27:
            r0.f = r2
            r1 = 0
            r0.g = r1
            r0.h = r2
        L2e:
            pu r1 = r0.d
            r1.remove(r4)
            pu r1 = r0.e
            r1.remove(r4)
            r4.c = r2
            r0.b()
        L3d:
            return
    }

    public final void f(boolean r2) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 != r2) goto L5
            goto L14
        L5:
            r1.b = r2
            eb r1 = r1.c
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.L
            md4 r1 = (defpackage.md4) r1
            if (r1 == 0) goto L14
            r1.b()
        L14:
            return
    }
}
