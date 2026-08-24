package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux3  reason: default package */
/* loaded from: classes.dex */
public final class ux3 extends defpackage.sx3 {
    public final defpackage.hu3 a;

    public ux3(defpackage.hu3 r2, defpackage.ap7 r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r3.getClass()
            h71 r1 = defpackage.h71.b
            r1.getClass()
            eb r2 = new eb
            nl2 r0 = defpackage.tx3.c
            r2.<init>(r3, r0, r1)
            java.lang.Class<tx3> r1 = defpackage.tx3.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r3 = r1.b()
            if (r3 == 0) goto L2d
            java.lang.String r0 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r0.concat(r3)
            qo7 r1 = r2.G(r1, r3)
            tx3 r1 = (defpackage.tx3) r1
            return
        L2d:
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            hu3 r3 = r3.a
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r1.length()
            if (r2 > 0) goto L42
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r2 = 46
            int r2 = r1.lastIndexOf(r2)
            if (r2 <= 0) goto L42
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
        L42:
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            java.lang.String r3 = "}}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
