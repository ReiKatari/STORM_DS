package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn3  reason: default package */
/* loaded from: classes.dex */
public final class fn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.gn3 b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ fn3(defpackage.gn3 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    private final void a() {
            r0 = this;
            return
    }

    public defpackage.ym3 b() {
            r2 = this;
            gn3 r0 = r2.b
            ja4 r1 = r0.f0
            java.lang.Object r2 = r2.c
            java.lang.Object r2 = r1.g(r2)
            sm3 r2 = (defpackage.sm3) r2
            if (r2 == 0) goto L17
            ja4 r0 = r0.Y
            java.lang.Object r2 = r0.g(r2)
            ym3 r2 = (defpackage.ym3) r2
            return r2
        L17:
            r2 = 0
            return r2
    }

    public final boolean c() {
            r2 = this;
            int r0 = r2.a
            r1 = 1
            switch(r0) {
                case 0: goto L14;
                default: goto L6;
            }
        L6:
            ym3 r2 = r2.b()
            if (r2 == 0) goto L14
            tu4 r2 = r2.f
            if (r2 == 0) goto L14
            boolean r1 = r2.c()
        L14:
            return r1
    }
}
