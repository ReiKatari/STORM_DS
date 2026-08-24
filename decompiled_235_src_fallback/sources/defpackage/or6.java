package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class or6 implements defpackage.nc6 {
    public final /* synthetic */ defpackage.pr6 a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ defpackage.zi7 d;
    public final /* synthetic */ defpackage.yy e;
    public final /* synthetic */ defpackage.yy f;

    public /* synthetic */ or6(defpackage.pr6 r1, java.lang.String r2, java.lang.String r3, defpackage.zi7 r4, defpackage.yy r5, defpackage.yy r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    @Override // defpackage.nc6
    public final void a(defpackage.rc6 r7, defpackage.oc6 r8) {
            r6 = this;
            pr6 r0 = r6.a
            eg0 r7 = r0.d()
            if (r7 != 0) goto L9
            goto L3e
        L9:
            r0.G()
            java.lang.String r1 = r6.b
            java.lang.String r2 = r6.c
            zi7 r3 = r6.d
            yy r4 = r6.e
            yy r5 = r6.f
            java.util.List r6 = r0.H(r1, r2, r3, r4, r5)
            r0.E(r6)
            r0.r()
            mq7 r6 = r0.r
            r6.getClass()
            defpackage.nj2.h()
            java.util.HashSet r7 = r6.A
            java.util.Iterator r7 = r7.iterator()
        L2e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3e
            java.lang.Object r8 = r7.next()
            di7 r8 = (defpackage.di7) r8
            r6.b(r8)
            goto L2e
        L3e:
            return
    }
}
