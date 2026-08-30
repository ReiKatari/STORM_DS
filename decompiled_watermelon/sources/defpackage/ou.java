package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ou  reason: default package */
/* loaded from: classes.dex */
public final class ou {
    public float a;
    public float b;

    public b92 a(float f) {
        double b = b(f);
        double d = c92.a;
        double d2 = d - 1.0d;
        return new b92(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = eh.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
