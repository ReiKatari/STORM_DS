package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je6  reason: default package */
/* loaded from: classes.dex */
public final class je6 extends android.text.style.CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public je6(float r1, float r2, float r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            float r0 = r3.c
            int r1 = r3.a
            float r2 = r3.d
            float r3 = r3.b
            r4.setShadowLayer(r2, r3, r0, r1)
            return
    }
}
