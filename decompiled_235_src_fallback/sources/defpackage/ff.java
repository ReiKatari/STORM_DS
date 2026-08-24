package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public final class ff {
    public static final defpackage.ff a = null;

    static {
            ff r0 = new ff
            r0.<init>()
            defpackage.ff.a = r0
            return
    }

    public final void a(android.view.View r2, defpackage.ty4 r3) {
            r1 = this;
            android.content.Context r1 = r2.getContext()
            boolean r0 = r3 instanceof defpackage.sj
            if (r0 == 0) goto L11
            sj r3 = (defpackage.sj) r3
            int r3 = r3.b
            android.view.PointerIcon r1 = android.view.PointerIcon.getSystemIcon(r1, r3)
            goto L17
        L11:
            r3 = 1000(0x3e8, float:1.401E-42)
            android.view.PointerIcon r1 = android.view.PointerIcon.getSystemIcon(r1, r3)
        L17:
            android.view.PointerIcon r3 = r2.getPointerIcon()
            boolean r3 = defpackage.nb3.k(r3, r1)
            if (r3 != 0) goto L24
            r2.setPointerIcon(r1)
        L24:
            return
    }
}
