package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.pd4("navigation")
/* renamed from: qc4  reason: default package */
/* loaded from: classes.dex */
public class qc4 extends defpackage.qd4 {
    public final defpackage.rd4 c;

    public qc4(defpackage.rd4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.qd4
    public /* bridge */ /* synthetic */ defpackage.ic4 a() {
            r0 = this;
            mc4 r0 = r0.g()
            return r0
    }

    @Override // defpackage.qd4
    public final void d(java.util.List r7, defpackage.ad4 r8) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L114
            java.lang.Object r0 = r7.next()
            sb4 r0 = (defpackage.sb4) r0
            ic4 r1 = r0.B
            r1.getClass()
            mc4 r1 = (defpackage.mc4) r1
            z9 r2 = r1.B
            dh5 r3 = new dh5
            r3.<init>()
            uk1 r0 = r0.d0
            android.os.Bundle r0 = r0.c()
            r3.A = r0
            dk0 r0 = r1.Y
            int r1 = r0.L
            java.lang.Object r4 = r0.Y
            java.lang.String r4 = (java.lang.String) r4
            if (r1 != 0) goto L56
            if (r4 == 0) goto L33
            goto L56
        L33:
            r2.getClass()
            int r6 = r2.a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r6.getClass()
            java.lang.Object r7 = r0.R
            mc4 r7 = (defpackage.mc4) r7
            z9 r7 = r7.B
            int r7 = r7.a
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            java.lang.String r6 = "the root navigation"
        L4c:
            java.lang.String r7 = "no start destination defined via app:startDestination for "
            java.lang.String r6 = r7.concat(r6)
            defpackage.u34.f(r6)
            return
        L56:
            r2 = 0
            if (r4 == 0) goto L5e
            ic4 r1 = r0.m(r4, r2)
            goto L68
        L5e:
            java.lang.Object r5 = r0.X
            un6 r5 = (defpackage.un6) r5
            java.lang.Object r1 = r5.c(r1)
            ic4 r1 = (defpackage.ic4) r1
        L68:
            if (r1 != 0) goto L91
            java.lang.Object r6 = r0.B
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L7e
            java.lang.Object r6 = r0.Y
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L7c
            int r6 = r0.L
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L7c:
            r0.B = r6
        L7e:
            java.lang.Object r6 = r0.B
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.String r7 = "navigation destination "
            java.lang.String r8 = " is not a direct child of this NavGraph"
            java.lang.String r6 = defpackage.lb1.A(r7, r6, r8)
            defpackage.i.h(r6)
            return
        L91:
            z9 r0 = r1.B
            if (r4 == 0) goto Lf3
            java.lang.Object r5 = r0.e
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto Lcb
            hc4 r0 = r0.l(r4)
            if (r0 == 0) goto La8
            android.os.Bundle r0 = r0.B
            goto La9
        La8:
            r0 = 0
        La9:
            if (r0 == 0) goto Lcb
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Lcb
            vr4[] r4 = new defpackage.vr4[r2]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            vr4[] r4 = (defpackage.vr4[]) r4
            android.os.Bundle r4 = defpackage.jw2.l(r4)
            r4.putAll(r0)
            java.lang.Object r0 = r3.A
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto Lc9
            r4.putAll(r0)
        Lc9:
            r3.A = r4
        Lcb:
            java.util.Map r0 = r1.c()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf3
            java.util.Map r0 = r1.c()
            pc4 r4 = new pc4
            r4.<init>(r2, r3)
            java.util.ArrayList r0 = defpackage.xk2.C(r0, r4)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le9
            goto Lf3
        Le9:
            java.lang.String r6 = ". Missing required arguments ["
            r7 = 93
            java.lang.String r8 = "Cannot navigate to startDestination "
            defpackage.e41.s(r8, r1, r6, r0, r7)
            return
        Lf3:
            rd4 r0 = r6.c
            java.lang.String r2 = r1.A
            qd4 r0 = r0.b(r2)
            vb4 r2 = r6.b()
            java.lang.Object r3 = r3.A
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.Bundle r3 = r1.a(r3)
            sb4 r1 = r2.b(r1, r3)
            java.util.List r1 = defpackage.hf.b0(r1)
            r0.d(r1, r8)
            goto L4
        L114:
            return
    }

    public defpackage.mc4 g() {
            r1 = this;
            mc4 r0 = new mc4
            r0.<init>(r1)
            return r0
    }
}
