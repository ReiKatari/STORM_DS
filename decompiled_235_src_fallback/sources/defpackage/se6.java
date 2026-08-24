package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: se6  reason: default package */
/* loaded from: classes.dex */
public final class se6 extends defpackage.ue6 {
    public static final android.graphics.RectF h = null;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            defpackage.se6.h = r0
            return
    }

    public se6(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            return
    }

    @Override // defpackage.ue6
    public final void a(android.graphics.Matrix r6, android.graphics.Path r7) {
            r5 = this;
            android.graphics.Matrix r0 = r5.a
            r6.invert(r0)
            r7.transform(r0)
            float r0 = r5.d
            float r1 = r5.e
            android.graphics.RectF r2 = defpackage.se6.h
            float r3 = r5.b
            float r4 = r5.c
            r2.set(r3, r4, r0, r1)
            float r0 = r5.f
            float r5 = r5.g
            r1 = 0
            r7.arcTo(r2, r0, r5, r1)
            r7.transform(r6)
            return
    }
}
