package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha4  reason: default package */
/* loaded from: classes.dex */
public final class ha4 extends defpackage.j45 implements defpackage.eg3, defpackage.fg3 {
    public ha4(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r5 = 1
            kb0 r1 = defpackage.kb0.A
            java.lang.Class<eb6> r2 = defpackage.eb6.class
            r0 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.lb0
    public final defpackage.yf3 a() {
            r1 = this;
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            return r1
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r1) {
            r0 = this;
            r0.h()
            r0 = 0
            throw r0
    }

    @Override // defpackage.eg3
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final void h() {
            r1 = this;
            boolean r0 = r1.Z
            if (r0 != 0) goto L1a
            yf3 r0 = r1.f()
            if (r0 == r1) goto L12
            fg3 r0 = (defpackage.fg3) r0
            ha4 r0 = (defpackage.ha4) r0
            r0.h()
            return
        L12:
            d71 r1 = new d71
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            throw r1
        L1a:
            java.lang.String r1 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            defpackage.fa6.h(r1)
            return
    }
}
