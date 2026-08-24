package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv  reason: default package */
/* loaded from: classes.dex */
public final class gv {
    public float a;
    public float b;

    public td2 a(float f) {
        double b = b(f);
        double d = ud2.a;
        double d2 = d - 1.0d;
        return new td2(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = qh.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
