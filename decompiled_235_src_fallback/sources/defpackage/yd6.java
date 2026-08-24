package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd6  reason: default package */
/* loaded from: classes.dex */
public final class yd6 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.xd6 A;
    public final float B;
    public final defpackage.vs4 L;
    public final defpackage.ii1 R;

    public yd6(defpackage.xd6 r3, float r4) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2.B = r4
            xi6 r3 = new xi6
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r3.<init>(r0)
            vs4 r3 = defpackage.np2.Y(r3)
            r2.L = r3
            t46 r3 = new t46
            r4 = 9
            r3.<init>(r2, r4)
            ii1 r3 = defpackage.np2.I(r3)
            r2.R = r3
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.B
            defpackage.g04.Q(r2, r0)
            ii1 r1 = r1.R
            java.lang.Object r1 = r1.getValue()
            android.graphics.Shader r1 = (android.graphics.Shader) r1
            r2.setShader(r1)
            return
    }
}
