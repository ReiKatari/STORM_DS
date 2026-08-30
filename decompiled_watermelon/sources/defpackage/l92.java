package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l92  reason: default package */
/* loaded from: classes.dex */
public final class l92 implements f92 {
    public final float a;
    public final rc6 b;

    /* JADX WARN: Type inference failed for: r6v1, types: [rc6, java.lang.Object] */
    public l92(float f, float f2, float f3) {
        this.a = f3;
        ?? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < RecyclerView.A1) {
            qr4.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= RecyclerView.A1) {
            qr4.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt(f2);
        this.b = obj;
    }

    @Override // defpackage.f92
    public final float b(long j, float f, float f2, float f3) {
        rc6 rc6Var = this.b;
        rc6Var.a = f2;
        return Float.intBitsToFloat((int) (rc6Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.f92
    public final float c(long j, float f, float f2, float f3) {
        rc6 rc6Var = this.b;
        rc6Var.a = f2;
        return Float.intBitsToFloat((int) (rc6Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // defpackage.f92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l92.d(float, float, float):long");
    }

    @Override // defpackage.f92
    public final float e(float f, float f2, float f3) {
        return RecyclerView.A1;
    }
}
