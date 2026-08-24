package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj2  reason: default package */
/* loaded from: classes.dex */
public final class rj2 {
    public final android.net.Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final java.lang.String e;
    public final int f;

    public rj2(android.net.Uri r1, int r2, int r3, boolean r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public rj2(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "systemfont"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r3 = r0.authority(r3)
            android.net.Uri r3 = r3.build()
            r2.a = r3
            r3 = 0
            r2.b = r3
            r0 = 400(0x190, float:5.6E-43)
            r2.c = r0
            r2.d = r3
            r2.e = r4
            r2.f = r3
            return
    }
}
