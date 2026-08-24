package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt7  reason: default package */
/* loaded from: classes.dex */
public abstract class zt7 {
    public final int a;
    public float b;
    public final android.view.animation.Interpolator c;
    public final long d;

    public zt7(int r1, android.view.animation.Interpolator r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public float a() {
            r0 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public long b() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public float c() {
            r1 = this;
            float r0 = r1.b
            android.view.animation.Interpolator r1 = r1.c
            if (r1 == 0) goto Lb
            float r1 = r1.getInterpolation(r0)
            return r1
        Lb:
            return r0
    }

    public int d() {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    public void e(float r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
