package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu0  reason: default package */
/* loaded from: classes.dex */
public final class vu0 implements defpackage.ib0 {
    public final /* synthetic */ int A;
    public final java.lang.reflect.Type B;

    public /* synthetic */ vu0(int r1, java.lang.reflect.Type r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ib0
    public final java.lang.reflect.Type a() {
            r1 = this;
            int r0 = r1.A
            java.lang.reflect.Type r1 = r1.B
            return r1
    }

    @Override // defpackage.ib0
    public final java.lang.Object b(defpackage.vk4 r3) {
            r2 = this;
            int r2 = r2.A
            switch(r2) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            wu0 r2 = new wu0
            r2.<init>(r3)
            uu0 r0 = new uu0
            r1 = 1
            r0.<init>(r2, r1)
            r3.h(r0)
            return r2
        L14:
            wu0 r2 = new wu0
            r2.<init>(r3)
            uu0 r0 = new uu0
            r1 = 0
            r0.<init>(r2, r1)
            r3.h(r0)
            return r2
    }
}
