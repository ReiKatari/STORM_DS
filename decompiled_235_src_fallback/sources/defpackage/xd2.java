package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd2  reason: default package */
/* loaded from: classes.dex */
public interface xd2 extends defpackage.to {
    @Override // defpackage.to
    default defpackage.il7 a(defpackage.wc7 r1) {
            r0 = this;
            eb r1 = new eb
            r1.<init>(r0)
            return r1
    }

    float b(long r1, float r3, float r4, float r5);

    long c(float r1, float r2, float r3);

    default float d(float r7, float r8, float r9) {
            r6 = this;
            long r1 = r6.c(r7, r8, r9)
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            float r6 = r0.b(r1, r3, r4, r5)
            return r6
    }

    float e(long r1, float r3, float r4, float r5);
}
