package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs1  reason: default package */
/* loaded from: classes.dex */
public final class hs1 extends defpackage.ak3 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public hs1(defpackage.ak3 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public hs1(defpackage.nj3 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r2.getClass()
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // defpackage.ak3
    public final android.view.View a(android.content.Context r2) {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            w64 r0 = new w64
            nj3 r1 = (defpackage.nj3) r1
            r0.<init>(r2, r1)
            return r0
        Lf:
            ak3 r1 = (defpackage.ak3) r1
            android.view.View r1 = r1.a(r2)
            r0 = 2131230850(0x7f080082, float:1.8077764E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            r1.setBackground(r2)
            return r1
    }

    @Override // defpackage.ak3
    public final float b() {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto L27;
                default: goto L7;
            }
        L7:
            nj3 r1 = (defpackage.nj3) r1
            int[] r0 = defpackage.hi6.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L23
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 == r0) goto L20
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L26
        L20:
            r1 = 1067450368(0x3fa00000, float:1.25)
            goto L26
        L23:
            r1 = 1072064102(0x3fe66666, float:1.8)
        L26:
            return r1
        L27:
            ak3 r1 = (defpackage.ak3) r1
            float r1 = r1.b()
            return r1
    }
}
