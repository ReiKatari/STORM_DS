package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs2  reason: default package */
/* loaded from: classes.dex */
public final class qs2 extends android.widget.EdgeEffect {
    public final float a;
    public float b;

    public qs2(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            uh1 r2 = defpackage.ak7.s(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2.A
            float r2 = r2 * r0
            r1.a = r2
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int r2) {
            r1 = this;
            r0 = 0
            r1.b = r0
            super.onAbsorb(r2)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2) {
            r1 = this;
            r0 = 0
            r1.b = r0
            super.onPull(r2)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2, float r3) {
            r1 = this;
            r0 = 0
            r1.b = r0
            super.onPull(r2, r3)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
            r1 = this;
            r0 = 0
            r1.b = r0
            super.onRelease()
            return
    }
}
