package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu7  reason: default package */
/* loaded from: classes.dex */
public class zu7 extends defpackage.bv7 {
    public final android.view.WindowInsetsController a;
    public final defpackage.s35 b;
    public final android.view.Window c;

    public zu7(android.view.Window r2, defpackage.s35 r3) {
            r1 = this;
            android.view.WindowInsetsController r0 = defpackage.zm6.k(r2)
            r1.<init>()
            r1.a = r0
            r1.b = r3
            r1.c = r2
            return
    }

    @Override // defpackage.bv7
    public final void a(int r1) {
            r0 = this;
            android.view.WindowInsetsController r0 = r0.a
            r1 = r1 & (-9)
            defpackage.yu7.d(r0, r1)
            return
    }

    @Override // defpackage.bv7
    public boolean b() {
            r1 = this;
            android.view.Window r0 = r1.c
            if (r0 == 0) goto L11
            android.view.View r1 = r0.getDecorView()
            int r1 = r1.getSystemUiVisibility()
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L22
            goto L20
        L11:
            android.view.WindowInsetsController r0 = r1.a
            defpackage.yu7.b(r0)
            android.view.WindowInsetsController r1 = r1.a
            int r1 = defpackage.yu7.a(r1)
            r1 = r1 & 8
            if (r1 == 0) goto L22
        L20:
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    @Override // defpackage.bv7
    public void c(boolean r3) {
            r2 = this;
            r0 = 16
            android.view.Window r1 = r2.c
            if (r1 == 0) goto L19
            if (r3 == 0) goto L15
            android.view.View r2 = r1.getDecorView()
            int r3 = r2.getSystemUiVisibility()
            r3 = r3 | r0
            r2.setSystemUiVisibility(r3)
            return
        L15:
            r2.h(r0)
            return
        L19:
            android.view.WindowInsetsController r2 = r2.a
            if (r3 == 0) goto L21
            defpackage.zm6.r(r2, r0, r0)
            return
        L21:
            defpackage.yu7.c(r2, r0)
            return
    }

    @Override // defpackage.bv7
    public void d(boolean r3) {
            r2 = this;
            android.view.Window r0 = r2.c
            if (r0 == 0) goto L19
            r1 = 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L15
            android.view.View r2 = r0.getDecorView()
            int r3 = r2.getSystemUiVisibility()
            r3 = r3 | r1
            r2.setSystemUiVisibility(r3)
            return
        L15:
            r2.h(r1)
            return
        L19:
            android.view.WindowInsetsController r2 = r2.a
            r0 = 8
            if (r3 == 0) goto L23
            defpackage.zm6.r(r2, r0, r0)
            return
        L23:
            defpackage.yu7.c(r2, r0)
            return
    }

    @Override // defpackage.bv7
    public void e() {
            r4 = this;
            android.view.Window r0 = r4.c
            if (r0 == 0) goto L26
            android.view.View r1 = r0.getDecorView()
            r2 = 356039078(0x1538b9a6, float:3.7304955E-26)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setTag(r2, r3)
            r1 = 2048(0x800, float:2.87E-42)
            r4.h(r1)
            android.view.View r4 = r0.getDecorView()
            int r0 = r4.getSystemUiVisibility()
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r4.setSystemUiVisibility(r0)
            return
        L26:
            android.view.WindowInsetsController r4 = r4.a
            defpackage.zm6.p(r4)
            return
    }

    @Override // defpackage.bv7
    public final void f(int r2) {
            r1 = this;
            r0 = r2 & 8
            if (r0 == 0) goto Ld
            s35 r0 = r1.b
            java.lang.Object r0 = r0.A
            s35 r0 = (defpackage.s35) r0
            r0.E()
        Ld:
            android.view.WindowInsetsController r1 = r1.a
            r2 = r2 & (-9)
            defpackage.yu7.e(r1, r2)
            return
    }

    public final void h(int r2) {
            r1 = this;
            android.view.Window r1 = r1.c
            android.view.View r1 = r1.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            int r2 = ~r2
            r2 = r2 & r0
            r1.setSystemUiVisibility(r2)
            return
    }
}
