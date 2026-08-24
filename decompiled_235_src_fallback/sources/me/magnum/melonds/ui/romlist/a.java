package me.magnum.melonds.ui.romlist;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends defpackage.tx2 {
    public defpackage.l06 Y;
    public final defpackage.uo7 Z;
    public defpackage.d00 d0;
    public defpackage.qn2 e0;
    public defpackage.pq5 f0;
    public final defpackage.d9 g0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: me.magnum.melonds.ui.romlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0004a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.romlist.a.EnumC0004a[] $VALUES = null;
        public static final me.magnum.melonds.ui.romlist.a.EnumC0004a ENABLE_ALL = null;
        public static final me.magnum.melonds.ui.romlist.a.EnumC0004a ENABLE_NON_DSIWARE = null;

        private static final /* synthetic */ me.magnum.melonds.ui.romlist.a.EnumC0004a[] $values() {
                me.magnum.melonds.ui.romlist.a$a r0 = me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_ALL
                me.magnum.melonds.ui.romlist.a$a r1 = me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_NON_DSIWARE
                me.magnum.melonds.ui.romlist.a$a[] r0 = new me.magnum.melonds.ui.romlist.a.EnumC0004a[]{r0, r1}
                return r0
        }

        static {
                me.magnum.melonds.ui.romlist.a$a r0 = new me.magnum.melonds.ui.romlist.a$a
                java.lang.String r1 = "ENABLE_ALL"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_ALL = r0
                me.magnum.melonds.ui.romlist.a$a r0 = new me.magnum.melonds.ui.romlist.a$a
                java.lang.String r1 = "ENABLE_NON_DSIWARE"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_NON_DSIWARE = r0
                me.magnum.melonds.ui.romlist.a$a[] r0 = $values()
                me.magnum.melonds.ui.romlist.a.EnumC0004a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.romlist.a.EnumC0004a.$ENTRIES = r0
                return
        }

        EnumC0004a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.romlist.a.EnumC0004a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.romlist.a.EnumC0004a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.romlist.a$a> r0 = me.magnum.melonds.ui.romlist.a.EnumC0004a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.romlist.a$a r1 = (me.magnum.melonds.ui.romlist.a.EnumC0004a) r1
                return r1
        }

        public static me.magnum.melonds.ui.romlist.a.EnumC0004a[] values() {
                me.magnum.melonds.ui.romlist.a$a[] r0 = me.magnum.melonds.ui.romlist.a.EnumC0004a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.romlist.a$a[] r0 = (me.magnum.melonds.ui.romlist.a.EnumC0004a[]) r0
                return r0
        }
    }

    public a() {
            r6 = this;
            r6.<init>()
            java.lang.Class<tz5> r0 = defpackage.tz5.class
            ar0 r0 = defpackage.gh5.a(r0)
            wy5 r1 = new wy5
            r2 = 0
            r1.<init>(r6, r2)
            wy5 r2 = new wy5
            r3 = 1
            r2.<init>(r6, r3)
            wy5 r4 = new wy5
            r5 = 2
            r4.<init>(r6, r5)
            uo7 r5 = new uo7
            r5.<init>(r0, r1, r4, r2)
            r6.Z = r5
            c9 r0 = new c9
            r0.<init>(r3)
            k9 r1 = new k9
            r2 = 4
            r1.<init>(r6, r2)
            d9 r0 = r6.registerForActivityResult(r0, r1)
            r0.getClass()
            r6.g0 = r0
            return
    }

    public final defpackage.tz5 j() {
            r0 = this;
            uo7 r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            tz5 r0 = (defpackage.tz5) r0
            return r0
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            r4.getClass()
            android.os.Bundle r4 = r3.getArguments()
            r5 = 1
            if (r4 == 0) goto L11
            java.lang.String r6 = "allow_rom_configuration"
            boolean r4 = r4.getBoolean(r6)
            goto L12
        L11:
            r4 = r5
        L12:
            d00 r6 = new d00
            r0 = 5
            r6.<init>(r3, r0)
            r3.d0 = r6
            androidx.fragment.app.p r6 = r3.requireActivity()
            il4 r6 = r6.b()
            d00 r0 = r3.d0
            r1 = 0
            if (r0 == 0) goto L4e
            r6.a(r3, r0)
            androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r0 = r3.requireContext()
            r0.getClass()
            r2 = 6
            r6.<init>(r0, r1, r2)
            cs1 r0 = defpackage.cs1.p0
            r6.setViewCompositionStrategy(r0)
            py5 r0 = new py5
            r1 = 0
            r0.<init>(r3, r4, r1)
            zv0 r3 = new zv0
            r4 = -834077021(0xffffffffce48fea3, float:-8.4303277E8)
            r3.<init>(r4, r5, r0)
            r6.setContent(r3)
            return r6
        L4e:
            java.lang.String r3 = "backPressedCallback"
            defpackage.nb3.a0(r3)
            throw r1
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
            r5 = this;
            super.onResume()
            tz5 r0 = r5.j()
            as0 r1 = defpackage.to7.a(r0)
            pz5 r2 = new pz5
            r3 = 0
            r4 = 0
            r2.<init>(r0, r4, r3)
            r0 = 3
            defpackage.hv.L(r1, r4, r4, r2, r0)
            tz5 r5 = r5.j()
            r5.p()
            return
    }
}
