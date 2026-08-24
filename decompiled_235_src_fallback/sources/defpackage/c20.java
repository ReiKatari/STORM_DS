package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c20  reason: default package */
/* loaded from: classes.dex */
public abstract class c20 implements defpackage.k11 {
    public final defpackage.a21 a;

    public c20(defpackage.a21 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.k11
    public final boolean a(defpackage.yw7 r1) {
            r0 = this;
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L14
            a21 r1 = r0.a
            java.lang.Object r1 = r1.d()
            boolean r0 = r0.e(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // defpackage.k11
    public final defpackage.pb0 b(defpackage.p21 r3) {
            r2 = this;
            r3.getClass()
            z r3 = new z
            r0 = 0
            r1 = 8
            r3.<init>(r2, r0, r1)
            pb0 r2 = defpackage.f04.p(r3)
            return r2
    }

    public abstract int d();

    public abstract boolean e(java.lang.Object r1);
}
