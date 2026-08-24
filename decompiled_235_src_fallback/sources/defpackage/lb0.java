package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb0  reason: default package */
/* loaded from: classes.dex */
public abstract class lb0 implements defpackage.yf3, java.io.Serializable {
    public transient defpackage.yf3 A;
    public final java.lang.Object B;
    public final java.lang.Class L;
    public final java.lang.String R;
    public final java.lang.String X;
    public final boolean Y;

    public lb0(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            return
    }

    public abstract defpackage.yf3 a();

    public final defpackage.yq0 b() {
            r1 = this;
            boolean r0 = r1.Y
            java.lang.Class r1 = r1.L
            if (r0 == 0) goto L11
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            gq4 r0 = new gq4
            r0.<init>(r1)
            return r0
        L11:
            ar0 r1 = defpackage.gh5.a(r1)
            return r1
    }
}
