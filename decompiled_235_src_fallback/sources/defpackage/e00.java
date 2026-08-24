package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e00  reason: default package */
/* loaded from: classes.dex */
public final class e00 {
    public final defpackage.eb a;
    public final defpackage.il4 b;

    public e00(defpackage.eb r1, defpackage.il4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            if (r1 != 0) goto La
            r1 = r2
        La:
            if (r1 == 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public final void a(defpackage.d2 r2) {
            r1 = this;
            eb r0 = r1.a
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r2.b
            c00 r1 = (defpackage.c00) r1
            defpackage.eb.e(r0, r1)
            return
        Lc:
            il4 r1 = r1.b
            if (r1 == 0) goto L18
            java.lang.Object r2 = r2.a
            d00 r2 = (defpackage.d00) r2
            r1.b(r2)
            return
        L18:
            java.lang.String r1 = "Unreachable"
            defpackage.i.m(r1)
            return
    }

    public final void b(defpackage.d2 r2) {
            r1 = this;
            eb r0 = r1.a
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r2.b
            c00 r1 = (defpackage.c00) r1
            r1.e()
            return
        Lc:
            il4 r1 = r1.b
            if (r1 == 0) goto L18
            java.lang.Object r1 = r2.a
            d00 r1 = (defpackage.d00) r1
            r1.e()
            return
        L18:
            java.lang.String r1 = "Unreachable"
            defpackage.i.m(r1)
            return
    }
}
