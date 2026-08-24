package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q14  reason: default package */
/* loaded from: classes.dex */
public abstract class q14 {
    public final android.view.animation.PathInterpolator a;
    public final android.view.View b;
    public final int c;
    public final int d;
    public final int e;
    public defpackage.b00 f;

    public q14(android.view.View r5) {
            r4 = this;
            r4.<init>()
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r0.<init>(r3, r3, r1, r2)
            r4.a = r0
            r4.b = r5
            android.content.Context r5 = r5.getContext()
            r0 = 2130969527(0x7f0403b7, float:1.7547738E38)
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = defpackage.kj2.W(r5, r0, r1)
            r4.c = r0
            r0 = 2130969532(0x7f0403bc, float:1.7547749E38)
            r1 = 150(0x96, float:2.1E-43)
            int r0 = defpackage.kj2.W(r5, r0, r1)
            r4.d = r0
            r0 = 2130969531(0x7f0403bb, float:1.7547747E38)
            r1 = 100
            int r5 = defpackage.kj2.W(r5, r0, r1)
            r4.e = r5
            return
    }
}
