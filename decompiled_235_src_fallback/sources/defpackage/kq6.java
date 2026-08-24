package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq6  reason: default package */
/* loaded from: classes.dex */
public final class kq6 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.lq6 Y;

    public /* synthetic */ kq6(defpackage.lq6 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            kq6 r2 = (defpackage.kq6) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            kq6 r2 = (defpackage.kq6) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            lq6 r1 = r1.Y
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            kq6 r3 = new kq6
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            kq6 r3 = new kq6
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            lq6 r3 = r3.Y
            switch(r0) {
                case 0: goto L1c;
                default: goto La;
            }
        La:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            android.content.Context r3 = r3.a
            r4 = 2131951983(0x7f13016f, float:1.9540396E38)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r2)
            r3.show()
            return r1
        L1c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            android.content.Context r3 = r3.a
            r4 = 2131952296(0x7f1302a8, float:1.954103E38)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r2)
            r3.show()
            return r1
    }
}
