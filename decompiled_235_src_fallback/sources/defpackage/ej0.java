package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ej0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.content.Context B;

    public /* synthetic */ ej0(android.content.Context r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r12 = this;
            int r0 = r12.A
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            android.content.Context r12 = r12.B
            switch(r0) {
                case 0: goto Ld2;
                case 1: goto Lc4;
                case 2: goto L74;
                case 3: goto L66;
                case 4: goto L58;
                case 5: goto L53;
                case 6: goto L49;
                case 7: goto L3f;
                case 8: goto L1c;
                default: goto La;
            }
        La:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r1 = me.magnum.melonds.ui.settings.SettingsActivity.class
            r0.<init>(r12, r1)
            java.lang.String r1 = "entry_point"
            java.lang.String r3 = "translator"
            r0.putExtra(r1, r3)
            r12.startActivity(r0)
            return r2
        L1c:
            u12 r0 = new u12
            r1 = 0
            r2 = 17
            r0.<init>(r12, r1, r2)
            g21 r12 = new g21
            r1 = 7
            r12.<init>(r0, r1)
            le2 r12 = defpackage.f04.z(r12)
            mp6 r0 = new mp6
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 0
            r0.<init>(r1, r3)
            r1 = 1
            ms2 r2 = defpackage.ms2.A
            be5 r12 = defpackage.f04.P(r12, r2, r0, r1)
            return r12
        L3f:
            java.lang.String r0 = "Список комнат обновлен"
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r0, r1)
            r12.show()
            return r2
        L49:
            java.lang.String r0 = "Комната создана! Ожидание игроков..."
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r0, r1)
            r12.show()
            return r2
        L53:
            rc4 r12 = defpackage.gi2.A(r12)
            return r12
        L58:
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            r0 = 1106247680(0x41f00000, float:30.0)
            float r12 = defpackage.np2.K(r12, r0)
            int r12 = (int) r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L66:
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            r0 = 1124859904(0x430c0000, float:140.0)
            float r12 = defpackage.np2.K(r12, r0)
            int r12 = (int) r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L74:
            xf3 r4 = defpackage.db2.A
            xe1 r0 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            java.io.File r12 = r12.getCacheDir()
            r12.getClass()
            java.io.File r12 = defpackage.jc2.C0(r12)
            java.lang.String r0 = defpackage.lt4.B
            lt4 r5 = defpackage.w31.q(r12)
            r0 = 0
            int r12 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r12 <= 0) goto Lba
            r8 = 10485760(0xa00000, double:5.180654E-317)
            java.io.File r12 = r5.toFile()     // Catch: java.lang.Exception -> Lb8
            r12.mkdir()     // Catch: java.lang.Exception -> Lb8
            java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> Lb8
            android.os.StatFs r2 = new android.os.StatFs     // Catch: java.lang.Exception -> Lb8
            r2.<init>(r12)     // Catch: java.lang.Exception -> Lb8
            long r6 = r2.getBlockCountLong()     // Catch: java.lang.Exception -> Lb8
            double r6 = (double) r6     // Catch: java.lang.Exception -> Lb8
            double r0 = r0 * r6
            long r6 = r2.getBlockSizeLong()     // Catch: java.lang.Exception -> Lb8
            double r6 = (double) r6     // Catch: java.lang.Exception -> Lb8
            double r0 = r0 * r6
            long r6 = (long) r0     // Catch: java.lang.Exception -> Lb8
            r10 = 262144000(0xfa00000, double:1.295163447E-315)
            long r8 = defpackage.gi2.s(r6, r8, r10)     // Catch: java.lang.Exception -> Lb8
        Lb8:
            r1 = r8
            goto Lbe
        Lba:
            r8 = 100663296(0x6000000, double:4.97342764E-316)
            goto Lb8
        Lbe:
            me5 r0 = new me5
            r0.<init>(r1, r3, r4, r5)
            return r0
        Lc4:
            b44 r0 = new b44
            r0.<init>(r12)
            r1 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r0.b = r1
            se5 r12 = r0.a()
            return r12
        Ld2:
            t16 r0 = new t16
            r0.<init>(r12)
            return r0
    }
}
