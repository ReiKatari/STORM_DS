package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d8  reason: default package */
/* loaded from: classes.dex */
public final class d8 extends defpackage.v44 {
    public final /* synthetic */ int l;
    public final /* synthetic */ defpackage.g8 m;

    public d8(defpackage.g8 r9, android.content.Context r10, defpackage.i44 r11, android.view.View r12) {
            r8 = this;
            r0 = 1
            r8.l = r0
            r8.m = r9
            r6 = 2130968611(0x7f040023, float:1.754588E38)
            r7 = 0
            r5 = 1
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 8388613(0x800005, float:1.175495E-38)
            r1.f = r8
            os0 r8 = r9.s0
            r1.h = r8
            t44 r9 = r1.i
            if (r9 == 0) goto L21
            r9.g(r8)
        L21:
            return
    }

    public d8(defpackage.g8 r9, android.content.Context r10, defpackage.it6 r11, android.view.View r12) {
            r8 = this;
            r0 = 0
            r8.l = r0
            r8.m = r9
            r6 = 2130968611(0x7f040023, float:1.754588E38)
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            o44 r8 = r3.A
            int r8 = r8.x
            r10 = 32
            r8 = r8 & r10
            if (r8 != r10) goto L1b
            goto L25
        L1b:
            f8 r8 = r9.e0
            if (r8 != 0) goto L23
            d54 r8 = r9.d0
            android.view.View r8 = (android.view.View) r8
        L23:
            r1.e = r8
        L25:
            os0 r8 = r9.s0
            r1.h = r8
            t44 r9 = r1.i
            if (r9 == 0) goto L30
            r9.g(r8)
        L30:
            return
    }

    @Override // defpackage.v44
    public final void c() {
            r4 = this;
            int r0 = r4.l
            r1 = 0
            g8 r2 = r4.m
            switch(r0) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            i44 r0 = r2.L
            if (r0 == 0) goto L10
            r3 = 1
            r0.c(r3)
        L10:
            r2.o0 = r1
            super.c()
            return
        L16:
            r2.p0 = r1
            super.c()
            return
    }
}
