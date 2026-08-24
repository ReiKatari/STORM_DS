package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we6  reason: default package */
/* loaded from: classes.dex */
public final class we6 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public we6() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            r0 = 0
            r1 = 1132920832(0x43870000, float:270.0)
            r2.d(r0, r1, r0)
            return
    }

    public final void a(float r5) {
            r4 = this;
            float r0 = r4.d
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 != 0) goto L7
            goto L13
        L7:
            float r0 = r5 - r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 + r1
            float r0 = r0 % r1
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
        L13:
            return
        L14:
            se6 r1 = new se6
            float r2 = r4.b
            float r3 = r4.c
            r1.<init>(r2, r3, r2, r3)
            float r2 = r4.d
            r1.f = r2
            r1.g = r0
            qe6 r0 = new qe6
            r0.<init>(r1)
            java.util.ArrayList r1 = r4.g
            r1.add(r0)
            r4.d = r5
            return
    }

    public final void b(android.graphics.Matrix r4, android.graphics.Path r5) {
            r3 = this;
            java.util.ArrayList r3 = r3.f
            int r0 = r3.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r3.get(r1)
            ue6 r2 = (defpackage.ue6) r2
            r2.a(r4, r5)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public final void c(float r5, float r6) {
            r4 = this;
            te6 r0 = new te6
            r0.<init>()
            r0.b = r5
            r0.c = r6
            java.util.ArrayList r1 = r4.f
            r1.add(r0)
            re6 r1 = new re6
            float r2 = r4.b
            float r3 = r4.c
            r1.<init>(r0, r2, r3)
            float r0 = r1.b()
            r2 = 1132920832(0x43870000, float:270.0)
            float r0 = r0 + r2
            float r3 = r1.b()
            float r3 = r3 + r2
            r4.a(r0)
            java.util.ArrayList r0 = r4.g
            r0.add(r1)
            r4.d = r3
            r4.b = r5
            r4.c = r6
            return
    }

    public final void d(float r2, float r3, float r4) {
            r1 = this;
            r1.a = r2
            r0 = 0
            r1.b = r0
            r1.c = r2
            r1.d = r3
            float r3 = r3 + r4
            r2 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r2
            r1.e = r3
            java.util.ArrayList r2 = r1.f
            r2.clear()
            java.util.ArrayList r1 = r1.g
            r1.clear()
            return
    }
}
