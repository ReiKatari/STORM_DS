package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r7  reason: default package */
/* loaded from: classes.dex */
public final class r7 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ r7(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto Lb8;
                case 1: goto L7f;
                case 2: goto L4c;
                case 3: goto L1e;
                case 4: goto L18;
                default: goto L9;
            }
        L9:
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            d87 r3 = r3.L0
            if (r3 != 0) goto L10
            goto L12
        L10:
            o44 r2 = r3.B
        L12:
            if (r2 == 0) goto L17
            r2.collapseActionView()
        L17:
            return
        L18:
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.performClick(r4)
            return
        L1e:
            f24 r3 = (defpackage.f24) r3
            f24$a r4 = r3.X
            f24$a r0 = defpackage.f24.a.YEAR
            if (r4 != r0) goto L38
            f24$a r4 = defpackage.f24.a.DAY
            r3.i(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r3.d0
            r0 = 2131952271(0x7f13028f, float:1.954098E38)
            java.lang.String r3 = r3.getString(r0)
            r4.announceForAccessibility(r3)
            goto L4b
        L38:
            f24$a r1 = defpackage.f24.a.DAY
            if (r4 != r1) goto L4b
            r3.i(r0)
            androidx.recyclerview.widget.RecyclerView r4 = r3.Z
            r0 = 2131952272(0x7f130290, float:1.9540982E38)
            java.lang.String r3 = r3.getString(r0)
            r4.announceForAccessibility(r3)
        L4b:
            return
        L4c:
            o60 r3 = (defpackage.o60) r3
            boolean r4 = r3.g0
            if (r4 == 0) goto L7e
            boolean r4 = r3.isShowing()
            if (r4 == 0) goto L7e
            boolean r4 = r3.i0
            if (r4 != 0) goto L77
            android.content.Context r4 = r3.getContext()
            r0 = 16843611(0x101035b, float:2.3695965E-38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0)
            r0 = 0
            boolean r0 = r4.getBoolean(r0, r1)
            r3.h0 = r0
            r4.recycle()
            r3.i0 = r1
        L77:
            boolean r4 = r3.h0
            if (r4 == 0) goto L7e
            r3.cancel()
        L7e:
            return
        L7f:
            yb r3 = (defpackage.yb) r3
            android.widget.Button r0 = r3.j
            if (r4 != r0) goto L8e
            android.os.Message r0 = r3.l
            if (r0 == 0) goto L8e
            android.os.Message r2 = android.os.Message.obtain(r0)
            goto La7
        L8e:
            android.widget.Button r0 = r3.m
            if (r4 != r0) goto L9b
            android.os.Message r0 = r3.o
            if (r0 == 0) goto L9b
            android.os.Message r2 = android.os.Message.obtain(r0)
            goto La7
        L9b:
            android.widget.Button r0 = r3.p
            if (r4 != r0) goto La7
            android.os.Message r4 = r3.r
            if (r4 == 0) goto La7
            android.os.Message r2 = android.os.Message.obtain(r4)
        La7:
            if (r2 == 0) goto Lac
            r2.sendToTarget()
        Lac:
            sk1 r4 = r3.G
            ac r3 = r3.b
            android.os.Message r3 = r4.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
        Lb8:
            k8 r3 = (defpackage.k8) r3
            r3.a()
            return
    }
}
