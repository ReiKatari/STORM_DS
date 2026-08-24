package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu7  reason: default package */
/* loaded from: classes.dex */
public class wu7 extends defpackage.bv7 {
    public final android.view.Window a;
    public final defpackage.s35 b;

    public wu7(android.view.Window r1, defpackage.s35 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.bv7
    public final void a(int r4) {
            r3 = this;
            r0 = 1
            r1 = r0
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L2a
            r2 = r4 & r1
            if (r2 != 0) goto Lb
            goto L27
        Lb:
            if (r1 == r0) goto L23
            r2 = 2
            if (r1 == r2) goto L1f
            r2 = 8
            if (r1 == r2) goto L15
            goto L27
        L15:
            s35 r2 = r3.b
            java.lang.Object r2 = r2.A
            s35 r2 = (defpackage.s35) r2
            r2.z()
            goto L27
        L1f:
            r3.h(r2)
            goto L27
        L23:
            r2 = 4
            r3.h(r2)
        L27:
            int r1 = r1 << 1
            goto L2
        L2a:
            return
    }

    @Override // defpackage.bv7
    public final boolean b() {
            r0 = this;
            android.view.Window r0 = r0.a
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // defpackage.bv7
    public final void d(boolean r3) {
            r2 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L14
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.view.Window r1 = r2.a
            r1.clearFlags(r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r3)
            r2.h(r0)
            return
        L14:
            r2.i(r0)
            return
    }

    @Override // defpackage.bv7
    public final void e() {
            r3 = this;
            android.view.Window r0 = r3.a
            android.view.View r0 = r0.getDecorView()
            r1 = 356039078(0x1538b9a6, float:3.7304955E-26)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
            r0 = 2048(0x800, float:2.87E-42)
            r3.i(r0)
            r0 = 4096(0x1000, float:5.74E-42)
            r3.h(r0)
            return
    }

    @Override // defpackage.bv7
    public final void f(int r5) {
            r4 = this;
            r0 = 1
            r1 = r0
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L31
            r2 = r5 & r1
            if (r2 != 0) goto Lb
            goto L2e
        Lb:
            if (r1 == r0) goto L23
            r2 = 2
            if (r1 == r2) goto L1f
            r2 = 8
            if (r1 == r2) goto L15
            goto L2e
        L15:
            s35 r2 = r4.b
            java.lang.Object r2 = r2.A
            s35 r2 = (defpackage.s35) r2
            r2.E()
            goto L2e
        L1f:
            r4.i(r2)
            goto L2e
        L23:
            r2 = 4
            r4.i(r2)
            r2 = 1024(0x400, float:1.435E-42)
            android.view.Window r3 = r4.a
            r3.clearFlags(r2)
        L2e:
            int r1 = r1 << 1
            goto L2
        L31:
            return
    }

    public final void h(int r2) {
            r1 = this;
            android.view.Window r1 = r1.a
            android.view.View r1 = r1.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            r2 = r2 | r0
            r1.setSystemUiVisibility(r2)
            return
    }

    public final void i(int r2) {
            r1 = this;
            android.view.Window r1 = r1.a
            android.view.View r1 = r1.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            int r2 = ~r2
            r2 = r2 & r0
            r1.setSystemUiVisibility(r2)
            return
    }
}
