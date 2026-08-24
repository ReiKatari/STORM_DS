package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m62  reason: default package */
/* loaded from: classes.dex */
public final class m62 extends defpackage.o62 {
    public final defpackage.rj0 L;
    public final /* synthetic */ defpackage.q62 R;

    public m62(defpackage.q62 r1, long r2, defpackage.rj0 r4) {
            r0 = this;
            r0.R = r1
            r0.<init>(r2)
            r0.L = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            q62 r0 = r2.R
            jg7 r1 = defpackage.jg7.a
            rj0 r2 = r2.L
            r2.I(r0, r1)
            return
    }

    @Override // defpackage.o62
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            rj0 r2 = r2.L
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
