package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x82  reason: default package */
/* loaded from: classes.dex */
public final class x82 extends android.app.Presentation {
    public final defpackage.mv0 A;
    public final defpackage.vs4 B;

    public x82(defpackage.mv0 r1, android.view.Display r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.A = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.B = r1
            return
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            androidx.compose.ui.platform.ComposeView r5 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r0 = r4.getContext()
            r0.getClass()
            r1 = 0
            r2 = 6
            r5.<init>(r0, r1, r2)
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            mv0 r1 = r4.A
            r5.setTag(r0, r1)
            r0 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r5.setTag(r0, r1)
            r0 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r5.setTag(r0, r1)
            w82 r0 = new w82
            r1 = 1
            r0.<init>(r4, r1)
            zv0 r2 = new zv0
            r3 = 1798755713(0x6b36d581, float:2.2103274E26)
            r2.<init>(r3, r1, r0)
            r5.setContent(r2)
            r4.setContentView(r5)
            return
    }
}
