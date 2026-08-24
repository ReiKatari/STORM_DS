package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd6  reason: default package */
/* loaded from: classes.dex */
public abstract class xd6 extends defpackage.f80 {
    public defpackage.j97 a;
    public long b;

    public xd6() {
            r2 = this;
            r2.<init>()
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.b = r0
            return
    }

    @Override // defpackage.f80
    public final void a(float r6, long r7, defpackage.aj r9) {
            r5 = this;
            java.lang.Object r0 = r9.L
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            j97 r1 = r5.a
            r2 = 0
            if (r1 == 0) goto L11
            long r3 = r5.b
            boolean r3 = defpackage.xi6.b(r3, r7)
            if (r3 != 0) goto L38
        L11:
            boolean r1 = defpackage.xi6.f(r7)
            if (r1 == 0) goto L22
            r5.a = r2
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.b = r7
            r1 = r2
            goto L38
        L22:
            j97 r1 = r5.a
            if (r1 != 0) goto L2e
            j97 r1 = new j97
            r3 = 0
            r1.<init>(r3)
            r5.a = r1
        L2e:
            android.graphics.Shader r3 = r5.b(r7)
            r1.B = r3
            r5.a = r1
            r5.b = r7
        L38:
            int r5 = r0.getColor()
            long r7 = defpackage.hv.b(r5)
            long r3 = defpackage.kt0.b
            boolean r5 = defpackage.kt0.d(r7, r3)
            if (r5 != 0) goto L4b
            r9.l(r3)
        L4b:
            java.lang.Object r5 = r9.R
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r1 == 0) goto L56
            java.lang.Object r7 = r1.B
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L57
        L56:
            r7 = r2
        L57:
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 != 0) goto L67
            if (r1 == 0) goto L64
            java.lang.Object r5 = r1.B
            r2 = r5
            android.graphics.Shader r2 = (android.graphics.Shader) r2
        L64:
            r9.p(r2)
        L67:
            int r5 = r0.getAlpha()
            float r5 = (float) r5
            r7 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L74
            return
        L74:
            r9.j(r6)
            return
    }

    public abstract android.graphics.Shader b(long r1);
}
