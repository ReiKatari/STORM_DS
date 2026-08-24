package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf5  reason: default package */
/* loaded from: classes.dex */
public final class cf5 {
    public defpackage.ey0 a;
    public int b;
    public defpackage.sq2 c;
    public defpackage.eo2 d;
    public int e;
    public defpackage.y94 f;
    public defpackage.ja4 g;

    public cf5(defpackage.ey0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean a() {
            r2 = this;
            ey0 r0 = r2.a
            r1 = 0
            if (r0 == 0) goto L13
            sq2 r2 = r2.c
            if (r2 == 0) goto Le
            boolean r2 = r2.a()
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            return r1
    }

    public final defpackage.yb3 b(java.lang.Object r2) {
            r1 = this;
            ey0 r0 = r1.a
            if (r0 == 0) goto Lc
            yb3 r1 = r0.s(r1, r2)
            if (r1 != 0) goto Lb
            goto Lc
        Lb:
            return r1
        Lc:
            yb3 r1 = defpackage.yb3.IGNORED
            return r1
    }

    public final void c() {
            r2 = this;
            ey0 r0 = r2.a
            if (r0 == 0) goto Lc
            r1 = 1
            r0.k0 = r1
            os0 r0 = r0.p0
            r0.S()
        Lc:
            r0 = 0
            r2.a = r0
            r2.f = r0
            r2.g = r0
            r2.d = r0
            return
    }

    public final void d(boolean r2) {
            r1 = this;
            int r0 = r1.b
            if (r2 == 0) goto L7
            r2 = r0 | 32
            goto L9
        L7:
            r2 = r0 & (-33)
        L9:
            r1.b = r2
            return
    }

    public final void e(defpackage.eo2 r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
