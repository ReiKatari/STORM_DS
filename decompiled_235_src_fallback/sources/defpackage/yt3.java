package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt3  reason: default package */
/* loaded from: classes.dex */
public final class yt3 implements defpackage.gu3 {
    public final defpackage.zt3 A;
    public final defpackage.hu3 B;

    public yt3(defpackage.hu3 r1, defpackage.zt3 r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @defpackage.ql4(defpackage.st3.ON_DESTROY)
    public void onDestroy(defpackage.hu3 r1) {
            r0 = this;
            zt3 r0 = r0.A
            r0.l(r1)
            return
    }

    @defpackage.ql4(defpackage.st3.ON_START)
    public void onStart(defpackage.hu3 r1) {
            r0 = this;
            zt3 r0 = r0.A
            r0.g(r1)
            return
    }

    @defpackage.ql4(defpackage.st3.ON_STOP)
    public void onStop(defpackage.hu3 r1) {
            r0 = this;
            zt3 r0 = r0.A
            r0.h(r1)
            return
    }
}
