package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo7  reason: default package */
/* loaded from: classes.dex */
public final class xo7 {
    public static defpackage.os0 a(defpackage.bp7 r1, defpackage.yo7 r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L12
            boolean r2 = r1 instanceof defpackage.mw2
            if (r2 == 0) goto L10
            r2 = r1
            mw2 r2 = (defpackage.mw2) r2
            yo7 r2 = r2.getDefaultViewModelProviderFactory()
            goto L12
        L10:
            eg1 r2 = defpackage.eg1.b
        L12:
            boolean r3 = r1 instanceof defpackage.mw2
            if (r3 == 0) goto L1e
            r3 = r1
            mw2 r3 = (defpackage.mw2) r3
            j71 r3 = r3.getDefaultViewModelCreationExtras()
            goto L20
        L1e:
            h71 r3 = defpackage.h71.b
        L20:
            r2.getClass()
            r3.getClass()
            os0 r0 = new os0
            ap7 r1 = r1.getViewModelStore()
            r0.<init>(r1, r2, r3)
            return r0
    }
}
