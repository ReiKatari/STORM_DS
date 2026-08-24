package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te6  reason: default package */
/* loaded from: classes.dex */
public final class te6 extends defpackage.ue6 {
    public float b;
    public float c;

    @Override // defpackage.ue6
    public final void a(android.graphics.Matrix r2, android.graphics.Path r3) {
            r1 = this;
            android.graphics.Matrix r0 = r1.a
            r2.invert(r0)
            r3.transform(r0)
            float r0 = r1.b
            float r1 = r1.c
            r3.lineTo(r0, r1)
            r3.transform(r2)
            return
    }
}
