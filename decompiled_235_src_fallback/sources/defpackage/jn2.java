package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn2  reason: default package */
/* loaded from: classes.dex */
public final class jn2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ android.content.Context Y;

    public /* synthetic */ jn2(android.content.Context r1, defpackage.r41 r2, int r3) {
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
            jn2 r2 = (defpackage.jn2) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            jn2 r2 = (defpackage.jn2) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            jn2 r3 = new jn2
            android.content.Context r1 = r1.Y
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            jn2 r3 = new jn2
            android.content.Context r1 = r1.Y
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
            android.content.Context r3 = r3.Y
            switch(r0) {
                case 0: goto L19;
                default: goto La;
            }
        La:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.String r4 = "Импорт чит-базы запущен..."
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r2)
            r3.show()
            return r1
        L19:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.String r4 = "Не удалось загрузить изображение"
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r2)
            r3.show()
            return r1
    }
}
