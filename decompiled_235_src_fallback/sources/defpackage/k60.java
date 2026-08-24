package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k60  reason: default package */
/* loaded from: classes.dex */
public final class k60 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public k60(android.content.Context r2, defpackage.oe r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.d = r3
            r3 = 0
            r1.b = r3
            android.view.GestureDetector r3 = new android.view.GestureDetector
            b53 r0 = new b53
            r0.<init>(r1)
            r3.<init>(r2, r0)
            r1.e = r3
            return
    }

    public k60(com.google.android.material.bottomsheet.BottomSheetBehavior r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.e = r2
            g15 r2 = new g15
            r0 = 3
            r2.<init>(r1, r0)
            r1.d = r2
            return
    }

    public k60(com.google.android.material.sidesheet.SideSheetBehavior r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.e = r2
            rk3 r2 = new rk3
            r0 = 11
            r2.<init>(r1, r0)
            r1.d = r2
            return
    }

    public void a(int r5) {
            r4 = this;
            int r0 = r4.a
            r1 = 1
            java.lang.Object r2 = r4.d
            java.lang.Object r3 = r4.e
            switch(r0) {
                case 0: goto L2d;
                default: goto La;
            }
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            java.lang.ref.WeakReference r0 = r3.p
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L17
            goto L2c
        L17:
            r4.b = r5
            boolean r5 = r4.c
            if (r5 != 0) goto L2c
            java.lang.ref.WeakReference r5 = r3.p
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            rk3 r2 = (defpackage.rk3) r2
            r5.postOnAnimation(r2)
            r4.c = r1
        L2c:
            return
        L2d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            java.lang.ref.WeakReference r0 = r3.W
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L3a
            goto L4f
        L3a:
            r4.b = r5
            boolean r5 = r4.c
            if (r5 != 0) goto L4f
            java.lang.ref.WeakReference r5 = r3.W
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            g15 r2 = (defpackage.g15) r2
            r5.postOnAnimation(r2)
            r4.c = r1
        L4f:
            return
    }
}
