package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo7  reason: default package */
/* loaded from: classes.dex */
public final class uo7 implements defpackage.go3 {
    public final defpackage.ar0 A;
    public final defpackage.on2 B;
    public final defpackage.on2 L;
    public final defpackage.on2 R;
    public defpackage.qo7 X;

    public uo7(defpackage.ar0 r1, defpackage.on2 r2, defpackage.on2 r3, defpackage.on2 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.go3
    public final java.lang.Object getValue() {
            r4 = this;
            qo7 r0 = r4.X
            if (r0 != 0) goto L46
            on2 r0 = r4.B
            java.lang.Object r0 = r0.c()
            ap7 r0 = (defpackage.ap7) r0
            on2 r1 = r4.L
            java.lang.Object r1 = r1.c()
            yo7 r1 = (defpackage.yo7) r1
            on2 r2 = r4.R
            java.lang.Object r2 = r2.c()
            j71 r2 = (defpackage.j71) r2
            r0.getClass()
            r1.getClass()
            r2.getClass()
            eb r3 = new eb
            r3.<init>(r0, r1, r2)
            ar0 r0 = r4.A
            java.lang.String r1 = r0.b()
            if (r1 == 0) goto L3f
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = r2.concat(r1)
            qo7 r0 = r3.G(r0, r1)
            r4.X = r0
            return r0
        L3f:
            java.lang.String r4 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r4)
            r4 = 0
            return r4
        L46:
            return r0
    }
}
