package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj  reason: default package */
/* loaded from: classes.dex */
public final class jj {
    public final android.graphics.PathMeasure a;

    public jj(android.graphics.PathMeasure r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(float r2, float r3, defpackage.hj r4) {
            r1 = this;
            if (r4 == 0) goto Lb
            android.graphics.Path r4 = r4.a
            android.graphics.PathMeasure r1 = r1.a
            r0 = 1
            r1.getSegment(r2, r3, r4, r0)
            return
        Lb:
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            defpackage.fa6.h(r1)
            return
    }
}
