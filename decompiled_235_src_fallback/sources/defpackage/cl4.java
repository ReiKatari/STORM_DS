package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl4  reason: default package */
/* loaded from: classes.dex */
public final class cl4 extends defpackage.jd4 {
    public final defpackage.dl4 d;
    public boolean e;

    public cl4(defpackage.dl4 r2, defpackage.el4 r3) {
            r1 = this;
            boolean r0 = r2.b
            r1.<init>()
            r1.a = r3
            r1.b = r0
            r1.d = r2
            r2 = 1
            r1.e = r2
            return
    }

    @Override // defpackage.jd4
    public final void a() {
            r0 = this;
            dl4 r0 = r0.d
            r0.a()
            return
    }

    @Override // defpackage.jd4
    public final void b() {
            r0 = this;
            dl4 r0 = r0.d
            r0.b()
            return
    }

    @Override // defpackage.jd4
    public final void c(defpackage.hd4 r2) {
            r1 = this;
            b00 r0 = new b00
            r0.<init>(r2)
            dl4 r1 = r1.d
            r1.c(r0)
            return
    }

    @Override // defpackage.jd4
    public final void d(defpackage.hd4 r2) {
            r1 = this;
            r2.getClass()
            b00 r0 = new b00
            r0.<init>(r2)
            dl4 r1 = r1.d
            r1.d(r0)
            return
    }

    public final void g(boolean r1) {
            r0 = this;
            r0.e = r1
            if (r1 == 0) goto Lc
            dl4 r1 = r0.d
            boolean r1 = r1.b
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.f(r1)
            return
    }
}
