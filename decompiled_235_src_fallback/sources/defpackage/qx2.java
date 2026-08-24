package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx2  reason: default package */
/* loaded from: classes.dex */
public final class qx2 implements defpackage.yo7 {
    public static final defpackage.w31 d = null;
    public final defpackage.io3 a;
    public final defpackage.yo7 b;
    public final defpackage.m9 c;

    static {
            w31 r0 = new w31
            r1 = 8
            r0.<init>(r1)
            defpackage.qx2.d = r0
            return
    }

    public qx2(defpackage.io3 r1, defpackage.yo7 r2, defpackage.bt r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            m9 r1 = new m9
            r2 = 1
            r1.<init>(r3, r2)
            r0.c = r1
            return
    }

    @Override // defpackage.yo7
    public final defpackage.qo7 a(java.lang.Class r2) {
            r1 = this;
            io3 r0 = r1.a
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto Lf
            yo7 r1 = r1.b
            qo7 r1 = r1.a(r2)
            return r1
        Lf:
            java.lang.String r1 = "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."
            defpackage.fa6.h(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.yo7
    public final defpackage.qo7 b(java.lang.Class r2, defpackage.m94 r3) {
            r1 = this;
            io3 r0 = r1.a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            m9 r1 = r1.c
            qo7 r1 = r1.b(r2, r3)
            return r1
        Lf:
            yo7 r1 = r1.b
            qo7 r1 = r1.b(r2, r3)
            return r1
    }
}
