package defpackage;

import android.graphics.Shader;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l26  reason: default package */
/* loaded from: classes.dex */
public abstract class l26 extends b60 {
    public dz4 a;
    public long b = 9205357640488583168L;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (defpackage.i76.b(r5.b, r7) == false) goto L23;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, dz4] */
    @Override // defpackage.b60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r6, long r7, defpackage.oi r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r9.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            dz4 r1 = r5.a
            r2 = 0
            if (r1 == 0) goto L11
            long r3 = r5.b
            boolean r3 = defpackage.i76.b(r3, r7)
            if (r3 != 0) goto L37
        L11:
            boolean r1 = defpackage.i76.f(r7)
            if (r1 == 0) goto L22
            r5.a = r2
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.b = r7
            r1 = r2
            goto L37
        L22:
            dz4 r1 = r5.a
            if (r1 != 0) goto L2d
            dz4 r1 = new dz4
            r1.<init>()
            r5.a = r1
        L2d:
            android.graphics.Shader r3 = r5.b(r7)
            r1.A = r3
            r5.a = r1
            r5.b = r7
        L37:
            int r5 = r0.getColor()
            long r7 = defpackage.mh7.c(r5)
            long r3 = defpackage.xq0.b
            boolean r5 = defpackage.xq0.c(r7, r3)
            if (r5 != 0) goto L4a
            r9.l(r3)
        L4a:
            java.lang.Object r5 = r9.R
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r1 == 0) goto L55
            java.lang.Object r7 = r1.A
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L56
        L55:
            r7 = r2
        L56:
            boolean r5 = defpackage.b53.x(r5, r7)
            if (r5 != 0) goto L66
            if (r1 == 0) goto L63
            java.lang.Object r5 = r1.A
            r2 = r5
            android.graphics.Shader r2 = (android.graphics.Shader) r2
        L63:
            r9.p(r2)
        L66:
            int r5 = r0.getAlpha()
            float r5 = (float) r5
            r7 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L73
            return
        L73:
            r9.j(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l26.a(float, long, oi):void");
    }

    public abstract Shader b(long j);
}
