package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p90  reason: default package */
/* loaded from: classes.dex */
public final class p90 extends defpackage.ak3 {
    public final /* synthetic */ int a;

    public /* synthetic */ p90(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ak3
    public final android.view.View a(android.content.Context r6) {
            r5 = this;
            int r5 = r5.a
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            switch(r5) {
                case 0: goto L47;
                case 1: goto L41;
                default: goto L8;
            }
        L8:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r6)
            r2 = 1
            r5.setOrientation(r2)
            android.view.View r2 = new android.view.View
            r2.<init>(r6)
            r3 = 2131230847(0x7f08007f, float:1.8077758E38)
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r3)
            r2.setBackground(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r1, r0)
            r5.addView(r2, r3)
            android.view.View r2 = new android.view.View
            r2.<init>(r6)
            r3 = 2131230845(0x7f08007d, float:1.8077754E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r3)
            r2.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r4, r1, r0)
            r5.addView(r2, r6)
            return r5
        L41:
            u64 r5 = new u64
            r5.<init>(r6)
            return r5
        L47:
            s64 r5 = new s64
            r5.<init>(r6)
            java.lang.String r2 = defpackage.v15.b(r6)
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r2, r1)
            java.lang.String r1 = "pref_button_cluster_spread"
            float r1 = r6.getFloat(r1, r0)
            r5.setButtonSpread(r1)
            java.lang.String r1 = "pref_button_cluster_inner_scale"
            float r6 = r6.getFloat(r1, r0)
            r5.setButtonInnerScale(r6)
            return r5
    }

    @Override // defpackage.ak3
    public final float b() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r0 = 1059760811(0x3f2aaaab, float:0.6666667)
            return r0
        L9:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        Lc:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }
}
