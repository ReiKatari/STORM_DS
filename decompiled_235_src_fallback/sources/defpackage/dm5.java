package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm5  reason: default package */
/* loaded from: classes.dex */
public abstract class dm5 extends defpackage.cm5 implements defpackage.oo2 {
    public final int B;

    public dm5(int r1, defpackage.r41 r2) {
            r0 = this;
            r0.<init>(r2)
            r0.B = r1
            return
    }

    @Override // defpackage.oo2
    public final int d() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.String toString() {
            r1 = this;
            r41 r0 = r1.A
            if (r0 != 0) goto Le
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            java.lang.String r1 = defpackage.lh5.a(r1)
            return r1
        Le:
            java.lang.String r1 = super.toString()
            return r1
    }
}
