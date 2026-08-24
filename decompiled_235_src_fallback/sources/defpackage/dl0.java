package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl0  reason: default package */
/* loaded from: classes.dex */
public final class dl0 {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager c;

    public dl0(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public dl0(com.google.android.material.carousel.CarouselLayoutManager r1, int r2) {
            r0 = this;
            r0.b = r2
            switch(r2) {
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            r0.c = r1
            r1 = 1
            r0.<init>(r1)
            return
        Lc:
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    public final int a() {
            r2 = this;
            int r0 = r2.b
            r1 = 0
            switch(r0) {
                case 0: goto L10;
                default: goto L6;
            }
        L6:
            com.google.android.material.carousel.CarouselLayoutManager r2 = r2.c
            boolean r0 = r2.F0()
            if (r0 == 0) goto L10
            int r1 = r2.n
        L10:
            return r1
    }
}
