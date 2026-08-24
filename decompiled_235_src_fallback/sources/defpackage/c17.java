package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c17  reason: default package */
/* loaded from: classes.dex */
public final class c17 extends android.text.style.CharacterStyle {
    public final boolean a;
    public final boolean b;

    public c17(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            boolean r0 = r1.a
            r2.setUnderlineText(r0)
            boolean r1 = r1.b
            r2.setStrikeThruText(r1)
            return
    }
}
