package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd1  reason: default package */
/* loaded from: classes.dex */
public final class gd1 implements defpackage.gb0 {
    public final java.util.concurrent.Executor A;
    public final defpackage.gb0 B;

    public gd1(java.util.concurrent.Executor r1, defpackage.gb0 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.gb0
    public final void cancel() {
            r0 = this;
            gb0 r0 = r0.B
            r0.cancel()
            return
    }

    @Override // defpackage.gb0
    public final defpackage.gb0 clone() {
            r2 = this;
            gd1 r0 = new gd1
            gb0 r1 = r2.B
            gb0 r1 = r1.clone()
            java.util.concurrent.Executor r2 = r2.A
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m2clone() {
            r0 = this;
            gb0 r0 = r0.clone()
            return r0
    }

    @Override // defpackage.gb0
    public final void h(defpackage.mb0 r3) {
            r2 = this;
            yc1 r0 = new yc1
            r1 = 0
            r0.<init>(r2, r3, r1)
            gb0 r2 = r2.B
            r2.h(r0)
            return
    }

    @Override // defpackage.gb0
    public final boolean r() {
            r0 = this;
            gb0 r0 = r0.B
            boolean r0 = r0.r()
            return r0
    }

    @Override // defpackage.gb0
    public final defpackage.pa x() {
            r0 = this;
            gb0 r0 = r0.B
            pa r0 = r0.x()
            return r0
    }
}
