package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u46  reason: default package */
/* loaded from: classes.dex */
public final class u46 implements defpackage.q46, defpackage.g56 {
    public final /* synthetic */ defpackage.r46 A;
    public defpackage.ku3 B;
    public defpackage.e56 L;

    public u46(defpackage.r46 r6) {
            r5 = this;
            r5.<init>()
            r5.A = r6
            java.lang.String r0 = "androidx.savedstate.SavedStateRegistry"
            java.lang.Object r1 = r6.e(r0)
            boolean r2 = r1 instanceof android.os.Bundle
            if (r2 == 0) goto L12
            android.os.Bundle r1 = (android.os.Bundle) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L2e
            e56 r2 = r5.L
            if (r2 != 0) goto L2e
            f56 r2 = new f56
            t46 r3 = new t46
            r4 = 2
            r3.<init>(r5, r4)
            r2.<init>(r5, r3)
            e56 r3 = new e56
            r3.<init>(r2)
            r5.L = r3
            r3.b(r1)
        L2e:
            t46 r1 = new t46
            r2 = 0
            r1.<init>(r5, r2)
            r6.a(r0, r1)
            return
    }

    @Override // defpackage.q46
    public final defpackage.m44 a(java.lang.String r1, defpackage.on2 r2) {
            r0 = this;
            r46 r0 = r0.A
            m44 r0 = r0.a(r1, r2)
            return r0
    }

    @Override // defpackage.q46
    public final boolean c(java.lang.Object r1) {
            r0 = this;
            r46 r0 = r0.A
            boolean r0 = r0.c(r1)
            return r0
    }

    @Override // defpackage.q46
    public final java.util.Map d() {
            r0 = this;
            r46 r0 = r0.A
            java.util.Map r0 = r0.d()
            return r0
    }

    @Override // defpackage.q46
    public final java.lang.Object e(java.lang.String r1) {
            r0 = this;
            r46 r0 = r0.A
            java.lang.Object r0 = r0.e(r1)
            return r0
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r2 = this;
            ku3 r0 = r2.B
            if (r0 != 0) goto Lc
            ku3 r0 = new ku3
            r1 = 0
            r0.<init>(r2, r1)
            r2.B = r0
        Lc:
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r3 = this;
            e56 r0 = r3.L
            if (r0 != 0) goto L1b
            f56 r0 = new f56
            t46 r1 = new t46
            r2 = 2
            r1.<init>(r3, r2)
            r0.<init>(r3, r1)
            e56 r1 = new e56
            r1.<init>(r0)
            r3.L = r1
            r3 = 0
            r1.b(r3)
            r0 = r1
        L1b:
            d56 r3 = r0.b
            return r3
    }
}
