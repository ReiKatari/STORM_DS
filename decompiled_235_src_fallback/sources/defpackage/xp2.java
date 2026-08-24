package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xp2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.hq2 B;

    public /* synthetic */ xp2(defpackage.hq2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r8 = this;
            int r0 = r8.A
            r1 = 0
            java.lang.String r2 = ""
            jg7 r3 = defpackage.jg7.a
            hq2 r8 = r8.B
            switch(r0) {
                case 0: goto Ldf;
                case 1: goto Ld0;
                case 2: goto Lcc;
                case 3: goto Lc8;
                case 4: goto Lbe;
                case 5: goto L39;
                case 6: goto L35;
                case 7: goto L28;
                case 8: goto L1b;
                default: goto Lc;
            }
        Lc:
            android.content.SharedPreferences r8 = r8.f
            java.lang.String r0 = "translator_custom_ai_endpoint"
            java.lang.String r1 = "https://api.openai.com/v1/chat/completions"
            java.lang.String r8 = r8.getString(r0, r1)
            if (r8 != 0) goto L19
            goto L1a
        L19:
            r2 = r8
        L1a:
            return r2
        L1b:
            android.content.SharedPreferences r8 = r8.f
            java.lang.String r0 = "translator_custom_ai_key"
            java.lang.String r8 = r8.getString(r0, r2)
            if (r8 != 0) goto L26
            goto L27
        L26:
            r2 = r8
        L27:
            return r2
        L28:
            android.content.SharedPreferences r8 = r8.f
            java.lang.String r0 = "translator_deepl_key"
            java.lang.String r8 = r8.getString(r0, r2)
            if (r8 != 0) goto L33
            goto L34
        L33:
            r2 = r8
        L34:
            return r2
        L35:
            r8.c()
            return r3
        L39:
            o60 r0 = new o60
            android.app.Activity r2 = r8.a
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r2.getTheme()
            r6 = 2130968711(0x7f040087, float:1.7546083E38)
            r7 = 1
            boolean r5 = r5.resolveAttribute(r6, r4, r7)
            if (r5 == 0) goto L53
            int r4 = r4.resourceId
            goto L56
        L53:
            r4 = 2132017831(0x7f1402a7, float:1.9673952E38)
        L56:
            r0.<init>(r2, r4)
            r0.g0 = r7
            r0.h0 = r7
            m60 r4 = new m60
            r4.<init>(r0)
            r0.m0 = r4
            tq r4 = r0.f()
            r4.i(r7)
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969060(0x7f0401e4, float:1.7546791E38)
            int[] r6 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r6)
            boolean r6 = r4.getBoolean(r1, r1)
            r0.k0 = r6
            r4.recycle()
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r1 = r4.getBoolean(r1, r1)
            r0.k0 = r1
            r4.recycle()
            androidx.compose.ui.platform.ComposeView r1 = new androidx.compose.ui.platform.ComposeView
            r4 = 0
            r5 = 6
            r1.<init>(r2, r4, r5)
            yp2 r2 = new yp2
            r2.<init>(r8, r0, r7)
            zv0 r8 = new zv0
            r4 = 1278803476(0x4c38fe14, float:4.849467E7)
            r8.<init>(r4, r7, r2)
            r1.setContent(r8)
            r0.setContentView(r1)
            r0.show()
            return r3
        Lbe:
            qq2 r8 = r8.p
            java.lang.String r0 = "Бэтмен: Город под защитой. Лейтон: У каждой загадки есть разгадка!"
            java.lang.String r1 = "ru"
            r8.d(r0, r1)
            return r3
        Lc8:
            r8.h()
            return r3
        Lcc:
            r8.i()
            return r3
        Ld0:
            android.content.SharedPreferences r8 = r8.f
            java.lang.String r0 = "translator_custom_ai_model"
            java.lang.String r1 = "gpt-4o-mini"
            java.lang.String r8 = r8.getString(r0, r1)
            if (r8 != 0) goto Ldd
            goto Lde
        Ldd:
            r2 = r8
        Lde:
            return r2
        Ldf:
            r8.j(r1)
            return r3
    }
}
