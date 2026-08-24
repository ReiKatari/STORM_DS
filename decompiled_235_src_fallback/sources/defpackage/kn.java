package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public final class kn implements defpackage.fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public kn(defpackage.ij1 r2, defpackage.sb4 r3, defpackage.mm6 r4) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.b = r4
            return
    }

    public /* synthetic */ kn(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // defpackage.fl1
    public final void dispose() {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r1 = r3.d
            java.lang.Object r2 = r3.c
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L67;
                case 1: goto L56;
                case 2: goto L3f;
                case 3: goto L2b;
                default: goto Lb;
            }
        Lb:
            p46 r3 = (defpackage.p46) r3
            ja4 r0 = r3.B
            java.lang.Object r0 = r0.k(r2)
            u46 r1 = (defpackage.u46) r1
            if (r0 != r1) goto L2a
            java.util.Map r3 = r3.A
            java.util.Map r0 = r1.d()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L27
            r3.remove(r2)
            goto L2a
        L27:
            r3.put(r2, r0)
        L2a:
            return
        L2b:
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r3.get(r2)
            nh2 r1 = (defpackage.nh2) r1
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L3e
            r3.remove(r2)
        L3e:
            return
        L3f:
            hu3 r3 = (defpackage.hu3) r3
            ut3 r3 = r3.getLifecycle()
            du3 r2 = (defpackage.du3) r2
            r3.c(r2)
            dh5 r1 = (defpackage.dh5) r1
            java.lang.Object r3 = r1.A
            i00 r3 = (defpackage.i00) r3
            if (r3 == 0) goto L55
            r3.a()
        L55:
            return
        L56:
            ij1 r2 = (defpackage.ij1) r2
            sb4 r1 = (defpackage.sb4) r1
            vb4 r0 = r2.b()
            r0.c(r1)
            mm6 r3 = (defpackage.mm6) r3
            r3.remove(r1)
            return
        L67:
            mm6 r3 = (defpackage.mm6) r3
            r3.remove(r2)
            yn r1 = (defpackage.yn) r1
            ja4 r3 = r1.d
            r3.k(r2)
            return
    }
}
